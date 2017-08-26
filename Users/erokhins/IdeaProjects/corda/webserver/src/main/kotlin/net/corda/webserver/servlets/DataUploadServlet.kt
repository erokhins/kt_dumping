'HttpServlet' @ [15:27] ==> public constructor HttpServlet() defined in javax.servlet.http.HttpServlet[JavaClassConstructorDescriptor]

'loggerFor' @ [16:23] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> DataUploadServlet

'Throws' @ [18:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [18:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'isMultipartContent' @ [20:45] ==> public final fun isMultipartContent(p0: (HttpServletRequest..HttpServletRequest?)): Boolean defined in org.apache.commons.fileupload.servlet.ServletFileUpload[JavaMethodDescriptor]

'req' @ [20:64] ==> value-parameter req: HttpServletRequest defined in net.corda.webserver.servlets.DataUploadServlet.doPost[ValueParameterDescriptorImpl]

'servletContext' @ [21:19] ==> public final val DataUploadServlet.servletContext: (ServletContext..ServletContext?)[MyPropertyDescriptor]

'getAttribute' @ [21:34] ==> public abstract fun getAttribute(p0: (String..String?)): (Any..Any?) defined in javax.servlet.ServletContext[JavaMethodDescriptor]

'!' @ [23:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isMultipart' @ [23:14] ==> val isMultipart: Boolean defined in net.corda.webserver.servlets.DataUploadServlet.doPost[LocalVariableDescriptor]

'resp' @ [24:13] ==> value-parameter resp: HttpServletResponse defined in net.corda.webserver.servlets.DataUploadServlet.doPost[ValueParameterDescriptorImpl]

'sendError' @ [24:18] ==> public abstract fun sendError(p0: Int, p1: (String..String?)): Unit defined in javax.servlet.http.HttpServletResponse[JavaMethodDescriptor]

'SC_BAD_REQUEST' @ [24:48] ==> public const final val SC_BAD_REQUEST: Int defined in javax.servlet.http.HttpServletResponse[JavaPropertyDescriptor]

'ServletFileUpload' @ [28:22] ==> public constructor ServletFileUpload() defined in org.apache.commons.fileupload.servlet.ServletFileUpload[JavaClassConstructorDescriptor]

'upload' @ [29:24] ==> val upload: ServletFileUpload defined in net.corda.webserver.servlets.DataUploadServlet.doPost[LocalVariableDescriptor]

'getItemIterator' @ [29:31] ==> public open fun getItemIterator(p0: (HttpServletRequest..HttpServletRequest?)): (FileItemIterator..FileItemIterator?) defined in org.apache.commons.fileupload.servlet.ServletFileUpload[JavaMethodDescriptor]

'req' @ [29:47] ==> value-parameter req: HttpServletRequest defined in net.corda.webserver.servlets.DataUploadServlet.doPost[ValueParameterDescriptorImpl]

'ArrayList' @ [30:24] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'!' @ [32:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'iterator' @ [32:14] ==> val iterator: (FileItemIterator..FileItemIterator?) defined in net.corda.webserver.servlets.DataUploadServlet.doPost[LocalVariableDescriptor]

'hasNext' @ [32:23] ==> public abstract operator fun hasNext(): Boolean defined in org.apache.commons.fileupload.FileItemIterator[JavaMethodDescriptor]

'resp' @ [33:13] ==> value-parameter resp: HttpServletResponse defined in net.corda.webserver.servlets.DataUploadServlet.doPost[ValueParameterDescriptorImpl]

'sendError' @ [33:18] ==> public abstract fun sendError(p0: Int, p1: (String..String?)): Unit defined in javax.servlet.http.HttpServletResponse[JavaMethodDescriptor]

'SC_BAD_REQUEST' @ [33:48] ==> public const final val SC_BAD_REQUEST: Int defined in javax.servlet.http.HttpServletResponse[JavaPropertyDescriptor]

'println' @ [37:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'message' @ [37:21] ==> value-parameter message: String defined in net.corda.webserver.servlets.DataUploadServlet.doPost.reportError[ValueParameterDescriptorImpl]

'resp' @ [38:13] ==> value-parameter resp: HttpServletResponse defined in net.corda.webserver.servlets.DataUploadServlet.doPost[ValueParameterDescriptorImpl]

'sendError' @ [38:18] ==> public abstract fun sendError(p0: Int, p1: (String..String?)): Unit defined in javax.servlet.http.HttpServletResponse[JavaMethodDescriptor]

'SC_BAD_REQUEST' @ [38:48] ==> public const final val SC_BAD_REQUEST: Int defined in javax.servlet.http.HttpServletResponse[JavaPropertyDescriptor]

'message' @ [38:64] ==> value-parameter message: String defined in net.corda.webserver.servlets.DataUploadServlet.doPost.reportError[ValueParameterDescriptorImpl]

'iterator' @ [40:16] ==> val iterator: (FileItemIterator..FileItemIterator?) defined in net.corda.webserver.servlets.DataUploadServlet.doPost[LocalVariableDescriptor]

'hasNext' @ [40:25] ==> public abstract operator fun hasNext(): Boolean defined in org.apache.commons.fileupload.FileItemIterator[JavaMethodDescriptor]

'iterator' @ [41:24] ==> val iterator: (FileItemIterator..FileItemIterator?) defined in net.corda.webserver.servlets.DataUploadServlet.doPost[LocalVariableDescriptor]

'next' @ [41:33] ==> public abstract operator fun next(): (FileItemStream..FileItemStream?) defined in org.apache.commons.fileupload.FileItemIterator[JavaMethodDescriptor]

'log' @ [42:13] ==> private final val log: Logger defined in net.corda.webserver.servlets.DataUploadServlet[PropertyDescriptorImpl]

'info' @ [42:17] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'item' @ [42:35] ==> val item: (FileItemStream..FileItemStream?) defined in net.corda.webserver.servlets.DataUploadServlet.doPost[LocalVariableDescriptor]

'name' @ [42:40] ==> public final val FileItemStream.name: (String..String?)[MyPropertyDescriptor]

'req' @ [43:28] ==> value-parameter req: HttpServletRequest defined in net.corda.webserver.servlets.DataUploadServlet.doPost[ValueParameterDescriptorImpl]

'pathInfo' @ [43:32] ==> public final val HttpServletRequest.pathInfo: (String..String?)[MyPropertyDescriptor]

'substring' @ [43:41] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substringBefore' @ [43:54] ==> public fun String.substringBefore(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'dataType' @ [44:17] ==> val dataType: String defined in net.corda.webserver.servlets.DataUploadServlet.doPost[LocalVariableDescriptor]

'reportError' @ [45:17] ==> local final fun reportError(message: String): Unit defined in net.corda.webserver.servlets.DataUploadServlet.doPost[SimpleFunctionDescriptorImpl]

'dataType' @ [45:82] ==> val dataType: String defined in net.corda.webserver.servlets.DataUploadServlet.doPost[LocalVariableDescriptor]

'messages' @ [49:17] ==> val messages: ArrayList<String> defined in net.corda.webserver.servlets.DataUploadServlet.doPost[LocalVariableDescriptor]

'rpc' @ [49:29] ==> val rpc: CordaRPCOps defined in net.corda.webserver.servlets.DataUploadServlet.doPost[LocalVariableDescriptor]

'uploadAttachment' @ [49:33] ==> public abstract fun uploadAttachment(jar: InputStream): SecureHash defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'item' @ [49:50] ==> val item: (FileItemStream..FileItemStream?) defined in net.corda.webserver.servlets.DataUploadServlet.doPost[LocalVariableDescriptor]

'openStream' @ [49:55] ==> public abstract fun openStream(): (InputStream..InputStream?) defined in org.apache.commons.fileupload.FileItemStream[JavaMethodDescriptor]

'toString' @ [49:69] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'reportError' @ [51:17] ==> local final fun reportError(message: String): Unit defined in net.corda.webserver.servlets.DataUploadServlet.doPost[SimpleFunctionDescriptorImpl]

'e' @ [51:29] ==> val e: RuntimeException /* = RuntimeException */ defined in net.corda.webserver.servlets.DataUploadServlet.doPost[LocalVariableDescriptor]

'toString' @ [51:31] ==> public open fun toString(): String defined in java.lang.RuntimeException[DeserializedSimpleFunctionDescriptor]

'log' @ [54:13] ==> private final val log: Logger defined in net.corda.webserver.servlets.DataUploadServlet[PropertyDescriptorImpl]

'info' @ [54:17] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'item' @ [54:25] ==> val item: (FileItemStream..FileItemStream?) defined in net.corda.webserver.servlets.DataUploadServlet.doPost[LocalVariableDescriptor]

'name' @ [54:30] ==> public final val FileItemStream.name: (String..String?)[MyPropertyDescriptor]

'messages' @ [54:61] ==> val messages: ArrayList<String> defined in net.corda.webserver.servlets.DataUploadServlet.doPost[LocalVariableDescriptor]

'last' @ [54:70] ==> public fun <T> List<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'resp' @ [58:22] ==> value-parameter resp: HttpServletResponse defined in net.corda.webserver.servlets.DataUploadServlet.doPost[ValueParameterDescriptorImpl]

'writer' @ [58:27] ==> public final val HttpServletResponse.writer: (PrintWriter..PrintWriter?)[MyPropertyDescriptor]

'messages' @ [59:9] ==> val messages: ArrayList<String> defined in net.corda.webserver.servlets.DataUploadServlet.doPost[LocalVariableDescriptor]

'forEach' @ [59:18] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'writer' @ [59:28] ==> val writer: (PrintWriter..PrintWriter?) defined in net.corda.webserver.servlets.DataUploadServlet.doPost[LocalVariableDescriptor]

'println' @ [59:35] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'it' @ [59:43] ==> value-parameter it: String defined in net.corda.webserver.servlets.DataUploadServlet.doPost.<anonymous>[ValueParameterDescriptorImpl]

