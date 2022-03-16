package ca.bytetube.communityApp.service;

import ca.bytetube.communityApp.dto.ImageHolder;
import ca.bytetube.communityApp.dto.ProductExecution;
import ca.bytetube.communityApp.entity.Product;
import ca.bytetube.communityApp.exceptions.ProductOperationException;

import java.util.List;

public interface ProductService {

	/**
	 * 添加商品信息以及图片处理
	 */
	ProductExecution addProduct(Product product, ImageHolder thumbnail, List<ImageHolder> productImgList)
			throws ProductOperationException;

}
