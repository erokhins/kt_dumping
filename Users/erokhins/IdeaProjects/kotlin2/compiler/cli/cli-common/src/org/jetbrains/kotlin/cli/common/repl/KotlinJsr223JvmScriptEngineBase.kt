'AbstractScriptEngine' @ [26:96] ==> public constructor AbstractScriptEngine() defined in javax.script.AbstractScriptEngine[JavaClassConstructorDescriptor]

'compileAndEval' @ [31:71] ==> public open fun compileAndEval(script: String, context: ScriptContext): Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[SimpleFunctionDescriptorImpl]

'script' @ [31:86] ==> value-parameter script: String defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.eval[ValueParameterDescriptorImpl]

'context' @ [31:94] ==> value-parameter context: ScriptContext defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.eval[ValueParameterDescriptorImpl]

'compileAndEval' @ [33:71] ==> public open fun compileAndEval(script: String, context: ScriptContext): Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[SimpleFunctionDescriptorImpl]

'script' @ [33:86] ==> value-parameter script: Reader defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.eval[ValueParameterDescriptorImpl]

'readText' @ [33:93] ==> public fun Reader.readText(): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'context' @ [33:105] ==> value-parameter context: ScriptContext defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.eval[ValueParameterDescriptorImpl]

'compile' @ [35:60] ==> public open fun compile(script: String, context: ScriptContext): CompiledScript defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[SimpleFunctionDescriptorImpl]

'script' @ [35:68] ==> value-parameter script: String defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compile[ValueParameterDescriptorImpl]

'getContext' @ [35:76] ==> public open fun getContext(): (ScriptContext..ScriptContext?) defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[JavaMethodDescriptor]

'compile' @ [37:60] ==> public open fun compile(script: String, context: ScriptContext): CompiledScript defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[SimpleFunctionDescriptorImpl]

'script' @ [37:68] ==> value-parameter script: Reader defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compile[ValueParameterDescriptorImpl]

'readText' @ [37:75] ==> public fun Reader.readText(): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'getContext' @ [37:87] ==> public open fun getContext(): (ScriptContext..ScriptContext?) defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[JavaMethodDescriptor]

'SimpleBindings' @ [39:47] ==> public constructor SimpleBindings() defined in javax.script.SimpleBindings[JavaClassConstructorDescriptor]

'apply' @ [39:64] ==> @InlineOnly public inline fun <T> SimpleBindings.apply(block: SimpleBindings.() -> Unit): SimpleBindings defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleBindings

'put' @ [39:72] ==> public open fun put(key: (String..String?), value: (Any..Any?)): Any? defined in javax.script.SimpleBindings[JavaMethodDescriptor]

'KOTLIN_SCRIPT_ENGINE_BINDINGS_KEY' @ [39:76] ==> public const val KOTLIN_SCRIPT_ENGINE_BINDINGS_KEY: String defined in org.jetbrains.kotlin.cli.common.repl in file KotlinJsr223JvmScriptEngineBase.kt[PropertyDescriptorImpl]

'this' @ [39:111] ==> <this> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.createBindings.<anonymous>[ReceiverParameterDescriptorImpl]

'myFactory' @ [41:54] ==> protected final val myFactory: ScriptEngineFactory defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[PropertyDescriptorImpl]

'getCurrentState' @ [44:62] ==> protected final fun getCurrentState(context: ScriptContext): IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[SimpleFunctionDescriptorImpl]

'context' @ [44:78] ==> value-parameter context: ScriptContext defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.nextCodeLine[ValueParameterDescriptorImpl]

'let' @ [44:87] ==> @InlineOnly public inline fun <T, R> IReplStageState<*>.let(block: (IReplStageState<*>) -> ReplCodeLine): ReplCodeLine defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IReplStageState<*>
    <R> -> ReplCodeLine

'ReplCodeLine' @ [44:93] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[ClassConstructorDescriptorImpl]

'it' @ [44:106] ==> value-parameter it: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.nextCodeLine.<anonymous>[ValueParameterDescriptorImpl]

'getNextLineNo' @ [44:109] ==> public open fun getNextLineNo(): Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[SimpleFunctionDescriptorImpl]

'it' @ [44:126] ==> value-parameter it: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.nextCodeLine.<anonymous>[ValueParameterDescriptorImpl]

'currentGeneration' @ [44:129] ==> public abstract val currentGeneration: Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[PropertyDescriptorImpl]

'code' @ [44:148] ==> value-parameter code: String defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.nextCodeLine[ValueParameterDescriptorImpl]

'ReentrantReadWriteLock' @ [46:71] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'context' @ [49:13] ==> value-parameter context: ScriptContext defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.getCurrentState[ValueParameterDescriptorImpl]

