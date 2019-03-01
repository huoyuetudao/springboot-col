package com.iflytek.datawoodVoice.util;


import org.springframework.util.Assert;

import java.util.Map;

/**
 * @author yangxiao2
 *  常用常量定义
 */
public class Constants {

    public static final String DECODE_ID = "2";

    /**
     * check
     */
    public static final String CHECK_ENGL = "check";
    /**
     * mark
     */
    public static final String MARK_ENGL = "mark";
    /**
     * 数字5
     */
    public static final Integer NUM_FIVE = 5;

    /**
     * 数字6
     */
    public static final Integer NUM_SIX = 6;

    /**
     * 用户任务转移全部语音文件
     */
    public static final boolean IS_ALLTRANSFER = true;

    /**
     * IS_OK
     */
    public static final String IS_OK = "OK";

    /**
     * 快捷键默认值
     */
//    public static final String KEYBOARD = "[{'value':'1','title':'选中内容栏','keyCode':'49','fun':'getContent'},{'value':'Q','title':'上一句','keyCode':'81','fun':'goBack'},{'value':'E','title':'下一句','keyCode':'69','fun':'goNext'},{'value':'DELETE','title':'标记不可用','keyCode':'46','fun':'isBadData'},{'value':'SPACE','title':'播放','keyCode':'32','fun':'audioPlay'}]";
    public static final String KEYBOARD = "";

    /**
     * 通用标注：TYBZ,辅助标注的方言语种：FYBZ
     */
    public static final String TYBZFLAG = "TYBZ";

    /**
     * 通用标注：TYBZ,辅助标注的方言语种：FYBZ
     */
    public static final String FYBZFLAG = "FYBZ";

    /**
     * 连续语音标识，用于方言和连续语音标注任务提交
     */
    public static final String DSDECODE = "decode";

    /**
     * 方言语种标识，用于方言和连续语音标注任务提交
     */
    public static final String DSLANG = "dslang";

    /**
     * 噪声和有效语音的ItemCode
     */
    public static final String VOICE_DETECTION = "VOICE_DETECTION";

    /**
     * 军民类别的ItemCode
     */
    public static final String JM_LB = "JM_LB";

    /**
     * 性别的ItemCode
     */
    public static final String SEX = "SEX";

    /**
     * 关键词
     */
    public static final String KEY_WORD = "关键词";
    /**
     * 语种无关关键词，方向为空的标志
     */
    public static final String KEY_WORD_NO_DIRECTION_ID_FLAG ="--";

    /**
     * 增加操作
     */
    public static final String ADD = "保存";
    /**
     * 删除操作
     */
    public static final String DELETE = "删除";
    /**
     * 更新操作
     */
    public static final String UPDATE = "更新";
    /**
     * 查询操作
     */
    public static final String QUERY = "查询";
    /**
     * 查看操作
     */
    public static final String VIEW = "展示";
    /**
     * 导出操作
     */
    public static final String EXPORT = "导出";
    /**
     * 上传操作
     */
    public static final String UPLOAD = "上传";


    /**
     * 采样率
     */
    public static final int SAM_PLE_RATE = 8000;

    /**
     * 比特率
     */
    public static final int BIT_PER_SAMPLE = 16;

    /**
     * 声道
     */
    public static final int CHANNEL = 1;

    /**
     * 声纹基本信息表名
     */
    public static final String KEY_PERSON_FLAG = "keyPerson";

    /**
     * 声纹语音信息表名
     */
    public static final String KEY_PERSON_FILE_FLAG = "keyPersonFile";

    /**
     * 标注员角色代码
     */
    public static final String MARK_ROLE_CODE = "0000004";

    /**
     * 检查员角色代码
     */
    public static final String CHECK_ROLE_CODE = "0000005";

    /**
     * 管理员角色代码
     */
    public static final String ADMIN_ROLE_CODE = "SYS";

    /**
     * 开始检查任务
     */
    public static final String START_CHECK_TASK = "开始检查任务";

    /**
     * 开始标注任务
     */
    public static final String START_MARK_TASK = "开始标注任务";

