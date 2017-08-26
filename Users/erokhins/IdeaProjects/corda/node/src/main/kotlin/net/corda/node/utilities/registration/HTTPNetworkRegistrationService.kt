'Throws' @ [21:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'CertificateRequestException' @ [21:13] ==> public constructor CertificateRequestException(message: String) defined in net.corda.node.utilities.registration.CertificateRequestException[ClassConstructorDescriptorImpl]

'URL' @ [24:19] ==> public constructor URL(p0: (String..String?)) defined in java.net.URL[JavaClassConstructorDescriptor]

'server' @ [24:25] ==> public final val server: URL defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService[PropertyDescriptorImpl]

'requestId' @ [24:49] ==> value-parameter requestId: String defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.retrieveCertificates[ValueParameterDescriptorImpl]

'url' @ [26:20] ==> val url: URL defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.retrieveCertificates[LocalVariableDescriptor]

'openConnection' @ [26:24] ==> public open fun openConnection(): (URLConnection..URLConnection?) defined in java.net.URL[JavaMethodDescriptor]

'conn' @ [27:9] ==> val conn: HttpURLConnection defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.retrieveCertificates[LocalVariableDescriptor]

'requestMethod' @ [27:14] ==> public final var HttpURLConnection.requestMethod: (String..String?)[MyPropertyDescriptor]

'when (conn.responseCode) {
            HTTP_OK -> ZipInputStream(conn.inputStream).use {
                val certificates = ArrayList<Certificate>()
                val stream = CertificateStream(it)
                while (it.nextEntry != null) {
                    certificates.add(stream.nextCertificate())
                }
                certificates.toTypedArray()
            }
            HTTP_NO_CONTENT -> null
            HTTP_UNAUTHORIZED -> throw CertificateRequestException("Certificate signing request has been rejected: ${conn.errorMessage}")
            else -> throwUnexpectedResponseCode(conn)
        }' @ [29:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Array<Certificate>?, entry1: Array<Certificate>?, entry2: Array<Certificate>?, entry3: Array<Certificate>?): Array<Certificate>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Array<Certificate>?

'conn' @ [29:22] ==> val conn: HttpURLConnection defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.retrieveCertificates[LocalVariableDescriptor]

'responseCode' @ [29:27] ==> public final val HttpURLConnection.responseCode: Int[MyPropertyDescriptor]

'HTTP_OK' @ [30:13] ==> public const final val HTTP_OK: Int defined in java.net.HttpURLConnection[JavaPropertyDescriptor]

'ZipInputStream' @ [30:24] ==> public constructor ZipInputStream(p0: (InputStream..InputStream?)) defined in java.util.zip.ZipInputStream[JavaClassConstructorDescriptor]

'conn' @ [30:39] ==> val conn: HttpURLConnection defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.retrieveCertificates[LocalVariableDescriptor]

'inputStream' @ [30:44] ==> public final val HttpURLConnection.inputStream: (InputStream..InputStream?)[MyPropertyDescriptor]

'use' @ [30:57] ==> @InlineOnly public inline fun <T : Closeable?, R> ZipInputStream.use(block: (ZipInputStream) -> Array<Certificate>): Array<Certificate> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> ZipInputStream
    <R> -> Array<Certificate>

'ArrayList' @ [31:36] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Certificate

'CertificateStream' @ [32:30] ==> public constructor CertificateStream(input: InputStream) defined in net.corda.node.utilities.CertificateStream[ClassConstructorDescriptorImpl]

'it' @ [32:48] ==> value-parameter it: ZipInputStream defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.retrieveCertificates.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [33:24] ==> value-parameter it: ZipInputStream defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.retrieveCertificates.<anonymous>[ValueParameterDescriptorImpl]

'nextEntry' @ [33:27] ==> public final val ZipInputStream.nextEntry: (ZipEntry..ZipEntry?)[MyPropertyDescriptor]

'certificates' @ [34:21] ==> val certificates: ArrayList<Certificate> defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.retrieveCertificates.<anonymous>[LocalVariableDescriptor]

'add' @ [34:34] ==> public open fun add(element: Certificate): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'stream' @ [34:38] ==> val stream: CertificateStream defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.retrieveCertificates.<anonymous>[LocalVariableDescriptor]

