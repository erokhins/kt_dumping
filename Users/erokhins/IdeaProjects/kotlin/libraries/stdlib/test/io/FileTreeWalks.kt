'kotlin.jvm.JvmVersion' @ [1:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[DeserializedClassConstructorDescriptor]

'listOf' @ [14:17] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'createTempDir' @ [16:27] ==> public fun createTempDir(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'referenceFilenames' @ [17:26] ==> public final val referenceFilenames: List<String> defined in test.io.FileTreeWalkTest.Companion[PropertyDescriptorImpl]

'basedir' @ [18:28] ==> val basedir: File defined in test.io.FileTreeWalkTest.Companion.createTestFiles[LocalVariableDescriptor]

'resolve' @ [18:36] ==> public fun File.resolve(relative: String): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'name' @ [18:44] ==> val name: String defined in test.io.FileTreeWalkTest.Companion.createTestFiles[LocalVariableDescriptor]

'if (file.extension.isEmpty())
                    file.mkdir()
                else
                    file.createNewFile()' @ [19:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'file' @ [19:21] ==> val file: File defined in test.io.FileTreeWalkTest.Companion.createTestFiles[LocalVariableDescriptor]

'extension' @ [19:26] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'isEmpty' @ [19:36] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'file' @ [20:21] ==> val file: File defined in test.io.FileTreeWalkTest.Companion.createTestFiles[LocalVariableDescriptor]

'mkdir' @ [20:26] ==> public open fun mkdir(): Boolean defined in java.io.File[JavaMethodDescriptor]

'file' @ [22:21] ==> val file: File defined in test.io.FileTreeWalkTest.Companion.createTestFiles[LocalVariableDescriptor]

'createNewFile' @ [22:26] ==> public open fun createNewFile(): Boolean defined in java.io.File[JavaMethodDescriptor]

'basedir' @ [24:20] ==> val basedir: File defined in test.io.FileTreeWalkTest.Companion.createTestFiles[LocalVariableDescriptor]

'Test' @ [28:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTestFiles' @ [29:23] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'setOf' @ [31:34] ==> public fun <T> setOf(element: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'referenceFilenames' @ [31:46] ==> public final val referenceFilenames: List<String> defined in test.io.FileTreeWalkTest.Companion[PropertyDescriptorImpl]

'HashSet' @ [32:32] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'basedir' @ [33:26] ==> val basedir: File defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'walkTopDown' @ [33:34] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'file' @ [34:28] ==> val file: File defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'relativeToOrSelf' @ [34:33] ==> public fun File.relativeToOrSelf(base: File): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'basedir' @ [34:50] ==> val basedir: File defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'invariantSeparatorsPath' @ [34:59] ==> public val File.invariantSeparatorsPath: String defined in kotlin.io[DeserializedPropertyDescriptor]

'assertFalse' @ [35:17] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'namesTopDown' @ [35:29] ==> val namesTopDown: HashSet<String> defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'contains' @ [35:42] ==> public open fun contains(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [35:51] ==> val name: String defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'name' @ [35:60] ==> val name: String defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'namesTopDown' @ [36:17] ==> val namesTopDown: HashSet<String> defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'add' @ [36:30] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [36:34] ==> val name: String defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'assertEquals' @ [38:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<String>, actual: Set<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<String>

'referenceNames' @ [38:26] ==> val referenceNames: Set<String> defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'namesTopDown' @ [38:42] ==> val namesTopDown: HashSet<String> defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'HashSet' @ [39:33] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'basedir' @ [40:26] ==> val basedir: File defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'walkBottomUp' @ [40:34] ==> public fun File.walkBottomUp(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'file' @ [41:28] ==> val file: File defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'relativeToOrSelf' @ [41:33] ==> public fun File.relativeToOrSelf(base: File): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'basedir' @ [41:50] ==> val basedir: File defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'invariantSeparatorsPath' @ [41:59] ==> public val File.invariantSeparatorsPath: String defined in kotlin.io[DeserializedPropertyDescriptor]

'assertFalse' @ [42:17] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'namesBottomUp' @ [42:29] ==> val namesBottomUp: HashSet<String> defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'contains' @ [42:43] ==> public open fun contains(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [42:52] ==> val name: String defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'name' @ [42:61] ==> val name: String defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'namesBottomUp' @ [43:17] ==> val namesBottomUp: HashSet<String> defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'add' @ [43:31] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [43:35] ==> val name: String defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'assertEquals' @ [45:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<String>, actual: Set<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<String>

'referenceNames' @ [45:26] ==> val referenceNames: Set<String> defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'namesBottomUp' @ [45:42] ==> val namesBottomUp: HashSet<String> defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'basedir' @ [47:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.withSimple[LocalVariableDescriptor]

'deleteRecursively' @ [47:21] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [51:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTempFile' @ [52:24] ==> public fun createTempFile(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'testFile' @ [53:31] ==> val testFile: File defined in test.io.FileTreeWalkTest.singleFile[LocalVariableDescriptor]

'resolve' @ [53:40] ==> public fun File.resolve(relative: String): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'listOf' @ [55:26] ==> public fun <T> listOf(vararg elements: KFunction1<File, FileTreeWalk>): List<KFunction1<File, FileTreeWalk>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction1<File, FileTreeWalk>

'assertEquals' @ [56:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: File, actual: File, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> File

'testFile' @ [56:30] ==> val testFile: File defined in test.io.FileTreeWalkTest.singleFile[LocalVariableDescriptor]

'invoke' @ [56:40] ==> public abstract fun invoke(p1: File): FileTreeWalk defined in kotlin.reflect.KFunction1[FunctionInvokeDescriptor]

'testFile' @ [56:45] ==> val testFile: File defined in test.io.FileTreeWalkTest.singleFile[LocalVariableDescriptor]

'single' @ [56:55] ==> public fun <T> Sequence<File>.single(): File defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'walk' @ [56:68] ==> val walk: KFunction1<File, FileTreeWalk> defined in test.io.FileTreeWalkTest.singleFile[LocalVariableDescriptor]

'name' @ [56:73] ==> public abstract val name: String defined in kotlin.reflect.KFunction1[DeserializedPropertyDescriptor]

'assertEquals' @ [57:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: File, actual: File, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> File

'testFile' @ [57:30] ==> val testFile: File defined in test.io.FileTreeWalkTest.singleFile[LocalVariableDescriptor]

'testFile' @ [57:40] ==> val testFile: File defined in test.io.FileTreeWalkTest.singleFile[LocalVariableDescriptor]

'walk' @ [57:49] ==> public fun File.walk(direction: FileWalkDirection = ...): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'onEnter' @ [57:56] ==> public final fun onEnter(function: (File) -> Boolean): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'single' @ [57:74] ==> public fun <T> Sequence<File>.single(): File defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'walk' @ [57:87] ==> val walk: KFunction1<File, FileTreeWalk> defined in test.io.FileTreeWalkTest.singleFile[LocalVariableDescriptor]

'name' @ [57:92] ==> public abstract val name: String defined in kotlin.reflect.KFunction1[DeserializedPropertyDescriptor]

'assertTrue' @ [59:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'invoke' @ [59:28] ==> public abstract fun invoke(p1: File): FileTreeWalk defined in kotlin.reflect.KFunction1[FunctionInvokeDescriptor]

'nonExistantFile' @ [59:33] ==> val nonExistantFile: File defined in test.io.FileTreeWalkTest.singleFile[LocalVariableDescriptor]

'none' @ [59:50] ==> public fun <T> Sequence<File>.none(): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'walk' @ [59:61] ==> val walk: KFunction1<File, FileTreeWalk> defined in test.io.FileTreeWalkTest.singleFile[LocalVariableDescriptor]

'name' @ [59:66] ==> public abstract val name: String defined in kotlin.reflect.KFunction1[DeserializedPropertyDescriptor]

'testFile' @ [63:13] ==> val testFile: File defined in test.io.FileTreeWalkTest.singleFile[LocalVariableDescriptor]

'delete' @ [63:22] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'Test' @ [67:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTestFiles' @ [68:23] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'setOf' @ [71:21] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'HashSet' @ [72:37] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'HashSet' @ [73:37] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'HashSet' @ [74:32] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'file' @ [76:28] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withEnterLeave.enter[ValueParameterDescriptorImpl]

'relativeToOrSelf' @ [76:33] ==> public fun File.relativeToOrSelf(base: File): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'basedir' @ [76:50] ==> val basedir: File defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'invariantSeparatorsPath' @ [76:59] ==> public val File.invariantSeparatorsPath: String defined in kotlin.io[DeserializedPropertyDescriptor]

'assertTrue' @ [77:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'file' @ [77:28] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withEnterLeave.enter[ValueParameterDescriptorImpl]

'isDirectory' @ [77:33] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'name' @ [77:48] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.enter[LocalVariableDescriptor]

'assertFalse' @ [78:17] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'namesTopDownEnter' @ [78:29] ==> val namesTopDownEnter: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'contains' @ [78:47] ==> public open fun contains(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [78:56] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.enter[LocalVariableDescriptor]

'name' @ [78:65] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.enter[LocalVariableDescriptor]

'assertFalse' @ [79:17] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'namesTopDownLeave' @ [79:29] ==> val namesTopDownLeave: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'contains' @ [79:47] ==> public open fun contains(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [79:56] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.enter[LocalVariableDescriptor]

'name' @ [79:65] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.enter[LocalVariableDescriptor]

'file' @ [80:21] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withEnterLeave.enter[ValueParameterDescriptorImpl]

'name' @ [80:26] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'namesTopDownEnter' @ [81:17] ==> val namesTopDownEnter: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'add' @ [81:35] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [81:39] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.enter[LocalVariableDescriptor]

'file' @ [86:28] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withEnterLeave.leave[ValueParameterDescriptorImpl]

'relativeToOrSelf' @ [86:33] ==> public fun File.relativeToOrSelf(base: File): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'basedir' @ [86:50] ==> val basedir: File defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'invariantSeparatorsPath' @ [86:59] ==> public val File.invariantSeparatorsPath: String defined in kotlin.io[DeserializedPropertyDescriptor]

'assertTrue' @ [87:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'file' @ [87:28] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withEnterLeave.leave[ValueParameterDescriptorImpl]

'isDirectory' @ [87:33] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'name' @ [87:48] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.leave[LocalVariableDescriptor]

'assertFalse' @ [88:17] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'namesTopDownLeave' @ [88:29] ==> val namesTopDownLeave: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'contains' @ [88:47] ==> public open fun contains(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [88:56] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.leave[LocalVariableDescriptor]

'name' @ [88:65] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.leave[LocalVariableDescriptor]

'namesTopDownLeave' @ [89:17] ==> val namesTopDownLeave: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'add' @ [89:35] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [89:39] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.leave[LocalVariableDescriptor]

'assertTrue' @ [90:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'namesTopDownEnter' @ [90:28] ==> val namesTopDownEnter: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'contains' @ [90:46] ==> public open fun contains(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [90:55] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.leave[LocalVariableDescriptor]

'name' @ [90:64] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.leave[LocalVariableDescriptor]

'file' @ [94:28] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withEnterLeave.visit[ValueParameterDescriptorImpl]

'relativeToOrSelf' @ [94:33] ==> public fun File.relativeToOrSelf(base: File): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'basedir' @ [94:50] ==> val basedir: File defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'invariantSeparatorsPath' @ [94:59] ==> public val File.invariantSeparatorsPath: String defined in kotlin.io[DeserializedPropertyDescriptor]

'file' @ [95:21] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withEnterLeave.visit[ValueParameterDescriptorImpl]

'isDirectory' @ [95:26] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'assertTrue' @ [96:21] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'namesTopDownEnter' @ [96:32] ==> val namesTopDownEnter: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'contains' @ [96:50] ==> public open fun contains(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [96:59] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.visit[LocalVariableDescriptor]

'name' @ [96:68] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.visit[LocalVariableDescriptor]

'namesTopDown' @ [97:21] ==> val namesTopDown: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'add' @ [97:34] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [97:38] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.visit[LocalVariableDescriptor]

'assertFalse' @ [98:21] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'namesTopDownLeave' @ [98:33] ==> val namesTopDownLeave: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'contains' @ [98:51] ==> public open fun contains(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [98:60] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.visit[LocalVariableDescriptor]

'name' @ [98:69] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.visit[LocalVariableDescriptor]

'file' @ [100:21] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withEnterLeave.visit[ValueParameterDescriptorImpl]

'basedir' @ [100:29] ==> val basedir: File defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'file' @ [102:30] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withEnterLeave.visit[ValueParameterDescriptorImpl]

'parentFile' @ [102:35] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'parent' @ [103:21] ==> val parent: (File..File?) defined in test.io.FileTreeWalkTest.withEnterLeave.visit[LocalVariableDescriptor]

'parent' @ [104:38] ==> val parent: (File..File?) defined in test.io.FileTreeWalkTest.withEnterLeave.visit[LocalVariableDescriptor]

'relativeToOrSelf' @ [104:45] ==> public fun File.relativeToOrSelf(base: File): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'basedir' @ [104:62] ==> val basedir: File defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'invariantSeparatorsPath' @ [104:71] ==> public val File.invariantSeparatorsPath: String defined in kotlin.io[DeserializedPropertyDescriptor]

'assertTrue' @ [105:21] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'namesTopDownEnter' @ [105:32] ==> val namesTopDownEnter: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'contains' @ [105:50] ==> public open fun contains(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'parentName' @ [105:59] ==> val parentName: String defined in test.io.FileTreeWalkTest.withEnterLeave.visit[LocalVariableDescriptor]

'name' @ [106:31] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.visit[LocalVariableDescriptor]

'parentName' @ [106:75] ==> val parentName: String defined in test.io.FileTreeWalkTest.withEnterLeave.visit[LocalVariableDescriptor]

'assertFalse' @ [107:21] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'namesTopDownLeave' @ [107:33] ==> val namesTopDownLeave: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'contains' @ [107:51] ==> public open fun contains(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'parentName' @ [107:60] ==> val parentName: String defined in test.io.FileTreeWalkTest.withEnterLeave.visit[LocalVariableDescriptor]

'name' @ [108:31] ==> val name: String defined in test.io.FileTreeWalkTest.withEnterLeave.visit[LocalVariableDescriptor]

'parentName' @ [108:73] ==> val parentName: String defined in test.io.FileTreeWalkTest.withEnterLeave.visit[LocalVariableDescriptor]

'basedir' @ [111:26] ==> val basedir: File defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'walkTopDown' @ [111:34] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'onEnter' @ [111:48] ==> public final fun onEnter(function: (File) -> Boolean): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'onLeave' @ [111:65] ==> public final fun onLeave(function: (File) -> Unit): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'visit' @ [112:17] ==> local final fun visit(file: File): Unit defined in test.io.FileTreeWalkTest.withEnterLeave[SimpleFunctionDescriptorImpl]

'file' @ [112:23] ==> val file: File defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'assertEquals' @ [114:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<String>, actual: Set<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<String>

'referenceNames' @ [114:26] ==> val referenceNames: Set<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'namesTopDownEnter' @ [114:42] ==> val namesTopDownEnter: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'assertEquals' @ [115:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<String>, actual: Set<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<String>

'referenceNames' @ [115:26] ==> val referenceNames: Set<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'namesTopDownLeave' @ [115:42] ==> val namesTopDownLeave: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'namesTopDownEnter' @ [116:13] ==> val namesTopDownEnter: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'clear' @ [116:31] ==> public open fun clear(): Unit defined in java.util.HashSet[JavaMethodDescriptor]

'namesTopDownLeave' @ [117:13] ==> val namesTopDownLeave: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'clear' @ [117:31] ==> public open fun clear(): Unit defined in java.util.HashSet[JavaMethodDescriptor]

'namesTopDown' @ [118:13] ==> val namesTopDown: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'clear' @ [118:26] ==> public open fun clear(): Unit defined in java.util.HashSet[JavaMethodDescriptor]

'basedir' @ [119:26] ==> val basedir: File defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'walkBottomUp' @ [119:34] ==> public fun File.walkBottomUp(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'onEnter' @ [119:49] ==> public final fun onEnter(function: (File) -> Boolean): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'onLeave' @ [119:66] ==> public final fun onLeave(function: (File) -> Unit): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'visit' @ [120:17] ==> local final fun visit(file: File): Unit defined in test.io.FileTreeWalkTest.withEnterLeave[SimpleFunctionDescriptorImpl]

'file' @ [120:23] ==> val file: File defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'assertEquals' @ [122:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<String>, actual: Set<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<String>

'referenceNames' @ [122:26] ==> val referenceNames: Set<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'namesTopDownEnter' @ [122:42] ==> val namesTopDownEnter: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'assertEquals' @ [123:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<String>, actual: Set<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<String>

'referenceNames' @ [123:26] ==> val referenceNames: Set<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'namesTopDownLeave' @ [123:42] ==> val namesTopDownLeave: HashSet<String> defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'basedir' @ [125:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.withEnterLeave[LocalVariableDescriptor]

'deleteRecursively' @ [125:21] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [129:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTestFiles' @ [130:23] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'setOf' @ [132:34] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [133:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<String>, actual: Set<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<String>

'referenceNames' @ [133:26] ==> val referenceNames: Set<String> defined in test.io.FileTreeWalkTest.withFilterAndMap[LocalVariableDescriptor]

'basedir' @ [133:42] ==> val basedir: File defined in test.io.FileTreeWalkTest.withFilterAndMap[LocalVariableDescriptor]

'walkTopDown' @ [133:50] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'filter' @ [133:64] ==> public fun <T> Sequence<File>.filter(predicate: (File) -> Boolean): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [133:73] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.withFilterAndMap.<anonymous>[ValueParameterDescriptorImpl]

'isDirectory' @ [133:76] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'map' @ [133:90] ==> public fun <T, R> Sequence<File>.map(transform: (File) -> String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> String

'it' @ [134:17] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.withFilterAndMap.<anonymous>[ValueParameterDescriptorImpl]

'relativeToOrSelf' @ [134:20] ==> public fun File.relativeToOrSelf(base: File): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'basedir' @ [134:37] ==> val basedir: File defined in test.io.FileTreeWalkTest.withFilterAndMap[LocalVariableDescriptor]

'invariantSeparatorsPath' @ [134:46] ==> public val File.invariantSeparatorsPath: String defined in kotlin.io[DeserializedPropertyDescriptor]

'toHashSet' @ [135:15] ==> public fun <T> Sequence<String>.toHashSet(): HashSet<String> /* = HashSet<String> */ defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'basedir' @ [137:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.withFilterAndMap[LocalVariableDescriptor]

'deleteRecursively' @ [137:21] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [142:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTestFiles' @ [143:23] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'setOf' @ [145:34] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'HashSet' @ [146:32] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'assertTrue' @ [148:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'file' @ [148:28] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown.enter[ValueParameterDescriptorImpl]

'isDirectory' @ [148:33] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'file' @ [149:31] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown.enter[ValueParameterDescriptorImpl]

'listFiles' @ [149:36] ==> public open fun listFiles(): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[JavaMethodDescriptor]

'child' @ [150:25] ==> val child: (File..File?) defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown.enter[LocalVariableDescriptor]

'name' @ [150:31] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [150:36] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'child' @ [151:25] ==> val child: (File..File?) defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown.enter[LocalVariableDescriptor]

'delete' @ [151:31] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'basedir' @ [154:26] ==> val basedir: File defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown[LocalVariableDescriptor]

'walkTopDown' @ [154:34] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'onEnter' @ [154:48] ==> public final fun onEnter(function: (File) -> Boolean): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'enter' @ [154:58] ==> local final fun enter(file: File): Unit defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown[SimpleFunctionDescriptorImpl]

'it' @ [154:64] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [155:28] ==> val file: File defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown[LocalVariableDescriptor]

'relativeToOrSelf' @ [155:33] ==> public fun File.relativeToOrSelf(base: File): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'basedir' @ [155:50] ==> val basedir: File defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown[LocalVariableDescriptor]

'invariantSeparatorsPath' @ [155:59] ==> public val File.invariantSeparatorsPath: String defined in kotlin.io[DeserializedPropertyDescriptor]

'assertFalse' @ [156:17] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'namesTopDown' @ [156:29] ==> val namesTopDown: HashSet<String> defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown[LocalVariableDescriptor]

'contains' @ [156:42] ==> public open fun contains(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [156:51] ==> val name: String defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown[LocalVariableDescriptor]

'name' @ [156:60] ==> val name: String defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown[LocalVariableDescriptor]

'namesTopDown' @ [157:17] ==> val namesTopDown: HashSet<String> defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown[LocalVariableDescriptor]

'add' @ [157:30] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [157:34] ==> val name: String defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown[LocalVariableDescriptor]

'assertEquals' @ [159:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<String>, actual: Set<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<String>

'referenceNames' @ [159:26] ==> val referenceNames: Set<String> defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown[LocalVariableDescriptor]

'namesTopDown' @ [159:42] ==> val namesTopDown: HashSet<String> defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown[LocalVariableDescriptor]

'basedir' @ [161:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.withDeleteTxtTopDown[LocalVariableDescriptor]

'deleteRecursively' @ [161:21] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [165:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTestFiles' @ [166:23] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'setOf' @ [168:34] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'HashSet' @ [169:32] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'assertTrue' @ [171:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'file' @ [171:28] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp.enter[ValueParameterDescriptorImpl]

'isDirectory' @ [171:33] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'file' @ [172:31] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp.enter[ValueParameterDescriptorImpl]

'listFiles' @ [172:36] ==> public open fun listFiles(): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[JavaMethodDescriptor]

'child' @ [173:25] ==> val child: (File..File?) defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp.enter[LocalVariableDescriptor]

'name' @ [173:31] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [173:36] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'child' @ [174:25] ==> val child: (File..File?) defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp.enter[LocalVariableDescriptor]

'delete' @ [174:31] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'basedir' @ [177:26] ==> val basedir: File defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp[LocalVariableDescriptor]

'walkBottomUp' @ [177:34] ==> public fun File.walkBottomUp(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'onEnter' @ [177:49] ==> public final fun onEnter(function: (File) -> Boolean): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'enter' @ [177:59] ==> local final fun enter(file: File): Unit defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp[SimpleFunctionDescriptorImpl]

'it' @ [177:65] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [178:28] ==> val file: File defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp[LocalVariableDescriptor]

'relativeToOrSelf' @ [178:33] ==> public fun File.relativeToOrSelf(base: File): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'basedir' @ [178:50] ==> val basedir: File defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp[LocalVariableDescriptor]

'invariantSeparatorsPath' @ [178:59] ==> public val File.invariantSeparatorsPath: String defined in kotlin.io[DeserializedPropertyDescriptor]

'assertFalse' @ [179:17] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'namesTopDown' @ [179:29] ==> val namesTopDown: HashSet<String> defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp[LocalVariableDescriptor]

'contains' @ [179:42] ==> public open fun contains(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [179:51] ==> val name: String defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp[LocalVariableDescriptor]

'name' @ [179:60] ==> val name: String defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp[LocalVariableDescriptor]

'namesTopDown' @ [180:17] ==> val namesTopDown: HashSet<String> defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp[LocalVariableDescriptor]

'add' @ [180:30] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [180:34] ==> val name: String defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp[LocalVariableDescriptor]

'assertEquals' @ [182:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<String>, actual: Set<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<String>

'referenceNames' @ [182:26] ==> val referenceNames: Set<String> defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp[LocalVariableDescriptor]

'namesTopDown' @ [182:42] ==> val namesTopDown: HashSet<String> defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp[LocalVariableDescriptor]

'basedir' @ [184:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.withDeleteTxtBottomUp[LocalVariableDescriptor]

'deleteRecursively' @ [184:21] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'HashSet' @ [189:28] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'basedir' @ [190:22] ==> value-parameter basedir: File defined in test.io.FileTreeWalkTest.compareWalkResults[ValueParameterDescriptorImpl]

'walkTopDown' @ [190:30] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'onEnter' @ [190:44] ==> public final fun onEnter(function: (File) -> Boolean): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'invoke' @ [190:54] ==> public abstract operator fun invoke(p1: File): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [190:61] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.compareWalkResults.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [191:24] ==> val file: File defined in test.io.FileTreeWalkTest.compareWalkResults[LocalVariableDescriptor]

'toRelativeString' @ [191:29] ==> public fun File.toRelativeString(base: File): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'basedir' @ [191:46] ==> value-parameter basedir: File defined in test.io.FileTreeWalkTest.compareWalkResults[ValueParameterDescriptorImpl]

'assertFalse' @ [192:13] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'namesTopDown' @ [192:25] ==> val namesTopDown: HashSet<String> defined in test.io.FileTreeWalkTest.compareWalkResults[LocalVariableDescriptor]

'contains' @ [192:38] ==> public open fun contains(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [192:47] ==> val name: String defined in test.io.FileTreeWalkTest.compareWalkResults[LocalVariableDescriptor]

'name' @ [192:56] ==> val name: String defined in test.io.FileTreeWalkTest.compareWalkResults[LocalVariableDescriptor]

'namesTopDown' @ [193:13] ==> val namesTopDown: HashSet<String> defined in test.io.FileTreeWalkTest.compareWalkResults[LocalVariableDescriptor]

'add' @ [193:26] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [193:30] ==> val name: String defined in test.io.FileTreeWalkTest.compareWalkResults[LocalVariableDescriptor]

'assertEquals' @ [195:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<String>, actual: Set<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<String>

'expected' @ [195:22] ==> value-parameter expected: Set<String> defined in test.io.FileTreeWalkTest.compareWalkResults[ValueParameterDescriptorImpl]

'namesTopDown' @ [195:32] ==> val namesTopDown: HashSet<String> defined in test.io.FileTreeWalkTest.compareWalkResults[LocalVariableDescriptor]

'HashSet' @ [196:29] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'basedir' @ [197:22] ==> value-parameter basedir: File defined in test.io.FileTreeWalkTest.compareWalkResults[ValueParameterDescriptorImpl]

'walkBottomUp' @ [197:30] ==> public fun File.walkBottomUp(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'onEnter' @ [197:45] ==> public final fun onEnter(function: (File) -> Boolean): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'invoke' @ [197:55] ==> public abstract operator fun invoke(p1: File): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [197:62] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.compareWalkResults.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [198:24] ==> val file: File defined in test.io.FileTreeWalkTest.compareWalkResults[LocalVariableDescriptor]

'toRelativeString' @ [198:29] ==> public fun File.toRelativeString(base: File): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'basedir' @ [198:46] ==> value-parameter basedir: File defined in test.io.FileTreeWalkTest.compareWalkResults[ValueParameterDescriptorImpl]

'assertFalse' @ [199:13] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'namesBottomUp' @ [199:25] ==> val namesBottomUp: HashSet<String> defined in test.io.FileTreeWalkTest.compareWalkResults[LocalVariableDescriptor]

'contains' @ [199:39] ==> public open fun contains(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [199:48] ==> val name: String defined in test.io.FileTreeWalkTest.compareWalkResults[LocalVariableDescriptor]

'name' @ [199:57] ==> val name: String defined in test.io.FileTreeWalkTest.compareWalkResults[LocalVariableDescriptor]

'namesBottomUp' @ [200:13] ==> val namesBottomUp: HashSet<String> defined in test.io.FileTreeWalkTest.compareWalkResults[LocalVariableDescriptor]

'add' @ [200:27] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [200:31] ==> val name: String defined in test.io.FileTreeWalkTest.compareWalkResults[LocalVariableDescriptor]

'assertEquals' @ [202:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<String>, actual: Set<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<String>

'expected' @ [202:22] ==> value-parameter expected: Set<String> defined in test.io.FileTreeWalkTest.compareWalkResults[ValueParameterDescriptorImpl]

'namesBottomUp' @ [202:32] ==> val namesBottomUp: HashSet<String> defined in test.io.FileTreeWalkTest.compareWalkResults[LocalVariableDescriptor]

'Test' @ [205:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTestFiles' @ [206:23] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'!' @ [209:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [209:48] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withDirectoryFilter.filter[ValueParameterDescriptorImpl]

'name' @ [209:53] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [209:58] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'listOf' @ [211:34] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [211:87] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (kotlin.String..kotlin.String?)

'File' @ [211:93] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [211:98] ==> value-parameter it: String defined in test.io.FileTreeWalkTest.withDirectoryFilter.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [211:102] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'toSet' @ [211:109] ==> public fun <T> Iterable<(String..String?)>.toSet(): Set<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'compareWalkResults' @ [212:13] ==> private final fun compareWalkResults(expected: Set<String>, basedir: File, filter: (File) -> Boolean): Unit defined in test.io.FileTreeWalkTest[SimpleFunctionDescriptorImpl]

'referenceNames' @ [212:32] ==> val referenceNames: Set<(String..String?)> defined in test.io.FileTreeWalkTest.withDirectoryFilter[LocalVariableDescriptor]

'basedir' @ [212:48] ==> val basedir: File defined in test.io.FileTreeWalkTest.withDirectoryFilter[LocalVariableDescriptor]

'basedir' @ [214:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.withDirectoryFilter[LocalVariableDescriptor]

'deleteRecursively' @ [214:21] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [218:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTestFiles' @ [219:23] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'emptySet' @ [221:34] ==> public fun <T> emptySet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'compareWalkResults' @ [222:13] ==> private final fun compareWalkResults(expected: Set<String>, basedir: File, filter: (File) -> Boolean): Unit defined in test.io.FileTreeWalkTest[SimpleFunctionDescriptorImpl]

'referenceNames' @ [222:32] ==> val referenceNames: Set<String> defined in test.io.FileTreeWalkTest.withTotalDirectoryFilter[LocalVariableDescriptor]

'basedir' @ [222:48] ==> val basedir: File defined in test.io.FileTreeWalkTest.withTotalDirectoryFilter[LocalVariableDescriptor]

'basedir' @ [224:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.withTotalDirectoryFilter[LocalVariableDescriptor]

'deleteRecursively' @ [224:21] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [228:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTestFiles' @ [229:23] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'basedir' @ [232:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.withForEach[LocalVariableDescriptor]

'walkTopDown' @ [232:21] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'forEach' @ [232:35] ==> public inline fun <T> Sequence<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'i' @ [232:50] ==> var i: Int defined in test.io.FileTreeWalkTest.withForEach[LocalVariableDescriptor]

'assertEquals' @ [233:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'i' @ [233:30] ==> var i: Int defined in test.io.FileTreeWalkTest.withForEach[LocalVariableDescriptor]

'i' @ [234:13] ==> var i: Int defined in test.io.FileTreeWalkTest.withForEach[LocalVariableDescriptor]

'basedir' @ [235:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.withForEach[LocalVariableDescriptor]

'walkBottomUp' @ [235:21] ==> public fun File.walkBottomUp(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'forEach' @ [235:36] ==> public inline fun <T> Sequence<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'i' @ [235:51] ==> var i: Int defined in test.io.FileTreeWalkTest.withForEach[LocalVariableDescriptor]

'assertEquals' @ [236:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'i' @ [236:30] ==> var i: Int defined in test.io.FileTreeWalkTest.withForEach[LocalVariableDescriptor]

'basedir' @ [238:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.withForEach[LocalVariableDescriptor]

'deleteRecursively' @ [238:21] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [242:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTestFiles' @ [243:23] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'assertEquals' @ [245:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'basedir' @ [245:30] ==> val basedir: File defined in test.io.FileTreeWalkTest.withCount[LocalVariableDescriptor]

'walkTopDown' @ [245:38] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'count' @ [245:52] ==> public fun <T> Sequence<File>.count(): Int defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'assertEquals' @ [246:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'basedir' @ [246:30] ==> val basedir: File defined in test.io.FileTreeWalkTest.withCount[LocalVariableDescriptor]

'walkBottomUp' @ [246:38] ==> public fun File.walkBottomUp(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'count' @ [246:53] ==> public fun <T> Sequence<File>.count(): Int defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'basedir' @ [248:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.withCount[LocalVariableDescriptor]

'deleteRecursively' @ [248:21] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [252:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTestFiles' @ [253:23] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'basedir' @ [255:23] ==> val basedir: File defined in test.io.FileTreeWalkTest.withReduce[LocalVariableDescriptor]

'walkTopDown' @ [255:31] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'reduce' @ [255:45] ==> public inline fun <S, T : File> Sequence<File>.reduce(operation: (File, File) -> File): File defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> File
    <T : S> -> File

'if (a.canonicalPath > b.canonicalPath) a else b' @ [255:62] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: File, elseBranch: File): File[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> File

'a' @ [255:66] ==> value-parameter a: File defined in test.io.FileTreeWalkTest.withReduce.<anonymous>[ValueParameterDescriptorImpl]

'canonicalPath' @ [255:68] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'b' @ [255:84] ==> value-parameter b: File defined in test.io.FileTreeWalkTest.withReduce.<anonymous>[ValueParameterDescriptorImpl]

'canonicalPath' @ [255:86] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'a' @ [255:101] ==> value-parameter a: File defined in test.io.FileTreeWalkTest.withReduce.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [255:108] ==> value-parameter b: File defined in test.io.FileTreeWalkTest.withReduce.<anonymous>[ValueParameterDescriptorImpl]

'assertTrue' @ [256:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'res' @ [256:24] ==> val res: File defined in test.io.FileTreeWalkTest.withReduce[LocalVariableDescriptor]

'endsWith' @ [256:28] ==> public fun File.endsWith(other: String): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'res' @ [256:82] ==> val res: File defined in test.io.FileTreeWalkTest.withReduce[LocalVariableDescriptor]

'name' @ [256:86] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'basedir' @ [258:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.withReduce[LocalVariableDescriptor]

'deleteRecursively' @ [258:21] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [262:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTestFiles' @ [263:23] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'HashSet' @ [265:25] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'HashSet' @ [266:24] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'HashSet' @ [267:26] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'ArrayList' @ [268:25] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'stack' @ [270:17] ==> val stack: ArrayList<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'add' @ [270:23] ==> public open fun add(element: File): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'dir' @ [270:27] ==> value-parameter dir: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth.beforeVisitDirectory[ValueParameterDescriptorImpl]

'dirs' @ [271:17] ==> val dirs: HashSet<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'add' @ [271:22] ==> public open fun add(element: File): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'dir' @ [271:26] ==> value-parameter dir: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth.beforeVisitDirectory[ValueParameterDescriptorImpl]

'relativeToOrSelf' @ [271:30] ==> public fun File.relativeToOrSelf(base: File): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'basedir' @ [271:47] ==> val basedir: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'assertEquals' @ [276:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: File, actual: File, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> File

'stack' @ [276:30] ==> val stack: ArrayList<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'last' @ [276:36] ==> public fun <T> List<File>.last(): File defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'dir' @ [276:44] ==> value-parameter dir: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth.afterVisitDirectory[ValueParameterDescriptorImpl]

'stack' @ [277:17] ==> val stack: ArrayList<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'removeAt' @ [277:23] ==> public open fun removeAt(p0: Int): File defined in java.util.ArrayList[JavaMethodDescriptor]

'stack' @ [277:32] ==> val stack: ArrayList<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'lastIndex' @ [277:38] ==> public val <T> List<File>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> File

'assertTrue' @ [281:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'stack' @ [281:28] ==> val stack: ArrayList<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'last' @ [281:34] ==> public fun <T> List<File>.last(): File defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'listFiles' @ [281:41] ==> public open fun listFiles(): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[JavaMethodDescriptor]

'contains' @ [281:53] ==> public operator fun <@OnlyInputTypes T> Array<out (File..File?)>.contains(element: (File..File?)): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.io.File..java.io.File?)

'file' @ [281:62] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth.visitFile[ValueParameterDescriptorImpl]

'file' @ [281:69] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth.visitFile[ValueParameterDescriptorImpl]

'toString' @ [281:74] ==> public open fun toString(): String defined in java.io.File[JavaMethodDescriptor]

'files' @ [282:17] ==> val files: HashSet<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'add' @ [282:23] ==> public open fun add(element: File): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'file' @ [282:27] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth.visitFile[ValueParameterDescriptorImpl]

'relativeToOrSelf' @ [282:32] ==> public fun File.relativeToOrSelf(base: File): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'basedir' @ [282:49] ==> val basedir: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'Suppress' @ [285:49] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'assertEquals' @ [286:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: File, actual: File, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> File

'stack' @ [286:30] ==> val stack: ArrayList<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'last' @ [286:36] ==> public fun <T> List<File>.last(): File defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'dir' @ [286:44] ==> value-parameter dir: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth.visitDirectoryFailed[ValueParameterDescriptorImpl]

'failed' @ [288:17] ==> val failed: HashSet<String> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'add' @ [288:24] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'dir' @ [288:28] ==> value-parameter dir: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth.visitDirectoryFailed[ValueParameterDescriptorImpl]

'name' @ [288:32] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'basedir' @ [290:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'walkTopDown' @ [290:21] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'onEnter' @ [290:35] ==> public final fun onEnter(function: (File) -> Boolean): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'onLeave' @ [290:67] ==> public final fun onLeave(function: (File) -> Unit): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'onFail' @ [291:21] ==> public final fun onFail(function: (File, IOException) -> Unit): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'forEach' @ [291:52] ==> public inline fun <T> Sequence<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'!' @ [291:72] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [291:73] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth.<anonymous>[ValueParameterDescriptorImpl]

'isDirectory' @ [291:76] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'visitFile' @ [291:89] ==> local final fun visitFile(file: File): Unit defined in test.io.FileTreeWalkTest.withVisitorAndDepth[SimpleFunctionDescriptorImpl]

'it' @ [291:99] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth.<anonymous>[ValueParameterDescriptorImpl]

'assertTrue' @ [292:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'stack' @ [292:24] ==> val stack: ArrayList<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'isEmpty' @ [292:30] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'arrayOf' @ [293:30] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'assertTrue' @ [294:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'dirs' @ [294:28] ==> val dirs: HashSet<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'contains' @ [294:33] ==> public open fun contains(element: File): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'File' @ [294:42] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'fileName' @ [294:47] ==> val fileName: String defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'fileName' @ [294:59] ==> val fileName: String defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'arrayOf' @ [296:30] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'assertTrue' @ [297:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'files' @ [297:28] ==> val files: HashSet<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'contains' @ [297:34] ==> public open fun contains(element: File): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'File' @ [297:43] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'fileName' @ [297:48] ==> val fileName: String defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'fileName' @ [297:60] ==> val fileName: String defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'files' @ [301:13] ==> val files: HashSet<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'clear' @ [301:19] ==> public open fun clear(): Unit defined in java.util.HashSet[JavaMethodDescriptor]

'dirs' @ [302:13] ==> val dirs: HashSet<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'clear' @ [302:18] ==> public open fun clear(): Unit defined in java.util.HashSet[JavaMethodDescriptor]

'basedir' @ [303:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'walkTopDown' @ [303:21] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'onEnter' @ [303:35] ==> public final fun onEnter(function: (File) -> Boolean): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'onLeave' @ [303:67] ==> public final fun onLeave(function: (File) -> Unit): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'maxDepth' @ [303:98] ==> public final fun maxDepth(depth: Int): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'forEach' @ [304:21] ==> public inline fun <T> Sequence<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [304:41] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth.<anonymous>[ValueParameterDescriptorImpl]

'basedir' @ [304:47] ==> val basedir: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'visitFile' @ [304:56] ==> local final fun visitFile(file: File): Unit defined in test.io.FileTreeWalkTest.withVisitorAndDepth[SimpleFunctionDescriptorImpl]

'it' @ [304:66] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth.<anonymous>[ValueParameterDescriptorImpl]

'assertTrue' @ [305:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'stack' @ [305:24] ==> val stack: ArrayList<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'isEmpty' @ [305:30] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'assertEquals' @ [306:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<File>, actual: Set<File>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<File>

'setOf' @ [306:26] ==> public fun <T> setOf(element: File): Set<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [306:32] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'dirs' @ [306:43] ==> val dirs: HashSet<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'arrayOf' @ [307:26] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'assertTrue' @ [308:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'files' @ [308:28] ==> val files: HashSet<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'contains' @ [308:34] ==> public open fun contains(element: File): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'File' @ [308:43] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'file' @ [308:48] ==> val file: String defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'file' @ [308:56] ==> val file: String defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'toString' @ [308:61] ==> public open fun toString(): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (File(basedir, "1").setReadable(false)) {
                try {
                    files.clear()
                    dirs.clear()
                    basedir.walkTopDown().onEnter(::beforeVisitDirectory).onLeave(::afterVisitDirectory).
                            onFail(::visitDirectoryFailed).forEach { it -> if (!it.isDirectory) visitFile(it) }
                    assertTrue(stack.isEmpty())
                    assertEquals(setOf("1"), failed)
                    assertEquals(listOf("", "1", "6", "8").map { File(it) }.toSet(), dirs)
                    assertEquals(listOf("7.txt", "8/9.txt").map { File(it) }.toSet(), files)
                } finally {
                    File(basedir, "1").setReadable(true)
                }
            } else {
                System.err.println("cannot restrict access")
            }' @ [312:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'File' @ [312:17] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'basedir' @ [312:22] ==> val basedir: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'setReadable' @ [312:36] ==> public open fun setReadable(p0: Boolean): Boolean defined in java.io.File[JavaMethodDescriptor]

'files' @ [314:21] ==> val files: HashSet<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'clear' @ [314:27] ==> public open fun clear(): Unit defined in java.util.HashSet[JavaMethodDescriptor]

'dirs' @ [315:21] ==> val dirs: HashSet<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'clear' @ [315:26] ==> public open fun clear(): Unit defined in java.util.HashSet[JavaMethodDescriptor]

'basedir' @ [316:21] ==> val basedir: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'walkTopDown' @ [316:29] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'onEnter' @ [316:43] ==> public final fun onEnter(function: (File) -> Boolean): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'onLeave' @ [316:75] ==> public final fun onLeave(function: (File) -> Unit): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'onFail' @ [317:29] ==> public final fun onFail(function: (File, IOException) -> Unit): FileTreeWalk defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'forEach' @ [317:60] ==> public inline fun <T> Sequence<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'!' @ [317:80] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [317:81] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth.<anonymous>[ValueParameterDescriptorImpl]

'isDirectory' @ [317:84] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'visitFile' @ [317:97] ==> local final fun visitFile(file: File): Unit defined in test.io.FileTreeWalkTest.withVisitorAndDepth[SimpleFunctionDescriptorImpl]

'it' @ [317:107] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth.<anonymous>[ValueParameterDescriptorImpl]

'assertTrue' @ [318:21] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'stack' @ [318:32] ==> val stack: ArrayList<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'isEmpty' @ [318:38] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'assertEquals' @ [319:21] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<String>, actual: Set<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<String>

'setOf' @ [319:34] ==> public fun <T> setOf(element: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'failed' @ [319:46] ==> val failed: HashSet<String> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'assertEquals' @ [320:21] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<File>, actual: Set<File>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<File>

'listOf' @ [320:34] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [320:60] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'File' @ [320:66] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [320:71] ==> value-parameter it: String defined in test.io.FileTreeWalkTest.withVisitorAndDepth.<anonymous>[ValueParameterDescriptorImpl]

'toSet' @ [320:77] ==> public fun <T> Iterable<File>.toSet(): Set<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'dirs' @ [320:86] ==> val dirs: HashSet<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'assertEquals' @ [321:21] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<File>, actual: Set<File>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<File>

'listOf' @ [321:34] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [321:61] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'File' @ [321:67] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [321:72] ==> value-parameter it: String defined in test.io.FileTreeWalkTest.withVisitorAndDepth.<anonymous>[ValueParameterDescriptorImpl]

'toSet' @ [321:78] ==> public fun <T> Iterable<File>.toSet(): Set<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'files' @ [321:87] ==> val files: HashSet<File> defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'File' @ [323:21] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'basedir' @ [323:26] ==> val basedir: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'setReadable' @ [323:40] ==> public open fun setReadable(p0: Boolean): Boolean defined in java.io.File[JavaMethodDescriptor]

'err' @ [326:24] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [326:28] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'basedir' @ [329:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.withVisitorAndDepth[LocalVariableDescriptor]

'deleteRecursively' @ [329:21] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [333:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTestFiles' @ [334:23] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'HashSet' @ [336:27] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'assertTrue' @ [338:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'!' @ [338:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'visited' @ [338:29] ==> val visited: HashSet<File> defined in test.io.FileTreeWalkTest.topDown[LocalVariableDescriptor]

'contains' @ [338:37] ==> public open fun contains(element: File): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'it' @ [338:46] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.topDown.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [338:51] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.topDown.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [338:54] ==> public open fun toString(): String defined in java.io.File[JavaMethodDescriptor]

'assertTrue' @ [339:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'it' @ [339:28] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.topDown.<anonymous>[ValueParameterDescriptorImpl]

'basedir' @ [339:34] ==> val basedir: File defined in test.io.FileTreeWalkTest.topDown[LocalVariableDescriptor]

'visited' @ [339:45] ==> val visited: HashSet<File> defined in test.io.FileTreeWalkTest.topDown[LocalVariableDescriptor]

'isEmpty' @ [339:53] ==> public open fun isEmpty(): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'visited' @ [339:66] ==> val visited: HashSet<File> defined in test.io.FileTreeWalkTest.topDown[LocalVariableDescriptor]

'contains' @ [339:74] ==> public open fun contains(element: File): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'it' @ [339:83] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.topDown.<anonymous>[ValueParameterDescriptorImpl]

'parentFile' @ [339:86] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'it' @ [339:99] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.topDown.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [339:102] ==> public open fun toString(): String defined in java.io.File[JavaMethodDescriptor]

'visited' @ [340:17] ==> val visited: HashSet<File> defined in test.io.FileTreeWalkTest.topDown[LocalVariableDescriptor]

'add' @ [340:25] ==> public open fun add(element: File): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'it' @ [340:29] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.topDown.<anonymous>[ValueParameterDescriptorImpl]

'basedir' @ [342:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.topDown[LocalVariableDescriptor]

'walkTopDown' @ [342:21] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'forEach' @ [342:35] ==> public inline fun <T> Sequence<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'block' @ [342:43] ==> val block: (File) -> Unit defined in test.io.FileTreeWalkTest.topDown[LocalVariableDescriptor]

'assertEquals' @ [343:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'visited' @ [343:30] ==> val visited: HashSet<File> defined in test.io.FileTreeWalkTest.topDown[LocalVariableDescriptor]

'size' @ [343:38] ==> public open val size: Int defined in java.util.HashSet[JavaPropertyDescriptor]

'basedir' @ [345:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.topDown[LocalVariableDescriptor]

'deleteRecursively' @ [345:21] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [349:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTestFiles' @ [350:23] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'File' @ [351:26] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'basedir' @ [351:31] ==> val basedir: File defined in test.io.FileTreeWalkTest.restrictedAccess[LocalVariableDescriptor]

'restricted' @ [353:17] ==> val restricted: File defined in test.io.FileTreeWalkTest.restrictedAccess[LocalVariableDescriptor]

'setReadable' @ [353:28] ==> public open fun setReadable(p0: Boolean): Boolean defined in java.io.File[JavaMethodDescriptor]

'HashSet' @ [354:31] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'assertTrue' @ [356:21] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'!' @ [356:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'visited' @ [356:33] ==> val visited: HashSet<File> defined in test.io.FileTreeWalkTest.restrictedAccess[LocalVariableDescriptor]

'contains' @ [356:41] ==> public open fun contains(element: File): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'it' @ [356:50] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.restrictedAccess.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [356:55] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.restrictedAccess.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [356:58] ==> public open fun toString(): String defined in java.io.File[JavaMethodDescriptor]

'assertTrue' @ [357:21] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'it' @ [357:32] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.restrictedAccess.<anonymous>[ValueParameterDescriptorImpl]

'basedir' @ [357:38] ==> val basedir: File defined in test.io.FileTreeWalkTest.restrictedAccess[LocalVariableDescriptor]

'visited' @ [357:49] ==> val visited: HashSet<File> defined in test.io.FileTreeWalkTest.restrictedAccess[LocalVariableDescriptor]

'isEmpty' @ [357:57] ==> public open fun isEmpty(): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'visited' @ [357:70] ==> val visited: HashSet<File> defined in test.io.FileTreeWalkTest.restrictedAccess[LocalVariableDescriptor]

'contains' @ [357:78] ==> public open fun contains(element: File): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'it' @ [357:87] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.restrictedAccess.<anonymous>[ValueParameterDescriptorImpl]

'parentFile' @ [357:90] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'it' @ [357:103] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.restrictedAccess.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [357:106] ==> public open fun toString(): String defined in java.io.File[JavaMethodDescriptor]

'visited' @ [358:21] ==> val visited: HashSet<File> defined in test.io.FileTreeWalkTest.restrictedAccess[LocalVariableDescriptor]

'add' @ [358:29] ==> public open fun add(element: File): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'it' @ [358:33] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.restrictedAccess.<anonymous>[ValueParameterDescriptorImpl]

'basedir' @ [360:17] ==> val basedir: File defined in test.io.FileTreeWalkTest.restrictedAccess[LocalVariableDescriptor]

'walkTopDown' @ [360:25] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'forEach' @ [360:39] ==> public inline fun <T> Sequence<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'block' @ [360:47] ==> val block: (File) -> Unit defined in test.io.FileTreeWalkTest.restrictedAccess[LocalVariableDescriptor]

'assertEquals' @ [361:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'visited' @ [361:33] ==> val visited: HashSet<File> defined in test.io.FileTreeWalkTest.restrictedAccess[LocalVariableDescriptor]

'size' @ [361:41] ==> public open val size: Int defined in java.util.HashSet[JavaPropertyDescriptor]

'restricted' @ [364:13] ==> val restricted: File defined in test.io.FileTreeWalkTest.restrictedAccess[LocalVariableDescriptor]

'setReadable' @ [364:24] ==> public open fun setReadable(p0: Boolean): Boolean defined in java.io.File[JavaMethodDescriptor]

'basedir' @ [365:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.restrictedAccess[LocalVariableDescriptor]

'deleteRecursively' @ [365:21] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [369:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'count' @ [372:13] ==> var count: Int defined in test.io.FileTreeWalkTest.backup[LocalVariableDescriptor]

'File' @ [373:27] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'file' @ [373:32] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.backup.makeBackup[ValueParameterDescriptorImpl]

'toString' @ [373:37] ==> public open fun toString(): String defined in java.io.File[JavaMethodDescriptor]

'file' @ [374:13] ==> value-parameter file: File defined in test.io.FileTreeWalkTest.backup.makeBackup[ValueParameterDescriptorImpl]

'copyTo' @ [374:18] ==> public fun File.copyTo(target: File, overwrite: Boolean = ..., bufferSize: Int = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'bakFile' @ [374:25] ==> val bakFile: File defined in test.io.FileTreeWalkTest.backup.makeBackup[LocalVariableDescriptor]

'createTestFiles' @ [377:24] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'basedir1' @ [379:13] ==> val basedir1: File defined in test.io.FileTreeWalkTest.backup[LocalVariableDescriptor]

'walkTopDown' @ [379:22] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'forEach' @ [379:36] ==> public inline fun <T> Sequence<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [380:21] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.backup.<anonymous>[ValueParameterDescriptorImpl]

'isFile' @ [380:24] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'makeBackup' @ [381:21] ==> local final fun makeBackup(file: File): Unit defined in test.io.FileTreeWalkTest.backup[SimpleFunctionDescriptorImpl]

'it' @ [381:32] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.backup.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [384:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'count' @ [384:29] ==> var count: Int defined in test.io.FileTreeWalkTest.backup[LocalVariableDescriptor]

'basedir1' @ [386:13] ==> val basedir1: File defined in test.io.FileTreeWalkTest.backup[LocalVariableDescriptor]

'deleteRecursively' @ [386:22] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'count' @ [389:9] ==> var count: Int defined in test.io.FileTreeWalkTest.backup[LocalVariableDescriptor]

'createTestFiles' @ [390:24] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'basedir2' @ [392:13] ==> val basedir2: File defined in test.io.FileTreeWalkTest.backup[LocalVariableDescriptor]

'walkTopDown' @ [392:22] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'forEach' @ [392:36] ==> public inline fun <T> Sequence<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [393:21] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.backup.<anonymous>[ValueParameterDescriptorImpl]

'isFile' @ [393:24] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'makeBackup' @ [394:21] ==> local final fun makeBackup(file: File): Unit defined in test.io.FileTreeWalkTest.backup[SimpleFunctionDescriptorImpl]

'it' @ [394:32] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.backup.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [397:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'count' @ [397:29] ==> var count: Int defined in test.io.FileTreeWalkTest.backup[LocalVariableDescriptor]

'basedir2' @ [399:13] ==> val basedir2: File defined in test.io.FileTreeWalkTest.backup[LocalVariableDescriptor]

'deleteRecursively' @ [399:22] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [403:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTestFiles' @ [404:23] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'File' @ [406:13] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'basedir' @ [406:18] ==> val basedir: File defined in test.io.FileTreeWalkTest.find[LocalVariableDescriptor]

'createNewFile' @ [406:38] ==> public open fun createNewFile(): Boolean defined in java.io.File[JavaMethodDescriptor]

'basedir' @ [408:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.find[LocalVariableDescriptor]

'walkTopDown' @ [408:21] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'takeWhile' @ [408:35] ==> public fun <T> Sequence<File>.takeWhile(predicate: (File) -> Boolean): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'count' @ [408:52] ==> var count: Int defined in test.io.FileTreeWalkTest.find[LocalVariableDescriptor]

'forEach' @ [408:65] ==> public inline fun <T> Sequence<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [409:21] ==> value-parameter it: File defined in test.io.FileTreeWalkTest.find.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [409:24] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'count' @ [410:21] ==> var count: Int defined in test.io.FileTreeWalkTest.find[LocalVariableDescriptor]

'assertEquals' @ [413:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'count' @ [413:29] ==> var count: Int defined in test.io.FileTreeWalkTest.find[LocalVariableDescriptor]

'basedir' @ [415:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.find[LocalVariableDescriptor]

'deleteRecursively' @ [415:21] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [419:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTestFiles' @ [420:23] ==> public final fun createTestFiles(): File defined in test.io.FileTreeWalkTest.Companion[SimpleFunctionDescriptorImpl]

'File' @ [422:13] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'basedir' @ [422:18] ==> val basedir: File defined in test.io.FileTreeWalkTest.findGits[LocalVariableDescriptor]

'mkdir' @ [422:39] ==> public open fun mkdir(): Boolean defined in java.io.File[JavaMethodDescriptor]

'File' @ [423:13] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'basedir' @ [423:18] ==> val basedir: File defined in test.io.FileTreeWalkTest.findGits[LocalVariableDescriptor]

'mkdir' @ [423:39] ==> public open fun mkdir(): Boolean defined in java.io.File[JavaMethodDescriptor]

'File' @ [424:13] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'basedir' @ [424:18] ==> val basedir: File defined in test.io.FileTreeWalkTest.findGits[LocalVariableDescriptor]

'mkdir' @ [424:37] ==> public open fun mkdir(): Boolean defined in java.io.File[JavaMethodDescriptor]

'HashSet' @ [425:25] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'basedir' @ [426:26] ==> val basedir: File defined in test.io.FileTreeWalkTest.findGits[LocalVariableDescriptor]

'walkTopDown' @ [426:34] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'file' @ [427:21] ==> val file: File defined in test.io.FileTreeWalkTest.findGits[LocalVariableDescriptor]

'name' @ [427:26] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'found' @ [428:21] ==> val found: HashSet<File> defined in test.io.FileTreeWalkTest.findGits[LocalVariableDescriptor]

'add' @ [428:27] ==> public open fun add(element: File): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'file' @ [428:31] ==> val file: File defined in test.io.FileTreeWalkTest.findGits[LocalVariableDescriptor]

'parentFile' @ [428:36] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'assertEquals' @ [431:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'found' @ [431:29] ==> val found: HashSet<File> defined in test.io.FileTreeWalkTest.findGits[LocalVariableDescriptor]

'size' @ [431:35] ==> public open val size: Int defined in java.util.HashSet[JavaPropertyDescriptor]

'basedir' @ [433:13] ==> val basedir: File defined in test.io.FileTreeWalkTest.findGits[LocalVariableDescriptor]

'deleteRecursively' @ [433:21] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [437:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTempDir' @ [438:19] ==> public fun createTempDir(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'createTempDir' @ [440:27] ==> public fun createTempDir(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'dir' @ [440:69] ==> val dir: File defined in test.io.FileTreeWalkTest.streamFileTree[LocalVariableDescriptor]

'createTempDir' @ [441:27] ==> public fun createTempDir(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'dir' @ [441:69] ==> val dir: File defined in test.io.FileTreeWalkTest.streamFileTree[LocalVariableDescriptor]

'createTempDir' @ [442:13] ==> public fun createTempDir(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'subDir1' @ [442:55] ==> val subDir1: File defined in test.io.FileTreeWalkTest.streamFileTree[LocalVariableDescriptor]

'createTempFile' @ [443:13] ==> public fun createTempFile(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'subDir1' @ [443:56] ==> val subDir1: File defined in test.io.FileTreeWalkTest.streamFileTree[LocalVariableDescriptor]

'createTempDir' @ [444:13] ==> public fun createTempDir(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'subDir2' @ [444:55] ==> val subDir2: File defined in test.io.FileTreeWalkTest.streamFileTree[LocalVariableDescriptor]

'assertEquals' @ [445:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'dir' @ [445:29] ==> val dir: File defined in test.io.FileTreeWalkTest.streamFileTree[LocalVariableDescriptor]

'walkTopDown' @ [445:33] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'count' @ [445:47] ==> public fun <T> Sequence<File>.count(): Int defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'dir' @ [447:13] ==> val dir: File defined in test.io.FileTreeWalkTest.streamFileTree[LocalVariableDescriptor]

'deleteRecursively' @ [447:17] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'dir' @ [449:9] ==> val dir: File defined in test.io.FileTreeWalkTest.streamFileTree[LocalVariableDescriptor]

'mkdir' @ [449:13] ==> public open fun mkdir(): Boolean defined in java.io.File[JavaMethodDescriptor]

'dir' @ [451:22] ==> val dir: File defined in test.io.FileTreeWalkTest.streamFileTree[LocalVariableDescriptor]

'walkTopDown' @ [451:26] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'iterator' @ [451:40] ==> public open fun iterator(): Iterator<File> defined in kotlin.io.FileTreeWalk[DeserializedSimpleFunctionDescriptor]

'it' @ [452:13] ==> val it: Iterator<File> defined in test.io.FileTreeWalkTest.streamFileTree[LocalVariableDescriptor]

'next' @ [452:16] ==> public abstract operator fun next(): File defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [453:13] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): NoSuchElementException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> NoSuchElementException

'it' @ [453:93] ==> val it: Iterator<File> defined in test.io.FileTreeWalkTest.streamFileTree[LocalVariableDescriptor]

'next' @ [453:96] ==> public abstract operator fun next(): File defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'dir' @ [455:13] ==> val dir: File defined in test.io.FileTreeWalkTest.streamFileTree[LocalVariableDescriptor]

'delete' @ [455:17] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

