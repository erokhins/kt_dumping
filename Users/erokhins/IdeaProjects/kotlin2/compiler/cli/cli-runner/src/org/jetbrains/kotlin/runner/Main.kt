'getProperty' @ [28:27] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'home' @ [29:13] ==> val home: (String..String?) defined in org.jetbrains.kotlin.runner.Main.<init>[LocalVariableDescriptor]

'err' @ [30:20] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [30:24] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'exit' @ [31:20] ==> public open fun exit(p0: Int): Unit defined in java.lang.System[JavaMethodDescriptor]

'KOTLIN_HOME' @ [33:9] ==> private final val KOTLIN_HOME: File defined in org.jetbrains.kotlin.runner.Main[PropertyDescriptorImpl]

'File' @ [33:23] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'home' @ [33:28] ==> val home: (String..String?) defined in org.jetbrains.kotlin.runner.Main.<init>[LocalVariableDescriptor]

'arrayListOf' @ [37:25] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<URL> /* = ArrayList<URL> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> URL

'arrayListOf' @ [40:25] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'i' @ [44:16] ==> var i: Int defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'args' @ [44:20] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.runner.Main.run[ValueParameterDescriptorImpl]

'size' @ [44:25] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'args' @ [45:23] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.runner.Main.run[ValueParameterDescriptorImpl]

'i' @ [45:28] ==> var i: Int defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'collectingArguments' @ [46:17] ==> var collectingArguments: Boolean defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'arguments' @ [47:17] ==> val arguments: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'add' @ [47:27] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'arg' @ [47:31] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'i' @ [48:17] ==> var i: Int defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'++' @ [53:21] ==> public final operator fun inc(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'i' @ [53:23] ==> var i: Int defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'args' @ [53:28] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.runner.Main.run[ValueParameterDescriptorImpl]

'size' @ [53:33] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'RunnerException' @ [54:27] ==> public constructor RunnerException(message: String) defined in org.jetbrains.kotlin.runner.RunnerException[ClassConstructorDescriptorImpl]

'arg' @ [54:66] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'args' @ [56:24] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.runner.Main.run[ValueParameterDescriptorImpl]

'i' @ [56:29] ==> var i: Int defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'if ("-help" == arg || "-h" == arg) {
                printUsageAndExit()
            }
            else if ("-version" == arg) {
                printVersionAndExit()
            }
            else if ("-classpath" == arg || "-cp" == arg) {
                for (path in next().split(File.pathSeparator).filter(String::isNotEmpty)) {
                    classpath.addPath(path)
                }
            }
            else if ("-expression" == arg || "-e" == arg) {
                runner = ExpressionRunner(next())
                collectingArguments = true
            }
            else if ("-no-reflect" == arg) {
                noReflect = true
            }
            else if (arg.startsWith("-")) {
                throw RunnerException("unsupported argument: $arg")
            }
            else if (arg.endsWith(".jar")) {
                runner = JarRunner(arg)
                collectingArguments = true
            }
            else if (arg.endsWith(".kts")) {
                runner = ScriptRunner(arg)
                collectingArguments = true
            }
            else {
                runner = MainClassRunner(arg)
                collectingArguments = true
            }' @ [59:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'==' @ [59:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arg' @ [59:28] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'==' @ [59:35] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arg' @ [59:43] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'printUsageAndExit' @ [60:17] ==> private final fun printUsageAndExit(): Unit defined in org.jetbrains.kotlin.runner.Main[SimpleFunctionDescriptorImpl]

'if ("-version" == arg) {
                printVersionAndExit()
            }
            else if ("-classpath" == arg || "-cp" == arg) {
                for (path in next().split(File.pathSeparator).filter(String::isNotEmpty)) {
                    classpath.addPath(path)
                }
            }
            else if ("-expression" == arg || "-e" == arg) {
                runner = ExpressionRunner(next())
                collectingArguments = true
            }
            else if ("-no-reflect" == arg) {
                noReflect = true
            }
            else if (arg.startsWith("-")) {
                throw RunnerException("unsupported argument: $arg")
            }
            else if (arg.endsWith(".jar")) {
                runner = JarRunner(arg)
                collectingArguments = true
            }
            else if (arg.endsWith(".kts")) {
                runner = ScriptRunner(arg)
                collectingArguments = true
            }
            else {
                runner = MainClassRunner(arg)
                collectingArguments = true
            }' @ [62:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'==' @ [62:22] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arg' @ [62:36] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'printVersionAndExit' @ [63:17] ==> private final fun printVersionAndExit(): Unit defined in org.jetbrains.kotlin.runner.Main[SimpleFunctionDescriptorImpl]

'if ("-classpath" == arg || "-cp" == arg) {
                for (path in next().split(File.pathSeparator).filter(String::isNotEmpty)) {
                    classpath.addPath(path)
                }
            }
            else if ("-expression" == arg || "-e" == arg) {
                runner = ExpressionRunner(next())
                collectingArguments = true
            }
            else if ("-no-reflect" == arg) {
                noReflect = true
            }
            else if (arg.startsWith("-")) {
                throw RunnerException("unsupported argument: $arg")
            }
            else if (arg.endsWith(".jar")) {
                runner = JarRunner(arg)
                collectingArguments = true
            }
            else if (arg.endsWith(".kts")) {
                runner = ScriptRunner(arg)
                collectingArguments = true
            }
            else {
                runner = MainClassRunner(arg)
                collectingArguments = true
            }' @ [65:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'==' @ [65:22] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arg' @ [65:38] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'==' @ [65:45] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arg' @ [65:54] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'next' @ [66:30] ==> local final fun next(): String defined in org.jetbrains.kotlin.runner.Main.run[SimpleFunctionDescriptorImpl]

'split' @ [66:37] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pathSeparator' @ [66:48] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'filter' @ [66:63] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'String' @ [66:70] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'isNotEmpty' @ [66:78] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'classpath' @ [67:21] ==> val classpath: ArrayList<URL> /* = ArrayList<URL> */ defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'addPath' @ [67:31] ==> private final fun MutableList<URL>.addPath(path: String): Unit defined in org.jetbrains.kotlin.runner.Main[SimpleFunctionDescriptorImpl]