'nextCertificate' @ [34:45] ==> public final fun nextCertificate(): X509Certificate defined in net.corda.node.utilities.CertificateStream[SimpleFunctionDescriptorImpl]

'certificates' @ [36:17] ==> val certificates: ArrayList<Certificate> defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.retrieveCertificates.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [36:30] ==> public inline fun <reified T> Collection<Certificate>.toTypedArray(): Array<Certificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Certificate

'HTTP_NO_CONTENT' @ [38:13] ==> public const final val HTTP_NO_CONTENT: Int defined in java.net.HttpURLConnection[JavaPropertyDescriptor]

'HTTP_UNAUTHORIZED' @ [39:13] ==> public const final val HTTP_UNAUTHORIZED: Int defined in java.net.HttpURLConnection[JavaPropertyDescriptor]

'CertificateRequestException' @ [39:40] ==> public constructor CertificateRequestException(message: String) defined in net.corda.node.utilities.registration.CertificateRequestException[ClassConstructorDescriptorImpl]

'conn' @ [39:118] ==> val conn: HttpURLConnection defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.retrieveCertificates[LocalVariableDescriptor]

'errorMessage' @ [39:123] ==> private final val HttpURLConnection.errorMessage: String defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService[PropertyDescriptorImpl]

'throwUnexpectedResponseCode' @ [40:21] ==> private final fun throwUnexpectedResponseCode(connection: HttpURLConnection): Nothing defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService[SimpleFunctionDescriptorImpl]

'conn' @ [40:49] ==> val conn: HttpURLConnection defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.retrieveCertificates[LocalVariableDescriptor]

'URL' @ [46:20] ==> public constructor URL(p0: (String..String?)) defined in java.net.URL[JavaClassConstructorDescriptor]

'server' @ [46:26] ==> public final val server: URL defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService[PropertyDescriptorImpl]

'openConnection' @ [46:51] ==> public open fun openConnection(): (URLConnection..URLConnection?) defined in java.net.URL[JavaMethodDescriptor]

'conn' @ [47:9] ==> val conn: HttpURLConnection defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.submitRequest[LocalVariableDescriptor]

'doOutput' @ [47:14] ==> public final var HttpURLConnection.doOutput: Boolean[MyPropertyDescriptor]

'conn' @ [48:9] ==> val conn: HttpURLConnection defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.submitRequest[LocalVariableDescriptor]

'requestMethod' @ [48:14] ==> public final var HttpURLConnection.requestMethod: (String..String?)[MyPropertyDescriptor]

'conn' @ [49:9] ==> val conn: HttpURLConnection defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.submitRequest[LocalVariableDescriptor]

'setRequestProperty' @ [49:14] ==> public open fun setRequestProperty(p0: (String..String?), p1: (String..String?)): Unit defined in java.net.HttpURLConnection[JavaMethodDescriptor]

'conn' @ [50:9] ==> val conn: HttpURLConnection defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.submitRequest[LocalVariableDescriptor]

'setRequestProperty' @ [50:14] ==> public open fun setRequestProperty(p0: (String..String?), p1: (String..String?)): Unit defined in java.net.HttpURLConnection[JavaMethodDescriptor]

'clientVersion' @ [50:51] ==> public final val clientVersion: String defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.Companion[PropertyDescriptorImpl]

'conn' @ [51:9] ==> val conn: HttpURLConnection defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.submitRequest[LocalVariableDescriptor]

'outputStream' @ [51:14] ==> public final val HttpURLConnection.outputStream: (OutputStream..OutputStream?)[MyPropertyDescriptor]

'write' @ [51:27] ==> public open fun write(p0: (ByteArray..ByteArray?)): Unit defined in java.io.OutputStream[JavaMethodDescriptor]

'request' @ [51:33] ==> value-parameter request: PKCS10CertificationRequest defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.submitRequest[ValueParameterDescriptorImpl]

'encoded' @ [51:41] ==> public final val PKCS10CertificationRequest.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'when (conn.responseCode) {
            HTTP_OK -> IOUtils.toString(conn.inputStream, conn.charset)
            HTTP_FORBIDDEN -> throw IOException("Client version $clientVersion is forbidden from accessing permissioning server, please upgrade to newer version.")
            else -> throwUnexpectedResponseCode(conn)
        }' @ [53:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'conn' @ [53:22] ==> val conn: HttpURLConnection defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.submitRequest[LocalVariableDescriptor]

