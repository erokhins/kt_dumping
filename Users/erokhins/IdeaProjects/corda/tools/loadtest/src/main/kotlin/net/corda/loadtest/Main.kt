'if (args.isNotEmpty()) {
        ConfigFactory.parseFile(File(args[0]), ConfigParseOptions.defaults().setAllowMissing(false))
    } else {
        // This allow us to provide some configurations via teamcity.
        ConfigFactory.parseProperties(System.getProperties()).getConfig("loadtest")
    }' @ [53:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Config..Config?), elseBranch: (Config..Config?)): (Config..Config?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.typesafe.config.Config..com.typesafe.config.Config?)

'args' @ [53:28] ==> value-parameter args: Array<String> defined in net.corda.loadtest.main[ValueParameterDescriptorImpl]

'isNotEmpty' @ [53:33] ==> @InlineOnly public inline fun <T> Array<out String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'parseFile' @ [54:23] ==> public open fun parseFile(p0: (File..File?), p1: (ConfigParseOptions..ConfigParseOptions?)): (Config..Config?) defined in com.typesafe.config.ConfigFactory[JavaMethodDescriptor]

'File' @ [54:33] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'args' @ [54:38] ==> value-parameter args: Array<String> defined in net.corda.loadtest.main[ValueParameterDescriptorImpl]

'defaults' @ [54:67] ==> public open fun defaults(): (ConfigParseOptions..ConfigParseOptions?) defined in com.typesafe.config.ConfigParseOptions[JavaMethodDescriptor]

'setAllowMissing' @ [54:78] ==> public open fun setAllowMissing(p0: Boolean): (ConfigParseOptions..ConfigParseOptions?) defined in com.typesafe.config.ConfigParseOptions[JavaMethodDescriptor]

'parseProperties' @ [57:23] ==> public open fun parseProperties(p0: (Properties..Properties?)): (Config..Config?) defined in com.typesafe.config.ConfigFactory[JavaMethodDescriptor]

'getProperties' @ [57:46] ==> public open fun getProperties(): (Properties..Properties?) defined in java.lang.System[JavaMethodDescriptor]

