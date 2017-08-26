'TraderDemo' @ [17:5] ==> public constructor TraderDemo() defined in net.corda.traderdemo.TraderDemo[ClassConstructorDescriptorImpl]

'main' @ [17:18] ==> public final fun main(args: Array<String>): Unit defined in net.corda.traderdemo.TraderDemo[SimpleFunctionDescriptorImpl]

'args' @ [17:23] ==> value-parameter args: Array<String> defined in net.corda.traderdemo.main[ValueParameterDescriptorImpl]

'loggerFor' @ [27:30] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TraderDemo

'DUMMY_BANK_A' @ [28:25] ==> public val DUMMY_BANK_A: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [28:38] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'DUMMY_BANK_B' @ [29:26] ==> public val DUMMY_BANK_B: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [29:39] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'OptionParser' @ [35:22] ==> public constructor OptionParser() defined in joptsimple.OptionParser[JavaClassConstructorDescriptor]

'parser' @ [37:23] ==> val parser: OptionParser defined in net.corda.traderdemo.TraderDemo.main[LocalVariableDescriptor]

'accepts' @ [37:30] ==> public open fun accepts(p0: (String..String?)): (OptionSpecBuilder..OptionSpecBuilder?) defined in joptsimple.OptionParser[JavaMethodDescriptor]

'withRequiredArg' @ [37:46] ==> public open fun withRequiredArg(): (ArgumentAcceptingOptionSpec<(String..String?)>..ArgumentAcceptingOptionSpec<(String..String?)>?) defined in joptsimple.OptionSpecBuilder[JavaMethodDescriptor]

'ofType' @ [37:64] ==> public final fun <T : (Any..Any?)> ofType(p0: (Class<(TraderDemo.Role..TraderDemo.Role?)>..Class<(TraderDemo.Role..TraderDemo.Role?)>?)): (ArgumentAcceptingOptionSpec<(TraderDemo.Role..TraderDemo.Role?)>..ArgumentAcceptingOptionSpec<(TraderDemo.Role..TraderDemo.Role?)>?) defined in joptsimple.ArgumentAcceptingOptionSpec[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Role

'Role' @ [37:71] ==> private constructor Role() defined in net.corda.traderdemo.TraderDemo.Role[ClassConstructorDescriptorImpl]

'java' @ [37:83] ==> public val <T> KClass<TraderDemo.Role>.java: Class<TraderDemo.Role> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Role

'required' @ [37:89] ==> public open fun required(): (ArgumentAcceptingOptionSpec<(TraderDemo.Role..TraderDemo.Role?)>..ArgumentAcceptingOptionSpec<(TraderDemo.Role..TraderDemo.Role?)>?) defined in joptsimple.ArgumentAcceptingOptionSpec[JavaMethodDescriptor]

'parser' @ [39:13] ==> val parser: OptionParser defined in net.corda.traderdemo.TraderDemo.main[LocalVariableDescriptor]

'parse' @ [39:20] ==> public open fun parse(vararg p0: (String..String?)): (OptionSet..OptionSet?) defined in joptsimple.OptionParser[JavaMethodDescriptor]

'args' @ [39:27] ==> value-parameter args: Array<String> defined in net.corda.traderdemo.TraderDemo.main[ValueParameterDescriptorImpl]

'logger' @ [41:13] ==> public final val logger: Logger defined in net.corda.traderdemo.TraderDemo.Companion[PropertyDescriptorImpl]

'error' @ [41:20] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'e' @ [41:26] ==> val e: Exception /* = Exception */ defined in net.corda.traderdemo.TraderDemo.main[LocalVariableDescriptor]

'message' @ [41:28] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'printHelp' @ [42:13] ==> public final fun printHelp(parser: OptionParser): Unit defined in net.corda.traderdemo.TraderDemo[SimpleFunctionDescriptorImpl]

'parser' @ [42:23] ==> val parser: OptionParser defined in net.corda.traderdemo.TraderDemo.main[LocalVariableDescriptor]

'exitProcess' @ [43:13] ==> @InlineOnly public inline fun exitProcess(status: Int): Nothing defined in kotlin.system[DeserializedSimpleFunctionDescriptor]

'options' @ [48:20] ==> val options: (OptionSet..OptionSet?) defined in net.corda.traderdemo.TraderDemo.main[LocalVariableDescriptor]

'valueOf' @ [48:28] ==> public open fun <V : (Any..Any?)> valueOf(p0: (OptionSpec<(TraderDemo.Role..TraderDemo.Role?)>..OptionSpec<(TraderDemo.Role..TraderDemo.Role?)>?)): (TraderDemo.Role..TraderDemo.Role?) defined in joptsimple.OptionSet[JavaMethodDescriptor]
Inferred types:
    <V : (Any..Any?)> -> Role

'roleArg' @ [48:36] ==> val roleArg: (ArgumentAcceptingOptionSpec<(TraderDemo.Role..TraderDemo.Role?)>..ArgumentAcceptingOptionSpec<(TraderDemo.Role..TraderDemo.Role?)>?) defined in net.corda.traderdemo.TraderDemo.main[LocalVariableDescriptor]

'if (role == Role.BANK) {
            val bankHost = NetworkHostAndPort("localhost", bankRpcPort)
            CordaRPCClient(bankHost).use("demo", "demo") {
                TraderDemoClientApi(it.proxy).runIssuer(1100.DOLLARS, buyerName, sellerName)
            }
        } else {
            val sellerHost = NetworkHostAndPort("localhost", sellerRpcPort)
            CordaRPCClient(sellerHost).use("demo", "demo") {
                TraderDemoClientApi(it.proxy).runSeller(1000.DOLLARS, buyerName)
            }
        }' @ [49:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'role' @ [49:13] ==> val role: TraderDemo.Role defined in net.corda.traderdemo.TraderDemo.main[LocalVariableDescriptor]

