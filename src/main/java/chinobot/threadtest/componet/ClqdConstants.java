package chinobot.threadtest.componet;
import java.util.HashMap;
import java.util.Map;

//import com.sun.istack.FinalArrayList;
//import com.unisure.tylh.pojos.SingleFamliyCheckPojos;

/**
 *
 * <p>
 * 功能描述：材料清单常量类
 * </p>
 *
 * @author yebm
 * @date 2014-5-12 下午05:58:33
 * @company unisure
 * @version 1.0
 */
public class ClqdConstants {
	/** 变量描述 基础数据 区域 */
	public static final String AREANAME = "area";

	/** 变量描述 局内部核查类型 1：政策性住房 */
	public static final String JUBHCLXZCX_1 = "1";
	/** 变量描述 局内部核查类型 2：安居型商品房 */
	public static final String JUBHCLXZCX_2 = "2";
	/** 变量描述 局内部核查类型 3：政策性租房 */
	public static final String JUBHCLXZCX_3 = "3";

	/** 变量描述 接口比对结果表状态 1：有效 */
	public static final String BDJKYX = "1";

	/** 变量描述 接口比对结果表状态 0：历史 */
	public static final String BDJKLS = "0";

	/** 变量描述 是否有商品房 0：无 */
	public static final String WSPF = "0";

	/** 变量描述 是否有商品房 1：有 */
	public static final String YSPF = "1";

	/** 变量描述 社保查询接口方法名 */
	public static final String SBXXCXJKM = "getSUPPInfoService";

	/** 变量描述 社保查询接口方法名(新) */
	public static final String SBXXCXJKM_NEW = "getSUPPInfoServiceNew";

	/** 变量描述 房产交易查询接口方法名 */
	public static final String GTFCJYJKM = "getTranDateAfterInfo";

	/** 变量描述 房产数量查询接口方法名 */
	public static final String GTFCSLJKM = "getZqHouseCount";

	/** 变量描述 公安居住证接口方法名 */
	public static final String GAJZZJKM = "getJZZInfoNew";

	/** 变量描述 公安户籍接口方法名 */
	public static final String GAHJJKM = "getGrInfo";

	/** 变量描述 高层次专业人才信息查询接口方法名 */
	public static final String GETGCCRENC = "getGccRenc";

	/** 变量描述 海外高层次人才信息查询接口方法名 */
	public static final String GETHAIWRENC = "getHaiwRenc";

	/** 变量描述 新引进人才租房补贴信息查询接口方法名 */
	public static final String GETRENCSUBSIDY = "getRencSubsidy";

	/** 变量描述 计划生育证明信息接口方法名 */
	public static final String GETJSCERTIFY = "getJsCertify";

	/** 变量描述 婚姻信息接口方法名 */
	public static final String GETMARRIAGEINFO = "getMarriageInfo";

	/** 变量描述 历史违建申报信息接口方法名 */
	public static final String GETZJQUERY = "getZjQuery";

	/** 变量描述 低保信息接口方法名 */
	public static final String GETLOWINCOMESUBSIDY = "getLowIncomeSubsidy";

	/** 变量描述 房补信息接口方法名 */
	public static final String GETFBINFO = "getFbInfo";

	/** 变量描述 人才安居补贴方法名 */
	public static final String RCAJBT = "webquery";// getRcajBtInfo

	/** 变量描述 是否取得居住证 1:未取得 */
	public static final String WJZZ = "0";

	/** 变量描述 是否取得居住证 1:已取得 */
	public static final String YJZZ = "1";

	/** 变量描述 居住证状态 1:无效 */
	public static final String JZZZTWX = "0";

	/** 变量描述 居住证状态 0:有效 */
	public static final String JZZZTYX = "1";

	/** 变量描述 居住证状态 2:已注销 */
	public static final String JZZZTYZX = "2";

	/** 变量描述 公安接口类型 1:户籍信息 */
	public static final String GONGANJKLXHJ = "1";

	/** 变量描述 公安接口类型 2:居住证信息 */
	public static final String GONGANJKLXJZZ = "2";

	/** 变量描述 是否是深户 1:深户 */
	public static final String ISSZHJ = "1";

	/** 变量描述 是否是深户 0:非深户 */
	public static final String ISNOTSZHJ = "0";

	/** 变量描述 是否是主申请人 1:是主申请人 */
	public static final String ISZSQR = "1";

	/** 变量描述 是否是主申请人 0:不是主申请人 */
	public static final String NOTZSQR = "2";

	/** 变量描述 与申请人的关系 0:申请人 */
	public static final String YUZSQRGX_SQR = "0";

	/** 变量描述 与申请人的关系 1:申请人父母 */
	public static final String YUZSQRGX_FQ = "1";

	/** 变量描述 与申请人的关系 2:配偶父母 */
	public static final String YUZSQRGX_MQ = "2";

	/** 变量描述 与申请人的关系 3:岳父 */
	public static final String YUZSQRGX_YF = "3";

	/** 变量描述 与申请人的关系 4:岳母 */
	public static final String YUZSQRGX_YM = "4";

	/** 变量描述 与申请人的关系 5:丈夫 */
	public static final String YUZSQRGX_ZF = "5";

	/** 变量描述 与申请人的关系 6:妻子 */
	public static final String YUZSQRGX_QZ = "6";

	/** 变量描述 与申请人的关系 7:子女 */
	public static final String YUZSQRGX_EZ = "7";

	/** 变量描述 与申请人的关系 8:子女 */
	public static final String YUZSQRGX_NE = "8";

	/** 变量描述 与申请人的关系 9:成年子女的配偶 */
	public static final String YUZSQRGX_CNZN_PO = "9";

	/** 变量描述 与申请人的关系 10:成年子女的子女 */
	public static final String YUZSQRGX_CNZN_ZN = "10";

	/** 变量描述 成员类型 1:申请人 */
	public static final String CHENGYLX_SQR = "1";

	/** 变量描述 成员类型 2:配偶 */
	public static final String CHENGYLX_PO = "2";

	/** 变量描述 成员类型 3:申请人(配偶)父母 */
	public static final String CHENGYLX_FM = "3";

	/** 变量描述 成员类型 4:岳父母 */
	/*
	 * public static final String CHENGYLX_YFM = "4";
	 */

	/** 变量描述 成员类型 5:成年子女 */
	public static final String CHENGYLX_CNZN = "5";

	/** 变量描述 成员类型 6:未成年子女 */
	public static final String CHENGYLX_WCNZN = "6";

	/** 变量描述 成员类型 7:成年子女的配偶 */
	public static final String CHENGYLX_CNZNPO = "7";

	/** 变量描述 成员类型 8:成年子女的子女 */
	public static final String CHENGYLX_CNZNZN = "8";

