'VirtualFileFinder' @ [30:68] ==> public constructor VirtualFileFinder() defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder[DeserializedClassConstructorDescriptor]

'findVirtualFileWithHeader' @ [32:20] ==> private final fun findVirtualFileWithHeader(classId: ClassId, key: ID<FqName, Void>): VirtualFile? defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder[SimpleFunctionDescriptorImpl]

'classId' @ [32:46] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder.findMetadata[ValueParameterDescriptorImpl]

'KEY' @ [32:79] ==> public final val KEY: ID<FqName, Void> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndex[PropertyDescriptorImpl]

'file' @ [35:13] ==> val file: VirtualFile defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder.findMetadata[LocalVariableDescriptor]

'inputStream' @ [35:18] ==> public final val VirtualFile.inputStream: (InputStream..InputStream?)[MyPropertyDescriptor]

'KotlinMetadataFilePackageIndex' @ [42:64] ==> public object KotlinMetadataFilePackageIndex : KotlinMetadataFileIndexBase<KotlinMetadataFilePackageIndex> defined in org.jetbrains.kotlin.idea.vfilefinder in file fileIndexes.kt[FakeCallableDescriptorForObject]

'hasSomethingInPackage' @ [42:95] ==> public fun <T> KotlinFileIndexBase<KotlinMetadataFilePackageIndex>.hasSomethingInPackage(fqName: FqName, scope: GlobalSearchScope): Boolean defined in org.jetbrains.kotlin.idea.vfilefinder[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> KotlinMetadataFilePackageIndex

'fqName' @ [42:117] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder.hasMetadataPackage[ValueParameterDescriptorImpl]

'scope' @ [42:125] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder[PropertyDescriptorImpl]

'scope' @ [48:13] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder[PropertyDescriptorImpl]

'EMPTY_SCOPE' @ [48:40] ==> public final val EMPTY_SCOPE: (GlobalSearchScope..GlobalSearchScope?) defined in com.intellij.psi.search.GlobalSearchScope[JavaPropertyDescriptor]

'scope' @ [48:55] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder[PropertyDescriptorImpl]

'project' @ [48:61] ==> public final val GlobalSearchScope.project: Project?[MyPropertyDescriptor]

'LOG' @ [49:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder.Companion[PropertyDescriptorImpl]

'warn' @ [49:17] ==> public open fun warn(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'scope' @ [49:48] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder[PropertyDescriptorImpl]

'findVirtualFileWithHeader' @ [54:13] ==> private final fun findVirtualFileWithHeader(classId: ClassId, key: ID<FqName, Void>): VirtualFile? defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder[SimpleFunctionDescriptorImpl]

'classId' @ [54:39] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder.findVirtualFileWithHeader[ValueParameterDescriptorImpl]

'KEY' @ [54:69] ==> public final val KEY: ID<FqName, Void> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinClassFileIndex[PropertyDescriptorImpl]

'getInstance' @ [57:36] ==> public open fun getInstance(): (FileBasedIndex..FileBasedIndex?) defined in com.intellij.util.indexing.FileBasedIndex[JavaMethodDescriptor]

'getContainingFiles' @ [57:50] ==> @NotNull public abstract fun <K : (Any..Any?), V : (Any..Any?)> getContainingFiles(@NotNull p0: ID<(FqName..FqName?), (Void..Void?)>, @NotNull p1: FqName, @NotNull p2: GlobalSearchScope): (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>) defined in com.intellij.util.indexing.FileBasedIndex[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> FqName
    <V : (Any..Any?)> -> Void

'key' @ [57:83] ==> value-parameter key: ID<FqName, Void> defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder.findVirtualFileWithHeader[ValueParameterDescriptorImpl]

'classId' @ [57:88] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder.findVirtualFileWithHeader[ValueParameterDescriptorImpl]

'asSingleFqName' @ [57:96] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'scope' @ [57:114] ==> private final val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder[PropertyDescriptorImpl]

'files' @ [58:13] ==> val files: (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>) defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder.findVirtualFileWithHeader[LocalVariableDescriptor]

'size' @ [58:19] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'LOG' @ [59:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder.Companion[PropertyDescriptorImpl]

'warn' @ [59:17] ==> public open fun warn(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'files' @ [59:35] ==> val files: (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>) defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder.findVirtualFileWithHeader[LocalVariableDescriptor]

'size' @ [59:41] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'classId' @ [59:74] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder.findVirtualFileWithHeader[ValueParameterDescriptorImpl]

'files' @ [61:16] ==> val files: (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>) defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder.findVirtualFileWithHeader[LocalVariableDescriptor]

'firstOrNull' @ [61:22] ==> public fun <T> Iterable<(VirtualFile..VirtualFile?)>.firstOrNull(): VirtualFile? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'getInstance' @ [65:34] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'IDEVirtualFileFinder' @ [65:46] ==> public companion object defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder[FakeCallableDescriptorForObject]

'java' @ [65:74] ==> public val <T> KClass<IDEVirtualFileFinder>.java: Class<IDEVirtualFileFinder> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IDEVirtualFileFinder