    /**
     * 检查不通过
     */
    public static final String CHECK_NOT_PASS = "检查不通过";

    /**
     * 检查通过
     */
    public static final String CHECK_PASS = "检查通过";

    /**
     * 打回修改
     */
    public static final String FAIL_TO_PASS = "打回修改";

    /**
     * 检查通过
     */
    public static final int CHECK_PASS_STATUS = 1;

    /**
     * 检查任务
     */
    public static final int CHECK_WORK_TYPE = 2;

    /**
     * 不通过
     */
    public static final Byte NOT_PASS = 0;

    /**
     * 打回
     */
    public static final Byte PLAY_BACK = 1;

    /**
     * 语音片段没有被检查过
     */
    public static final Byte UNPROCESSED = 0;

    /**
     * 语音片段检查过
     */
    public static final Byte PROCESSED = 1;

    /**
     * 语音片段检查过
     */
    public static final Byte PENDINGPROCESSED = 2;

    /**
     * 待定数据
     */
    public static final Byte PENDING = 2;

    /**
     * 坏数据
     */
    public static final Byte BAD = 1;

    /**
     * 好数据
     */
    public static final Byte GOOD = 0;

    /**
     * 没有被检查
     */
    public static final String IS_CHECK = "0";

    /**
     * 已经检查
     */
    public static final String IS_CHECKED = "1";

    /**
     * 需要变化
     */
    public static final String IS_NEED_CHANGE = "1";

    /**
     * processedSegCount键值
     */
    public static final String PROCESSED_SEG_COUNT_KEY = "processedSegCount";

    /**
     * processedSegDuration键值
     */
    public static final String PROCESSED_SEG_DURATION_KEY = "processedSegDuration";

    /**
     * selectSegCount键值
     */
    public static final String SELECT_SEG_COUNT_KEY = "selectSegCount";

    /**
     * taskAudioId键值
     */
    public static final String TASK_AUDIO_KEY = "taskAudioId";

    /**
     * userTaskId键值
     */
    public static final String USER_TASK_KEY = "userTaskId";

    /**
     * updateTime键值
     */
    public static final String UPDATE_TIME_KEY = "updateTime";

    /**
     * segmentResultId键值
     */
    public static final String SEGMENT_RESULT_ID_KEY = "segmentResultId";

    /**
     * isValid键值
     */
    public static final String IS_VALID_KEY = "isValid";

    /**
     * currentPageNo键值
     */
    public static final String CURRENT_PAGE_NO_KEY = "currentPageNo";

    /**
     * pageSize键值
     */
    public static final String PAGE_SIZE_KEY = "pageSize";

    /**
     * recheckResult键值
     */
    public static final String RECHECK_RESULT_KEY = "recheckResult";

    /**
     * checkTaskId键值
     */
    public static final String CHECK_TASK_ID_KEY = "checkTaskId";

    /**
     * isBadData键值
     */
    public static final String IS_BAD_DATA_KEY = "isBadData";

    /**
     * badDataStatus键值
     */
    public static final String BAD_DATA_STATUS = "badDataStatus";

    /**
     * accuracy键值
     */
    public static final String ACCURACY_KEY = "accuracy";

    /**
     * 任务统计不显示声纹标注
     */
    public static final String VOICE_DISMISS = "voice";

    /**
     * 百分数
     */
    public static final int PERCENT_NUM = 100;

    /**
     * 需要切换
     */
    public static final String NEED_CHANGE = "1";

    /**
     * 字符串0
     */
    public static final String STRING_ZERO = "0";

    /**
     * 字符串1
     */
    public static final String STRING_ONE = "1";

    /**
     * 字符串1
     */
    public static final String STRING_TWO = "2";

    /**
     * 百分号
     */
    public static final String PERCENT = "%";

    /**
     * 空字符串
     */
    public static final double DOUBLE_ONE = 1.0;

    /**
     * 空字符串
     */
    public static final int BYTE_SIZE = 1024;

    /**
     * 空字符串
     */
    public static final String EMPTY_STRING = "";

    /**
     * 浮点型格式化格式
     */
    public static final String DECIMAL_FORMAT = "######0.00";