	// 此常量不用，注释，2014-09-21 毛敏
	/** 变量描述 材料编号对应的材料清单名称 0001:《深圳市保障性住房轮候申请表》 */
	/*
	 * public static final String CLBH_SQB = "0001";
	 *//** 变量描述 材料编号对应的材料清单名称 0002:《申请人身份证、户口簿或者其他户籍证明》 */
	/*
	 * public static final String CLBH_SQRHJZM = "0002";
	 *//** 变量描述 材料编号对应的材料清单名称 0003:《申请人及共同申请人的身份证、户口簿或者其他户籍证明》 */
	/*
	 * public static final String CLBH_GTSQRHJZM = "0003";
	 *//** 变量描述 材料编号对应的材料清单名称 0004:《民政部门出具的收养登记证》备注：子女为收养的需出示。 */
	/*
	 * public static final String CLBH_SYZNZM = "0004";
	 *//** 变量描述 材料编号对应的材料清单名称 0005:提供（离婚证、离婚协议书）或法院调解书或法院判决书 */
	/*
	 * public static final String CLBH_LHZM = "0005";
	 *//** 变量描述 材料编号对应的材料清单名称 0006:《结婚证》 */
	/*
	 * public static final String CLBH_JHZM = "0006";
	 *//** 变量描述 材料编号对应的材料清单名称 0007:《无婚姻状况证明》 */
	/*
	 * public static final String CLBH_WHZM = "0007";
	 *//** 变量描述 材料编号对应的材料清单名称 0008:《学历证明》（深圳人才中心出具的学历验证报告或学信网打印的学籍备案回执表） */
	/*
	 * public static final String CLBH_XLZM = "0008";
	 *//** 变量描述 材料编号对应的材料清单名称 0009:《职称证书》 */
	/*
	 * public static final String CLBH_ZCZS = "0009";
	 *//** 变量描述 材料编号对应的材料清单名称 0010:《残疾人证书》 */
	/*
	 * public static final String CLBH_CJRZS = "0010";
	 *//** 变量描述 材料编号对应的材料清单名称 0011:《深圳市优抚对象优待证》 */
	/*
	 * public static final String CLBH_YFDXYDZ = "0011";
	 *//** 变量描述 材料编号对应的材料清单名称 0012:《配偶军官证（士兵证）、军人公民身份证号码登记表》 */
	/*
	 * public static final String CLBH_POJGSBZ = "0012";
	 *//** 变量描述 材料编号对应的材料清单名称 0015:《子女军官证（士兵证）、军人公民身份证号码登记表》 */
	/*
	 * public static final String CLBH_ZNJGSBZ = "0015";
	 *//** 变量描述 材料编号对应的材料清单名称 0016:《配偶及子女军官证（士兵证）、军人公民身份证号码登记表》 */
	/*
	 * public static final String CLBH_POAZNJGSBZ = "0016";
	 *//** 变量描述 材料编号对应的材料清单名称 0013:《户籍迁移证》 */
	/*
	 * public static final String CLBH_HJQYZ = "0013";
	 *//** 变量描述 材料编号对应的材料清单名称 0014:《学籍证明》 */
	/*
	 * public static final String CLBH_XJZM = "0014";
	 */

	/** 变量描述 是否残疾 1:是 */
	public static final String SHIFCJ_YES = "1";
	/** 变量描述 是否残疾或抚恤家庭 1:是 */
	public static final String ISCJORFXDX_YES = "1";
	/** 变量描述 是否优抚定补优抚对象 1:是 */
	public static final String SHIFYFDBYFDX_YES = "1";

	/** 变量描述 是否公租房共同申请人 1:是 */
	public static final String SHIFGZFGTSQR_YES = "1";

	/** 变量描述 是否公租房共同申请人 2:否 */
	public static final String SHIFGZFGTSQR_NO = "2";

	/** 变量描述 是否安居房共同申请人 1:是 */
	public static final String SHIFAJFGTSQR_YES = "1";

	/** 变量描述 是否安居房共同申请人 2:否 */
	public static final String SHIFAJFGTSQR_NO = "2";

	/** 变量描述 婚姻状况 1:未婚 */
	public static final String HUNYZK_WH = "1";

	/** 变量描述 婚姻状况 2:结婚 */
	public static final String HUNYZK_CH = "2";

	/** 变量描述 婚姻状况 4:离异 */
	public static final String HUNYZK_LY = "4";

	/** 变量描述 婚姻状况 5:丧偶 */
	public static final String HUNYZK_SO = "5";

	/** 变量描述 申请类别 1:安居房 */
	public static final String SHENQLB_AJF = "1";

	/** 变量描述 申请类别 2:公租房 */
	public static final String SHENQLB_GZF = "2";

	/** 变量描述 申请类别 3:安居房和公租房 */
	public static final String SHENQLB_AJF_GZF = "3";

	/** 变量描述 申请类别 4:申请公租房预申请安居房 */
	public static final String SHENQLB_4 = "4";

	/** 变量描述 申请类别 5:单独预申请公租房 */
	public static final String SHENQLB_5 = "5";

	/** 变量描述 申请类别 6:单独预申请安居房 */
	public static final String SHENQLB_6 = "6";

	/** 变量描述 申请类别 7:公租转安居 */
	public static final String SHENQLB_7 = "7";

	/** 变量描述 申请类别 8:安居转公租 */
	public static final String SHENQLB_8 = "8";

	/** 变量描述 申请类别 10:领军人才安居房 */
	public static final String SHENQLB_10 = "10";

	/** 变量描述 申请类别 21:用于预申请条件系统自动核查传参标识，无实际类别 */
	public static final String SHENQLB_21 = "21";
	/**
	 *变量描述 申请类别 22:用于外网最后提交时核查相关房产信息类别，在申请表中显示，无实际类别
	 */
	public static final String SHENQLB_22 = "22";

	/** 变量描述 累计缴纳本市社保时间 36: 36个月,即3年 */
	public static final int LEIJJNBSSBSJ_SN = 36;

	/** 变量描述 累计缴纳本市社保时间 60: 60个月,即5年 */
	public static final int LEIJJNBSSBSJ_WN = 60;

	/** 变量描述 户籍迁出本地原因 服兵役 */
	public static final String HUJQCBDYY_FBY = "1";

	/** 变量描述 户籍迁出本地原因 就读全日制学校 */
	public static final String HUJQCBDYY_JDQRZXX = "2";

	/** 变量描述 最高学历 1:博士研究生 */
	public static final String ZUIGXL_BS = "1";

	/** 变量描述 最高学历 2:硕士研究生 */
	public static final String ZUIGXL_SS = "2";
	/** 变量描述 最高学历 3:研究生、双学士 */
	public static final String ZUIGXL_SXW = "3";
	/** 变量描述 最高学历 4:本科 */
	public static final String ZUIGXL_BK = "4";

	/** 变量描述 最高学历 5:大专 */
	public static final String ZUIGXL_DZ = "5";

	/** 变量描述 最高学历 6:其他 */
	public static final String ZUIGXL_QT = "6";

	/** 变量描述 最高职称 1:正高级职称 */
	public static final String ZUIGZC_ZGJ = "1";

