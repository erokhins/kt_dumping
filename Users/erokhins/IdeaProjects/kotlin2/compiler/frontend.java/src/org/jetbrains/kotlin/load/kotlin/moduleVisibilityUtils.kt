'JvmStatic' @ [41:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getService' @ [42:32] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(ModuleVisibilityManager..ModuleVisibilityManager?)>): (ModuleVisibilityManager..ModuleVisibilityManager?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ModuleVisibilityManager

'project' @ [42:43] ==> value-parameter project: Project defined in org.jetbrains.kotlin.load.kotlin.ModuleVisibilityManager.SERVICE.getInstance[ValueParameterDescriptorImpl]

'java' @ [42:83] ==> public val <T> KClass<ModuleVisibilityManager>.java: Class<ModuleVisibilityManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ModuleVisibilityManager

'outDirectory' @ [47:9] ==> value-parameter outDirectory: File? defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[ValueParameterDescriptorImpl]

'getParentOfType' @ [49:43] ==> @Nullable public open fun <D : (DeclarationDescriptor..DeclarationDescriptor?)> getParentOfType(@Nullable p0: DeclarationDescriptor?, @NotNull p1: Class<(PackageFragmentDescriptor..PackageFragmentDescriptor?)>, p2: Boolean): PackageFragmentDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (DeclarationDescriptor..DeclarationDescriptor?)> -> PackageFragmentDescriptor

'descriptor' @ [49:59] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[ValueParameterDescriptorImpl]

'java' @ [49:104] ==> public val <T> KClass<PackageFragmentDescriptor>.java: Class<PackageFragmentDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor

'packageFragment' @ [50:9] ==> val packageFragment: PackageFragmentDescriptor? defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[LocalVariableDescriptor]

'getSourceElement' @ [52:18] ==> public fun getSourceElement(descriptor: DeclarationDescriptor): SourceElement defined in org.jetbrains.kotlin.load.kotlin in file moduleVisibilityUtils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [52:35] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[ValueParameterDescriptorImpl]

'when (source) {
        is KotlinJvmBinarySourceElement ->
            source.binaryClass
        is KotlinJvmBinaryPackageSourceElement ->
            if (descriptor is DeserializedMemberDescriptor) {
                source.getContainingBinaryClass(descriptor) ?: source.getRepresentativeBinaryClass()
            }
            else {
                source.getRepresentativeBinaryClass()
            }
        else ->
            null
    }' @ [54:23] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinJvmBinaryClass?, entry1: KotlinJvmBinaryClass?, entry2: KotlinJvmBinaryClass?): KotlinJvmBinaryClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinJvmBinaryClass?

'source' @ [54:29] ==> val source: SourceElement defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[LocalVariableDescriptor]

'source' @ [56:13] ==> val source: SourceElement defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[LocalVariableDescriptor]

'binaryClass' @ [56:20] ==> public final val binaryClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinarySourceElement[DeserializedPropertyDescriptor]

'if (descriptor is DeserializedMemberDescriptor) {
                source.getContainingBinaryClass(descriptor) ?: source.getRepresentativeBinaryClass()
            }
            else {
                source.getRepresentativeBinaryClass()
            }' @ [58:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinJvmBinaryClass, elseBranch: KotlinJvmBinaryClass): KotlinJvmBinaryClass[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinJvmBinaryClass

'descriptor' @ [58:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[ValueParameterDescriptorImpl]

'source' @ [59:17] ==> val source: SourceElement defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[LocalVariableDescriptor]

'getContainingBinaryClass' @ [59:24] ==> public final fun getContainingBinaryClass(descriptor: DeserializedMemberDescriptor): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryPackageSourceElement[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [59:49] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[ValueParameterDescriptorImpl]

'source' @ [59:64] ==> val source: SourceElement defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[LocalVariableDescriptor]

'getRepresentativeBinaryClass' @ [59:71] ==> public final fun getRepresentativeBinaryClass(): KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryPackageSourceElement[DeserializedSimpleFunctionDescriptor]

'source' @ [62:17] ==> val source: SourceElement defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[LocalVariableDescriptor]

'getRepresentativeBinaryClass' @ [62:24] ==> public final fun getRepresentativeBinaryClass(): KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryPackageSourceElement[DeserializedSimpleFunctionDescriptor]

'binaryClass' @ [68:9] ==> val binaryClass: KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[LocalVariableDescriptor]

'binaryClass' @ [69:20] ==> val binaryClass: KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[LocalVariableDescriptor]

'file' @ [69:32] ==> public final val file: VirtualFile defined in org.jetbrains.kotlin.load.kotlin.VirtualFileKotlinClass[PropertyDescriptorImpl]

'when (file.fileSystem.protocol) {
            StandardFileSystems.FILE_PROTOCOL -> VfsUtilCore.virtualToIoFile(file)
            StandardFileSystems.JAR_PROTOCOL -> VfsUtilCore.getVirtualFileForJar(file)?.let(VfsUtilCore::virtualToIoFile)
            else -> null
        }' @ [70:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: File?, entry1: File?, entry2: File?): File?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> File?

'file' @ [70:28] ==> val file: VirtualFile defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[LocalVariableDescriptor]

'fileSystem' @ [70:33] ==> public final val VirtualFile.fileSystem: VirtualFileSystem[MyPropertyDescriptor]

'protocol' @ [70:44] ==> public final val VirtualFileSystem.protocol: String[MyPropertyDescriptor]

'FILE_PROTOCOL' @ [71:33] ==> public const final val FILE_PROTOCOL: String defined in com.intellij.openapi.vfs.StandardFileSystems[JavaPropertyDescriptor]

'virtualToIoFile' @ [71:62] ==> @NotNull public open fun virtualToIoFile(@NotNull p0: VirtualFile): File defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'file' @ [71:78] ==> val file: VirtualFile defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[LocalVariableDescriptor]

'JAR_PROTOCOL' @ [72:33] ==> public const final val JAR_PROTOCOL: String defined in com.intellij.openapi.vfs.StandardFileSystems[JavaPropertyDescriptor]

'getVirtualFileForJar' @ [72:61] ==> @Nullable public open fun getVirtualFileForJar(@Nullable p0: VirtualFile?): VirtualFile? defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'file' @ [72:82] ==> val file: VirtualFile defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[LocalVariableDescriptor]

'let' @ [72:89] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> File

'VfsUtilCore' @ [72:93] ==> public constructor VfsUtilCore() defined in com.intellij.openapi.vfs.VfsUtilCore[JavaClassConstructorDescriptor]

'ioFile' @ [75:16] ==> val ioFile: File? defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[LocalVariableDescriptor]

'get' @ [75:40] ==> public open fun get(p0: (URI..URI?)): (Path..Path?) defined in java.nio.file.Paths[JavaMethodDescriptor]

'ioFile' @ [75:44] ==> val ioFile: File? defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[LocalVariableDescriptor]

'toURI' @ [75:51] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'startsWith' @ [75:60] ==> public abstract fun startsWith(p0: (Path..Path?)): Boolean defined in java.nio.file.Path[JavaMethodDescriptor]

'get' @ [75:77] ==> public open fun get(p0: (URI..URI?)): (Path..Path?) defined in java.nio.file.Paths[JavaMethodDescriptor]

'outDirectory' @ [75:81] ==> value-parameter outDirectory: File? defined in org.jetbrains.kotlin.load.kotlin.isContainedByCompiledPartOfOurModule[ValueParameterDescriptorImpl]

'toURI' @ [75:94] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'when {
            descriptor is CallableMemberDescriptor && descriptor.source === SourceElement.NO_SOURCE ->
                getSourceElement(descriptor.containingDeclaration)
            descriptor is DeserializedTypeAliasDescriptor ->
                getSourceElement(descriptor.containingDeclaration)
            else ->
                descriptor.toSourceElement
        }' @ [82:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SourceElement, entry1: SourceElement, entry2: SourceElement): SourceElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SourceElement

'descriptor' @ [83:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.load.kotlin.getSourceElement[ValueParameterDescriptorImpl]

'descriptor' @ [83:55] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.load.kotlin.getSourceElement[ValueParameterDescriptorImpl]

'source' @ [83:66] ==> public final val CallableMemberDescriptor.source: SourceElement[MyPropertyDescriptor]

'NO_SOURCE' @ [83:91] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'getSourceElement' @ [84:17] ==> public fun getSourceElement(descriptor: DeclarationDescriptor): SourceElement defined in org.jetbrains.kotlin.load.kotlin in file moduleVisibilityUtils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [84:34] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.load.kotlin.getSourceElement[ValueParameterDescriptorImpl]

'containingDeclaration' @ [84:45] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptor' @ [85:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.load.kotlin.getSourceElement[ValueParameterDescriptorImpl]

'getSourceElement' @ [86:17] ==> public fun getSourceElement(descriptor: DeclarationDescriptor): SourceElement defined in org.jetbrains.kotlin.load.kotlin in file moduleVisibilityUtils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [86:34] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.load.kotlin.getSourceElement[ValueParameterDescriptorImpl]

'containingDeclaration' @ [86:45] ==> public final val DeserializedTypeAliasDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptor' @ [88:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.load.kotlin.getSourceElement[ValueParameterDescriptorImpl]

'toSourceElement' @ [88:28] ==> private val DeclarationDescriptor.toSourceElement: SourceElement defined in org.jetbrains.kotlin.load.kotlin in file moduleVisibilityUtils.kt[PropertyDescriptorImpl]

'if (this is DeclarationDescriptorWithSource) source else SourceElement.NO_SOURCE' @ [92:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SourceElement, elseBranch: SourceElement): SourceElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SourceElement

'this' @ [92:17] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.toSourceElement[ReceiverParameterDescriptorImpl]

'source' @ [92:58] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'NO_SOURCE' @ [92:84] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