'getBindings' @ [49:21] ==> public abstract fun getBindings(p0: Int): (Bindings..Bindings?) defined in javax.script.ScriptContext[JavaMethodDescriptor]

'ENGINE_SCOPE' @ [49:47] ==> public const final val ENGINE_SCOPE: Int defined in javax.script.ScriptContext[JavaPropertyDescriptor]

'getOrPut' @ [50:22] ==> public inline fun <K, V> MutableMap<(String..String?), (Any..Any?)>.getOrPut(key: (String..String?), defaultValue: () -> (Any..Any?)): (Any..Any?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (kotlin.Any..kotlin.Any?)

'KOTLIN_SCRIPT_STATE_BINDINGS_KEY' @ [50:31] ==> public const val KOTLIN_SCRIPT_STATE_BINDINGS_KEY: String defined in org.jetbrains.kotlin.cli.common.repl in file KotlinJsr223JvmScriptEngineBase.kt[PropertyDescriptorImpl]

'context' @ [52:25] ==> value-parameter context: ScriptContext defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.getCurrentState[ValueParameterDescriptorImpl]

'getBindings' @ [52:33] ==> public abstract fun getBindings(p0: Int): (Bindings..Bindings?) defined in javax.script.ScriptContext[JavaMethodDescriptor]

'ENGINE_SCOPE' @ [52:59] ==> public const final val ENGINE_SCOPE: Int defined in javax.script.ScriptContext[JavaPropertyDescriptor]

'put' @ [52:73] ==> public abstract fun put(key: (String..String?), value: (Any..Any?)): Any? defined in javax.script.Bindings[JavaMethodDescriptor]

'KOTLIN_SCRIPT_ENGINE_BINDINGS_KEY' @ [52:77] ==> public const val KOTLIN_SCRIPT_ENGINE_BINDINGS_KEY: String defined in org.jetbrains.kotlin.cli.common.repl in file KotlinJsr223JvmScriptEngineBase.kt[PropertyDescriptorImpl]

'this@KotlinJsr223JvmScriptEngineBase' @ [52:112] ==> <this> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[LazyClassReceiverParameterDescriptor]

'createState' @ [53:25] ==> protected abstract fun createState(lock: ReentrantReadWriteLock = ...): IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[SimpleFunctionDescriptorImpl]

'nextCodeLine' @ [59:24] ==> public final fun nextCodeLine(context: ScriptContext, code: String): ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[SimpleFunctionDescriptorImpl]

'context' @ [59:37] ==> value-parameter context: ScriptContext defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compileAndEval[ValueParameterDescriptorImpl]

'script' @ [59:46] ==> value-parameter script: String defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compileAndEval[ValueParameterDescriptorImpl]

'getCurrentState' @ [60:21] ==> protected final fun getCurrentState(context: ScriptContext): IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[SimpleFunctionDescriptorImpl]

'context' @ [60:37] ==> value-parameter context: ScriptContext defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compileAndEval[ValueParameterDescriptorImpl]

'replEvaluator' @ [61:22] ==> protected abstract val replEvaluator: ReplFullEvaluator defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[PropertyDescriptorImpl]

'compileAndEval' @ [61:36] ==> public abstract fun compileAndEval(state: IReplStageState<*>, codeLine: ReplCodeLine, scriptArgs: ScriptArgsWithTypes?, invokeWrapper: InvokeWrapper?): ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.ReplFullEvaluator[SimpleFunctionDescriptorImpl]

'state' @ [61:51] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compileAndEval[LocalVariableDescriptor]

'codeLine' @ [61:58] ==> val codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compileAndEval[LocalVariableDescriptor]

'overrideScriptArgs' @ [61:81] ==> public open fun overrideScriptArgs(context: ScriptContext): ScriptArgsWithTypes? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[SimpleFunctionDescriptorImpl]

'context' @ [61:100] ==> value-parameter context: ScriptContext defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compileAndEval[ValueParameterDescriptorImpl]

'when (result) {
            is ReplEvalResult.ValueResult -> result.value
            is ReplEvalResult.UnitResult -> null
            is ReplEvalResult.Error -> throw ScriptException(result.message)
            is ReplEvalResult.Incomplete -> throw ScriptException("error: incomplete code")
            is ReplEvalResult.HistoryMismatch -> throw ScriptException("Repl history mismatch at line: ${result.lineNo}")
        }' @ [62:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?, entry3: Any?, entry4: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'result' @ [62:22] ==> val result: ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compileAndEval[LocalVariableDescriptor]

'result' @ [63:46] ==> val result: ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compileAndEval[LocalVariableDescriptor]

'value' @ [63:53] ==> public final val value: Any? defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.ValueResult[PropertyDescriptorImpl]