	/** 变量描述 最高职称 2:副高级职称 */
	public static final String ZUIGZC_FGJ = "2";

	/** 变量描述 最高职称 3:中级职称（技师） */
	public static final String ZUIGZC_ZJ = "3";
	//
	// /** 变量描述 最高职称 4:助理级（高级技工）*/
	// public static final String ZUIGZC_ZLJ = "4";
	//
	// /** 变量描述 最高职称 5:其他*/
	// public static final String ZUIGZC_QT = "5";

	/** 变量描述 所属人才层级 0:无 */
	public static final String SUOSRCDJ_WU = "0";

	/** 变量描述 所属人才层级 1:杰出人才 */
	public static final String SUOSRCDJ_JIEC = "1";

	/** 变量描述 所属人才层级 2:国家级领军人才 */
	public static final String SUOSRCDJ_GUOJLJ = "2";

	/** 变量描述 所属人才层级 3:地方级领军人才 */
	public static final String SUOSRCDJ_DIFLJ = "3";

	/** 变量描述 所属人才层级 4:后备级人才 */
	public static final String SUOSRCDJ_HOUB = "4";

	/** 变量描述 所属人才层级 5:高级人才 */
	public static final String SUOSRCDJ_GAOJ = "5";

	/** 变量描述 所属人才层级 6:中初级人才 */
	public static final String SUOSRCDJ_ZHONGJ = "6";

	/** 变量描述 性别 1:男 */
	public static final String XINGB_NAN = "1";

	/** 变量描述 性别 2:女 */
	public static final String XINGB_NV = "2";

	/** 变量描述 是否现服役军人 1:是 */
	public static final String SHIFXFYJR_YES = "1";

	/** 变量描述 是否现服役军人 2:否 */
	public static final String SHIFXFYJR_NO = "2";

	/** 变量描述 是否本市户籍 1:是 */
	public static final String SHIFBSHJ_YES = "1";

	/** 变量描述 是否本市户籍 2:不是 */
	public static final String SHIFBSHJ_NO = "2";

	/** 变量描述 是否收养过子女 1:是 */
	public static final String ISSYCHILDREN_YES = "1";

	/** 变量描述 是否收养过子女 2:不是 */
	public static final String ISSYCHILDREN_NO = "2";

	/** 变量描述 是否失独家庭 1:是 */
	public static final String SHIFSDJT_YES = "1";

	/** 变量描述 是否失独家庭 2:否 */
	public static final String SHIFSDJT_NO = "2";


	/** 变量描述 残疾类型 1:视力残疾 */
	public static final String CJLX_SLCJ = "1";

	/** 变量描述 残疾类型 2:听力残疾 */
	public static final String CJLX_TLCJ = "2";

	/** 变量描述 残疾类型 3:言语残疾 */
	public static final String CJLX_YYCJ = "3";

	/** 变量描述 残疾类型 4:肢体残疾 */
	public static final String CJLX_ZTCJ = "4";

	/** 变量描述 残疾类型 5:智力残疾 */
	public static final String CJLX_ZLCJ = "5";

	/** 变量描述 残疾类型 6:精神残疾 */
	public static final String CJLX_JSCJ = "6";


	/** 轮候类别 1：日常 */
	public static final String LHLB_RC = "1";
	/** 轮候类别 2：集中 */
	public static final String LHLB_JZ = "2";

	// 当前登录人账号（先写死）
	// public static final String OPT_ACCOUNT = "430923198811220000";
	// /**
	// * 增加成功标志
	// */
	// public static final String OPT_ADD_SUCCESS = "1";
	// /**
	// * 修改成功标志
	// */
	// public static final String OPT_UPDATE_SUCCESS = "2";
	// /**
	// * 删除成功标志
	// */
	// public static final String OPT_DELETE_SUCCESS = "3";
	/**
	 * 预约状态
	 */
	// ==========start=============
	/** 已预约 */
	public static final String YY_YIYY = "1";
	/** 取消 */
	public static final String YY_YQX = "2";
	/** 变更 */
	public static final String YY_BG = "3";
	/** 已受理当前预约的申请信息 */
	public static final String YY_YSL = "4";

	/**
	 * 预约类型
	 */
	// ==========start=============
	/** 1 新申办预约 */
	public static final String YY_TYPE_1 = "1";
	/** 2 信息变更预约 */
	public static final String YY_TYPE_2 = "2";

	/** 公租房：是 */
	// public static final String GONG_Z_F_YES = "1";
	// /**公租房：否*/
	// public static final String GONG_Z_F_NO = "2";
	// /**安居房：是*/
	// public static final String AN_J_F_YES = "1";
	// /**安居房：否*/
	// public static final String AN_J_F_NO = "2";

	/**
	 * 申请材料 材料类别 1:原件
	 */
	public static final String CAILLB_1 = "1";
	/**
	 *申请材料 材料类别 2：复印件
	 */
	public static final String CAILLB_2 = "2";
	/**
	 *申请材料 材料类别 3：原件、复印件
	 */
	public static final String CAILLB_3 = "3";

	/**
	 * 预约受理状态 0:未受理
	 */
	public static final String YY_SHOULZT_0 = "0";
	/**
	 *预约受理状态 1：已受理
	 */
	public static final String YY_SHOULZT_1 = "1";
	// ==========================审核状态 start==========================

	/**
	 * 核查状态 0：待发送
	 */
	public static final String HC_STATE_DFS = "0";

	/**
	 * 核查状态 1：已发送未核查
	 */
	public static final String HC_STATE_YFSWHC = "1";

	/**
	 * 核查状态 2：部分通过
	 */
	public static final String HC_STATE_BFTG = "2";

	/**
	 * 核查状态 3：部分不通过
	 */
	public static final String HC_STATE_BFBTG = "3";

	/**
	 * 核查状态 4：通过
	 */
	public static final String HC_STATE_TG = "4";

	/**
	 * 核查状态 5：不通过
	 */
	public static final String HC_STATE_BTG = "5";

	/**
	 * 区审核
	 */
	public static final String SHEN_HUANJIE_QSH = "1";

	/**
	 * 标识是否审批提交
	 */
	public static final String SHP_IS_SUBMIT = "SB";
	/**
	 * 退回重新受理
	 */
	public static final String APPROPINION_RETURN_SL = "退回重新受理";

	/**
	 * 退回区核审
	 */
	public static final String APPROPINION_RETURN_SH = "退回区核审";
	/**
	 * 同意
	 */
	public static final String APPROPINION_AGREE = "同意";
	/**
	 * 不同意
	 */
	public static final String APPROPINION_DISAGREE = "不同意";
	/**
	 * 提交
	 */
	public static final String APPROPINION_SUBMIT = "提交";
	/**
	 * 退件
	 */
	public static final String APPROPINION_RETURNYSL = "退件";
	/**
	 *同意公示
	 */
	public static final String APPROPINION_PASS = "同意公示";

	/**
	 *出册
	 */
	public static final String APPROPINION_OUTLH = "出册";

