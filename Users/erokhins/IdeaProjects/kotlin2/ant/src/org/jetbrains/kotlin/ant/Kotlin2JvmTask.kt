'KotlinCompilerBaseTask' @ [23:24] ==> public constructor KotlinCompilerBaseTask() defined in org.jetbrains.kotlin.ant.KotlinCompilerBaseTask[ClassConstructorDescriptorImpl]

'if (compileClasspath == null) {
            compileClasspath = classpath
        }
        else {
            compileClasspath!!.append(classpath)
        }' @ [34:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'compileClasspath' @ [34:13] ==> private final var compileClasspath: Path? defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'compileClasspath' @ [35:13] ==> private final var compileClasspath: Path? defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'classpath' @ [35:32] ==> value-parameter classpath: Path defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask.setClasspath[ValueParameterDescriptorImpl]

'compileClasspath' @ [38:13] ==> private final var compileClasspath: Path? defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'append' @ [38:32] ==> public open fun append(p0: (Path..Path?)): Unit defined in org.apache.tools.ant.types.Path[JavaMethodDescriptor]

'classpath' @ [38:39] ==> value-parameter classpath: Path defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask.setClasspath[ValueParameterDescriptorImpl]

'compileClasspath' @ [43:13] ==> private final var compileClasspath: Path? defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'compileClasspath' @ [44:13] ==> private final var compileClasspath: Path? defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'Path' @ [44:32] ==> public constructor Path(p0: (Project..Project?)) defined in org.apache.tools.ant.types.Path[JavaClassConstructorDescriptor]

'getProject' @ [44:37] ==> public open fun getProject(): (Project..Project?) defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[JavaMethodDescriptor]

'compileClasspath' @ [46:9] ==> private final var compileClasspath: Path? defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'createPath' @ [46:28] ==> public open fun createPath(): (Path..Path?) defined in org.apache.tools.ant.types.Path[JavaMethodDescriptor]

'refid' @ [46:41] ==> public final var Path.refid: (Reference..Reference?)[MyPropertyDescriptor]

'ref' @ [46:49] ==> value-parameter ref: Reference defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask.setClasspathRef[ValueParameterDescriptorImpl]

'setClasspath' @ [50:9] ==> public final fun setClasspath(classpath: Path): Unit defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[SimpleFunctionDescriptorImpl]

'classpath' @ [50:22] ==> value-parameter classpath: Path defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask.addConfiguredClasspath[ValueParameterDescriptorImpl]

'args' @ [54:9] ==> public final val args: MutableList<String> defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'add' @ [54:14] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'args' @ [55:9] ==> public final val args: MutableList<String> defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'add' @ [55:14] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'output' @ [55:18] ==> public final var output: File? defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'canonicalPath' @ [55:27] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'compileClasspath' @ [57:9] ==> private final var compileClasspath: Path? defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'let' @ [57:27] ==> @InlineOnly public inline fun <T, R> Path.let(block: (Path) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Path
    <R> -> Boolean

'args' @ [58:13] ==> public final val args: MutableList<String> defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'add' @ [58:18] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'args' @ [59:13] ==> public final val args: MutableList<String> defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'add' @ [59:18] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'it' @ [59:22] ==> value-parameter it: Path defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask.fillSpecificArguments.<anonymous>[ValueParameterDescriptorImpl]

'list' @ [59:25] ==> public open fun list(): (Array<(String..String?)>..Array<out (String..String?)>?) defined in org.apache.tools.ant.types.Path[JavaMethodDescriptor]

'joinToString' @ [59:32] ==> public fun <T> Array<out (String..String?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((String..String?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'pathSeparator' @ [59:45] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'moduleName' @ [63:13] ==> public final var moduleName: String? defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'moduleName' @ [64:13] ==> public final var moduleName: String? defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'defaultModuleName' @ [64:26] ==> internal val Task.defaultModuleName: String? defined in org.jetbrains.kotlin.ant in file KotlinAntTaskUtil.kt[PropertyDescriptorImpl]

'moduleName' @ [67:9] ==> public final var moduleName: String? defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'let' @ [67:21] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Boolean

'args' @ [68:13] ==> public final val args: MutableList<String> defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'add' @ [68:18] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'args' @ [69:13] ==> public final val args: MutableList<String> defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'add' @ [69:18] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'moduleName' @ [69:22] ==> public final var moduleName: String? defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'noStdlib' @ [72:13] ==> public final var noStdlib: Boolean defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'args' @ [72:23] ==> public final val args: MutableList<String> defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'add' @ [72:28] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'noReflect' @ [73:13] ==> public final var noReflect: Boolean defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'args' @ [73:24] ==> public final val args: MutableList<String> defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'add' @ [73:29] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'includeRuntime' @ [74:13] ==> public final var includeRuntime: Boolean defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'args' @ [74:29] ==> public final val args: MutableList<String> defined in org.jetbrains.kotlin.ant.Kotlin2JvmTask[PropertyDescriptorImpl]

'add' @ [74:34] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

