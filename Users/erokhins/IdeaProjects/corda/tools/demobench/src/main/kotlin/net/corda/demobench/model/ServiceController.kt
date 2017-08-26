'Controller' @ [9:68] ==> public constructor Controller() defined in tornadofx.Controller[DeserializedClassConstructorDescriptor]

'loadConf' @ [11:34] ==> private final fun loadConf(url: URL?): List<String> defined in net.corda.demobench.model.ServiceController[SimpleFunctionDescriptorImpl]

'resources' @ [11:43] ==> public final val resources: ResourceLookup defined in net.corda.demobench.model.ServiceController[DeserializedPropertyDescriptor]

'url' @ [11:53] ==> public final fun url(resource: String): URL defined in tornadofx.ResourceLookup[DeserializedSimpleFunctionDescriptor]

'resourceName' @ [11:57] ==> value-parameter resourceName: String = ... defined in net.corda.demobench.model.ServiceController.<init>[ValueParameterDescriptorImpl]

'services' @ [13:34] ==> public final val services: List<String> defined in net.corda.demobench.model.ServiceController[PropertyDescriptorImpl]

'filter' @ [13:43] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [13:52] ==> value-parameter it: String defined in net.corda.demobench.model.ServiceController.notaries.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [13:55] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toList' @ [13:85] ==> public fun <T> Iterable<String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'if (url == null) {
            emptyList()
        } else {
            try {
                val set = sortedSetOf<String>()
                InputStreamReader(url.openStream()).useLines { sq ->
                    sq.forEach { line ->
                        val service = line.trim()
                        set.add(service)

                        log.info("Supports: $service")
                    }
                }
                set.toList()
            } catch (e: IOException) {
                log.log(Level.SEVERE, "Failed to load $url: ${e.message}", e)
                emptyList<String>()
            }
        }' @ [19:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'url' @ [19:20] ==> value-parameter url: URL? defined in net.corda.demobench.model.ServiceController.loadConf[ValueParameterDescriptorImpl]

'emptyList' @ [20:13] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sortedSetOf' @ [23:27] ==> public fun <T> sortedSetOf(vararg elements: String): TreeSet<String> /* = TreeSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'InputStreamReader' @ [24:17] ==> public constructor InputStreamReader(p0: (InputStream..InputStream?)) defined in java.io.InputStreamReader[JavaClassConstructorDescriptor]

'url' @ [24:35] ==> value-parameter url: URL? defined in net.corda.demobench.model.ServiceController.loadConf[ValueParameterDescriptorImpl]

'openStream' @ [24:39] ==> public final fun openStream(): (InputStream..InputStream?) defined in java.net.URL[JavaMethodDescriptor]

'useLines' @ [24:53] ==> public inline fun <T> Reader.useLines(block: (Sequence<String>) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'sq' @ [25:21] ==> value-parameter sq: Sequence<String> defined in net.corda.demobench.model.ServiceController.loadConf.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [25:24] ==> public inline fun <T> Sequence<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'line' @ [26:39] ==> value-parameter line: String defined in net.corda.demobench.model.ServiceController.loadConf.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'trim' @ [26:44] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'set' @ [27:25] ==> val set: TreeSet<String> /* = TreeSet<String> */ defined in net.corda.demobench.model.ServiceController.loadConf[LocalVariableDescriptor]

'add' @ [27:29] ==> public open fun add(element: String): Boolean defined in java.util.TreeSet[JavaMethodDescriptor]

'service' @ [27:33] ==> val service: String defined in net.corda.demobench.model.ServiceController.loadConf.<anonymous>.<anonymous>[LocalVariableDescriptor]

'log' @ [29:25] ==> public final val log: (Logger..Logger?) defined in net.corda.demobench.model.ServiceController[DeserializedPropertyDescriptor]

'info' @ [29:29] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'service' @ [29:46] ==> val service: String defined in net.corda.demobench.model.ServiceController.loadConf.<anonymous>.<anonymous>[LocalVariableDescriptor]

'set' @ [32:17] ==> val set: TreeSet<String> /* = TreeSet<String> */ defined in net.corda.demobench.model.ServiceController.loadConf[LocalVariableDescriptor]

'toList' @ [32:21] ==> public fun <T> Iterable<String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'log' @ [34:17] ==> public final val log: (Logger..Logger?) defined in net.corda.demobench.model.ServiceController[DeserializedPropertyDescriptor]

'log' @ [34:21] ==> public open fun log(p0: (Level..Level?), p1: (String..String?), p2: (Throwable..Throwable?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'SEVERE' @ [34:31] ==> public final val SEVERE: (Level..Level?) defined in java.util.logging.Level[JavaPropertyDescriptor]

'url' @ [34:56] ==> value-parameter url: URL? defined in net.corda.demobench.model.ServiceController.loadConf[ValueParameterDescriptorImpl]

'e' @ [34:63] ==> val e: IOException defined in net.corda.demobench.model.ServiceController.loadConf[LocalVariableDescriptor]

'message' @ [34:65] ==> public open val message: String? defined in java.io.IOException[DeserializedPropertyDescriptor]

'e' @ [34:76] ==> val e: IOException defined in net.corda.demobench.model.ServiceController.loadConf[LocalVariableDescriptor]

'emptyList' @ [35:17] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