	/**
	 * 0 申报环节
	 */
	public static final String LINK_SB_0 = "0";
	/**
	 * 1 受理环节
	 */
	public static final String LINK_SL_1 = "1";
	/**
	 * 11 区局退回受理 环节（共用页面person_view作控制用）
	 */
	public static final String LINK_SL_11 = "11";
	/**
	 * 12 报送受理数据 环节（共用页面person_view作控制用）
	 */
	public static final String LINK_SL_12 = "12";
	/**
	 * 13 打印通知书 环节（共用页面person_view作控制用）
	 */
	public static final String LINK_SL_13 = "13";

	/**
	 * 16 特殊审批 环节（共用页面person_view作控制用）
	 */
	public static final String LINK_SP_8 = "8";

	/**
	 * 2 审核环节
	 */
	public static final String LINK_SH_2 = "2";
	/**
	 * 3 审批环节
	 */
	public static final String LINK_SP_3 = "3";
	/**
	 * 4 公示环节
	 */
	public static final String LINK_GS_4 = "4";
	/**
	 * 5 轮候环节
	 */
	public static final String LINK_LH_5 = "5";

	/**
	 * 7 其它操作环节（内网共用页面控制，除以上正常环节外，其他操作则可用此值）
	 */
	public static final String LINK_LH_7 = "7";
	/**
	 * 21 预申请条件检查系统自动环节
	 */
	public static final String LINK_LH_21 = "21";

	/**
	 *22 外网打印申请表 核查相关房产信息环节
	 */
	public static final String LINK_LH_22 = "22";

	/**
	 *变更环节 B1：增加共同申请人
	 */
	public static final String BIANG_LINK_B1 = "B1";

	/**
	 *变更环节 B2：增加配偶
	 */
	public static final String BIANG_LINK_B2 = "B2";

	/**
	 *变更环节 B3：修改信息
	 */
	public static final String BIANG_LINK_B3 = "B3";

	/**
	 *变更审核环节 B4：变更审核环节
	 */
	public static final String BIANG_LINK_B4 = "B4";


	/**
	 *变更审核环节 B5：变更受理环节
	 */
	public static final String BIANG_LINK_B5 = "B5";


	/**
	 *变更审核环节 B6：变更复核环节
	 */
	public static final String BIANG_LINK_B6 = "B6";


	/**
	 *变更审核环节 B7：变更审核环节
	 */
	public static final String BIANG_LINK_B7 = "B7";
	/**
	 *变更审核环节 B8：变更受理退回环节
	 */
	public static final String BIANG_LINK_B8 = "B8";

	/**
	 * 有效无效标识 1 有效
	 */
	public static final String VALUE_FLAG_1 = "1";
	/**
	 * 有效无效标识 2 无效
	 */
	public static final String VALUE_FLAG_2 = "2";

	/**
	 * 申请表 公租房\安居房 申请状态(暂存)
	 */
	public static final String SQB_GONGZF_SHENHZ_STATUS_ZC = "-1";

	/**
	 * 申请表 公租房\安居房 申请状态(已提交)
	 */
	public static final String SQB_GONGZF_SHENHZ_STATUS_TJ = "0";

	/**
	 * 申请表 公租房\安居房 申请状态(已预约)
	 */
	public static final String SQB_GONGZF_SHENHZ_STATUS_YY = "1";

	/**
	 * 申请表 公租房\安居房 申请状态(已退回)
	 */
	public static final String SQB_GONGZF_SHENHZ_STATUS_TH = "2";

	/**
	 * 申请表 公租房\安居房 申请状态(审核中)
	 */
	public static final String SQB_GONGZF_SHENHZ_STATUS = "3";

	/**
	 * 申请表 公租房\安居房 申请状态(审核不通过) 4
	 */
	public static final String SQB_GONGZF_SHENHZ_STATUS_BTG = "4";

	/**
	 * 申请表 公租房\安居房 申请状态(审核通过)
	 */
	public static final String SQB_GONGZF_SHENHZ_STATUS_TG = "5";
	// ==========================审核状态 end==========================

	/**
	 * 备案类型 1、新申请备案；
	 */
	public static final String BEIALX_1 = "1";
	/**
	 * 备案类型 2、变更备案
	 */
	public static final String BEIALX_2 = "2";

	// ==========================流水号start==========================
	/**
	 * 回执编号流水号 公共租赁轮候备案回执编号：BHR+00000001（数字序号）
	 */
	// public static final String BAR_HZ_ZF = "ZF";//20141123 延用之前编号 BHR
	public static final String BAR_HZ_ZF = "BHR";
	/**
	 * 回执编号流水号 安居型商品房备案回执编号：SQR+00000001（数字序号）
	 */
	// public static final String BAR_HZ_SF = "SF";//20141123 延用之前编号 SQR
	public static final String BAR_HZ_SF = "SQR";

	/**
	 * 回执编号流水号 领军安居型商品房备案回执编号：LJ+00000001（数字序号）
	 */
	public static final String BAR_HZ_LJ = "LJ";

	/**
	 * 回执编号流水号 安居转公租：BHR
	 * */
	public static final String BAR_HZ_BHR = "BHR";
	/**
	 * 回执编号流水号 公租转安居:SQA
	 * */
	public static final String BAR_HZ_SQA = "SQA";
	/**
	 * 原始排位号 安居:AJSEQ
	 * */
	public static final String Aj_SEQ = "AJSEQ";
	/**
	 * 原始排位号 公租:GZSEQ
	 * */
	public static final String GZ_SEQ = "GZSEQ";

	/**
	 * 公租房原始排位最大编号所对应的备案回执号
	 */
	public static final String MAX_GZ_SEQ_HZH = "BHJ023614";

	/**
	 * 区流水号流水号 罗湖 ：LH+10000001（数字序号）
	 */
	public static final String BAR_QY_LH1 = "LH1";
	/**
	 * 区流水号流水号 福田 ：FT+10000001（数字序号）
	 */
	public static final String BAR_QY_FT1 = "FT1";
	/**
	 * 区流水号流水号 南山 ：NS+10000001（数字序号）
	 */
	public static final String BAR_QY_NS1 = "NS1";
	/**
	 * 区流水号流水号 大鹏新区 ：DP+10000001（数字序号）
	 */
	public static final String BAR_QY_DP1 = "DP1";
	/**
	 * 区流水号流水号 盐田 ：YT+10000001（数字序号）
	 */
	public static final String BAR_QY_YT1 = "YT1";
	/**
	 * 区流水号流水号 宝安 ：BA+10000001（数字序号）
	 */
	public static final String BAR_QY_BA1 = "BA1";
	/**
	 * 区流水号流水号 龙岗 ：LG+10000001（数字序号）
	 */
	public static final String BAR_QY_LG1 = "LG1";
	/**
	 * 区流水号流水号 光明新区 ：GM+10000001（数字序号）
	 */
	public static final String BAR_QY_GM1 = "GM1";
	/**
	 * 区流水号流水号 坪山区 ：PS+10000001（数字序号）
	 */
	public static final String BAR_QY_PS1 = "PS1";
	/**
	 * 区流水号流水号 龙华区 ：LHA+10000001（数字序号）
	 */
	public static final String BAR_QY_LHA1 = "LHA1";