'ScriptException' @ [65:46] ==> public constructor ScriptException(p0: (String..String?)) defined in javax.script.ScriptException[JavaClassConstructorDescriptor]

'result' @ [65:62] ==> val result: ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compileAndEval[LocalVariableDescriptor]

'message' @ [65:69] ==> public final val message: String defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.Error[PropertyDescriptorImpl]

'ScriptException' @ [66:51] ==> public constructor ScriptException(p0: (String..String?)) defined in javax.script.ScriptException[JavaClassConstructorDescriptor]

'ScriptException' @ [67:56] ==> public constructor ScriptException(p0: (String..String?)) defined in javax.script.ScriptException[JavaClassConstructorDescriptor]

'result' @ [67:106] ==> val result: ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compileAndEval[LocalVariableDescriptor]

'lineNo' @ [67:113] ==> public final val lineNo: Int defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.HistoryMismatch[PropertyDescriptorImpl]

'nextCodeLine' @ [72:24] ==> public final fun nextCodeLine(context: ScriptContext, code: String): ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[SimpleFunctionDescriptorImpl]

'context' @ [72:37] ==> value-parameter context: ScriptContext defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compile[ValueParameterDescriptorImpl]

'script' @ [72:46] ==> value-parameter script: String defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compile[ValueParameterDescriptorImpl]

'getCurrentState' @ [73:21] ==> protected final fun getCurrentState(context: ScriptContext): IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[SimpleFunctionDescriptorImpl]

'context' @ [73:37] ==> value-parameter context: ScriptContext defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compile[ValueParameterDescriptorImpl]

'replCompiler' @ [75:22] ==> protected abstract val replCompiler: ReplCompiler defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[PropertyDescriptorImpl]

'compile' @ [75:35] ==> public abstract fun compile(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCompileResult defined in org.jetbrains.kotlin.cli.common.repl.ReplCompiler[SimpleFunctionDescriptorImpl]

'state' @ [75:43] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compile[LocalVariableDescriptor]

'codeLine' @ [75:50] ==> val codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compile[LocalVariableDescriptor]

'when (result) {
            is ReplCompileResult.Error -> throw ScriptException("Error${result.locationString()}: ${result.message}")
            is ReplCompileResult.Incomplete -> throw ScriptException("error: incomplete code")
            is ReplCompileResult.CompiledClasses -> result
        }' @ [76:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReplCompileResult.CompiledClasses, entry1: ReplCompileResult.CompiledClasses, entry2: ReplCompileResult.CompiledClasses): ReplCompileResult.CompiledClasses[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CompiledClasses

'result' @ [76:30] ==> val result: ReplCompileResult defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compile[LocalVariableDescriptor]

'ScriptException' @ [77:49] ==> public constructor ScriptException(p0: (String..String?)) defined in javax.script.ScriptException[JavaClassConstructorDescriptor]

'result' @ [77:73] ==> val result: ReplCompileResult defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compile[LocalVariableDescriptor]

'locationString' @ [77:80] ==> private fun ReplCompileResult.Error.locationString(): String defined in org.jetbrains.kotlin.cli.common.repl in file KotlinJsr223JvmScriptEngineBase.kt[SimpleFunctionDescriptorImpl]

'result' @ [77:101] ==> val result: ReplCompileResult defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compile[LocalVariableDescriptor]

'message' @ [77:108] ==> public final val message: String defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.Error[PropertyDescriptorImpl]

'ScriptException' @ [78:54] ==> public constructor ScriptException(p0: (String..String?)) defined in javax.script.ScriptException[JavaClassConstructorDescriptor]

'result' @ [79:53] ==> val result: ReplCompileResult defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compile[LocalVariableDescriptor]

'CompiledKotlinScript' @ [81:16] ==> public constructor CompiledKotlinScript(engine: KotlinJsr223JvmScriptEngineBase, codeLine: ReplCodeLine, compiledData: ReplCompileResult.CompiledClasses) defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.CompiledKotlinScript[ClassConstructorDescriptorImpl]

'this' @ [81:37] ==> <this> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[LazyClassReceiverParameterDescriptor]

'codeLine' @ [81:43] ==> val codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compile[LocalVariableDescriptor]

'compiled' @ [81:53] ==> val compiled: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.compile[LocalVariableDescriptor]

'getCurrentState' @ [85:21] ==> protected final fun getCurrentState(context: ScriptContext): IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[SimpleFunctionDescriptorImpl]

'context' @ [85:37] ==> value-parameter context: ScriptContext defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.eval[ValueParameterDescriptorImpl]

