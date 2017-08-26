'jrtFileSystemRoot' @ [26:31] ==> value-parameter jrtFileSystemRoot: VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder.<init>[ValueParameterDescriptorImpl]

'findChild' @ [26:50] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'linkedMapOf' @ [27:31] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<String, JavaModule> /* = LinkedHashMap<String, JavaModule> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> JavaModule

'userModules' @ [30:9] ==> private final val userModules: LinkedHashMap<String, JavaModule> /* = LinkedHashMap<String, JavaModule> */ defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[PropertyDescriptorImpl]

'putIfAbsent' @ [30:21] ==> public open fun putIfAbsent(p0: String, p1: JavaModule): JavaModule? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'module' @ [30:33] ==> value-parameter module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder.addUserModule[ValueParameterDescriptorImpl]

'name' @ [30:40] ==> public abstract val name: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'module' @ [30:46] ==> value-parameter module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder.addUserModule[ValueParameterDescriptorImpl]

'systemModules' @ [34:17] ==> public final val systemModules: Sequence<JavaModule.Explicit> defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[PropertyDescriptorImpl]

'userModules' @ [34:33] ==> private final val userModules: LinkedHashMap<String, JavaModule> /* = LinkedHashMap<String, JavaModule> */ defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[PropertyDescriptorImpl]

'values' @ [34:45] ==> public open val values: MutableCollection<JavaModule> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'modulesRoot' @ [37:17] ==> private final val modulesRoot: VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[PropertyDescriptorImpl]

'children' @ [37:30] ==> public final val VirtualFile.children: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)[MyPropertyDescriptor]

'orEmpty' @ [37:39] ==> public inline fun <reified T> Array<out (VirtualFile..VirtualFile?)>?.orEmpty(): Array<out (VirtualFile..VirtualFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'asSequence' @ [37:49] ==> public fun <T> Array<out (VirtualFile..VirtualFile?)>.asSequence(): Sequence<(VirtualFile..VirtualFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'mapNotNull' @ [37:62] ==> public fun <T, R : Any> Sequence<(VirtualFile..VirtualFile?)>.mapNotNull(transform: ((VirtualFile..VirtualFile?)) -> JavaModule.Explicit?): Sequence<JavaModule.Explicit> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)
    <R : Any> -> Explicit

'this' @ [37:73] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[LazyClassReceiverParameterDescriptor]

'findSystemModule' @ [37:79] ==> private final fun findSystemModule(moduleRoot: VirtualFile): JavaModule.Explicit? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[SimpleFunctionDescriptorImpl]

'modulesRoot' @ [40:13] ==> private final val modulesRoot: VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[PropertyDescriptorImpl]

'findChild' @ [40:26] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'name' @ [40:36] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder.findModule[ValueParameterDescriptorImpl]

'let' @ [40:43] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> JavaModule.Explicit?): JavaModule.Explicit? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> Explicit?

'this' @ [40:47] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[LazyClassReceiverParameterDescriptor]

'findSystemModule' @ [40:53] ==> private final fun findSystemModule(moduleRoot: VirtualFile): JavaModule.Explicit? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[SimpleFunctionDescriptorImpl]

'userModules' @ [40:74] ==> private final val userModules: LinkedHashMap<String, JavaModule> /* = LinkedHashMap<String, JavaModule> */ defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[PropertyDescriptorImpl]

'name' @ [40:86] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder.findModule[ValueParameterDescriptorImpl]

'moduleRoot' @ [43:20] ==> value-parameter moduleRoot: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder.findSystemModule[ValueParameterDescriptorImpl]

'findChild' @ [43:31] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'MODULE_INFO_CLS_FILE' @ [43:55] ==> public const final val MODULE_INFO_CLS_FILE: String defined in com.intellij.psi.PsiJavaModule[JavaPropertyDescriptor]

'?:' @ [44:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: JavaModuleInfo?, right: JavaModuleInfo): JavaModuleInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> JavaModuleInfo

'read' @ [44:41] ==> public final fun read(file: VirtualFile): JavaModuleInfo? defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion[DeserializedSimpleFunctionDescriptor]

'file' @ [44:46] ==> val file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder.findSystemModule[LocalVariableDescriptor]

'Explicit' @ [45:27] ==> public constructor Explicit(moduleInfo: JavaModuleInfo, moduleRoot: VirtualFile, moduleInfoFile: VirtualFile, isBinary: Boolean) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule.Explicit[DeserializedClassConstructorDescriptor]

'moduleInfo' @ [45:36] ==> val moduleInfo: JavaModuleInfo defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder.findSystemModule[LocalVariableDescriptor]

'moduleRoot' @ [45:48] ==> value-parameter moduleRoot: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder.findSystemModule[ValueParameterDescriptorImpl]

'file' @ [45:60] ==> val file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder.findSystemModule[LocalVariableDescriptor]