    /**
     * 默认浮点值
     */
    public static final String DEFAULT_DECIMAL = "0.00";

    /**
     * 浮点值结尾
     */
    public static final String DOUBLE_END = ".00";

    /**
     * 只能导出权限
     */
    public static final String PERMISSION_LEVEL_EXPORT = "1";

    /**
     * 新建，标注，删除，导出权限
     */
    public static final String PERMISSION_LEVEL_ALL = "2";

    /**
     * 一个人数据方式
     */
    public static final String DATA_TYPE_A = "单人";

    /**
     * 两个人数据方式
     */
    public static final String DATA_TYPE_AB = "双人";

    /**
     * 未知数据方式
     */
    public static final String DATA_TYPE_NONE = "未知";

    /**
     * 初始化CODE
     */
    public static final int INIT_CODE = 0;

    /**
     * 初始化float类型CODE
     */
    public static final float FLOAT_INIT_CODE = 0.0f;

    /**
     * 初始化CODE
     */
    public static final int IS_RECHECK = 1;

    /**
     * 单位类型-自身
     */
    public static final String ORG_TYPE_ONE = "0";

    /**
     * 单位类型-自身和子单位
     */
    public static final String ORG_TYPE_CHILD = "1";

    /**
     * 更新失败
     */
    public static final String UPDATE_FAIL = "更新失败";

    /**
     * 查询失败
     */
    public static final String SELECT_FAIL = "没有查询到数据";

    /**
     * 语音无头
     */
    public static final String VOICE_NO_HEAD = "存在无头语音,请选择无头语音格式!";

    /**
     * 批次名称重复
     */
    public static final String BATCH_NAME_EXIST = "批次名称重复!";

    /**
     * 获取数据成功
     */
    public static final String LOAD_SUCCESS = "LOAD_SUCCESS";

    /**
     * 获取数据失败
     */
    public static final String LOAD_ERROR = "LOAD_ERROR";

    /**
     * 操作数据成功
     */
    public static final String OPER_SUCCESS = "OPER_SUCCESS";

    /**
     * 操作数据失败
     */
    public static final String OPER_ERROR = "OPER_ERROR";

    /**
     * 大任务名称相同
     */
    public static final String TASK_NAME_SAME = "TASK_NAME_SAME";

    /**
     * 大任务名称相同
     */
    public static final String FORBIDEN_CREATE_TASK = "创建任务条件不满足！";

    /**
     * 语音已被创建任务
     */
    public static final String VOICE_BE_USED = "VOICE_BE_USED";

    /**
     * 文件夹不存在
     */
    public static final String FILE_PATH_NOEXITS = "FILE_PATH_NOEXITS";

    /**
     * 语音文件夹包含非法字符
     */
    public static final String FILE_NAME_WRONGFUL = "FILE_NAME_WRONGFUL";

    /**
     * 文件夹不包括语音文件
     */
    public static final String FILE_PATH_NOINCLUDE_AUDIO = "FILE_PATH_NOINCLUDE_AUDIO";

    /**
     * 逗号
     */
    public static final String COMMA = ",";

    /**
     * 标注类型-连续语音
     */
    public static final String MARKTYPE_DECODE = "3";

    /**
     * 标注类型-方言语种
     */
    public static final int MARKTYPE_LANGUAGE = 2;

    /**
     * 标注类型-声纹标注
     */
    public static final int MARKTYPE_VOICE = 1;

    /**
     * 任务分配-启动
     */
    public static final String TASK_ISSTART = "1";

    /**
     * 删除标识-未删除
     */
    public static final int DELETE_NO = 0;

    /**
     * 标注状态名称-待标注
     */
    public static final String MARKSTATUSNAME_WAITMARK = "待标注";

    /**
     * 标注状态名称-标注中
     */
    public static final String MARKSTATUSNAME_MARKING = "标注中";

    /**
     * 标注状态名称-已标注
     */
    public static final String MARKSTATUSNAME_MARKED = "已标注";

    /**
     * 打回修改标注状态名称-已检查
     */
    public static final String MARKSTATUSNAME_CHECKED = "已检查";

    /**
     * 省级管理员
     */
    public static final String XTGLY = "省厅管理员";