'replEvaluator' @ [87:13] ==> protected abstract val replEvaluator: ReplFullEvaluator defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[PropertyDescriptorImpl]

'eval' @ [87:27] ==> public abstract fun eval(state: IReplStageState<*>, compileResult: ReplCompileResult.CompiledClasses, scriptArgs: ScriptArgsWithTypes?, invokeWrapper: InvokeWrapper?): ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.ReplFullEvaluator[SimpleFunctionDescriptorImpl]

'state' @ [87:32] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.eval[LocalVariableDescriptor]

'compiledScript' @ [87:39] ==> value-parameter compiledScript: KotlinJsr223JvmScriptEngineBase.CompiledKotlinScript defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.eval[ValueParameterDescriptorImpl]

'compiledData' @ [87:54] ==> public final val compiledData: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.CompiledKotlinScript[PropertyDescriptorImpl]

'overrideScriptArgs' @ [87:81] ==> public open fun overrideScriptArgs(context: ScriptContext): ScriptArgsWithTypes? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[SimpleFunctionDescriptorImpl]

'context' @ [87:100] ==> value-parameter context: ScriptContext defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.eval[ValueParameterDescriptorImpl]

'ScriptException' @ [90:19] ==> public constructor ScriptException(p0: (Exception..Exception?)) defined in javax.script.ScriptException[JavaClassConstructorDescriptor]

'e' @ [90:35] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.eval[LocalVariableDescriptor]

'when (result) {
            is ReplEvalResult.ValueResult -> result.value
            is ReplEvalResult.UnitResult -> null
            is ReplEvalResult.Error -> throw ScriptException(result.message)
            is ReplEvalResult.Incomplete -> throw ScriptException("error: incomplete code")
            is ReplEvalResult.HistoryMismatch -> throw ScriptException("Repl history mismatch at line: ${result.lineNo}")
        }' @ [93:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?, entry3: Any?, entry4: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'result' @ [93:22] ==> val result: ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.eval[LocalVariableDescriptor]

'result' @ [94:46] ==> val result: ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.eval[LocalVariableDescriptor]

'value' @ [94:53] ==> public final val value: Any? defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.ValueResult[PropertyDescriptorImpl]

'ScriptException' @ [96:46] ==> public constructor ScriptException(p0: (String..String?)) defined in javax.script.ScriptException[JavaClassConstructorDescriptor]

'result' @ [96:62] ==> val result: ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.eval[LocalVariableDescriptor]

'message' @ [96:69] ==> public final val message: String defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.Error[PropertyDescriptorImpl]

'ScriptException' @ [97:51] ==> public constructor ScriptException(p0: (String..String?)) defined in javax.script.ScriptException[JavaClassConstructorDescriptor]

'ScriptException' @ [98:56] ==> public constructor ScriptException(p0: (String..String?)) defined in javax.script.ScriptException[JavaClassConstructorDescriptor]

'result' @ [98:106] ==> val result: ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.eval[LocalVariableDescriptor]

'lineNo' @ [98:113] ==> public final val lineNo: Int defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.HistoryMismatch[PropertyDescriptorImpl]

'CompiledScript' @ [102:160] ==> public constructor CompiledScript() defined in javax.script.CompiledScript[JavaClassConstructorDescriptor]

'engine' @ [103:59] ==> public final val engine: KotlinJsr223JvmScriptEngineBase defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.CompiledKotlinScript[PropertyDescriptorImpl]

'eval' @ [103:66] ==> public open fun eval(compiledScript: KotlinJsr223JvmScriptEngineBase.CompiledKotlinScript, context: ScriptContext): Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[SimpleFunctionDescriptorImpl]

'this' @ [103:71] ==> <this> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.CompiledKotlinScript[LazyClassReceiverParameterDescriptor]

'context' @ [103:77] ==> value-parameter context: ScriptContext defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.CompiledKotlinScript.eval[ValueParameterDescriptorImpl]

'engine' @ [104:50] ==> public final val engine: KotlinJsr223JvmScriptEngineBase defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase.CompiledKotlinScript[PropertyDescriptorImpl]

'if (location == null) ""
        else " at ${location.line}:${location.column}"' @ [109:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'location' @ [109:13] ==> public final val location: CompilerMessageLocation? defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.Error[PropertyDescriptorImpl]

'location' @ [110:21] ==> public final val location: CompilerMessageLocation? defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.Error[PropertyDescriptorImpl]

'line' @ [110:30] ==> public final val line: Int defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageLocation[PropertyDescriptorImpl]

'location' @ [110:38] ==> public final val location: CompilerMessageLocation? defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.Error[PropertyDescriptorImpl]

'column' @ [110:47] ==> public final val column: Int defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageLocation[PropertyDescriptorImpl]

