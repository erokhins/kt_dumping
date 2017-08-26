'HttpServlet' @ [27:35] ==> public constructor HttpServlet() defined in javax.servlet.http.HttpServlet[JavaClassConstructorDescriptor]

'loggerFor' @ [28:23] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> AttachmentDownloadServlet

'Throws' @ [30:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [30:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'req' @ [32:23] ==> value-parameter req: HttpServletRequest defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[ValueParameterDescriptorImpl]

'pathInfo' @ [32:27] ==> public final val HttpServletRequest.pathInfo: (String..String?)[MyPropertyDescriptor]

'substring' @ [32:37] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'reqPath' @ [33:13] ==> val reqPath: String? defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[LocalVariableDescriptor]

'resp' @ [34:13] ==> value-parameter resp: HttpServletResponse defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[ValueParameterDescriptorImpl]

'sendError' @ [34:18] ==> public abstract fun sendError(p0: Int): Unit defined in javax.servlet.http.HttpServletResponse[JavaMethodDescriptor]

'SC_BAD_REQUEST' @ [34:48] ==> public const final val SC_BAD_REQUEST: Int defined in javax.servlet.http.HttpServletResponse[JavaPropertyDescriptor]

'SecureHash' @ [39:24] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'parse' @ [39:35] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'reqPath' @ [39:41] ==> val reqPath: String? defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[LocalVariableDescriptor]

'substringBefore' @ [39:49] ==> public fun String.substringBefore(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'servletContext' @ [40:23] ==> public final val AttachmentDownloadServlet.servletContext: (ServletContext..ServletContext?)[MyPropertyDescriptor]

'getAttribute' @ [40:38] ==> public abstract fun getAttribute(p0: (String..String?)): (Any..Any?) defined in javax.servlet.ServletContext[JavaMethodDescriptor]

'rpc' @ [41:30] ==> val rpc: CordaRPCOps defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[LocalVariableDescriptor]

'openAttachment' @ [41:34] ==> public abstract fun openAttachment(id: SecureHash): InputStream defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'hash' @ [41:49] ==> val hash: SecureHash.SHA256 defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[LocalVariableDescriptor]

'reqPath' @ [44:27] ==> val reqPath: String? defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[LocalVariableDescriptor]

'substringAfter' @ [44:35] ==> public fun String.substringAfter(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toLowerCase' @ [44:83] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'resp' @ [46:13] ==> value-parameter resp: HttpServletResponse defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[ValueParameterDescriptorImpl]

'contentType' @ [46:18] ==> public final var HttpServletResponse.contentType: (String..String?)[MyPropertyDescriptor]

'APPLICATION_OCTET_STREAM' @ [46:42] ==> public const final val APPLICATION_OCTET_STREAM: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'if (subPath.isEmpty()) {
                resp.addHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"$hash.zip\"")
                attachment.use { it.copyTo(resp.outputStream) }
            } else {
                val filename = subPath.split('/').last()
                resp.addHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"$filename\"")
                JarInputStream(attachment).use { it.extractFile(subPath, resp.outputStream) }
            }' @ [47:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'subPath' @ [47:17] ==> val subPath: String defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[LocalVariableDescriptor]

'isEmpty' @ [47:25] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'resp' @ [48:17] ==> value-parameter resp: HttpServletResponse defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[ValueParameterDescriptorImpl]

'addHeader' @ [48:22] ==> public abstract fun addHeader(p0: (String..String?), p1: (String..String?)): Unit defined in javax.servlet.http.HttpServletResponse[JavaMethodDescriptor]

'CONTENT_DISPOSITION' @ [48:44] ==> public const final val CONTENT_DISPOSITION: String defined in javax.ws.rs.core.HttpHeaders[JavaPropertyDescriptor]

'hash' @ [48:90] ==> val hash: SecureHash.SHA256 defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[LocalVariableDescriptor]

'attachment' @ [49:17] ==> val attachment: InputStream defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[LocalVariableDescriptor]

'use' @ [49:28] ==> @InlineOnly public inline fun <T : Closeable?, R> InputStream.use(block: (InputStream) -> Long): Long defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> InputStream
    <R> -> Long

'it' @ [49:34] ==> value-parameter it: InputStream defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet.<anonymous>[ValueParameterDescriptorImpl]

'copyTo' @ [49:37] ==> public fun InputStream.copyTo(out: OutputStream, bufferSize: Int = ...): Long defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'resp' @ [49:44] ==> value-parameter resp: HttpServletResponse defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[ValueParameterDescriptorImpl]

'outputStream' @ [49:49] ==> public final val HttpServletResponse.outputStream: (ServletOutputStream..ServletOutputStream?)[MyPropertyDescriptor]

'subPath' @ [51:32] ==> val subPath: String defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[LocalVariableDescriptor]

'split' @ [51:40] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'last' @ [51:51] ==> public fun <T> List<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'resp' @ [52:17] ==> value-parameter resp: HttpServletResponse defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[ValueParameterDescriptorImpl]

'addHeader' @ [52:22] ==> public abstract fun addHeader(p0: (String..String?), p1: (String..String?)): Unit defined in javax.servlet.http.HttpServletResponse[JavaMethodDescriptor]

'CONTENT_DISPOSITION' @ [52:44] ==> public const final val CONTENT_DISPOSITION: String defined in javax.ws.rs.core.HttpHeaders[JavaPropertyDescriptor]

'filename' @ [52:90] ==> val filename: String defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[LocalVariableDescriptor]

'JarInputStream' @ [53:17] ==> public constructor JarInputStream(p0: (InputStream..InputStream?)) defined in java.util.jar.JarInputStream[JavaClassConstructorDescriptor]

'attachment' @ [53:32] ==> val attachment: InputStream defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[LocalVariableDescriptor]

'use' @ [53:44] ==> @InlineOnly public inline fun <T : Closeable?, R> JarInputStream.use(block: (JarInputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> JarInputStream
    <R> -> Unit

'it' @ [53:50] ==> value-parameter it: JarInputStream defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet.<anonymous>[ValueParameterDescriptorImpl]

'extractFile' @ [53:53] ==> public fun JarInputStream.extractFile(path: String, outputTo: OutputStream): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]

'subPath' @ [53:65] ==> val subPath: String defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[LocalVariableDescriptor]

'resp' @ [53:74] ==> value-parameter resp: HttpServletResponse defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[ValueParameterDescriptorImpl]

'outputStream' @ [53:79] ==> public final val HttpServletResponse.outputStream: (ServletOutputStream..ServletOutputStream?)[MyPropertyDescriptor]

'resp' @ [57:13] ==> value-parameter resp: HttpServletResponse defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[ValueParameterDescriptorImpl]

'outputStream' @ [57:18] ==> public final val HttpServletResponse.outputStream: (ServletOutputStream..ServletOutputStream?)[MyPropertyDescriptor]

'close' @ [57:31] ==> public open fun close(): Unit defined in javax.servlet.ServletOutputStream[JavaMethodDescriptor]

'log' @ [59:13] ==> private final val log: Logger defined in net.corda.webserver.servlets.AttachmentDownloadServlet[PropertyDescriptorImpl]

'warn' @ [59:17] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'servletContext' @ [59:95] ==> public final val AttachmentDownloadServlet.servletContext: (ServletContext..ServletContext?)[MyPropertyDescriptor]

'contextPath' @ [59:110] ==> public final val ServletContext.contextPath: (String..String?)[MyPropertyDescriptor]

'reqPath' @ [59:124] ==> val reqPath: String? defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[LocalVariableDescriptor]

'resp' @ [60:13] ==> value-parameter resp: HttpServletResponse defined in net.corda.webserver.servlets.AttachmentDownloadServlet.doGet[ValueParameterDescriptorImpl]

'sendError' @ [60:18] ==> public abstract fun sendError(p0: Int): Unit defined in javax.servlet.http.HttpServletResponse[JavaMethodDescriptor]

'SC_NOT_FOUND' @ [60:48] ==> public const final val SC_NOT_FOUND: Int defined in javax.servlet.http.HttpServletResponse[JavaPropertyDescriptor]