'BANK' @ [49:26] ==> enum entry BANK defined in net.corda.traderdemo.TraderDemo.Role[FakeCallableDescriptorForObject]

'NetworkHostAndPort' @ [50:28] ==> public constructor NetworkHostAndPort(host: String, port: Int) defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedClassConstructorDescriptor]

'bankRpcPort' @ [50:60] ==> public final val bankRpcPort: Int defined in net.corda.traderdemo.TraderDemo.Companion[PropertyDescriptorImpl]

'CordaRPCClient' @ [51:13] ==> public constructor CordaRPCClient(hostAndPort: NetworkHostAndPort, sslConfiguration: SSLConfiguration? = ..., configuration: CordaRPCClientConfiguration = ..., initialiseSerialization: Boolean = ...) defined in net.corda.client.rpc.CordaRPCClient[DeserializedClassConstructorDescriptor]

'bankHost' @ [51:28] ==> val bankHost: NetworkHostAndPort defined in net.corda.traderdemo.TraderDemo.main[LocalVariableDescriptor]

'use' @ [51:38] ==> public final inline fun <A> use(username: String, password: String, block: (CordaRPCConnection) -> Unit): Unit defined in net.corda.client.rpc.CordaRPCClient[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Unit

'TraderDemoClientApi' @ [52:17] ==> public constructor TraderDemoClientApi(rpc: CordaRPCOps) defined in net.corda.traderdemo.TraderDemoClientApi[ClassConstructorDescriptorImpl]

'it' @ [52:37] ==> value-parameter it: CordaRPCConnection defined in net.corda.traderdemo.TraderDemo.main.<anonymous>[ValueParameterDescriptorImpl]

'proxy' @ [52:40] ==> public open val proxy: CordaRPCOps defined in net.corda.client.rpc.CordaRPCConnection[DeserializedPropertyDescriptor]

'runIssuer' @ [52:47] ==> public final fun runIssuer(amount: Amount<Currency>, buyerName: X500Name, sellerName: X500Name): Unit defined in net.corda.traderdemo.TraderDemoClientApi[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [52:62] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'buyerName' @ [52:71] ==> public final val buyerName: X500Name defined in net.corda.traderdemo.TraderDemo.Companion[PropertyDescriptorImpl]

'sellerName' @ [52:82] ==> public final val sellerName: X500Name defined in net.corda.traderdemo.TraderDemo.Companion[PropertyDescriptorImpl]

'NetworkHostAndPort' @ [55:30] ==> public constructor NetworkHostAndPort(host: String, port: Int) defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedClassConstructorDescriptor]

'sellerRpcPort' @ [55:62] ==> public final val sellerRpcPort: Int defined in net.corda.traderdemo.TraderDemo.Companion[PropertyDescriptorImpl]

'CordaRPCClient' @ [56:13] ==> public constructor CordaRPCClient(hostAndPort: NetworkHostAndPort, sslConfiguration: SSLConfiguration? = ..., configuration: CordaRPCClientConfiguration = ..., initialiseSerialization: Boolean = ...) defined in net.corda.client.rpc.CordaRPCClient[DeserializedClassConstructorDescriptor]

'sellerHost' @ [56:28] ==> val sellerHost: NetworkHostAndPort defined in net.corda.traderdemo.TraderDemo.main[LocalVariableDescriptor]

'use' @ [56:40] ==> public final inline fun <A> use(username: String, password: String, block: (CordaRPCConnection) -> Unit): Unit defined in net.corda.client.rpc.CordaRPCClient[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Unit

'TraderDemoClientApi' @ [57:17] ==> public constructor TraderDemoClientApi(rpc: CordaRPCOps) defined in net.corda.traderdemo.TraderDemoClientApi[ClassConstructorDescriptorImpl]

'it' @ [57:37] ==> value-parameter it: CordaRPCConnection defined in net.corda.traderdemo.TraderDemo.main.<anonymous>[ValueParameterDescriptorImpl]

'proxy' @ [57:40] ==> public open val proxy: CordaRPCOps defined in net.corda.client.rpc.CordaRPCConnection[DeserializedPropertyDescriptor]

'runSeller' @ [57:47] ==> public final fun runSeller(amount: Amount<Currency> = ..., buyerName: X500Name): Unit defined in net.corda.traderdemo.TraderDemoClientApi[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [57:62] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'buyerName' @ [57:71] ==> public final val buyerName: X500Name defined in net.corda.traderdemo.TraderDemo.Companion[PropertyDescriptorImpl]

'println' @ [63:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'trimIndent' @ [67:13] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parser' @ [68:9] ==> value-parameter parser: OptionParser defined in net.corda.traderdemo.TraderDemo.printHelp[ValueParameterDescriptorImpl]

'printHelpOn' @ [68:16] ==> public open fun printHelpOn(p0: (OutputStream..OutputStream?)): Unit defined in joptsimple.OptionParser[JavaMethodDescriptor]

'out' @ [68:35] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

