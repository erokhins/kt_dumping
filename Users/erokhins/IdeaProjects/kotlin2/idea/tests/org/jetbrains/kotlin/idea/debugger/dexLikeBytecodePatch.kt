'split' @ [25:29] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'any' @ [25:40] ==> public inline fun <T> Iterable<String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [25:46] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.debugger.needDexPatch.<anonymous>[ValueParameterDescriptorImpl]

'endsWith' @ [25:49] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'dir' @ [28:5] ==> value-parameter dir: File defined in org.jetbrains.kotlin.idea.debugger.patchDexTests[ValueParameterDescriptorImpl]

'listFiles' @ [28:9] ==> public final fun listFiles(p0: (((File..File?)) -> Boolean..(((File..File?)) -> Boolean)?)): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[MyFunctionDescriptor]

'file' @ [28:29] ==> value-parameter file: (File..File?) defined in org.jetbrains.kotlin.idea.debugger.patchDexTests.<anonymous>[ValueParameterDescriptorImpl]

'isDirectory' @ [28:34] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'file' @ [28:49] ==> value-parameter file: (File..File?) defined in org.jetbrains.kotlin.idea.debugger.patchDexTests.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [28:54] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'needDexPatch' @ [28:59] ==> public fun String.needDexPatch(): Boolean defined in org.jetbrains.kotlin.idea.debugger[SimpleFunctionDescriptorImpl]

