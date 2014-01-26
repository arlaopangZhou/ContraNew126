package com.player.boxplayer.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;

public class BitmapWorkerTask extends AsyncTask<String, Void, Bitmap> {

	private static final String TAG = "BitmapWorkerTask";
	private ImageView imageView;
	private boolean isLruCache;
	private boolean isDiskLruCache;
	private PostCallBack callback;
	private BitmapUtil bitmapUtil;
	private Drawable defaultDrawable;

	private int width;
	private int height;

	public BitmapWorkerTask(Context context, ImageView imageView,
			boolean isLruCache, boolean isDiskLruCache) {
		super();
		this.bitmapUtil = BitmapUtil.getInstance(context);
		this.imageView = imageView;
		this.isLruCache = isLruCache;
		this.isDiskLruCache = isDiskLruCache;

	}

	/**
	 * ����UI�̵߳� post�ص��ӿ�
	 * @param callback
	 * @return
	 */
	public BitmapWorkerTask setCallback(PostCallBack callback) {
		this.callback = callback;
		return this;
	}

	/**
	 * ����Ĭ��ͼƬ
	 * 
	 * @param drawable
	 * @return
	 */
	public BitmapWorkerTask setDefaultDrawable(Drawable drawable) {
		this.defaultDrawable = drawable;
		return this;
	}

	@Override
	protected Bitmap doInBackground(String... params) {
		Bitmap bitmap = null;
		String imgKey = params[0];
		if (TextUtils.isEmpty(imgKey)){
			return null;
			}
		Log.d(TAG, "doInBackground bitmap url =" + imgKey +"  "+ Thread.currentThread().getName());
		// ���� �ж��Ƿ�� �ڴ滺�����
		if (bitmap == null && isLruCache) {
			bitmap = bitmapUtil.getBitmapFromMemory(imgKey);
		}
		// �ٴ� �Ƿ� �� Ӳ�̻������ �� Ӳ�̻��� ���뵽 �ڴ滺��
		if (bitmap == null&&isDiskLruCache) {
			bitmap = bitmapUtil.getBitmapFromDisk(imgKey);
		}

		// ��� ���������
		if (bitmap == null)
			bitmap = bitmapUtil.getBitmapFromNet(imgKey, width, height);
		bitmapUtil.addToCache(imgKey, bitmap, isLruCache, isDiskLruCache);
		
		Log.d(TAG, "doInBackground bitmap url =" + imgKey + ",bitmap ="+bitmap +" , "+ Thread.currentThread().getName());
		
		return bitmap;
	}

	@Override
	protected void onCancelled(Bitmap result) {
		Log.d(TAG, "onCancelled");
		if (result != null && result.isRecycled()) {
			result.recycle();
		}
		super.onCancelled(result);
	}

	@Override
	protected void onPostExecute(Bitmap result) {
		Log.d(TAG, "onPostExecute bitmap ="+ result +" , "+ Thread.currentThread().getName());
		
		if (imageView != null && result != null) {
			// ���� imageview ?�Ƿ���Ҫ �����ϵ�ͼƬ��
			imageView.setImageBitmap(result);
		} else if (imageView != null && result == null
				&& defaultDrawable != null) {
			imageView.setImageDrawable(defaultDrawable);
		}
		if (callback != null) {
			callback.post(result);
		}
		super.onPostExecute(result);

	}

	public interface PostCallBack {
		public void post(Bitmap bitmap);
	}

}
