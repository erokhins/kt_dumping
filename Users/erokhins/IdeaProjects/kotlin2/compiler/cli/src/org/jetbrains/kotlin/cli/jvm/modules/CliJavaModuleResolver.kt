'assert' @ [35:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'userModules' @ [35:16] ==> private final val userModules: List<JavaModule> defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver[PropertyDescriptorImpl]

'count' @ [35:28] ==> public inline fun <T> Iterable<JavaModule>.count(predicate: (JavaModule) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaModule

'!' @ [35:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [35:37] ==> value-parameter it: JavaModule defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.<init>.<anonymous>[ValueParameterDescriptorImpl]

'isBinary' @ [35:40] ==> public abstract val isBinary: Boolean defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'userModules' @ [36:99] ==> private final val userModules: List<JavaModule> defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver[PropertyDescriptorImpl]

'userModules' @ [40:45] ==> private final val userModules: List<JavaModule> defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver[PropertyDescriptorImpl]

'firstOrNull' @ [40:57] ==> public inline fun <T> Iterable<JavaModule>.firstOrNull(predicate: (JavaModule) -> Boolean): JavaModule? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaModule

'!' @ [40:71] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [40:72] ==> value-parameter it: JavaModule defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.sourceModule.<anonymous>[ValueParameterDescriptorImpl]

'isBinary' @ [40:75] ==> public abstract val isBinary: Boolean defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'file' @ [43:13] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.findJavaModule[ValueParameterDescriptorImpl]

'fileSystem' @ [43:18] ==> public final val VirtualFile.fileSystem: VirtualFileSystem[MyPropertyDescriptor]

'protocol' @ [43:29] ==> public final val VirtualFileSystem.protocol: String[MyPropertyDescriptor]

'JRT_PROTOCOL' @ [43:61] ==> public const final val JRT_PROTOCOL: String defined in com.intellij.openapi.vfs.StandardFileSystems[JavaPropertyDescriptor]

'systemModules' @ [44:20] ==> private final val systemModules: List<JavaModule.Explicit> defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver[PropertyDescriptorImpl]

'firstOrNull' @ [44:34] ==> public inline fun <T> Iterable<JavaModule.Explicit>.firstOrNull(predicate: (JavaModule.Explicit) -> Boolean): JavaModule.Explicit? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Explicit

'file' @ [44:58] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.findJavaModule[ValueParameterDescriptorImpl]

'module' @ [44:66] ==> value-parameter module: JavaModule.Explicit defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.findJavaModule.<anonymous>[ValueParameterDescriptorImpl]

'when (file.fileType) {
            KotlinFileType.INSTANCE, JavaFileType.INSTANCE -> sourceModule
            JavaClassFileType.INSTANCE -> userModules.firstOrNull { module -> module.isBinary && file in module }
            else -> null
        }' @ [47:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JavaModule?, entry1: JavaModule?, entry2: JavaModule?): JavaModule?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JavaModule?

'file' @ [47:22] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.findJavaModule[ValueParameterDescriptorImpl]

'fileType' @ [47:27] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'INSTANCE' @ [48:28] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'INSTANCE' @ [48:51] ==> public final val INSTANCE: (JavaFileType..JavaFileType?) defined in com.intellij.ide.highlighter.JavaFileType[JavaPropertyDescriptor]

'sourceModule' @ [48:63] ==> private final val sourceModule: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver[PropertyDescriptorImpl]

'INSTANCE' @ [49:31] ==> public final val INSTANCE: (JavaClassFileType..JavaClassFileType?) defined in com.intellij.ide.highlighter.JavaClassFileType[JavaPropertyDescriptor]

'userModules' @ [49:43] ==> private final val userModules: List<JavaModule> defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver[PropertyDescriptorImpl]

'firstOrNull' @ [49:55] ==> public inline fun <T> Iterable<JavaModule>.firstOrNull(predicate: (JavaModule) -> Boolean): JavaModule? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaModule

'module' @ [49:79] ==> value-parameter module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.findJavaModule.<anonymous>[ValueParameterDescriptorImpl]

'isBinary' @ [49:86] ==> public abstract val isBinary: Boolean defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'file' @ [49:98] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.findJavaModule[ValueParameterDescriptorImpl]

'module' @ [49:106] ==> value-parameter module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.findJavaModule.<anonymous>[ValueParameterDescriptorImpl]

'isAncestor' @ [55:25] ==> public open fun isAncestor(@NotNull p0: VirtualFile, @NotNull p1: VirtualFile, p2: Boolean): Boolean defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'moduleRoot' @ [55:36] ==> public abstract val moduleRoot: VirtualFile defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'file' @ [55:48] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.contains[ValueParameterDescriptorImpl]

'fileFromOurModule' @ [60:25] ==> value-parameter fileFromOurModule: VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[ValueParameterDescriptorImpl]

'let' @ [60:44] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> JavaModule?): JavaModule? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> JavaModule?

'this' @ [60:48] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver[LazyClassReceiverParameterDescriptor]

'this' @ [61:27] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver[LazyClassReceiverParameterDescriptor]

'findJavaModule' @ [61:32] ==> private final fun findJavaModule(file: VirtualFile): JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver[SimpleFunctionDescriptorImpl]

'referencedFile' @ [61:47] ==> value-parameter referencedFile: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[ValueParameterDescriptorImpl]

'ourModule' @ [63:13] ==> val ourModule: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'name' @ [63:24] ==> public abstract val name: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'theirModule' @ [63:32] ==> val theirModule: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'name' @ [63:45] ==> public abstract val name: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'theirModule' @ [65:13] ==> val theirModule: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'JavaModuleResolver' @ [66:20] ==> public companion object SERVICE defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver[FakeCallableDescriptorForObject]

'ModuleDoesNotReadUnnamedModule' @ [66:51] ==> public object ModuleDoesNotReadUnnamedModule : JavaModuleResolver.AccessError defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver.AccessError[FakeCallableDescriptorForObject]

'ourModule' @ [69:13] ==> val ourModule: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'!' @ [69:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'moduleGraph' @ [69:35] ==> private final val moduleGraph: JavaModuleGraph defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver[PropertyDescriptorImpl]

'reads' @ [69:47] ==> public final fun reads(moduleName: String, dependencyName: String): Boolean defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph[SimpleFunctionDescriptorImpl]

'ourModule' @ [69:53] ==> val ourModule: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'name' @ [69:63] ==> public abstract val name: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'theirModule' @ [69:69] ==> val theirModule: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'name' @ [69:81] ==> public abstract val name: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'JavaModuleResolver' @ [70:20] ==> public companion object SERVICE defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver[FakeCallableDescriptorForObject]

'ModuleDoesNotReadModule' @ [70:51] ==> public constructor ModuleDoesNotReadModule(dependencyModuleName: String) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver.AccessError.ModuleDoesNotReadModule[DeserializedClassConstructorDescriptor]

'theirModule' @ [70:75] ==> val theirModule: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'name' @ [70:87] ==> public abstract val name: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'referencedPackage' @ [73:22] ==> value-parameter referencedPackage: FqName? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[ValueParameterDescriptorImpl]

'!' @ [74:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'theirModule' @ [74:14] ==> val theirModule: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'exports' @ [74:26] ==> public abstract fun exports(packageFqName: FqName): Boolean defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedSimpleFunctionDescriptor]

'fqName' @ [74:34] ==> val fqName: FqName defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'ourModule' @ [74:46] ==> val ourModule: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'!' @ [74:67] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'theirModule' @ [74:68] ==> val theirModule: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'exportsTo' @ [74:80] ==> public abstract fun exportsTo(packageFqName: FqName, moduleName: String): Boolean defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedSimpleFunctionDescriptor]

'fqName' @ [74:90] ==> val fqName: FqName defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'ourModule' @ [74:98] ==> val ourModule: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'name' @ [74:108] ==> public abstract val name: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'JavaModuleResolver' @ [75:20] ==> public companion object SERVICE defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver[FakeCallableDescriptorForObject]

'ModuleDoesNotExportPackage' @ [75:51] ==> public constructor ModuleDoesNotExportPackage(dependencyModuleName: String) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver.AccessError.ModuleDoesNotExportPackage[DeserializedClassConstructorDescriptor]

'theirModule' @ [75:78] ==> val theirModule: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'name' @ [75:90] ==> public abstract val name: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