	/**
	 * 市流水号流水号  ：SLJ+10000001（数字序号）
	 */
	public static final String BAR_QY_SLJ1 = "SLJ";

	/**
	 * 业务编号表业务类型 ：1 备案回执编号
	 */
	public static final String YEWLX_1 = "1";
	/**
	 * 业务编号表业务类型 ：2 区流水号
	 */
	public static final String YEWLX_2 = "2";
	/**
	 * 业务编号表业务类型 ：3 修正单号
	 */
	public static final String YEWLX_3 = "3";
	/**
	 * 业务编号表业务类型 ：4 修改单号
	 */
	public static final String YEWLX_4 = "4";
	/**
	 * 业务编号表业务类型 ：5 不予受理通知书 单号
	 */
	public static final String YEWLX_5 = "5";
	/**
	 * 业务编号表业务类型 ：6 驳回申请通知书 单号
	 */
	public static final String YEWLX_6 = "6";
	/**
	 * 业务编号表业务类型 ：7 复核结果通知书 单号
	 */
	public static final String YEWLX_7 = "7";
	/**
	 * 业务编号表业务类型 ：8 原始排位号
	 */
	public static final String YEWLX_8 = "8";
	/**
	 * 业务编号表业务类型 ：9 市局流水号
	 */
	public static final String YEWLX_9 = "9";
	/**
	 * 修正单号 罗湖 ：LHX+10000001（数字序号）
	 */
	public static final String BAR_UP_LHX1 = "LHX1";
	/**
	 * 修正单号 福田 ：FTX+10000001（数字序号）
	 */
	public static final String BAR_UP_FTX1 = "FTX1";
	/**
	 * 修正单号 南山 ：NSX+10000001（数字序号）
	 */
	public static final String BAR_UP_NSX1 = "NSX1";
	/**
	 * 修正单号 大鹏新区 ：DPX+10000001（数字序号）
	 */
	public static final String BAR_UP_DPX1 = "DPX1";
	/**
	 * 修正单号 盐田 ：YTX+10000001（数字序号）
	 */
	public static final String BAR_UP_YTX1 = "YTX1";
	/**
	 * 修正单号 宝安 ：BAX+10000001（数字序号）
	 */
	public static final String BAR_UP_BAX1 = "BAX1";
	/**
	 * 修正单号 龙岗 ：LGX+10000001（数字序号）
	 */
	public static final String BAR_UP_LGX1 = "LGX1";
	/**
	 * 修正单号 光明新区 ：GMX+10000001（数字序号）
	 */
	public static final String BAR_UP_GMX1 = "GMX1";
	/**
	 * 修正单号 坪山区 ：PSX+10000001（数字序号）
	 */
	public static final String BAR_UP_PSX1 = "PSX1";
	/**
	 * 修正单号 龙华区 ：LHAX+10000001（数字序号）
	 */
	public static final String BAR_UP_LHAX1 = "LHAX1";

	// ==========================流水号 end==========================

	/**
	 * 调用接口返回值 0 成功通过
	 */
	public static final String INTERFACE_0 = "0";
	/**
	 * 调用接口返回值 -5 不通过
	 */
	public static final String INTERFACE_5 = "-5";

	/**
	 * 扫描类型 1 新增材料
	 */
	public static final String SCAN_TYPE_1 = "1";
	/**
	 * 扫描类型 2 补正材料
	 */
	public static final String SCAN_TYPE_2 = "2";
	/**
	 * 扫描类型 3 变更材料
	 */
	public static final String SCAN_TYPE_3 = "3";
	/**
	 * 扫描类型 ALL 标识查询全部扫描类型
	 */
	public static final String SCAN_TYPE_ALL = "ALL";

	/**
	 * 从公租系统和安居系统接口返回的申请类型（1、安居房 2、公租房 0、没有申请）
	 */
	public static final String JIE_KOU_SHENQ_LB = "2";

	/**
	 * 从公租系统和安居系统接口返回的申请状态（未提交、受理或受理之后的状态）
	 */
	public static final String JIE_KOU_SHENQ_ZT = "3";

	/** 业务状态- 撤销 */
	public static final String STATE_CX = "0000";

	/** 业务状态- 暂存 */
	public static final String STATE_ZC = "1000";
	/** 业务状态- 待受理 1010 */
	public static final String STATE_DSL = "1010";
	/** 业务状态- 已预约 1011 */
	public static final String STATE_YYY = "1011";
	/** 业务状态- 申请资料已确认 1012 (已打变更单)*/
	public static final String STATE_SQZLQR = "1012";
	/** 业务状态- 受理不通过 1030 */
	public static final String STATE_SLBTG = "1030";
	/** 业务状态- 受理退回 1020 */
	public static final String STATE_SLTH = "1020";
	/** 业务状态- 区材料补正（已备案，待移交区复核） 1050 */
	public static final String STATE_SLTJ = "1050"; //对应外网 申请进度 "已受理"
	/** 业务状态- 退回重新受理 1060 */
	public static final String STATE_THCXSL = "1060";

	/** 业务状态- 待审核 2010 */
	public static final String STATE_DSH = "2010";
	/** 业务状态- 审核不同意（市退回的不通过） 2020 */
	public static final String STATE_SHBTY = "2020";

	/** 业务状态- 待市审核 3010 */
	public static final String STATE_DSP = "3010";
	/** 业务状态- 市审核同意 3020 */
	public static final String STATE_SPTY = "3020";
	/** 业务状态- 市审核不同意 3030 */
	public static final String STATE_SPBTY = "3030";
	/** 业务状态- 审批通过（待公示）3040 */
	public static final String STATE_SPTG = "3040";
	/** 业务状态- 市审批不通过 */
	public static final String STATE_SPBTG = "3050";
	/** 业务状态- 市局退件 3051 */
	public static final String STATE_SJTJ = "3051";
	/** 业务状态- 市审批退回 */
	public static final String STATE_SSPTH = "3060";
	/** 业务状态- 市材料补正 */
	public static final String STATE_SCLBZ = "3070";

	/** 业务状态- 公示中 4010 */
	public static final String STATE_GSZ = "4010";
	/** 业务状态- 公示退件 4030 */
	public static final String STATE_GZTJ = "4030";
	/** 业务状态- 已入册未公布 5000 */
	public static final String STATE_YLH = "5000";
	/** 业务状态- 已入册公布 5010 */
	public static final String STATE_YRC = "5010";

	/** 业务状态- 已冻结 */
	public static final String STATE_YDJ = "6010";
	/** 业务状态- 已退册 6020 */
	public static final String STATE_YCC = "6020";

	/** 业务状态- 作废 */
	public static final String STATE_ZF = "7010";

