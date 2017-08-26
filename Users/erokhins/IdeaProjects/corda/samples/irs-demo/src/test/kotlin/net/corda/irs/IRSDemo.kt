'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'OptionParser' @ [16:18] ==> public constructor OptionParser() defined in joptsimple.OptionParser[JavaClassConstructorDescriptor]

'parser' @ [17:19] ==> val parser: OptionParser defined in net.corda.irs.main[LocalVariableDescriptor]

'accepts' @ [17:26] ==> public open fun accepts(p0: (String..String?)): (OptionSpecBuilder..OptionSpecBuilder?) defined in joptsimple.OptionParser[JavaMethodDescriptor]

'withRequiredArg' @ [17:42] ==> public open fun withRequiredArg(): (ArgumentAcceptingOptionSpec<(String..String?)>..ArgumentAcceptingOptionSpec<(String..String?)>?) defined in joptsimple.OptionSpecBuilder[JavaMethodDescriptor]

'ofType' @ [17:60] ==> public final fun <T : (Any..Any?)> ofType(p0: (Class<(Role..Role?)>..Class<(Role..Role?)>?)): (ArgumentAcceptingOptionSpec<(Role..Role?)>..ArgumentAcceptingOptionSpec<(Role..Role?)>?) defined in joptsimple.ArgumentAcceptingOptionSpec[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Role

'Role' @ [17:67] ==> private constructor Role() defined in net.corda.irs.Role[ClassConstructorDescriptorImpl]

'java' @ [17:79] ==> public val <T> KClass<Role>.java: Class<Role> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Role

'required' @ [17:85] ==> public open fun required(): (ArgumentAcceptingOptionSpec<(Role..Role?)>..ArgumentAcceptingOptionSpec<(Role..Role?)>?) defined in joptsimple.ArgumentAcceptingOptionSpec[JavaMethodDescriptor]

'parser' @ [18:20] ==> val parser: OptionParser defined in net.corda.irs.main[LocalVariableDescriptor]

'nonOptions' @ [18:27] ==> public open fun nonOptions(): (NonOptionArgumentSpec<(String..String?)>..NonOptionArgumentSpec<(String..String?)>?) defined in joptsimple.OptionParser[JavaMethodDescriptor]

'parser' @ [20:9] ==> val parser: OptionParser defined in net.corda.irs.main[LocalVariableDescriptor]

'parse' @ [20:16] ==> public open fun parse(vararg p0: (String..String?)): (OptionSet..OptionSet?) defined in joptsimple.OptionParser[JavaMethodDescriptor]

'args' @ [20:23] ==> value-parameter args: Array<String> defined in net.corda.irs.main[ValueParameterDescriptorImpl]

'println' @ [22:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'e' @ [22:17] ==> val e: Exception /* = Exception */ defined in net.corda.irs.main[LocalVariableDescriptor]

'message' @ [22:19] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'printHelp' @ [23:9] ==> public fun printHelp(parser: OptionParser): Unit defined in net.corda.irs in file IRSDemo.kt[SimpleFunctionDescriptorImpl]

'parser' @ [23:19] ==> val parser: OptionParser defined in net.corda.irs.main[LocalVariableDescriptor]

'exitProcess' @ [24:9] ==> @InlineOnly public inline fun exitProcess(status: Int): Nothing defined in kotlin.system[DeserializedSimpleFunctionDescriptor]

'options' @ [29:16] ==> val options: (OptionSet..OptionSet?) defined in net.corda.irs.main[LocalVariableDescriptor]

'valueOf' @ [29:24] ==> public open fun <V : (Any..Any?)> valueOf(p0: (OptionSpec<(Role..Role?)>..OptionSpec<(Role..Role?)>?)): (Role..Role?) defined in joptsimple.OptionSet[JavaMethodDescriptor]
Inferred types:
    <V : (Any..Any?)> -> Role

'roleArg' @ [29:32] ==> val roleArg: (ArgumentAcceptingOptionSpec<(Role..Role?)>..ArgumentAcceptingOptionSpec<(Role..Role?)>?) defined in net.corda.irs.main[LocalVariableDescriptor]

'options' @ [30:17] ==> val options: (OptionSet..OptionSet?) defined in net.corda.irs.main[LocalVariableDescriptor]

'valueOf' @ [30:25] ==> public open fun <V : (Any..Any?)> valueOf(p0: (OptionSpec<(String..String?)>..OptionSpec<(String..String?)>?)): (String..String?) defined in joptsimple.OptionSet[JavaMethodDescriptor]
Inferred types:
    <V : (Any..Any?)> -> String

'valueArg' @ [30:33] ==> val valueArg: (NonOptionArgumentSpec<(String..String?)>..NonOptionArgumentSpec<(String..String?)>?) defined in net.corda.irs.main[LocalVariableDescriptor]

'when (role) {
        Role.UploadRates -> IRSDemoClientApi(NetworkHostAndPort("localhost", 10004)).runUploadRates()
        Role.Trade -> IRSDemoClientApi(NetworkHostAndPort("localhost", 10007)).runTrade(value)
        Role.Date -> IRSDemoClientApi(NetworkHostAndPort("localhost", 10010)).runDateChange(value)
    }' @ [31:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'role' @ [31:11] ==> val role: Role defined in net.corda.irs.main[LocalVariableDescriptor]

'UploadRates' @ [32:14] ==> enum entry UploadRates defined in net.corda.irs.Role[FakeCallableDescriptorForObject]

'IRSDemoClientApi' @ [32:29] ==> public constructor IRSDemoClientApi(hostAndPort: NetworkHostAndPort) defined in net.corda.irs.IRSDemoClientApi[ClassConstructorDescriptorImpl]

'NetworkHostAndPort' @ [32:46] ==> public constructor NetworkHostAndPort(host: String, port: Int) defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedClassConstructorDescriptor]