'path' @ [67:39] ==> val path: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'if ("-expression" == arg || "-e" == arg) {
                runner = ExpressionRunner(next())
                collectingArguments = true
            }
            else if ("-no-reflect" == arg) {
                noReflect = true
            }
            else if (arg.startsWith("-")) {
                throw RunnerException("unsupported argument: $arg")
            }
            else if (arg.endsWith(".jar")) {
                runner = JarRunner(arg)
                collectingArguments = true
            }
            else if (arg.endsWith(".kts")) {
                runner = ScriptRunner(arg)
                collectingArguments = true
            }
            else {
                runner = MainClassRunner(arg)
                collectingArguments = true
            }' @ [70:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'==' @ [70:22] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arg' @ [70:39] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'==' @ [70:46] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arg' @ [70:54] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'runner' @ [71:17] ==> var runner: Runner? defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'ExpressionRunner' @ [71:26] ==> public constructor ExpressionRunner(code: String) defined in org.jetbrains.kotlin.runner.ExpressionRunner[ClassConstructorDescriptorImpl]

'next' @ [71:43] ==> local final fun next(): String defined in org.jetbrains.kotlin.runner.Main.run[SimpleFunctionDescriptorImpl]

'collectingArguments' @ [72:17] ==> var collectingArguments: Boolean defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'if ("-no-reflect" == arg) {
                noReflect = true
            }
            else if (arg.startsWith("-")) {
                throw RunnerException("unsupported argument: $arg")
            }
            else if (arg.endsWith(".jar")) {
                runner = JarRunner(arg)
                collectingArguments = true
            }
            else if (arg.endsWith(".kts")) {
                runner = ScriptRunner(arg)
                collectingArguments = true
            }
            else {
                runner = MainClassRunner(arg)
                collectingArguments = true
            }' @ [74:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'==' @ [74:22] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arg' @ [74:39] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'noReflect' @ [75:17] ==> var noReflect: Boolean defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'if (arg.startsWith("-")) {
                throw RunnerException("unsupported argument: $arg")
            }
            else if (arg.endsWith(".jar")) {
                runner = JarRunner(arg)
                collectingArguments = true
            }
            else if (arg.endsWith(".kts")) {
                runner = ScriptRunner(arg)
                collectingArguments = true
            }
            else {
                runner = MainClassRunner(arg)
                collectingArguments = true
            }' @ [77:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'arg' @ [77:22] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'startsWith' @ [77:26] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'RunnerException' @ [78:23] ==> public constructor RunnerException(message: String) defined in org.jetbrains.kotlin.runner.RunnerException[ClassConstructorDescriptorImpl]