	/** 业务状态- 待区审定 */
	public static final String STATE_DQSD = "8010";

	/** 业务状态- 区审定同意 */
	public static final String STATE_QSDTY = "8020";

	/** 业务状态- 区审定不同意*/
	public static final String STATE_QSDBTY = "8030";

	/** 业务状态- 新数据市局退件 3051 */
	//public static final String STATE_NSJTJ = "8051";

	/** 领军人才申请 */
	public static final String LJRC = "1";

	/** 区域- 市局 */
	public static final String AREA_SJ = "11";

	/** 业务状态- 所有有效的状态组合 */
	public static final String STATE_YX = "1050,1060,3010,3020,3040,3070,4010,5010,8010,8020";
	/** 内网标志 */
	public static final String SYS_NEIW = "1";

	/** 证件类型 1身份证 */
	public static final String ZJLX_SFZ = "1";
	/** 证件类型 2居住证 */
	public static final String ZJLX_JGSG = "2";
	/** 证件类型 3军官证、士兵证 */
	public static final String ZJLX_QT = "3";
	/** 证件类型 4其它有效居留证件 */
	public static final String ZJLX_JZZ = "4";

	/** 证件类型 5港澳台居住证 */
	public static final String ZJLX_GATJZZ = "5";

	/** 区协查任务状态 0待协查 */
	public static final String QUHCZT_DXC = "0";
	/** 区协查任务状态 1协查中 */
	public static final String QUHCZT_XCZ = "1";
	/** 区协查任务状态 2已协查 */
	public static final String QUHCZT_XCWC = "2";
	/** 区协查任务状态 3协查完成 */
	public static final String QUHCZT_END = "3";

	/** 变量描述 是否租住政策性住房 1:是 */
	public static final String SFZZZCXZF_YES = "1";

	/** 变量描述 是否租住政策性住房 2:否 */
	public static final String SFZZZCXZF_NO = "2";

	/** 变量描述 是否购买政策性住房 1:是 */
	public static final String SFGMZCXZF_YES = "1";

	/** 变量描述 是否购买政策性住房 2:否 */
	public static final String SFGMZCXZF_NO = "2";

	/** 有效标志 1有效 */
	public static final String VALUEFLAG_YES = "1";
	/** 有效标志 2无效 */
	public static final String VALUEFLAG_NO = "2";

	/** 变更记录表更改标识 1: 新增 */
	public static final String LHMC_MODIFY_ADD = "1";
	/** 变更记录表更改标识 2: 减少 */
	public static final String LHMC_MODIFY_DEL = "2";

	/** 轮候标识 1:正常轮候 （有效轮候状态） */
	public static final String WAIT_FLAG_1 = "1";
	/** 轮候标识 2:已租房出册 （无效轮候状态） */
	public static final String WAIT_FLAG_2 = "2";
	/** 轮候标识 3:已购房出册 （无效轮候状态） */
	public static final String WAIT_FLAG_3 = "3";
	/** 轮候标识 4:已取消申请出册 （无效轮候状态） */
	public static final String WAIT_FLAG_4 = "4";
	/** 轮候标识 5:已核查违规出册 （无效轮候状态） */
	public static final String WAIT_FLAG_5 = "5";
	/** 轮候标识 6:其他情况已出册 （无效轮候状态） */
	public static final String WAIT_FLAG_6 = "6";

	/** 变量描述 是否原配偶 1：是 */
	public static final String IS_YPO_1 = "1";

	/** 变量描述 是否原配偶 2：否 */
	public static final String IS_YPO_2 = "2";

	/** 变量描述 预申请状态 0:无 */
	public static final String YSQ_FLAG_0 = "0";
	/** 变量描述 预申请状态 1:待系统核查 */
	public static final String YSQ_FLAG_1 = "1";
	/** 变量描述 预申请状态 2:系统核查通过 */
	public static final String YSQ_FLAG_2 = "2";
	/** 变量描述 预申请状态 3:审定通过 */
	public static final String YSQ_FLAG_3 = "3";
	/** 变量描述 预申请状态 4:审定不通过 */
	public static final String YSQ_FLAG_4 = "4";
	/** 变量描述 预申请状态 5:退件 */
	public static final String YSQ_FLAG_5 = "5";

	/******************** 预申请条件表使用状态常量 START **********************************/
	/** 变量描述 核查状态 0:待核查 */
	public static final String CHECK_FLAG_0 = "0";
	/** 变量描述 核查状态 1:核查通过 */
	public static final String CHECK_FLAG_1 = "1";
	/** 变量描述 核查状态 2:核查不通过 */
	public static final String CHECK_FLAG_2 = "2";

	/** 变量描述 核查类型 1:公安户籍 */
	public static final String CHECK_TYPE_1 = "1";
	/** 变量描述 核查类型 2:社保 */
	public static final String CHECK_TYPE_2 = "2";
	/** 变量描述 核查类型 3:房产交易 */
	public static final String CHECK_TYPE_3 = "3";
	/** 变量描述 核查类型 4:其它 */
	public static final String CHECK_TYPE_4 = "4";

	/** 变量描述 核查条件 1:申请人单身满35岁； */
	public static final String CHECK_CONDITION_1 = "1";
	/** 变量描述 核查条件 2:申请人为认定人才，社保缴费满3年； */
	public static final String CHECK_CONDITION_2 = "2";
	/** 变量描述 核查条件 3:申请人非认定人才，社保缴费满5年； */
	public static final String CHECK_CONDITION_3 = "3";
	/** 变量描述 核查条件 4:申请人（或共同申请人）转让或分割自有住房满5年； */
	public static final String CHECK_CONDITION_4 = "4";
	/** 变量描述 核查条件 5:申请人违反计划生育政策并接受处罚满15年； */
	public static final String CHECK_CONDITION_5 = "5";
	/** 变量描述 核查条件 6:申请人配偶有深圳户籍 */
	public static final String CHECK_CONDITION_6 = "6";
	/** 变量描述 核查条件 7:未成年子女有深圳户籍 */
	public static final String CHECK_CONDITION_7 = "7";

	/******************** 预申请条件表使用状态常量 END **********************************/

	/** 变量描述 是否同山标识 0:未出册 */
	public static final String OUTLH_FLAG_0 = "0";
	/** 变量描述 是否同山标识 1:已出册 */
	public static final String OUTLH_FLAG_1 = "1";

	/** 变量描述 出册类型页面标识 ALL:家庭出册 */
	public static final String OUT_LH_ALL = "ALL";

	/** 变量描述 出册类型 1:家庭出册 */
	public static final String OUT_TYPE_1 = "1";
	/** 变量描述 出册类型 2:共同申请人出册 */
	public static final String OUT_TYPE_2 = "2";