    /**
     * 市级管理员
     */
    public static final String SJGLY = "地市管理员";

    /**
     * 任务管理员
     */
    public static final String RWGLY = "任务操作员";

    /**
     * 标注员
     */
    public static final String BZY = "标注员";

    /**
     * 省级管理员标识
     */
    public static final String XTGLY_SIGN = "X";

    /**
     * 市级管理员标识
     */
    public static final String SJGLY_SIGN = "S";

    /**
     * 任务管理员标识
     */
    public static final String RWGLY_SIGN = "R";

    /**
     * 字符串为空
     */
    public static final String IS_EMPTY = "";

    /**
     * 已删除标识
     */
    public static final Integer IS_DELETE = 1;

    /**
     * 异常信息
     */
    public static final String EXCEPTION_MESSAGE_KEY = "hello.search.result.err";

    /**
     * 操作失败信息
     */
    public static final String FAIL_MESSAGE_KEY = "common.msg.fail";

    /**
     * 参数不为空信息
     */
    public static final String PARAM_MESSAGE_KEY = "common.msg.paramnotnull";

    /**
     * 分配复查任务失败
     */
    public static final String RECHECKE_FAIL_MESSAGE = "分配复查任务失败！";

    /**
     * 存在不能复查的项
     */
    public static final String VALIDATE_FAIL_KEY = "存在不能复查的项！";

    /**
     * 保存失败
     */
    public static final String SAVE_FAIL_KEY = "保存失败";

    /**
     * 音频内容过长
     */
    public static final String PARAM_MARK_TEXT_LONG = "音频内容过长";

    /**
     * 用户是否为空信息
     */
    public static final String USER_MESSAGE_KEY = "common.msg.userinvalid";

    /**
     * 记录未找到
     */
    public static final String NOT_FOUND_KEY = "common.msg.notfound";

    /**
     * 记录未找到
     */
    public static final String USER_TASK_DELETE = "标注任务已删除";

    /**
     * 标注员
     */
    public static final String MARK_USER = "标注员";

    /**
     * 检查员
     */
    public static final String CHECK_USER = "检查员";

    /**
     * 是否为检查员
     */
    public static final String IS_CHECK_USER = "1";

    /**
     * 有权限
     */
    public static final String CREATOR = "1";

    /**
     * 任务编辑
     */
    public static final String EDIT_TASK = "任务编辑";

    /**
     * 任务归档
     */
    public static final String FILE_TASK = "任务归档";

    /**
     * 自然数0
     */
    public static final int NUM_ZERO = 0;

    /**
     * 自然数1
     */
    public static final int NUM_ONE = 1;

    /**
     * 自然数2
     */
    public static final int NUM_TWO = 2;

    /**
     * 自然数3
     */
    public static final int NUM_THREE = 3;

    /**
     * CREATE_TIME
     */
    public static final String CREATE_TIME = "CREATE_TIME";

    /**
     * UPDATE_TIME
     */
    public static final String UPDATE_TIME = "UPDATE_TIME";

    /**
     * 检查员
     */
    public static final String USER_NAME = "USER_NAME";

    /**
     * 提交时间
     */
    public static final String SUBMIT_TIME = "SUBMIT_TIME";

    /**
     * 上传时间
     */
    public static final String UPLOAD_TIME = "UPLOAD_TIME";

    /**
     * U_CREATE_TIME:u.CREATE_TIME.
     *
     * @since JDK 1.6
     */
    public static final String U_CREATE_TIME = "u.CREATE_TIME";

    /**
     * DESC
     */
    public static final String ORDER_DESC = "DESC";

    /**
     * ASC
     */
    public static final String ORDER_ASC = "ASC";

    /**
     * 待标注状态码
     */
    public static final int PRE_MARK_CODE = 5;

    /**
     * 标注中状态码
     */
    public static final int MARKING_CODE = 6;

    /**
     * 标注完成状态码
     */
    public static final int MARKED_CODE = 7;

    /**
     * 待检查状态码
     */
    public static final int PRE_CHECK_CODE = 8;

    /**
     * 检查中状态码
     */
    public static final int CHECKING_CODE = 9;