'getConfig' @ [57:63] ==> public abstract fun getConfig(p0: (String..String?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'parseResources' @ [59:39] ==> public open fun parseResources(p0: (String..String?), p1: (ConfigParseOptions..ConfigParseOptions?)): (Config..Config?) defined in com.typesafe.config.ConfigFactory[JavaMethodDescriptor]

'defaults' @ [59:100] ==> public open fun defaults(): (ConfigParseOptions..ConfigParseOptions?) defined in com.typesafe.config.ConfigParseOptions[JavaMethodDescriptor]

'setAllowMissing' @ [59:111] ==> public open fun setAllowMissing(p0: Boolean): (ConfigParseOptions..ConfigParseOptions?) defined in com.typesafe.config.ConfigParseOptions[JavaMethodDescriptor]

'customConfig' @ [60:26] ==> val customConfig: (Config..Config?) defined in net.corda.loadtest.main[LocalVariableDescriptor]

'withFallback' @ [60:39] ==> public abstract fun withFallback(p0: (ConfigMergeable..ConfigMergeable?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'defaultConfig' @ [60:52] ==> val defaultConfig: (Config..Config?) defined in net.corda.loadtest.main[LocalVariableDescriptor]

'resolve' @ [60:67] ==> public abstract fun resolve(): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'resolvedConfig' @ [61:33] ==> val resolvedConfig: (Config..Config?) defined in net.corda.loadtest.main[LocalVariableDescriptor]

'parseAs' @ [61:48] ==> public inline fun <reified T : Any> Config.parseAs(): LoadTestConfiguration defined in net.corda.nodeapi.config[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> LoadTestConfiguration

'loadTestConfiguration' @ [63:9] ==> val loadTestConfiguration: LoadTestConfiguration defined in net.corda.loadtest.main[LocalVariableDescriptor]

'nodeHosts' @ [63:31] ==> public final val nodeHosts: List<String> defined in net.corda.loadtest.LoadTestConfiguration[PropertyDescriptorImpl]

'isEmpty' @ [63:41] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'IllegalArgumentException' @ [64:15] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'when (loadTestConfiguration.mode) {
        TestMode.LOAD_TEST -> runLoadTest(loadTestConfiguration)
        TestMode.STABILITY_TEST -> runStabilityTest(loadTestConfiguration)
    }' @ [67:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'loadTestConfiguration' @ [67:11] ==> val loadTestConfiguration: LoadTestConfiguration defined in net.corda.loadtest.main[LocalVariableDescriptor]

'mode' @ [67:33] ==> public final val mode: TestMode defined in net.corda.loadtest.LoadTestConfiguration[PropertyDescriptorImpl]

'LOAD_TEST' @ [68:18] ==> enum entry LOAD_TEST defined in net.corda.loadtest.TestMode[FakeCallableDescriptorForObject]

'runLoadTest' @ [68:31] ==> private fun runLoadTest(loadTestConfiguration: LoadTestConfiguration): Unit defined in net.corda.loadtest in file Main.kt[SimpleFunctionDescriptorImpl]

'loadTestConfiguration' @ [68:43] ==> val loadTestConfiguration: LoadTestConfiguration defined in net.corda.loadtest.main[LocalVariableDescriptor]

'STABILITY_TEST' @ [69:18] ==> enum entry STABILITY_TEST defined in net.corda.loadtest.TestMode[FakeCallableDescriptorForObject]

'runStabilityTest' @ [69:36] ==> private fun runStabilityTest(loadTestConfiguration: LoadTestConfiguration): Unit defined in net.corda.loadtest in file Main.kt[SimpleFunctionDescriptorImpl]

'loadTestConfiguration' @ [69:53] ==> val loadTestConfiguration: LoadTestConfiguration defined in net.corda.loadtest.main[LocalVariableDescriptor]

'runLoadTests' @ [74:5] ==> public fun runLoadTests(configuration: LoadTestConfiguration, tests: List<Pair<LoadTest<*, *>, LoadTest.RunParameters>>): Unit defined in net.corda.loadtest in file LoadTest.kt[SimpleFunctionDescriptorImpl]

'loadTestConfiguration' @ [74:18] ==> value-parameter loadTestConfiguration: LoadTestConfiguration defined in net.corda.loadtest.runLoadTest[ValueParameterDescriptorImpl]

'listOf' @ [74:41] ==> public fun <T> listOf(vararg elements: Pair<LoadTest<out Any, out Any>, LoadTest.RunParameters>): List<Pair<LoadTest<out Any, out Any>, LoadTest.RunParameters>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<LoadTest<out Any, out Any>, RunParameters>

'selfIssueTest' @ [75:13] ==> public val selfIssueTest: LoadTest<SelfIssueCommand, SelfIssueState> defined in net.corda.loadtest.tests in file SelfIssueTest.kt[PropertyDescriptorImpl]

'RunParameters' @ [75:39] ==> public constructor RunParameters(parallelism: Int, generateCount: Int, clearDatabaseBeforeRun: Boolean, executionFrequency: Int?, gatherFrequency: Int, disruptionPatterns: List<List<DisruptionSpec>>) defined in net.corda.loadtest.LoadTest.RunParameters[ClassConstructorDescriptorImpl]

'listOf' @ [81:42] ==> public fun <T> listOf(vararg elements: List<DisruptionSpec>): List<List<DisruptionSpec>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<DisruptionSpec>

'listOf' @ [82:29] ==> @InlineOnly public inline fun <T> listOf(): List<DisruptionSpec> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DisruptionSpec

'listOf' @ [83:29] ==> public fun <T> listOf(vararg elements: DisruptionSpec): List<DisruptionSpec> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DisruptionSpec

'DisruptionSpec' @ [84:37] ==> public constructor DisruptionSpec(nodeFilter: (NodeConnection) -> Boolean, disruption: Disruption, noDisruptionWindowMs: LongRange) defined in net.corda.loadtest.DisruptionSpec[ClassConstructorDescriptorImpl]

'hang' @ [85:58] ==> public fun hang(hangIntervalRange: LongRange): Disruption defined in net.corda.loadtest in file Disruption.kt[SimpleFunctionDescriptorImpl]

'..' @ [85:63] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'..' @ [87:68] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'DisruptionSpec' @ [89:37] ==> public constructor DisruptionSpec(nodeFilter: (NodeConnection) -> Boolean, disruption: Disruption, noDisruptionWindowMs: LongRange) defined in net.corda.loadtest.DisruptionSpec[ClassConstructorDescriptorImpl]

'kill' @ [90:58] ==> public val kill: Disruption defined in net.corda.loadtest in file Disruption.kt[PropertyDescriptorImpl]

'isNetworkMap' @ [91:58] ==> public val isNetworkMap: (NodeConnection) -> Boolean defined in net.corda.loadtest in file Disruption.kt[PropertyDescriptorImpl]

'or' @ [91:71] ==> public fun <A> ((NodeConnection) -> Boolean).or(other: (NodeConnection) -> Boolean): (NodeConnection) -> Boolean defined in net.corda.loadtest[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> NodeConnection

'isNotary' @ [91:74] ==> public val isNotary: (NodeConnection) -> Boolean defined in net.corda.loadtest in file Disruption.kt[PropertyDescriptorImpl]

'..' @ [92:68] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'DisruptionSpec' @ [95:37] ==> public constructor DisruptionSpec(nodeFilter: (NodeConnection) -> Boolean, disruption: Disruption, noDisruptionWindowMs: LongRange) defined in net.corda.loadtest.DisruptionSpec[ClassConstructorDescriptorImpl]

'strainCpu' @ [96:58] ==> public fun strainCpu(parallelism: Int, durationSeconds: Int): Disruption defined in net.corda.loadtest in file Disruption.kt[SimpleFunctionDescriptorImpl]

'..' @ [98:68] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'crossCashTest' @ [104:13] ==> public val crossCashTest: LoadTest<CrossCashCommand, CrossCashState> defined in net.corda.loadtest.tests in file CrossCashTest.kt[PropertyDescriptorImpl]

'RunParameters' @ [104:39] ==> public constructor RunParameters(parallelism: Int, generateCount: Int, clearDatabaseBeforeRun: Boolean, executionFrequency: Int?, gatherFrequency: Int, disruptionPatterns: List<List<DisruptionSpec>>) defined in net.corda.loadtest.LoadTest.RunParameters[ClassConstructorDescriptorImpl]

'listOf' @ [110:42] ==> public fun <T> listOf(vararg elements: List<DisruptionSpec>): List<List<DisruptionSpec>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<DisruptionSpec>

'listOf' @ [111:29] ==> @InlineOnly public inline fun <T> listOf(): List<DisruptionSpec> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DisruptionSpec

'listOf' @ [112:29] ==> public fun <T> listOf(vararg elements: DisruptionSpec): List<DisruptionSpec> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DisruptionSpec

'DisruptionSpec' @ [113:37] ==> public constructor DisruptionSpec(nodeFilter: (NodeConnection) -> Boolean, disruption: Disruption, noDisruptionWindowMs: LongRange) defined in net.corda.loadtest.DisruptionSpec[ClassConstructorDescriptorImpl]

'hang' @ [114:58] ==> public fun hang(hangIntervalRange: LongRange): Disruption defined in net.corda.loadtest in file Disruption.kt[SimpleFunctionDescriptorImpl]

'..' @ [114:63] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'..' @ [116:68] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'DisruptionSpec' @ [118:37] ==> public constructor DisruptionSpec(nodeFilter: (NodeConnection) -> Boolean, disruption: Disruption, noDisruptionWindowMs: LongRange) defined in net.corda.loadtest.DisruptionSpec[ClassConstructorDescriptorImpl]

'kill' @ [119:58] ==> public val kill: Disruption defined in net.corda.loadtest in file Disruption.kt[PropertyDescriptorImpl]

'isNetworkMap' @ [120:58] ==> public val isNetworkMap: (NodeConnection) -> Boolean defined in net.corda.loadtest in file Disruption.kt[PropertyDescriptorImpl]

'or' @ [120:71] ==> public fun <A> ((NodeConnection) -> Boolean).or(other: (NodeConnection) -> Boolean): (NodeConnection) -> Boolean defined in net.corda.loadtest[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> NodeConnection

'isNotary' @ [120:74] ==> public val isNotary: (NodeConnection) -> Boolean defined in net.corda.loadtest in file Disruption.kt[PropertyDescriptorImpl]

'..' @ [121:68] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'DisruptionSpec' @ [123:37] ==> public constructor DisruptionSpec(nodeFilter: (NodeConnection) -> Boolean, disruption: Disruption, noDisruptionWindowMs: LongRange) defined in net.corda.loadtest.DisruptionSpec[ClassConstructorDescriptorImpl]

'strainCpu' @ [124:58] ==> public fun strainCpu(parallelism: Int, durationSeconds: Int): Disruption defined in net.corda.loadtest in file Disruption.kt[SimpleFunctionDescriptorImpl]

'..' @ [126:68] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'runLoadTests' @ [135:5] ==> public fun runLoadTests(configuration: LoadTestConfiguration, tests: List<Pair<LoadTest<*, *>, LoadTest.RunParameters>>): Unit defined in net.corda.loadtest in file LoadTest.kt[SimpleFunctionDescriptorImpl]

'loadTestConfiguration' @ [135:18] ==> value-parameter loadTestConfiguration: LoadTestConfiguration defined in net.corda.loadtest.runStabilityTest[ValueParameterDescriptorImpl]

'listOf' @ [135:41] ==> public fun <T> listOf(vararg elements: Pair<LoadTest<out Any, Unit>, LoadTest.RunParameters>): List<Pair<LoadTest<out Any, Unit>, LoadTest.RunParameters>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<LoadTest<out Any, Unit>, RunParameters>

'StabilityTest' @ [137:13] ==> public object StabilityTest defined in net.corda.loadtest.tests in file StabilityTest.kt[FakeCallableDescriptorForObject]

'selfIssueTest' @ [137:27] ==> public final fun selfIssueTest(replication: Int): LoadTest<SelfIssueCommand, Unit> defined in net.corda.loadtest.tests.StabilityTest[SimpleFunctionDescriptorImpl]

'RunParameters' @ [137:58] ==> public constructor RunParameters(parallelism: Int, generateCount: Int, clearDatabaseBeforeRun: Boolean, executionFrequency: Int?, gatherFrequency: Int, disruptionPatterns: List<List<DisruptionSpec>>) defined in net.corda.loadtest.LoadTest.RunParameters[ClassConstructorDescriptorImpl]

'loadTestConfiguration' @ [138:35] ==> value-parameter loadTestConfiguration: LoadTestConfiguration defined in net.corda.loadtest.runStabilityTest[ValueParameterDescriptorImpl]

'parallelism' @ [138:57] ==> public final val parallelism: Int defined in net.corda.loadtest.LoadTestConfiguration[PropertyDescriptorImpl]

'listOf' @ [143:42] ==> public fun <T> listOf(element: List<DisruptionSpec>): List<List<DisruptionSpec>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<DisruptionSpec>

'listOf' @ [143:49] ==> @InlineOnly public inline fun <T> listOf(): List<DisruptionSpec> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DisruptionSpec

'StabilityTest' @ [146:13] ==> public object StabilityTest defined in net.corda.loadtest.tests in file StabilityTest.kt[FakeCallableDescriptorForObject]

'crossCashTest' @ [146:27] ==> public final fun crossCashTest(replication: Int): LoadTest<CrossCashCommand, Unit> defined in net.corda.loadtest.tests.StabilityTest[SimpleFunctionDescriptorImpl]

'RunParameters' @ [146:58] ==> public constructor RunParameters(parallelism: Int, generateCount: Int, clearDatabaseBeforeRun: Boolean, executionFrequency: Int?, gatherFrequency: Int, disruptionPatterns: List<List<DisruptionSpec>>) defined in net.corda.loadtest.LoadTest.RunParameters[ClassConstructorDescriptorImpl]

'loadTestConfiguration' @ [147:35] ==> value-parameter loadTestConfiguration: LoadTestConfiguration defined in net.corda.loadtest.runStabilityTest[ValueParameterDescriptorImpl]

'parallelism' @ [147:57] ==> public final val parallelism: Int defined in net.corda.loadtest.LoadTestConfiguration[PropertyDescriptorImpl]

'loadTestConfiguration' @ [148:37] ==> value-parameter loadTestConfiguration: LoadTestConfiguration defined in net.corda.loadtest.runStabilityTest[ValueParameterDescriptorImpl]

'generateCount' @ [148:59] ==> public final val generateCount: Int defined in net.corda.loadtest.LoadTestConfiguration[PropertyDescriptorImpl]

'loadTestConfiguration' @ [150:42] ==> value-parameter loadTestConfiguration: LoadTestConfiguration defined in net.corda.loadtest.runStabilityTest[ValueParameterDescriptorImpl]

'executionFrequency' @ [150:64] ==> public final val executionFrequency: Int defined in net.corda.loadtest.LoadTestConfiguration[PropertyDescriptorImpl]

'listOf' @ [152:42] ==> public fun <T> listOf(element: List<DisruptionSpec>): List<List<DisruptionSpec>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<DisruptionSpec>

'listOf' @ [152:49] ==> @InlineOnly public inline fun <T> listOf(): List<DisruptionSpec> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DisruptionSpec