'arg' @ [78:63] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'if (arg.endsWith(".jar")) {
                runner = JarRunner(arg)
                collectingArguments = true
            }
            else if (arg.endsWith(".kts")) {
                runner = ScriptRunner(arg)
                collectingArguments = true
            }
            else {
                runner = MainClassRunner(arg)
                collectingArguments = true
            }' @ [80:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'arg' @ [80:22] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'endsWith' @ [80:26] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'runner' @ [81:17] ==> var runner: Runner? defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'JarRunner' @ [81:26] ==> public constructor JarRunner(path: String) defined in org.jetbrains.kotlin.runner.JarRunner[ClassConstructorDescriptorImpl]

'arg' @ [81:36] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'collectingArguments' @ [82:17] ==> var collectingArguments: Boolean defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'if (arg.endsWith(".kts")) {
                runner = ScriptRunner(arg)
                collectingArguments = true
            }
            else {
                runner = MainClassRunner(arg)
                collectingArguments = true
            }' @ [84:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'arg' @ [84:22] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'endsWith' @ [84:26] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'runner' @ [85:17] ==> var runner: Runner? defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'ScriptRunner' @ [85:26] ==> public constructor ScriptRunner(path: String) defined in org.jetbrains.kotlin.runner.ScriptRunner[ClassConstructorDescriptorImpl]

'arg' @ [85:39] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'collectingArguments' @ [86:17] ==> var collectingArguments: Boolean defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'runner' @ [89:17] ==> var runner: Runner? defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'MainClassRunner' @ [89:26] ==> public constructor MainClassRunner(className: String) defined in org.jetbrains.kotlin.runner.MainClassRunner[ClassConstructorDescriptorImpl]

'arg' @ [89:42] ==> val arg: String defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'collectingArguments' @ [90:17] ==> var collectingArguments: Boolean defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'i' @ [92:13] ==> var i: Int defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'classpath' @ [95:13] ==> val classpath: ArrayList<URL> /* = ArrayList<URL> */ defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'isEmpty' @ [95:23] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'classpath' @ [96:13] ==> val classpath: ArrayList<URL> /* = ArrayList<URL> */ defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'addPath' @ [96:23] ==> private final fun MutableList<URL>.addPath(path: String): Unit defined in org.jetbrains.kotlin.runner.Main[SimpleFunctionDescriptorImpl]

'classpath' @ [99:9] ==> val classpath: ArrayList<URL> /* = ArrayList<URL> */ defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'addPath' @ [99:19] ==> private final fun MutableList<URL>.addPath(path: String): Unit defined in org.jetbrains.kotlin.runner.Main[SimpleFunctionDescriptorImpl]

'KOTLIN_HOME' @ [99:27] ==> private final val KOTLIN_HOME: File defined in org.jetbrains.kotlin.runner.Main[PropertyDescriptorImpl]

'toString' @ [99:39] ==> public open fun toString(): String defined in java.io.File[JavaMethodDescriptor]