'responseCode' @ [53:27] ==> public final val HttpURLConnection.responseCode: Int[MyPropertyDescriptor]

'HTTP_OK' @ [54:13] ==> public const final val HTTP_OK: Int defined in java.net.HttpURLConnection[JavaPropertyDescriptor]

'toString' @ [54:32] ==> public open fun toString(p0: (InputStream..InputStream?), p1: (String..String?)): (String..String?) defined in org.apache.commons.io.IOUtils[JavaMethodDescriptor]

'conn' @ [54:41] ==> val conn: HttpURLConnection defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.submitRequest[LocalVariableDescriptor]

'inputStream' @ [54:46] ==> public final val HttpURLConnection.inputStream: (InputStream..InputStream?)[MyPropertyDescriptor]

'conn' @ [54:59] ==> val conn: HttpURLConnection defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.submitRequest[LocalVariableDescriptor]

'charset' @ [54:64] ==> private final val HttpURLConnection.charset: String defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService[PropertyDescriptorImpl]

'HTTP_FORBIDDEN' @ [55:13] ==> public const final val HTTP_FORBIDDEN: Int defined in java.net.HttpURLConnection[JavaPropertyDescriptor]

'IOException' @ [55:37] ==> public constructor IOException(p0: (String..String?)) defined in java.io.IOException[JavaClassConstructorDescriptor]

'clientVersion' @ [55:66] ==> public final val clientVersion: String defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.Companion[PropertyDescriptorImpl]

'throwUnexpectedResponseCode' @ [56:21] ==> private final fun throwUnexpectedResponseCode(connection: HttpURLConnection): Nothing defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService[SimpleFunctionDescriptorImpl]

'conn' @ [56:49] ==> val conn: HttpURLConnection defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.submitRequest[LocalVariableDescriptor]

'IOException' @ [61:15] ==> public constructor IOException(p0: (String..String?)) defined in java.io.IOException[JavaClassConstructorDescriptor]

'connection' @ [61:55] ==> value-parameter connection: HttpURLConnection defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.throwUnexpectedResponseCode[ValueParameterDescriptorImpl]

'responseCode' @ [61:66] ==> public final val HttpURLConnection.responseCode: Int[MyPropertyDescriptor]

'connection' @ [61:84] ==> value-parameter connection: HttpURLConnection defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService.throwUnexpectedResponseCode[ValueParameterDescriptorImpl]

'errorMessage' @ [61:95] ==> private final val HttpURLConnection.errorMessage: String defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService[PropertyDescriptorImpl]

'parse' @ [64:69] ==> public open fun parse(p0: (String..String?)): (MediaType..MediaType?) defined in com.google.common.net.MediaType[JavaMethodDescriptor]

'contentType' @ [64:75] ==> public final val HttpURLConnection.contentType: (String..String?)[MyPropertyDescriptor]

'charset' @ [64:88] ==> public open fun charset(): (Optional<(Charset..Charset?)>..Optional<(Charset..Charset?)>?) defined in com.google.common.net.MediaType[JavaMethodDescriptor]

'or' @ [64:98] ==> public abstract fun or(p0: (Charset..Charset?)): (Charset..Charset?) defined in com.google.common.base.Optional[JavaMethodDescriptor]

'Charsets' @ [64:101] ==> public object Charsets defined in kotlin.text[FakeCallableDescriptorForObject]

'UTF_8' @ [64:110] ==> @field:JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[DeserializedPropertyDescriptor]

'name' @ [64:117] ==> public final fun name(): (String..String?) defined in java.nio.charset.Charset[JavaMethodDescriptor]

'toString' @ [66:72] ==> public open fun toString(p0: (InputStream..InputStream?), p1: (String..String?)): (String..String?) defined in org.apache.commons.io.IOUtils[JavaMethodDescriptor]

'errorStream' @ [66:81] ==> public final val HttpURLConnection.errorStream: (InputStream..InputStream?)[MyPropertyDescriptor]

'charset' @ [66:94] ==> private final val HttpURLConnection.charset: String defined in net.corda.node.utilities.registration.HTTPNetworkRegistrationService[PropertyDescriptorImpl]