'runUploadRates' @ [32:86] ==> public final fun runUploadRates(): Unit defined in net.corda.irs.IRSDemoClientApi[SimpleFunctionDescriptorImpl]

'Trade' @ [33:14] ==> enum entry Trade defined in net.corda.irs.Role[FakeCallableDescriptorForObject]

'IRSDemoClientApi' @ [33:23] ==> public constructor IRSDemoClientApi(hostAndPort: NetworkHostAndPort) defined in net.corda.irs.IRSDemoClientApi[ClassConstructorDescriptorImpl]

'NetworkHostAndPort' @ [33:40] ==> public constructor NetworkHostAndPort(host: String, port: Int) defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedClassConstructorDescriptor]

'runTrade' @ [33:80] ==> public final fun runTrade(tradeId: String): Boolean defined in net.corda.irs.IRSDemoClientApi[SimpleFunctionDescriptorImpl]

'value' @ [33:89] ==> val value: (String..String?) defined in net.corda.irs.main[LocalVariableDescriptor]

'Date' @ [34:14] ==> enum entry Date defined in net.corda.irs.Role[FakeCallableDescriptorForObject]

'IRSDemoClientApi' @ [34:22] ==> public constructor IRSDemoClientApi(hostAndPort: NetworkHostAndPort) defined in net.corda.irs.IRSDemoClientApi[ClassConstructorDescriptorImpl]

'NetworkHostAndPort' @ [34:39] ==> public constructor NetworkHostAndPort(host: String, port: Int) defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedClassConstructorDescriptor]

'runDateChange' @ [34:79] ==> public final fun runDateChange(newDate: String): Boolean defined in net.corda.irs.IRSDemoClientApi[SimpleFunctionDescriptorImpl]

'value' @ [34:93] ==> val value: (String..String?) defined in net.corda.irs.main[LocalVariableDescriptor]

'println' @ [39:5] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'trimIndent' @ [43:5] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parser' @ [44:5] ==> value-parameter parser: OptionParser defined in net.corda.irs.printHelp[ValueParameterDescriptorImpl]

'printHelpOn' @ [44:12] ==> public open fun printHelpOn(p0: (OutputStream..OutputStream?)): Unit defined in joptsimple.OptionParser[JavaMethodDescriptor]

'out' @ [44:31] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