    /**
     * 检查完成状态码
     */
    public static final int CHECKED_CODE = 10;

    /**
     * FAIL_PASS_CODE:打回修改状态码
     *
     * @since JDK 1.6
     */
    public static final int FAIL_PASS_CODE = 11;

    /**
     * 待检查
     *
     * @since JDK 1.6
     */
    public static final String CHECK = "待检查";

    /**
     * 检查中.
     *
     * @since JDK 1.6
     */
    public static final String CHECKING = "检查中";

    /**
     * 检查完成.
     *
     * @since JDK 1.6
     */
    public static final String CHECKED = "检查完成";

    /**
     * 待提交
     */
    public static final String SUBMIT = "待提交";

    /**
     * USER_TASK_MARK:小任务未标注.
     *
     * @since JDK 1.6
     */
    public static final String USER_TASK_MARK = "待标注";

    /**
     * USER_MARKING:小任务标注中.
     *
     * @since JDK 1.6
     */
    public static final String USER_TASK_MARKING = "标注中";

    /**
     * USER_TASK_MARKED:小任务标注完成.
     *
     * @since JDK 1.6
     */
    public static final String USER_TASK_MARKED = "标注完成";

    /**
     * USER_TASK_FAIL_PASS:打回修改.
     *
     * @since JDK 1.6
     */
    public static final String USER_TASK_FAIL_PASS = "打回修改";

    /**
     * USER_CHECKTASK_RECHECKING:复检中.
     *
     * @since JDK 1.6
     */
    public static final String USER_CHECKTASK_RECHECKING = "复检中";

    /**
     * USER_CHECKTASK_UNRECHECK:复检不合格.
     *
     * @since JDK 1.6
     */
    public static final String USER_CHECKTASK_UNRECHECK = "复检不合格";

    /**
     * USER_CHECKTASK_RECHECKED:复检合格.
     *
     * @since JDK 1.6
     */
    public static final String USER_CHECKTASK_RECHECKED = "复检合格";

    /**
     * BACK_SLANT:反斜杠.
     *
     * @since JDK 1.6
     */
    public static final String BACK_SLANT = "/";

    /**
     * LANG_TAG:语种标签.
     *
     * @since JDK 1.6
     */
    public static final String LANG_TAG = "LANG_TAG";

    /**
     * DECODE_TAG:语音标签.
     *
     * @since JDK 1.6
     */
    public static final String DECODE_TAG = "DECODE_TAG";

    /**
     * MARK_TYPE:标注类型.
     *
     * @since JDK 1.6
     */
    public static final String MARK_TYPE = "MARK_TYPE";

    public static final String COMMON_MARK_TYPE = "COMMON_MARK_TYPE";

    /**
     * LANG:语种类型.
     *
     * @since JDK 1.6
     */
    public static final String LANG = "LANG";


    /**
     * 通用标注连续语音标签
     */
    public static final String LANG_DECODE = "LANG_DECODE";

    /**
     * 是否是最后一个片段或语音
     */
    public static final String IS_LAST = "1";

    /**
     * 相等
     */
    public static final String EQUAL = "1";

    /**
     * 是否打回修改
     */
    public static final String IS_FAIL_TO_PASS = "1";

    /**
     * 是否才开始检查任务
     */
    public static final int START_CHECK = 2;

    /**
     * 是否才开始语音
     */
    public static final int START_CHECK_AUDIO = 1;

    /**
     * <p>通用的模糊查询处理
     * <p><功能详细描述>
     *
     * @param str
     * @return
     * @author ylshi
     * @see [类、类#方法、类#成员]
     */
    public static String handel(String str) {
        str = str.replace("\\", "\\\\\\");
        str = str.replace("%", "\\%");
        str = str.replace("_", "\\_");
        str = str.replace("/", "\\/");
        str.trim();
        return "%" + str + "%";
    }

