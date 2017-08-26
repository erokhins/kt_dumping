'TestCase' @ [42:25] ==> public constructor TestCase() defined in junit.framework.TestCase[JavaClassConstructorDescriptor]

'Test' @ [44:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'TestRepl' @ [46:9] ==> public constructor TestRepl(templateClasspath: List<File> = ..., templateClassName: String = ..., repeatingMode: ReplRepeatingMode = ...) defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[ClassConstructorDescriptorImpl]

'use' @ [46:20] ==> @InlineOnly public inline fun <T : Closeable?, R> TestRepl.use(block: (TestRepl) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> TestRepl
    <R> -> Unit

'repl' @ [47:25] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[ValueParameterDescriptorImpl]

'createState' @ [47:30] ==> public final fun createState(lock: ReentrantReadWriteLock = ...): IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[SimpleFunctionDescriptorImpl]

'repl' @ [49:24] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[ValueParameterDescriptorImpl]

'replCompiler' @ [49:29] ==> public final val replCompiler: GenericReplCompiler defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'check' @ [49:42] ==> public open fun check(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCheckResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[DeserializedSimpleFunctionDescriptor]

'state' @ [49:48] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'ReplCodeLine' @ [49:55] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'assertTrue' @ [50:22] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res1' @ [50:61] ==> val res1: ReplCheckResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'res1' @ [50:68] ==> val res1: ReplCheckResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'ReplCodeLine' @ [52:29] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'repl' @ [53:24] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[ValueParameterDescriptorImpl]

'replCompiler' @ [53:29] ==> public final val replCompiler: GenericReplCompiler defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'compile' @ [53:42] ==> public open fun compile(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[DeserializedSimpleFunctionDescriptor]

'state' @ [53:50] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'codeLine0' @ [53:57] ==> val codeLine0: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'res2' @ [54:25] ==> val res2: ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'assertNotNull' @ [55:22] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res2' @ [55:65] ==> val res2: ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'res2c' @ [55:72] ==> val res2c: ReplCompileResult.CompiledClasses? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'repl' @ [57:25] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[ValueParameterDescriptorImpl]

'compiledEvaluator' @ [57:30] ==> public final val compiledEvaluator: ReplEvaluator defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'eval' @ [57:48] ==> public abstract fun eval(state: IReplStageState<*>, compileResult: ReplCompileResult.CompiledClasses, scriptArgs: ScriptArgsWithTypes?, invokeWrapper: InvokeWrapper?): ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.ReplEvaluator[DeserializedSimpleFunctionDescriptor]

'state' @ [57:53] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'res2c' @ [57:60] ==> val res2c: ReplCompileResult.CompiledClasses? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'res21' @ [58:26] ==> val res21: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'assertNotNull' @ [59:22] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res21' @ [59:62] ==> val res21: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'res21e' @ [59:70] ==> val res21e: ReplEvalResult.ValueResult? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [60:22] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res21e' @ [60:38] ==> val res21e: ReplEvalResult.ValueResult? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'value' @ [60:47] ==> public final val value: Any? defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.ValueResult[DeserializedPropertyDescriptor]

'ReplCodeLine' @ [62:29] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'repl' @ [63:24] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[ValueParameterDescriptorImpl]

'replCompiler' @ [63:29] ==> public final val replCompiler: GenericReplCompiler defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'compile' @ [63:42] ==> public open fun compile(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[DeserializedSimpleFunctionDescriptor]

'state' @ [63:50] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'codeLine1' @ [63:57] ==> val codeLine1: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'res3' @ [64:25] ==> val res3: ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'assertNotNull' @ [65:22] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res3' @ [65:65] ==> val res3: ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'res3c' @ [65:72] ==> val res3c: ReplCompileResult.CompiledClasses? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'repl' @ [67:25] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[ValueParameterDescriptorImpl]

'compiledEvaluator' @ [67:30] ==> public final val compiledEvaluator: ReplEvaluator defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'eval' @ [67:48] ==> public abstract fun eval(state: IReplStageState<*>, compileResult: ReplCompileResult.CompiledClasses, scriptArgs: ScriptArgsWithTypes?, invokeWrapper: InvokeWrapper?): ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.ReplEvaluator[DeserializedSimpleFunctionDescriptor]

'state' @ [67:53] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'res3c' @ [67:60] ==> val res3c: ReplCompileResult.CompiledClasses? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'res31' @ [68:26] ==> val res31: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'assertNotNull' @ [69:22] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res31' @ [69:62] ==> val res31: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'res31e' @ [69:70] ==> val res31e: ReplEvalResult.UnitResult? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'ReplCodeLine' @ [71:29] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'repl' @ [72:24] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[ValueParameterDescriptorImpl]

'replCompiler' @ [72:29] ==> public final val replCompiler: GenericReplCompiler defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'compile' @ [72:42] ==> public open fun compile(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[DeserializedSimpleFunctionDescriptor]

'state' @ [72:50] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'codeLine2' @ [72:57] ==> val codeLine2: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'res4' @ [73:25] ==> val res4: ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'assertNotNull' @ [74:22] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res4' @ [74:65] ==> val res4: ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'res4c' @ [74:72] ==> val res4c: ReplCompileResult.CompiledClasses? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'repl' @ [76:25] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[ValueParameterDescriptorImpl]

'compiledEvaluator' @ [76:30] ==> public final val compiledEvaluator: ReplEvaluator defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'eval' @ [76:48] ==> public abstract fun eval(state: IReplStageState<*>, compileResult: ReplCompileResult.CompiledClasses, scriptArgs: ScriptArgsWithTypes?, invokeWrapper: InvokeWrapper?): ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.ReplEvaluator[DeserializedSimpleFunctionDescriptor]

'state' @ [76:53] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'res4c' @ [76:60] ==> val res4c: ReplCompileResult.CompiledClasses? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'res41' @ [77:26] ==> val res41: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'assertNotNull' @ [78:22] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res41' @ [78:62] ==> val res41: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'res41e' @ [78:70] ==> val res41e: ReplEvalResult.ValueResult? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [79:22] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res41e' @ [79:38] ==> val res41e: ReplEvalResult.ValueResult? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplBasics.<anonymous>[LocalVariableDescriptor]

'value' @ [79:47] ==> public final val value: Any? defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.ValueResult[DeserializedPropertyDescriptor]

'Test' @ [83:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'TestRepl' @ [85:9] ==> public constructor TestRepl(templateClasspath: List<File> = ..., templateClassName: String = ..., repeatingMode: ReplRepeatingMode = ...) defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[ClassConstructorDescriptorImpl]

'use' @ [85:20] ==> @InlineOnly public inline fun <T : Closeable?, R> TestRepl.use(block: (TestRepl) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> TestRepl
    <R> -> Unit

'repl' @ [86:25] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplErrors.<anonymous>[ValueParameterDescriptorImpl]

'createState' @ [86:30] ==> public final fun createState(lock: ReentrantReadWriteLock = ...): IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[SimpleFunctionDescriptorImpl]

'repl' @ [87:13] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplErrors.<anonymous>[ValueParameterDescriptorImpl]

'compileAndEval' @ [87:18] ==> private fun TestRepl.compileAndEval(state: IReplStageState<*>, codeLine: ReplCodeLine): Pair<ReplCompileResult, ReplEvalResult?> defined in org.jetbrains.kotlin.cli.jvm.repl[SimpleFunctionDescriptorImpl]

'state' @ [87:33] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplErrors.<anonymous>[LocalVariableDescriptor]

'repl' @ [87:40] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplErrors.<anonymous>[ValueParameterDescriptorImpl]

'nextCodeLine' @ [87:45] ==> public final fun nextCodeLine(code: String): ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[SimpleFunctionDescriptorImpl]

'repl' @ [89:23] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplErrors.<anonymous>[ValueParameterDescriptorImpl]

'compileAndEval' @ [89:28] ==> private fun TestRepl.compileAndEval(state: IReplStageState<*>, codeLine: ReplCodeLine): Pair<ReplCompileResult, ReplEvalResult?> defined in org.jetbrains.kotlin.cli.jvm.repl[SimpleFunctionDescriptorImpl]

'state' @ [89:43] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplErrors.<anonymous>[LocalVariableDescriptor]

'repl' @ [89:50] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplErrors.<anonymous>[ValueParameterDescriptorImpl]

'nextCodeLine' @ [89:55] ==> public final fun nextCodeLine(code: String): ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[SimpleFunctionDescriptorImpl]

'assertTrue' @ [90:22] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res' @ [90:59] ==> val res: Pair<ReplCompileResult, ReplEvalResult?> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplErrors.<anonymous>[LocalVariableDescriptor]

'first' @ [90:63] ==> public final val first: ReplCompileResult defined in kotlin.Pair[DeserializedPropertyDescriptor]

'repl' @ [92:26] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplErrors.<anonymous>[ValueParameterDescriptorImpl]

'compileAndEval' @ [92:31] ==> private fun TestRepl.compileAndEval(state: IReplStageState<*>, codeLine: ReplCodeLine): Pair<ReplCompileResult, ReplEvalResult?> defined in org.jetbrains.kotlin.cli.jvm.repl[SimpleFunctionDescriptorImpl]

'state' @ [92:46] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplErrors.<anonymous>[LocalVariableDescriptor]

'repl' @ [92:53] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplErrors.<anonymous>[ValueParameterDescriptorImpl]

'nextCodeLine' @ [92:58] ==> public final fun nextCodeLine(code: String): ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[SimpleFunctionDescriptorImpl]

'assertEquals' @ [93:13] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res' @ [93:26] ==> val res: Pair<ReplCompileResult, ReplEvalResult?> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplErrors.<anonymous>[LocalVariableDescriptor]

'second' @ [93:30] ==> public final val second: ReplEvalResult? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toString' @ [93:37] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'result' @ [93:54] ==> val result: Pair<ReplCompileResult, ReplEvalResult?> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplErrors.<anonymous>[LocalVariableDescriptor]

'second' @ [93:61] ==> public final val second: ReplEvalResult? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'value' @ [93:101] ==> public final val value: Any? defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.ValueResult[DeserializedPropertyDescriptor]

'Test' @ [97:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'TestRepl' @ [99:9] ==> public constructor TestRepl(templateClasspath: List<File> = ..., templateClassName: String = ..., repeatingMode: ReplRepeatingMode = ...) defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[ClassConstructorDescriptorImpl]

'use' @ [99:20] ==> @InlineOnly public inline fun <T : Closeable?, R> TestRepl.use(block: (TestRepl) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> TestRepl
    <R> -> Unit

'repl' @ [100:25] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplCodeFormat.<anonymous>[ValueParameterDescriptorImpl]

'createState' @ [100:30] ==> public final fun createState(lock: ReentrantReadWriteLock = ...): IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[SimpleFunctionDescriptorImpl]

'ReplCodeLine' @ [102:29] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'repl' @ [103:24] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplCodeFormat.<anonymous>[ValueParameterDescriptorImpl]

'replCompiler' @ [103:29] ==> public final val replCompiler: GenericReplCompiler defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'check' @ [103:42] ==> public open fun check(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCheckResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[DeserializedSimpleFunctionDescriptor]

'state' @ [103:48] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplCodeFormat.<anonymous>[LocalVariableDescriptor]

'codeLine0' @ [103:55] ==> val codeLine0: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplCodeFormat.<anonymous>[LocalVariableDescriptor]

'res0' @ [104:25] ==> val res0: ReplCheckResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplCodeFormat.<anonymous>[LocalVariableDescriptor]

'assertNotNull' @ [105:22] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res0' @ [105:65] ==> val res0: ReplCheckResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplCodeFormat.<anonymous>[LocalVariableDescriptor]

'res0c' @ [105:72] ==> val res0c: ReplCheckResult.Ok? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testReplCodeFormat.<anonymous>[LocalVariableDescriptor]

'Test' @ [109:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'TestRepl' @ [111:9] ==> public constructor TestRepl(templateClasspath: List<File> = ..., templateClassName: String = ..., repeatingMode: ReplRepeatingMode = ...) defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[ClassConstructorDescriptorImpl]

'use' @ [111:20] ==> @InlineOnly public inline fun <T : Closeable?, R> TestRepl.use(block: (TestRepl) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> TestRepl
    <R> -> Unit

'repl' @ [112:25] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[ValueParameterDescriptorImpl]

'createState' @ [112:30] ==> public final fun createState(lock: ReentrantReadWriteLock = ...): IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[SimpleFunctionDescriptorImpl]

'repl' @ [114:29] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[ValueParameterDescriptorImpl]

'nextCodeLine' @ [114:34] ==> public final fun nextCodeLine(code: String): ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[SimpleFunctionDescriptorImpl]

'repl' @ [115:24] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[ValueParameterDescriptorImpl]

'replCompiler' @ [115:29] ==> public final val replCompiler: GenericReplCompiler defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'compile' @ [115:42] ==> public open fun compile(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[DeserializedSimpleFunctionDescriptor]

'state' @ [115:50] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'codeLine1' @ [115:57] ==> val codeLine1: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'res1' @ [116:25] ==> val res1: ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'assertNotNull' @ [117:22] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res1' @ [117:65] ==> val res1: ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'res1c' @ [117:72] ==> val res1c: ReplCompileResult.CompiledClasses? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'repl' @ [119:25] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[ValueParameterDescriptorImpl]

'compiledEvaluator' @ [119:30] ==> public final val compiledEvaluator: ReplEvaluator defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'eval' @ [119:48] ==> public abstract fun eval(state: IReplStageState<*>, compileResult: ReplCompileResult.CompiledClasses, scriptArgs: ScriptArgsWithTypes?, invokeWrapper: InvokeWrapper?): ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.ReplEvaluator[DeserializedSimpleFunctionDescriptor]

'state' @ [119:53] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'res1c' @ [119:60] ==> val res1c: ReplCompileResult.CompiledClasses? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'res11' @ [120:26] ==> val res11: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'assertNotNull' @ [121:22] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res11' @ [121:62] ==> val res11: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'res11e' @ [121:70] ==> val res11e: ReplEvalResult.ValueResult? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [122:22] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res11e' @ [122:38] ==> val res11e: ReplEvalResult.ValueResult? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'value' @ [122:47] ==> public final val value: Any? defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.ValueResult[DeserializedPropertyDescriptor]

'repl' @ [124:29] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[ValueParameterDescriptorImpl]

'nextCodeLine' @ [124:34] ==> public final fun nextCodeLine(code: String): ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[SimpleFunctionDescriptorImpl]

'repl' @ [125:24] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[ValueParameterDescriptorImpl]

'replCompiler' @ [125:29] ==> public final val replCompiler: GenericReplCompiler defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'compile' @ [125:42] ==> public open fun compile(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[DeserializedSimpleFunctionDescriptor]

'state' @ [125:50] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'codeLine2' @ [125:57] ==> val codeLine2: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'res2' @ [126:25] ==> val res2: ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'assertNotNull' @ [127:22] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res2' @ [127:65] ==> val res2: ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'res2c' @ [127:72] ==> val res2c: ReplCompileResult.CompiledClasses? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'repl' @ [129:25] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[ValueParameterDescriptorImpl]

'compiledEvaluator' @ [129:30] ==> public final val compiledEvaluator: ReplEvaluator defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'eval' @ [129:48] ==> public abstract fun eval(state: IReplStageState<*>, compileResult: ReplCompileResult.CompiledClasses, scriptArgs: ScriptArgsWithTypes?, invokeWrapper: InvokeWrapper?): ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.ReplEvaluator[DeserializedSimpleFunctionDescriptor]

'state' @ [129:53] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'res2c' @ [129:60] ==> val res2c: ReplCompileResult.CompiledClasses? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'res21' @ [130:26] ==> val res21: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'assertNotNull' @ [131:22] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res21' @ [131:62] ==> val res21: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'res21e' @ [131:70] ==> val res21e: ReplEvalResult.ValueResult? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [132:22] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res21e' @ [132:38] ==> val res21e: ReplEvalResult.ValueResult? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testRepPackage.<anonymous>[LocalVariableDescriptor]

'value' @ [132:47] ==> public final val value: Any? defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.ValueResult[DeserializedPropertyDescriptor]

'Test' @ [136:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'TestRepl' @ [138:9] ==> public constructor TestRepl(templateClasspath: List<File> = ..., templateClassName: String = ..., repeatingMode: ReplRepeatingMode = ...) defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[ClassConstructorDescriptorImpl]

'use' @ [138:20] ==> @InlineOnly public inline fun <T : Closeable?, R> TestRepl.use(block: (TestRepl) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> TestRepl
    <R> -> Unit

'GenericReplCompilingEvaluator' @ [139:24] ==> public constructor GenericReplCompilingEvaluator(compiler: ReplCompiler, baseClasspath: Iterable<File>, baseClassloader: ClassLoader? = ..., fallbackScriptArgs: ScriptArgsWithTypes? = ..., repeatingMode: ReplRepeatingMode = ...) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[DeserializedClassConstructorDescriptor]

'replBase' @ [139:54] ==> value-parameter replBase: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testCompilingReplEvaluator.<anonymous>[ValueParameterDescriptorImpl]

'replCompiler' @ [139:63] ==> public final val replCompiler: GenericReplCompiler defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'replBase' @ [139:77] ==> value-parameter replBase: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testCompilingReplEvaluator.<anonymous>[ValueParameterDescriptorImpl]

'baseClasspath' @ [139:86] ==> public final val baseClasspath: List<File> defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'replBase' @ [139:122] ==> value-parameter replBase: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testCompilingReplEvaluator.<anonymous>[ValueParameterDescriptorImpl]

'emptyScriptArgs' @ [139:131] ==> public final val emptyScriptArgs: ScriptArgsWithTypes defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'repl' @ [141:25] ==> val repl: GenericReplCompilingEvaluator defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testCompilingReplEvaluator.<anonymous>[LocalVariableDescriptor]

'createState' @ [141:30] ==> public open fun createState(lock: ReentrantReadWriteLock): IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[DeserializedSimpleFunctionDescriptor]

'repl' @ [143:24] ==> val repl: GenericReplCompilingEvaluator defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testCompilingReplEvaluator.<anonymous>[LocalVariableDescriptor]

'compileAndEval' @ [143:29] ==> public open fun compileAndEval(state: IReplStageState<*>, codeLine: ReplCodeLine, scriptArgs: ScriptArgsWithTypes?, invokeWrapper: InvokeWrapper?): ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[DeserializedSimpleFunctionDescriptor]

'state' @ [143:44] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testCompilingReplEvaluator.<anonymous>[LocalVariableDescriptor]

'ReplCodeLine' @ [143:51] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'assertTrue' @ [144:13] ==> public open fun assertTrue(p0: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res1' @ [144:24] ==> val res1: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testCompilingReplEvaluator.<anonymous>[LocalVariableDescriptor]

'repl' @ [146:24] ==> val repl: GenericReplCompilingEvaluator defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testCompilingReplEvaluator.<anonymous>[LocalVariableDescriptor]

'compileAndEval' @ [146:29] ==> public open fun compileAndEval(state: IReplStageState<*>, codeLine: ReplCodeLine, scriptArgs: ScriptArgsWithTypes?, invokeWrapper: InvokeWrapper?): ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[DeserializedSimpleFunctionDescriptor]

'state' @ [146:44] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testCompilingReplEvaluator.<anonymous>[LocalVariableDescriptor]

'ReplCodeLine' @ [146:51] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'assertEquals' @ [147:13] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res2' @ [147:26] ==> val res2: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testCompilingReplEvaluator.<anonymous>[LocalVariableDescriptor]

'toString' @ [147:31] ==> public open fun toString(): String defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult[DeserializedSimpleFunctionDescriptor]

'res2' @ [147:48] ==> val res2: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.testCompilingReplEvaluator.<anonymous>[LocalVariableDescriptor]

'value' @ [147:86] ==> public final val value: Any? defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.ValueResult[DeserializedPropertyDescriptor]

'Test' @ [151:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'TestRepl' @ [153:9] ==> public constructor TestRepl(templateClasspath: List<File> = ..., templateClassName: String = ..., repeatingMode: ReplRepeatingMode = ...) defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[ClassConstructorDescriptorImpl]

'use' @ [153:20] ==> @InlineOnly public inline fun <T : Closeable?, R> TestRepl.use(block: (TestRepl) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> TestRepl
    <R> -> Unit

'repl' @ [154:25] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.test256Evals.<anonymous>[ValueParameterDescriptorImpl]

'createState' @ [154:30] ==> public final fun createState(lock: ReentrantReadWriteLock = ...): IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[SimpleFunctionDescriptorImpl]

'repl' @ [156:13] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.test256Evals.<anonymous>[ValueParameterDescriptorImpl]

'compileAndEval' @ [156:18] ==> private fun TestRepl.compileAndEval(state: IReplStageState<*>, codeLine: ReplCodeLine): Pair<ReplCompileResult, ReplEvalResult?> defined in org.jetbrains.kotlin.cli.jvm.repl[SimpleFunctionDescriptorImpl]

'state' @ [156:33] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.test256Evals.<anonymous>[LocalVariableDescriptor]

'ReplCodeLine' @ [156:40] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'..' @ [159:23] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'evals' @ [159:26] ==> val evals: Int defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.test256Evals.<anonymous>[LocalVariableDescriptor]

'repl' @ [160:17] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.test256Evals.<anonymous>[ValueParameterDescriptorImpl]

'compileAndEval' @ [160:22] ==> private fun TestRepl.compileAndEval(state: IReplStageState<*>, codeLine: ReplCodeLine): Pair<ReplCompileResult, ReplEvalResult?> defined in org.jetbrains.kotlin.cli.jvm.repl[SimpleFunctionDescriptorImpl]

'state' @ [160:37] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.test256Evals.<anonymous>[LocalVariableDescriptor]

'ReplCodeLine' @ [160:44] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'i' @ [160:57] ==> val i: Int defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.test256Evals.<anonymous>[LocalVariableDescriptor]

'i' @ [160:70] ==> val i: Int defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.test256Evals.<anonymous>[LocalVariableDescriptor]

'i' @ [160:77] ==> val i: Int defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.test256Evals.<anonymous>[LocalVariableDescriptor]

'repl' @ [163:23] ==> value-parameter repl: TestRepl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.test256Evals.<anonymous>[ValueParameterDescriptorImpl]

'compileAndEval' @ [163:28] ==> private fun TestRepl.compileAndEval(state: IReplStageState<*>, codeLine: ReplCodeLine): Pair<ReplCompileResult, ReplEvalResult?> defined in org.jetbrains.kotlin.cli.jvm.repl[SimpleFunctionDescriptorImpl]

'state' @ [163:43] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.test256Evals.<anonymous>[LocalVariableDescriptor]

'ReplCodeLine' @ [163:50] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'evals' @ [163:63] ==> val evals: Int defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.test256Evals.<anonymous>[LocalVariableDescriptor]

'evals' @ [163:80] ==> val evals: Int defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.test256Evals.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [164:13] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res' @ [164:26] ==> val res: Pair<ReplCompileResult, ReplEvalResult?> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.test256Evals.<anonymous>[LocalVariableDescriptor]

'second' @ [164:30] ==> public final val second: ReplEvalResult? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toString' @ [164:37] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'evals' @ [164:49] ==> val evals: Int defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.test256Evals.<anonymous>[LocalVariableDescriptor]

'res' @ [164:57] ==> val res: Pair<ReplCompileResult, ReplEvalResult?> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplTest.test256Evals.<anonymous>[LocalVariableDescriptor]

'second' @ [164:61] ==> public final val second: ReplEvalResult? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'value' @ [164:101] ==> public final val value: Any? defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.ValueResult[DeserializedPropertyDescriptor]

'listOf' @ [171:41] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [171:48] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getCompilerLib' @ [171:79] ==> public open fun getCompilerLib(): (File..File?) defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'NONE' @ [173:62] ==> enum entry NONE defined in org.jetbrains.kotlin.cli.common.repl.ReplRepeatingMode[FakeCallableDescriptorForObject]

'getApplication' @ [175:42] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'lazy' @ [177:43] ==> public fun <T> lazy(initializer: () -> Disposable): Lazy<Disposable> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Disposable

'newDisposable' @ [177:59] ==> @NotNull public open fun newDisposable(): Disposable defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'ScriptArgsWithTypes' @ [179:27] ==> public constructor ScriptArgsWithTypes(scriptArgs: Array<out Any?>, scriptArgsTypes: Array<out KClass<out Any>>) defined in org.jetbrains.kotlin.cli.common.repl.ScriptArgsWithTypes[DeserializedClassConstructorDescriptor]

'arrayOf' @ [179:47] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Array<String>): Array<Array<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Array<String>

'emptyArray' @ [179:55] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'arrayOf' @ [179:78] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KClass<Array<String>>): Array<KClass<Array<String>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KClass<Array<String>>

'Array' @ [179:86] ==> public constructor Array<T>(size: Int, init: (Int) -> Any?) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> Any?

'newConfiguration' @ [181:49] ==> @NotNull public open fun newConfiguration(@NotNull p0: ConfigurationKind, @NotNull p1: TestJdkKind, @NotNull vararg p2: (File..File?)): CompilerConfiguration defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'ALL' @ [181:84] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'MOCK_JDK' @ [181:101] ==> enum entry MOCK_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'templateClasspath' @ [181:112] ==> value-parameter templateClasspath: List<File> = ... defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl.<init>[ValueParameterDescriptorImpl]

'toTypedArray' @ [181:130] ==> public inline fun <reified T> Collection<File>.toTypedArray(): Array<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> File

'apply' @ [181:146] ==> @InlineOnly public inline fun <T> CompilerConfiguration.apply(block: (CompilerConfiguration).() -> Unit): CompilerConfiguration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerConfiguration

'put' @ [182:9] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'CommonConfigurationKeys' @ [182:13] ==> public object CommonConfigurationKeys defined in org.jetbrains.kotlin.config[FakeCallableDescriptorForObject]

'MODULE_NAME' @ [182:37] ==> @field:JvmField public final val MODULE_NAME: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'configuration' @ [185:43] ==> private final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'jvmClasspathRoots' @ [185:57] ==> public val CompilerConfiguration.jvmClasspathRoots: List<File> defined in org.jetbrains.kotlin.cli.jvm.config[DeserializedPropertyDescriptor]

'AtomicInteger' @ [187:30] ==> public constructor AtomicInteger() defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'ReplCodeLine' @ [189:52] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'currentLineCounter' @ [189:65] ==> public final val currentLineCounter: AtomicInteger defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'getAndIncrement' @ [189:84] ==> public final fun getAndIncrement(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'code' @ [189:106] ==> value-parameter code: String defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl.nextCodeLine[ValueParameterDescriptorImpl]

'URLClassLoader' @ [192:27] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'templateClasspath' @ [192:42] ==> value-parameter templateClasspath: List<File> defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl.makeScriptDefinition[ValueParameterDescriptorImpl]

'map' @ [192:60] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (URL..URL?)): List<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (java.net.URL..java.net.URL?)

'it' @ [192:66] ==> value-parameter it: File defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl.makeScriptDefinition.<anonymous>[ValueParameterDescriptorImpl]

'toURI' @ [192:69] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [192:77] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'toTypedArray' @ [192:87] ==> public inline fun <reified T> Collection<(URL..URL?)>.toTypedArray(): Array<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.net.URL..java.net.URL?)

'this' @ [192:103] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[LazyClassReceiverParameterDescriptor]

'java' @ [192:115] ==> public val <T> KClass<out TestRepl>.java: Class<out TestRepl> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TestRepl

'classLoader' @ [192:120] ==> public final val <T : (Any..Any?)> Class<out TestRepl>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TestRepl

'classloader' @ [193:19] ==> val classloader: URLClassLoader defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl.makeScriptDefinition[LocalVariableDescriptor]

'loadClass' @ [193:31] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.net.URLClassLoader[JavaMethodDescriptor]

'templateClassName' @ [193:41] ==> value-parameter templateClassName: String defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl.makeScriptDefinition[ValueParameterDescriptorImpl]

'KotlinScriptDefinitionFromAnnotatedTemplate' @ [194:16] ==> public constructor KotlinScriptDefinitionFromAnnotatedTemplate(template: KClass<out Any>, providedResolver: DependenciesResolver? = ..., providedScriptFilePattern: String? = ..., environment: Map<String, Any?>? = ..., templateClasspath: List<File> = ...) defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[DeserializedClassConstructorDescriptor]

'cls' @ [194:60] ==> val cls: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl.makeScriptDefinition[LocalVariableDescriptor]

'kotlin' @ [194:64] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'emptyMap' @ [194:84] ==> public fun <K, V> emptyMap(): Map<String, Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any?

'makeScriptDefinition' @ [197:29] ==> private final fun makeScriptDefinition(templateClasspath: List<File>, templateClassName: String): KotlinScriptDefinition defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[SimpleFunctionDescriptorImpl]

'templateClasspath' @ [197:50] ==> value-parameter templateClasspath: List<File> = ... defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl.<init>[ValueParameterDescriptorImpl]

'templateClassName' @ [197:69] ==> value-parameter templateClassName: String = ... defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl.<init>[ValueParameterDescriptorImpl]

'lazy' @ [199:47] ==> public fun <T> lazy(initializer: () -> GenericReplCompiler): Lazy<GenericReplCompiler> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenericReplCompiler

'GenericReplCompiler' @ [200:9] ==> public constructor GenericReplCompiler(disposable: Disposable, scriptDefinition: KotlinScriptDefinition, compilerConfiguration: CompilerConfiguration, messageCollector: MessageCollector) defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[DeserializedClassConstructorDescriptor]

'disposable' @ [200:29] ==> private final val disposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'scriptDef' @ [200:41] ==> private final val scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'configuration' @ [200:52] ==> private final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'PrintingMessageCollector' @ [200:67] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'out' @ [200:99] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'WITHOUT_PATHS' @ [200:120] ==> public final val WITHOUT_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'lazy' @ [203:45] ==> public fun <T> lazy(initializer: () -> GenericReplEvaluator): Lazy<GenericReplEvaluator> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenericReplEvaluator

'GenericReplEvaluator' @ [204:9] ==> public constructor GenericReplEvaluator(baseClasspath: Iterable<File>, baseClassloader: ClassLoader? = ..., fallbackScriptArgs: ScriptArgsWithTypes? = ..., repeatingMode: ReplRepeatingMode = ...) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator[DeserializedClassConstructorDescriptor]

'baseClasspath' @ [204:30] ==> public final val baseClasspath: List<File> defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'emptyScriptArgs' @ [204:51] ==> public final val emptyScriptArgs: ScriptArgsWithTypes defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'repeatingMode' @ [204:68] ==> value-parameter repeatingMode: ReplRepeatingMode = ... defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl.<init>[ValueParameterDescriptorImpl]

'ReentrantReadWriteLock' @ [207:52] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'AggregatedReplStageState' @ [208:13] ==> public constructor AggregatedReplStageState<T1, T2>(state1: IReplStageState<out Any?>, state2: IReplStageState<out Any?>, lock: ReentrantReadWriteLock = ...) defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[DeserializedClassConstructorDescriptor]
Inferred types:
    <T1> -> Any?
    <T2> -> Any?

'replCompiler' @ [208:38] ==> public final val replCompiler: GenericReplCompiler defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'createState' @ [208:51] ==> public open fun createState(lock: ReentrantReadWriteLock): IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[DeserializedSimpleFunctionDescriptor]

'lock' @ [208:63] ==> value-parameter lock: ReentrantReadWriteLock = ... defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl.createState[ValueParameterDescriptorImpl]

'compiledEvaluator' @ [208:70] ==> public final val compiledEvaluator: ReplEvaluator defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'createState' @ [208:88] ==> public abstract fun createState(lock: ReentrantReadWriteLock): IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.ReplEvaluator[DeserializedSimpleFunctionDescriptor]

'lock' @ [208:100] ==> value-parameter lock: ReentrantReadWriteLock = ... defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl.createState[ValueParameterDescriptorImpl]

'lock' @ [208:107] ==> value-parameter lock: ReentrantReadWriteLock = ... defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl.createState[ValueParameterDescriptorImpl]

'dispose' @ [211:18] ==> public open fun dispose(@NotNull p0: Disposable): Unit defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'disposable' @ [211:26] ==> private final val disposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'resetApplicationToNull' @ [212:9] ==> public open fun resetApplicationToNull(p0: (Application..Application?)): Unit defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaMethodDescriptor]

'application' @ [212:32] ==> public final val application: (Application..Application?) defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'replCompiler' @ [218:19] ==> public final val replCompiler: GenericReplCompiler defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'compile' @ [218:32] ==> public open fun compile(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[DeserializedSimpleFunctionDescriptor]

'state' @ [218:40] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.compileAndEval[ValueParameterDescriptorImpl]

'codeLine' @ [218:47] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.compileAndEval[ValueParameterDescriptorImpl]

'compRes' @ [220:20] ==> val compRes: ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.compileAndEval[LocalVariableDescriptor]

'let' @ [220:68] ==> @InlineOnly public inline fun <T, R> ReplCompileResult.CompiledClasses.let(block: (ReplCompileResult.CompiledClasses) -> ReplEvalResult): ReplEvalResult defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompiledClasses
    <R> -> ReplEvalResult

'compiledEvaluator' @ [222:9] ==> public final val compiledEvaluator: ReplEvaluator defined in org.jetbrains.kotlin.cli.jvm.repl.TestRepl[PropertyDescriptorImpl]

'eval' @ [222:27] ==> public abstract fun eval(state: IReplStageState<*>, compileResult: ReplCompileResult.CompiledClasses, scriptArgs: ScriptArgsWithTypes?, invokeWrapper: InvokeWrapper?): ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.ReplEvaluator[DeserializedSimpleFunctionDescriptor]

'state' @ [222:32] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.compileAndEval[ValueParameterDescriptorImpl]

'it' @ [222:39] ==> value-parameter it: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.jvm.repl.compileAndEval.<anonymous>[ValueParameterDescriptorImpl]

'compRes' @ [224:12] ==> val compRes: ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.compileAndEval[LocalVariableDescriptor]

'evalRes' @ [224:23] ==> val evalRes: ReplEvalResult? defined in org.jetbrains.kotlin.cli.jvm.repl.compileAndEval[LocalVariableDescriptor]