'!' @ [101:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'noReflect' @ [101:14] ==> var noReflect: Boolean defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'classpath' @ [102:13] ==> val classpath: ArrayList<URL> /* = ArrayList<URL> */ defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'addPath' @ [102:23] ==> private final fun MutableList<URL>.addPath(path: String): Unit defined in org.jetbrains.kotlin.runner.Main[SimpleFunctionDescriptorImpl]

'KOTLIN_HOME' @ [102:31] ==> private final val KOTLIN_HOME: File defined in org.jetbrains.kotlin.runner.Main[PropertyDescriptorImpl]

'toString' @ [102:43] ==> public open fun toString(): String defined in java.io.File[JavaMethodDescriptor]

'runner' @ [105:13] ==> var runner: Runner? defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'runner' @ [106:13] ==> var runner: Runner? defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'ReplRunner' @ [106:22] ==> public constructor ReplRunner() defined in org.jetbrains.kotlin.runner.ReplRunner[ClassConstructorDescriptorImpl]

'runner' @ [109:9] ==> var runner: Runner? defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'run' @ [109:16] ==> public abstract fun run(classpath: List<URL>, arguments: List<String>): Unit defined in org.jetbrains.kotlin.runner.Runner[SimpleFunctionDescriptorImpl]

'classpath' @ [109:20] ==> val classpath: ArrayList<URL> /* = ArrayList<URL> */ defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'arguments' @ [109:31] ==> val arguments: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.runner.Main.run[LocalVariableDescriptor]

'add' @ [113:9] ==> public abstract fun add(element: URL): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'File' @ [113:13] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [113:18] ==> value-parameter path: String defined in org.jetbrains.kotlin.runner.Main.addPath[ValueParameterDescriptorImpl]

'absoluteFile' @ [113:24] ==> public final val File.absoluteFile: (File..File?)[MyPropertyDescriptor]

'toURI' @ [113:37] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [113:45] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'JvmStatic' @ [116:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'run' @ [119:13] ==> private final fun run(args: Array<String>): Unit defined in org.jetbrains.kotlin.runner.Main[SimpleFunctionDescriptorImpl]

'args' @ [119:17] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.runner.Main.main[ValueParameterDescriptorImpl]

'err' @ [122:20] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [122:24] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'+' @ [122:32] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'e' @ [122:44] ==> val e: RunnerException defined in org.jetbrains.kotlin.runner.Main.main[LocalVariableDescriptor]

'message' @ [122:46] ==> public open val message: String? defined in org.jetbrains.kotlin.runner.RunnerException[DeserializedPropertyDescriptor]

'exit' @ [123:20] ==> public open fun exit(p0: Int): Unit defined in java.lang.System[JavaMethodDescriptor]

'println' @ [128:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [128:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'exit' @ [146:16] ==> public open fun exit(p0: Int): Unit defined in java.lang.System[JavaMethodDescriptor]

'Scanner' @ [151:13] ==> public constructor Scanner(p0: (File..File?)) defined in java.util.Scanner[JavaClassConstructorDescriptor]

'File' @ [151:21] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'KOTLIN_HOME' @ [151:26] ==> private final val KOTLIN_HOME: File defined in org.jetbrains.kotlin.runner.Main[PropertyDescriptorImpl]

'nextLine' @ [151:53] ==> public open fun nextLine(): (String..String?) defined in java.util.Scanner[JavaMethodDescriptor]

'RunnerException' @ [154:19] ==> public constructor RunnerException(message: String) defined in org.jetbrains.kotlin.runner.RunnerException[ClassConstructorDescriptorImpl]

'KOTLIN_HOME' @ [154:68] ==> private final val KOTLIN_HOME: File defined in org.jetbrains.kotlin.runner.Main[PropertyDescriptorImpl]

'println' @ [157:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [157:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'version' @ [157:37] ==> val version: (String..String?) defined in org.jetbrains.kotlin.runner.Main.printVersionAndExit[LocalVariableDescriptor]

'getProperty' @ [157:65] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'exit' @ [158:16] ==> public open fun exit(p0: Int): Unit defined in java.lang.System[JavaMethodDescriptor]