    /**
     * 获取字符落在的字符区间
     *
     * @param ch
     * @param alphaWidth 字符区间的宽度
     * @return
     */
    public static String getAlphaBound(char ch, int alphaWidth) {
        ch = Character.toUpperCase(ch);
        Assert.isTrue(ch >= 'A' && ch <= 'Z' && alphaWidth >= 1);
        ch = Character.toUpperCase(ch);
        char start = 'A';
        for (; start <= 'Z'; start += alphaWidth) {
            if (ch >= start && ch < start + alphaWidth) {
                break;
            }
        }
        char end = start + alphaWidth - 1 >= 'Z' ? 'Z' : (char) (start + alphaWidth - 1);
        StringBuilder builder = new StringBuilder();
        String blank = " ";
        for (ch = start; ch <= end; ch++) {
            if (ch != end) {
                builder.append(ch + blank);
            } else {
                builder.append(ch);
            }
        }

        return builder.toString();
    }

    /**
     * 上一条标识
     */
    public static final String BAR_UP = "0";

    /**
     * 下一条标识
     */
    public static final String BAR_DOWN = "1";

    /**
     * 语种方言字典项代码
     */
    public static final String LANGUAGEITEMCODE = "LANG_TAG";

    /**
     * 工种类型 1-标注  2-检查
     */
    public static final int WORKTYPE_MARK = 1;

    /**
     * 语音标注入口  任务列表
     */
    public static final String MARK_DECODE_FROM_LIST = "list";

    /**
     * 语音标注入口 单个语音
     */
    public static final String MARK_DECODE_FROM_SINGLE = "single";

    /**
     * 语音自检入口 任务列表
     */
    public static final String SELFCHECK_DECODE_FROM_LIST = "selfcheck";

    /**
     * 下一条
     */
    public static final String AUDIO_HANDEL_TYPE_NEXT = "next";

    /**
     * 上一条
     */
    public static final String AUDIO_HANDEL_TYPE_LAST = "last";

    /**
     * 保存
     */
    public static final String AUDIO_HANDEL_TYPE_SAVE = "save";

    /**
     * 标记可用
     */
    public static final String AUDIO_HANDEL_TYPE_USE = "0";

    /**
     * 标记不可用
     */
    public static final String AUDIO_HANDEL_TYPE_USELESS = "1";

    /**
     * JSONObject的text
     */
    public static final String JSON_TEXT = "text";

    /**
     * JSONObject的value
     */
    public static final String JSON_VALUE = "value";

    /**
     * 表前缀
     */
    public static final String SQL_PREFIX = "cut.";

    /**
     * 表前缀
     */
    public static final String USER_TASK_PREFIX = "a.";

    /**
     * 导出标识-标注
     */
    public static final String EXPORT_FLAG_MARK = "1";

    /**
     * 导出标识-检查
     */
    public static final String EXPORT_FLAG_CHECK = "2";

    /**
     * 一倍制表符
     */
    public static final String EXPORT_SPACE_ONE = "\t";

    /**
     * 二倍制表符
     */
    public static final String EXPORT_SPACE_TWO = "\t\t";

    /**
     * 三倍制表符
     */
    public static final String EXPORT_SPACE_THREE = "\t\t\t";

    /**
     * 换行符
     */
    public static final String EXPORT_NEWLINE = "\r\n";

    /**
     * 任务日志-开始标注
     */
    public static final String TASK_LOG_BEGINMARK = "1";

    /**
     * 任务日志-标注完成
     */
    public static final String TASK_LOG_MARKCOMPLETE = "2";

    /**
     * 任务日志-标注提交
     */
    public static final String TASK_LOG_MARKSUBMIT = "3";

    /**
     * 语种标注-好数据tab标识
     */
    public static final String LANGUAGE_MARK_GOOD_TAB = "0";

    /**
     * 语种标注-坏数据tab标识
     */
    public static final String LANGUAGE_MARK_BAD_TAB = "1";

    /**
     * 语种标注-所有数据tab标识
     */
    public static final String LANGUAGE_MARK_ALL_TAB = "2";

    /**
     * 用户任务类型-检查任务
     */
    public static final int USER_TASK_TYPE_CHECK = 2;

    /**
     * 用户任务状态-打回修改
     */
    public static final int USER_TASK_STATUS_PLAYBACK = 5;