	/******************** 材料清单类型 START **********************************/
	/** 变量描述 材料清单类型 1:《深圳市保障性住房轮候申请表》 */
	public static final String CLQD_DATUM_1 = "1";
	/** 变量描述 材料清单类型 2: 身份证 */
	public static final String CLQD_DATUM_2 = "2";
	/** 变量描述 材料清单类型 3: 户口簿 */
	public static final String CLQD_DATUM_3 = "3";
	/** 变量描述 材料清单类型 4: 居住证 */
	public static final String CLQD_DATUM_4 = "4";
	/** 变量描述 材料清单类型 5:未婚证明 */
	public static final String CLQD_DATUM_5 = "5";
	/** 变量描述 材料清单类型 6: 结婚证 */
	public static final String CLQD_DATUM_6 = "6";
	/** 变量描述 材料清单类型 7:离婚证（含协议书）或离婚判决书（调解书） */
	public static final String CLQD_DATUM_7 = "7";
	/** 变量描述 材料清单类型 8:丧偶证明 */
	public static final String CLQD_DATUM_8 = "8";
	/** 变量描述 材料清单类型 9: 学历、学位证明 */
	public static final String CLQD_DATUM_9 = "9";
	/** 变量描述 材料清单类型 10:军官证（士兵证）或军人公民身份证号码登记表 */
	public static final String CLQD_DATUM_10 = "10";
	/** 变量描述 材料清单类型 11:户籍迁移证 */
	public static final String CLQD_DATUM_11 = "11";
	/** 变量描述 材料清单类型 12: 有效的学籍证明 */
	public static final String CLQD_DATUM_12 = "12";
	/** 变量描述 材料清单类型 13:职称证明 */
	public static final String CLQD_DATUM_13 = "13";
	/** 变量描述 材料清单类型 14:高层次人才证书 */
	public static final String CLQD_DATUM_14 = "14";
	/** 变量描述 材料清单类型 15: 残疾证明 */
	public static final String CLQD_DATUM_15 = "15";
	/** 变量描述 材料清单类型 16: 怃恤定补优抚证明 */
	public static final String CLQD_DATUM_16 = "16";
	/** 变量描述 材料清单类型 17: 收养证明 */
	public static final String CLQD_DATUM_17 = "17";
	/** 变量描述 材料清单类型 18: 亲属关系证明 */
	public static final String CLQD_DATUM_18 = "18";
	/** 变量描述 材料清单类型 19: 其它有效身份证明材料 */
	public static final String CLQD_DATUM_19 = "19";
	/** 变量描述 材料清单类型 20: 独生子女证明 */
	public static final String CLQD_DATUM_20 = "20";
	/** 变量描述 材料清单类型 21: 独生子女死亡证明 */
	public static final String CLQD_DATUM_21 = "21";
	/** 变量描述 材料清单类型 22: 出生证 */
	public static final String CLQD_DATUM_22 = "22";
	/** 变量描述 材料清单类型 23: 公证书 */
	public static final String CLQD_DATUM_23 = "23";
	/** 变量描述 材料清单类型 24: 户籍所在地派出所证明 */
	public static final String CLQD_DATUM_24 = "24";
	/** 变量描述 材料清单类型 25: 原配偶的死亡证明 */
	public static final String CLQD_DATUM_25 = "25";

	/******************** 材料清单 END **********************************/

	/** 变量描述 亲属关系证明 1: 户口簿 */
	public static final String family_relation_1 = "1";
	/** 变量描述 亲属关系证明 2: 出生证 */
	public static final String family_relation_2 = "2";
	/** 变量描述 亲属关系证明 3: 收养证明 */
	public static final String family_relation_3 = "3";
	/** 变量描述 亲属关系证明 4: 公证书 */
	public static final String family_relation_4 = "4";
	/** 变量描述 亲属关系证明 5: 户籍所在地派出所证明 */
	public static final String family_relation_5 = "5";
	/** 变量描述 亲属关系证明 6: 其它 */
	public static final String family_relation_6 = "6";

	/** 变量描述 申请家庭类型 1: 家庭 */
	public static final String FAMILY_TYPE_1 = "1";
	/** 变量描述 申请家庭类型 2: 单身 */
	public static final String FAMILY_TYPE_2 = "2";
	/** 变量描述 申请家庭类型 3: 单亲家庭 */
	public static final String FAMILY_TYPE_3 = "3";

	/** 变量描述 标识是否有做查询相关轮候申请 N: 未做查询 */
	public static final String ISQUERY_N = "N";
	/** 变量描述 标识是否有做查询相关轮候申请 Y:有做查询 */
	public static final String ISQUERY_Y = "Y";

	/** 信息变更类型 1: 增加共同申请人 */
	public static final String CHANTE_TYPE_1 = "1";
	/** 信息变更类型 2: 婚姻情况（结婚） */
	public static final String CHANTE_TYPE_2 = "2";
	/** 信息变更类型 3: 户籍情况（入深户） */
	public static final String CHANTE_TYPE_3 = "3";
	/** 信息变更类型 4: 信息项变更 */
	public static final String CHANTE_TYPE_4 = "4";
	/** 信息变更类型 10:信息项变更需受理（内网使用） */
	public static final String CHANTE_TYPE_10 = "10";

	/** 信息变更类型 10:外网，信息项变更需受理（外网使用） */
	public static final String CHANTE_TYPE_11 = "11";
	/** 信息变更类型 5: 丧偶减除申请人 */
	public static final String CHANTE_TYPE_5 = "5";
	/** 信息变更类型 6: 丧偶递补为申请人 */
	public static final String CHANTE_TYPE_6 = "6";
	/** 信息变更类型 7: 离异减除申请人 */
	public static final String CHANTE_TYPE_7 = "7";
	/** 信息变更类型 8: 离异递补为申请人 */
	public static final String CHANTE_TYPE_8 = "8";
	/** 信息变更类型 9: 减少共同申请人 */
	public static final String CHANTE_TYPE_9 = "9";

	/** 短信发送任务发送标识 0 未发送 */
	public static final String SEND_FLAG_WFS = "0";
	/** 短信发送任务发送标识 1 已发送 */
	public static final String SEND_FLAG_YFS = "1";
	/** 短信发送任务发送标识 2 正在发送 */
	public static final String SEND_FLAG_NOW = "2";
	/** 短信发送任务发送标识 3 发送失败 */
	public static final String SEND_FLAG_FAIL = "3";

	/** 变更处理状态 0: 未确认 */
	public static final String CHANTE_STATE_0 = "0";
	/** 变更处理状态 1: 确认变更 */
	public static final String CHANTE_STATE_1 = "1";
	/** 变更处理状态 2: 确认不变更 */
	public static final String CHANTE_STATE_2 = "2";

	/** 变更处理状态 更新类别(1-更新或插入) */
	public static final String CHANTE_TYPE_ONE = "1";
	/** 变更处理状态 更新类别(2-仅更新) */
	public static final String CHANTE_TYPE_TWO = "2";

