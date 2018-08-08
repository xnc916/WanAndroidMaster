package cn.white.ymc.wanandroidmaster.ui.fragment.home;

import java.util.List;

import cn.white.ymc.wanandroidmaster.base.contract.BasePre;
import cn.white.ymc.wanandroidmaster.base.contract.BaseView;
import cn.white.ymc.wanandroidmaster.data.bean.BenarBean;
import cn.white.ymc.wanandroidmaster.data.bean.HomePageArticleBean;

/**
 * 首页 契约类
 *
 * @packageName: cn.white.ymc.wanandroidmaster.ui.fragment.home
 * @fileName: HomeContract
 * @date: 2018/8/3  17:36
 * @author: ymc
 * @QQ:745612618
 */

public class HomeContract {

    interface View extends BaseView {

        void getHomepageListOk(HomePageArticleBean dataBean, boolean isRefresh);

        void getHomepageListErr(String info);

        void getBannerOk(List<BenarBean> bannerBean);

        void getBannerErr(String info);

    }

    interface Per extends BasePre<View> {
        /**
         * 刷新 列表
         */
        void autoRefresh();

        /**
         * 加載更多
         */
        void loadMore();

        /**
         * 获取 轮播信息
         */
        void getBanner();

        /**
         * 获取 首页 页数数据
         * @param page
         */
        void  getHomepageListData(int page);
    }

}