    /**
     * 用户任务状态-检查中
     */
    public static final int USER_TASK_STATUS_CHECKING = 4;

    /**
     * 用户任务状态-检查通过
     */
    public static final int USER_TASK_STATUS_CHECKED = 6;

    /**
     * 用户检查任务-被复查
     */
    public static final Byte USER_CHECKTASK_RECHECK = 1;

    /**
     * 标注类型-方言语种
     */
    public static final String LANGUAGE_MARKTYPE = "2";

    /**
     * 是否自检-是
     */
    public static final String IS_SELF_CHECK = "1";

    /**
     * 声纹标注保存(暂存)
     */
    public static final String VOICE_MARK_SAVE = "0";

    /**
     * 是否换文件
     */
    public static final String CHANGE_FILE = "1";

    /**
     * 已处理的文件数
     */
    public static final String PRO_SEG_COUNT = "1";

    /**
     * 空值处理
     */
    public static final String ENPTY_STR = "--";

    /**
     * 删除成功
     */
    public static final String DELETE_SUSCESS = "DELETE_SUSCESS";

    /**
     * 添加成功
     */
    public static final String ADD_SUSCESS = "ADD_SUSCESS";

    /**
     * 方言添加重名
     */
    public static final String EXIST_LANG = "EXIST_LANG";
    /**
     * 不能删除
     */
    public static final String NOCAN_DELETE = "NOCAN_DELETE";

    /**
     * 性别标签
     */
    public static final String SEX_TAG = "3";

    /**
     * 对象或身份标签
     */
    public static final String OBJECT_TAG = "4";

    /**
     * 声纹基本本信息代号重名
     */
    public static final String EXIST_CASENAME = "EXIST_CASENAME";

    /**
     * 归档任务导出文件语种层的代号
     */
    public static final String LANGUAGE_LAYER = "语种层";

    /**
     * 归档任务导出文件机型层的代号
     */
    public static final String JX_LAYER = "机型层";

    /**
     * 归档任务导出文件性别层的代号
     */
    public static final String SEX_LAYER = "性别层";

    /**
     * 归档任务导出文件检出层的代号
     */
    public static final String CHECK_LAYER = "检出层";

    /**
     * 归档任务导出文件说话人层的代号
     */
    public static final String SPEAKER_LAYER = "说话人层";

    /**
     * 归档任务导出文件关键词层的代号
     */
    public static final String KEYWORD_LAYER = "关键词层";

    /**
     * 归档任务导出文件转写层的代号
     */
    public static final String CONVERT_LAYER = "转写层";

    /**
     * 归档任务导出文件各层集合数组
     */
    public static final String[] layerArray = {LANGUAGE_LAYER, SEX_LAYER, CHECK_LAYER, SPEAKER_LAYER, KEYWORD_LAYER, CONVERT_LAYER};

    /**
     * false
     */
    public static final String FALSE = "false";

    /**
     * true
     */
    public static final String TRUE = "true";

    /**
     * 结果重复
     */
    public static final String REPEAT = "标注结果重复";

    /**
     * 语音检出代号
     */
    public static final String CHECK_NUMBER = "84";

    /**
     * 性别代号
     */
    public static final String SEX_NUMBER = "85";

    /**
     * 机型代号
     */
    public static final String JX_NUMBER = "98";

    /**
     * 关键词代号
     */
    public static final String KEYWORD_NUMBER = "90";

    /**
     * 方言语种代号
     */
    public static final String LANGUAGE_NUMBER = "1";

    /**
     * 说话人代号
     */
    public static final String KEYPERSON_NUMBER = "100";

    /**
     * 连续语音代号
     */
    public static final String CONTINUOUS_SPEECH_NUMBER = "2";

    /**
     * 文件路径错误
     */
    public static final String DIRECTORY_IS_NOT_ALLOW = "文件路径错误";

    /**
     * 文件不存在
     */
    public static final String FILE_IS_NOT_EXIST = "文件不存在";

    /**
     * file_result表别称
     */
    public static final String FILE_RESULT = "istp_file_result";

    /**
     * common_check_result表别称
     */
    public static final String COMMON_CHECK_RESULT = "istp_common_check_result";