	/** 操作变更类别 外网： A: 内网变更项操作(增加共同申请人，结婚增加配偶)（需内网受理） */
	public static final String BIANGE_TYPE_A = "A";
	/** 操作变更类别 外网： B: 外网变更户籍(无用) */
	public static final String BIANGE_TYPE_B = "B";
	/** 操作变更类别 外网： C: 外网直接更新信息(外网使用)*/
	public static final String BIANGE_TYPE_C = "C";
	/** 操作变更类别 外网： G: 内网直接更新信息 （内网使用） */
	public static final String BIANGE_TYPE_G = "G";
	/** 操作变更类别 内网： D: 减少共同申请人 */
	public static final String BIANGE_TYPE_D = "D";
	/** 操作变更类别 内网： E: 离异变更主申请人 */
	public static final String BIANGE_TYPE_E = "E";
	/** 操作变更类别 内网： F: 丧偶变更主申请人 */
	public static final String BIANGE_TYPE_F = "F";
	/** 操作变更类别  外网: 外网信息变更*/
	public static final String BIANGE_TYPE_I = "I";

	/** 轮候类型 1:安居房轮候 */
	public static final String WAIT_TYPE_AJ = "1";
	/** 轮候类型 2:公租房轮候 */
	public static final String WAIT_TYPE_GZ = "2";

	/** 出册原因 3:信息变更 */
	public static final String OUT_REASON_3 = "3";
	/** 出册原因 5:选房出册 */
	public static final String OUT_REASON_5 = "5";
	/******************** 核查参数 **********************************/
	/** 中止核查 */
//	public static boolean isStop = false;
	/** 并发数 */
//	public static int IS_SYN_COUNT = 5;
	/** 剩余异常再次核查 */
//	public static int IS_SYN_AG_COUNT = 2;
	/** 完成剩余并发数 */
//	public static int[] UNCOMPLETE = new int[8];
	/** 核查批次 */
//	public static String CHECK_BATCH_ID = "";
	/** 核查总数 */
//	public static int[] HC_TOTAL = new int[8];
	/** 核查已完成 */
//	public static int[] HC_COMPLETE_NUM = new int[8];
	/** 实际核查已完成 */
//	public static int[] HC_AV_COMPLETE_NUM = new int[8];
	/** 核查已完成 */
//	public static int[] ACT_HC_COMPLETE_NUM = new int[8];
	/** 实际核查已完成 */
//	public static int[] ACT_HC_AV_COMPLETE_NUM = new int[8];
	/** 核查未完成 */
	// public static int []HC_UNCOMPLETE_NUM = new int[8];
	/** 核查状态 */
//	public static int[] checkRZ = new int[8];

//	public static String single = "";

	//public static Map<String, SingleFamliyCheckPojos> singleFamliyHzMap = new HashMap<String, SingleFamliyCheckPojos>();//申请表ID，核查批次信息

	/*
	//public static Map<String, SingleFamliyCheckPojos> hzMap = new HashMap<String, SingleFamliyCheckPojos>();//批次号，核查批次信息
	*/
	//public static int autoNum = 0;// 定时自动核查次数。
//	public static int maxNum = 3;// 定时最大重复核查次数。

//	public static long stopTime = 0;
	/** 申请环节 **/
//	public static String SHENQZT = "";

	/** 受理过渡期起止日期 1:开始时间 */
	public static final String SL_INTERIM_DATE_START = "1";
	/** 受理过渡期起止日期 2:截止时间 */
	public static final String SL_INTERIM_DATE_END = "2";

	/** 是否已阅读申报指引 1.是 */
	public static final String ISREADSBZY_Y = "1";

	/** 受理(审核)意见: 同意受理,移交区复核 */
	public static final String SLYJ_1 = "资料齐全,同意受理";
	/** 受理(审核)意见: 同意受理,移交区复核 */
	public static final String SLYJ_2 = "同意受理,移交区复核";
	//最大批次号
	public static long maxBatchId = 1l;


	//认租封存迁移常量
	/**
	 * 安居商品房bizcode
	 */
	public final static String AJF_BIZCODE = "0231";
	public final static String AJF_BIZCODE2 = "0232";
	public final static String AJF_BIZCODE3 = "0233";
	public final static String AJF_BIZCODE4 = "0234";

	/**
	 * 环节_进入轮候册
	 */
	public static final String HJ_JRLHC = "160";

	/**
	 * 环节_异常办结
	 */
	public static final String HJ_YCBJ = "180";

	/**
	 * 收件结论(CHECKRESULT) 状态_轮候册修改
	 */
	public static final String ZT_RCLHM = "1603";

	/** 区对应简写 */
	public static final String[] AERA_VALUE =new String[]{"SJ","FT","LH","YT","NS","BA","LG","GM","PS","LX","DP","SJ"};

	/**
	 * 放弃类型 弃选
	 */
	public static final String FQ_TYPE_QX = "1";

	/**
	 * 放弃类型 弃签
	 */
	public static final String FQ_TYPE_QQ = "2";

	/**
	 * 放弃类型 毁约
	 */
	public static final String FQ_TYPE_HY = "3";

	/**
	 * 用于衔接视图中显示原安居房没有轮候册时已经存在购房记录的数据。
	 * 特殊标记 1:是 2:否
	 */
	public static final String TESBZ_YES = "1";

	/**
	 * 特殊标记 否
	 */
	public static final String TESBZ_NO = "0";


	/**
	 * 婚姻信息转换证件类型描述
	 **/
	public static final Map desMap = new HashMap() {{
		put("RegisterInfo", "结婚登记信息");
		put("ReRegisterInfo", "补领结婚证信息");
		put("BreakInfo", "离婚登记信息");
		put("ReBreakInfo", "补领离婚证信息");
	}};

	/**
	 * 分配给统一申办受理平台的密钥用户
	 */
	public static final String TYSL_USER_KEY = "TYSL_APPLY";

	/**
	 * 分配给统一申办受理平台的用户名称（自定义名称）
	 */
	public static final String TYSL_USER_NAME = "统一申办受理平台用户";

	/**变更类型转换
	 *
	 */

	/**
	 * 婚姻信息转换证件类型描述
	 **/
	public static final Map changeTypeMap = new HashMap() {{
		put("add", ClqdConstants.BIANGE_TYPE_A);//增加共同申请人
		put("marry", ClqdConstants.BIANGE_TYPE_A);//婚姻情况（结婚）
		put("reduce", ClqdConstants.BIANGE_TYPE_D);//减少共同申请人
		put("changeItem", ClqdConstants.BIANGE_TYPE_G);//信息项修改
	}};


	/**
	 * 婚姻信息转换证件类型描述
	 **/
	public static final Map biangeTypeMap = new HashMap() {{
		put(ClqdConstants.BIANGE_TYPE_A,"add");//增加共同申请人
		put(ClqdConstants.BIANGE_TYPE_A,"marry");//婚姻情况（结婚）
		put(ClqdConstants.BIANGE_TYPE_D,"reduce");//减少共同申请人
		put(ClqdConstants.BIANGE_TYPE_G,"changeItem");//信息项修改
	}};



}