'forEach' @ [28:77] ==> public inline fun <T> Array<out (File..File?)>.forEach(action: ((File..File?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'dir' @ [29:9] ==> value-parameter dir: (File..File?) defined in org.jetbrains.kotlin.idea.debugger.patchDexTests.<anonymous>[ValueParameterDescriptorImpl]

'listFiles' @ [29:13] ==> public final fun listFiles(p0: (((File..File?)) -> Boolean..(((File..File?)) -> Boolean)?)): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[MyFunctionDescriptor]

'testOutputFile' @ [29:43] ==> value-parameter testOutputFile: (File..File?) defined in org.jetbrains.kotlin.idea.debugger.patchDexTests.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'extension' @ [29:58] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'forEach' @ [29:81] ==> public inline fun <T> Array<out (File..File?)>.forEach(action: ((File..File?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'file' @ [34:5] ==> value-parameter file: File defined in org.jetbrains.kotlin.idea.debugger.applyDexLikePatch[ValueParameterDescriptorImpl]

'copyTo' @ [34:10] ==> public fun File.copyTo(target: File, overwrite: Boolean = ..., bufferSize: Int = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'File' @ [34:17] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'file' @ [34:22] ==> value-parameter file: File defined in org.jetbrains.kotlin.idea.debugger.applyDexLikePatch[ValueParameterDescriptorImpl]

'absolutePath' @ [34:27] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'DEX_BEFORE_PATCH_EXTENSION' @ [34:45] ==> public val DEX_BEFORE_PATCH_EXTENSION: String defined in org.jetbrains.kotlin.idea.debugger in file dexLikeBytecodePatch.kt[PropertyDescriptorImpl]

'ClassReader' @ [36:18] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'file' @ [36:30] ==> value-parameter file: File defined in org.jetbrains.kotlin.idea.debugger.applyDexLikePatch[ValueParameterDescriptorImpl]

'readBytes' @ [36:35] ==> public fun File.readBytes(): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'ClassWriter' @ [37:18] ==> public constructor ClassWriter(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassWriter[JavaClassConstructorDescriptor]

'COMPUTE_FRAMES' @ [37:42] ==> public const final val COMPUTE_FRAMES: Int defined in org.jetbrains.org.objectweb.asm.ClassWriter[JavaPropertyDescriptor]

'writer' @ [39:19] ==> val writer: ClassWriter defined in org.jetbrains.kotlin.idea.debugger.applyDexLikePatch[LocalVariableDescriptor]

'withRemoveSourceDebugExtensionVisitor' @ [40:14] ==> private fun ClassVisitor.withRemoveSourceDebugExtensionVisitor(): ClassVisitor defined in org.jetbrains.kotlin.idea.debugger in file dexLikeBytecodePatch.kt[SimpleFunctionDescriptorImpl]

'withRemoveSameLinesInLineTableVisitor' @ [41:14] ==> private fun ClassVisitor.withRemoveSameLinesInLineTableVisitor(): ClassVisitor defined in org.jetbrains.kotlin.idea.debugger in file dexLikeBytecodePatch.kt[SimpleFunctionDescriptorImpl]

'reader' @ [43:5] ==> val reader: ClassReader defined in org.jetbrains.kotlin.idea.debugger.applyDexLikePatch[LocalVariableDescriptor]

'accept' @ [43:12] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'visitor' @ [43:19] ==> val visitor: ClassVisitor defined in org.jetbrains.kotlin.idea.debugger.applyDexLikePatch[LocalVariableDescriptor]

'file' @ [45:5] ==> value-parameter file: File defined in org.jetbrains.kotlin.idea.debugger.applyDexLikePatch[ValueParameterDescriptorImpl]

'writeBytes' @ [45:10] ==> public fun File.writeBytes(array: ByteArray): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'writer' @ [45:21] ==> val writer: ClassWriter defined in org.jetbrains.kotlin.idea.debugger.applyDexLikePatch[LocalVariableDescriptor]

'toByteArray' @ [45:28] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in org.jetbrains.org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'ClassVisitor' @ [49:21] ==> public constructor ClassVisitor(p0: Int, p1: (ClassVisitor..ClassVisitor?)) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [49:42] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'this' @ [49:48] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.withRemoveSourceDebugExtensionVisitor[ReceiverParameterDescriptorImpl]

'super' @ [51:13] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.withRemoveSourceDebugExtensionVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitSource' @ [51:19] ==> public open fun visitSource(p0: (String..String?), p1: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaMethodDescriptor]

'source' @ [51:31] ==> value-parameter source: String? defined in org.jetbrains.kotlin.idea.debugger.withRemoveSourceDebugExtensionVisitor.<no name provided>.visitSource[ValueParameterDescriptorImpl]

'ClassVisitor' @ [57:21] ==> public constructor ClassVisitor(p0: Int, p1: (ClassVisitor..ClassVisitor?)) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [57:42] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'this' @ [57:48] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.withRemoveSameLinesInLineTableVisitor[ReceiverParameterDescriptorImpl]

'super' @ [59:33] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.withRemoveSameLinesInLineTableVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitMethod' @ [59:39] ==> public open fun visitMethod(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Array<(String..String?)>..Array<out (String..String?)>?)): (MethodVisitor..MethodVisitor?) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaMethodDescriptor]

'access' @ [59:51] ==> value-parameter access: Int defined in org.jetbrains.kotlin.idea.debugger.withRemoveSameLinesInLineTableVisitor.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'name' @ [59:59] ==> value-parameter name: String? defined in org.jetbrains.kotlin.idea.debugger.withRemoveSameLinesInLineTableVisitor.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [59:65] ==> value-parameter desc: String? defined in org.jetbrains.kotlin.idea.debugger.withRemoveSameLinesInLineTableVisitor.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'signature' @ [59:71] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.idea.debugger.withRemoveSameLinesInLineTableVisitor.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'exceptions' @ [59:82] ==> value-parameter exceptions: Array<out String>? defined in org.jetbrains.kotlin.idea.debugger.withRemoveSameLinesInLineTableVisitor.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'MethodVisitor' @ [61:29] ==> public constructor MethodVisitor(p0: Int, p1: (MethodVisitor..MethodVisitor?)) defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [61:51] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'methodVisitor' @ [61:57] ==> val methodVisitor: MethodVisitor defined in org.jetbrains.kotlin.idea.debugger.withRemoveSameLinesInLineTableVisitor.<no name provided>.visitMethod[LocalVariableDescriptor]

'HashSet' @ [62:30] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'labels' @ [65:33] ==> public final val labels: HashSet<String> defined in org.jetbrains.kotlin.idea.debugger.withRemoveSameLinesInLineTableVisitor.<no name provided>.visitMethod.<no name provided>[PropertyDescriptorImpl]

'add' @ [65:40] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'start' @ [65:44] ==> value-parameter start: Label? defined in org.jetbrains.kotlin.idea.debugger.withRemoveSameLinesInLineTableVisitor.<no name provided>.visitMethod.<no name provided>.visitLineNumber[ValueParameterDescriptorImpl]

'toString' @ [65:50] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'added' @ [67:25] ==> val added: Boolean defined in org.jetbrains.kotlin.idea.debugger.withRemoveSameLinesInLineTableVisitor.<no name provided>.visitMethod.<no name provided>.visitLineNumber[LocalVariableDescriptor]

'super' @ [68:25] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.withRemoveSameLinesInLineTableVisitor.<no name provided>.visitMethod.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitLineNumber' @ [68:31] ==> public open fun visitLineNumber(p0: Int, p1: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'line' @ [68:47] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.debugger.withRemoveSameLinesInLineTableVisitor.<no name provided>.visitMethod.<no name provided>.visitLineNumber[ValueParameterDescriptorImpl]

'start' @ [68:53] ==> value-parameter start: Label? defined in org.jetbrains.kotlin.idea.debugger.withRemoveSameLinesInLineTableVisitor.<no name provided>.visitMethod.<no name provided>.visitLineNumber[ValueParameterDescriptorImpl]