    /**
     * common_mark_result表别称
     */
    public static final String COMMON_MARK_RESULT = "istp_common_mark_result";

    /**
     * segment_result表别称
     */
    public static final String SEGMENT_RESULT = "istp_segment_result";

    /**
     * istp_face_segment_info表别称
     */
    public static final String FACE_SEGMENT_INFO = "istp_face_segment_info";

    /**
     * istp_face_audio_info表别称
     */
    public static final String FACE_AUDIO_INFO = "istp_face_audio_info";

    /**
     * 导出训练数据的语音检出类型
     */
    public static final String VAD = "VAD";

    /**
     * 导出训练数据的男女声类型
     */
    public static final String GID = "GID";

    /**
     * 导出训练数据的语种类型
     */
    public static final String LID = "LID";

    /**
     * 导出训练数据的关键词类型
     */
    public static final String LIKWS = "LIKWS";

    /**
     * 导出训练数据的转写类型
     */
    public static final String IST = "IST";

    /**
     * 导出训练数据的转写类型
     */
    public static final String JX = "JX";


    /**
     * 存储语音上传fileItemKey
     */
    public static final String UPLOAD_VOICE_FILEITEM_KEY = "fileItem";

    /**
     * 存储语音上传countKey
     */
    public static final String UPLOAD_VOICE_COUNT_KEY = "count";

    /**
     * 存储语音上传voiceLibKey
     */
    public static final String UPLOAD_VOICE_VOICELIB_KEY = "voiceLib";


    /**
     * 判断单词是否拼写正确TRUE
     */
    public static final String IS_CORRECTWORD_TRUE = "true";

    /**
     * 判断单词是否拼写正确FALSE
     */
    public static final String IS_CORRECTWORD_FALSE = "false";


    /**
     * 标注或者检查markText最大的长度
     */
    public static final int MAX_MARK_TEXT_LENGTH = 3000;

    /**
     * 该机型正在使用
     */
    public static final String JX_BE_USED = "JX_BE_USED";

    /**
     * 民用机型
     */
    public static final String CIVIL_AIRCRAFT = "FX001";

    /**
     * 辅助标注
     */
    public static final String MARK_METHOD = "1";

    /**
     * 通用标注
     */
    public static final String COMMON_MARK_METHOD = "2";

    /**
     * 辅助标注  连续语音 category_code
     */
    public static final String CONTINUOUS_SPEECH = "3";

    /**
     * 辅助标注  方言语种 category_code
     */
    public static final String DIALECT_LANGUAGE = "2";

    /**
     * 绩效统计，用于控制查找任务(查询归档还是全部)类型，对应字段在system.properties文件中
     */
    public final static String ARCHIVED_STATUS_FLAG = "isOnlyFileHold";
    /**
     * 控制方向字段，具体定义在system.properties文件中
     */
    public final static String DIRECTION_STATUS_FLAG = "direction_is_open";
    /**
     * 是否切音，1是切音
     */
    public final static String CUT_SPEECH_FLAG ="is.open.cut.speech";


    /**
     * 获取方言语种
     */
    public static final String getMarkLang(String val) {
        String text = IS_EMPTY;
        if ("1".equals(val)) {
            text = "河南方言";
        } else if ("2".equals(val)) {
            text = "重庆方言";
        } else if ("3".equals(val)) {
            text = "淮北方言";
        } else if ("4".equals(val)) {
            text = "四川方言";
        } else if ("5".equals(val)) {
            text = "安庆方言";
        } else if ("6".equals(val)) {
            text = "昆明方言";
        }
        return text;
    }

    /**
     * 获取连续语音性别
     */
    public static final String getMarkGender(String val) {
        String text = IS_EMPTY;
        if ("0".equals(val)) {
            text = "Male";
        } else if ("1".equals(val)) {
            text = "Female";
        }
        return text;
    }

    /**
     * 获取连续语音标注角色
     */
    public static final String getMarkRole(String val) {
        String text = IS_EMPTY;
        if ("1".equals(val)) {
            text = "B";
        } else if ("0".equals(val)) {
            text = "A";
        }
        return text;
    }

}
