### 日期时间格式正则表达式自动匹配 ###

# 年月日带分隔符的，自动支持yyyy-M-d格式；
^\d{4}-\d{1,2}-\d{1,2}$=yyyy-MM-dd
^\d{4}/\d{1,2}/\d{1,2}$=yyyy/MM/dd
# yyyyMMdd这种格式必须月、日都是两位的，否则无法区分；
^\d{8}$=yyyyMMdd
^\d{4}\.\d{1,2}\.\d{1,2}$=yyyy.MM.dd
^\d{4}年\d{1,2}\月\d{1,2}日$=yyyy年MM月dd日

# 时分秒
^\d{1,2}:\d{1,2}:\d{1,2}$=HH:mm:ss
^\d{1,2}\.\d{1,2}\.\d{1,2}$=HH.mm.ss
^\d{6}$=HHmmss
^\d{1,2}:\d{1,2}:\d{1,2}.\d{1,6}$=HH:mm:ss.SSS
^\d{1,2}\.\d{1,2}\.\d{1,2}.\d{1,6}$=HH.mm.ss.SSS
# 时分秒毫秒
^\d{9}$=HHmmssSSS

# 年月日时分秒
^\d{4}-\d{1,2}-\d{1,2} \d{1,2}:\d{1,2}:\d{1,2}$=yyyy-MM-dd HH:mm:ss
^\d{4}/\d{1,2}/\d{1,2} \d{1,2}:\d{1,2}:\d{1,2}$=yyyy/MM/dd HH:mm:ss
# yyyyMMddHHmmss这种格式必须月、日、时分秒都是两位的，否则无法区分；
^\d{14}$=yyyyMMddHHmmss
^\d{4}\.\d{1,2}\.\d{1,2} \d{1,2}:\d{1,2}:\d{1,2}$=yyyy.MM.dd HH:mm:ss

# 年月日时分秒毫秒
^\d{4}-\d{1,2}-\d{1,2} \d{1,2}:\d{1,2}:\d{1,2}\.\d{1,6}$=yyyy-MM-dd HH:mm:ss.SSS
^\d{4}/\d{1,2}/\d{1,2} \d{1,2}:\d{1,2}:\d{1,2}\.\d{1,6}$=yyyy/MM/dd HH:mm:ss.SSS
# 特殊情况特殊处理
^\d{17,20}$=yyyyMMddHHmmssSSS
^\d{4}\.\d{1,2}\.\d{1,2} \d{1,2}:\d{1,2}:\d{1,2}\.\d{1,6}$=yyyy.MM.dd HH:mm:ss.SSS
^\d{4}-\d{1,2}-\d{1,2}- \d{1,2}:\d{1,2}:\d{1,2}\.\d{1,6}$=yyyy-MM-dd-HH:mm:ss.SSS

# 年月日时分
^\d{4}-\d{1,2}-\d{1,2} \d{1,2}:\d{1,2}$=yyyy-MM-dd HH:mm
^\d{4}/\d{1,2}/\d{1,2} \d{1,2}:\d{1,2}$=yyyy/MM/dd HH:mm
# yyyyMMddHHmmss这种格式必须月、日、时分秒都是两位的，否则无法区分；
^\d{12}$=yyyyMMddHHmm
^\d{4}\.\d{1,2}\.\d{1,2} \d{1,2}:\d{1,2}$=yyyy.MM.dd HH:mm
