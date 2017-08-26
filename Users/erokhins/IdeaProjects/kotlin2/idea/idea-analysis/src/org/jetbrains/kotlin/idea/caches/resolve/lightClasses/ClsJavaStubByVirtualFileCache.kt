'createConcurrentWeakKeySoftValueMap' @ [34:39] ==> @NotNull @Contract public open fun <K : (Any..Any?), V : (Any..Any?)> createConcurrentWeakKeySoftValueMap(): ConcurrentMap<(VirtualFile..VirtualFile?), (ClsJavaStubByVirtualFileCache.CachedJavaStub..ClsJavaStubByVirtualFileCache.CachedJavaStub?)> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> VirtualFile
    <V : (Any..Any?)> -> CachedJavaStub

'cache' @ [37:22] ==> private final val cache: ConcurrentMap<(VirtualFile..VirtualFile?), (ClsJavaStubByVirtualFileCache.CachedJavaStub..ClsJavaStubByVirtualFileCache.CachedJavaStub?)> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache[PropertyDescriptorImpl]

'get' @ [37:28] ==> public abstract fun get(key: (VirtualFile..VirtualFile?)): ClsJavaStubByVirtualFileCache.CachedJavaStub? defined in java.util.concurrent.ConcurrentMap[DeserializedSimpleFunctionDescriptor]

'classFile' @ [37:32] ==> value-parameter classFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.get[ValueParameterDescriptorImpl]

'classFile' @ [38:37] ==> value-parameter classFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.get[ValueParameterDescriptorImpl]

'modificationStamp' @ [38:47] ==> public final val VirtualFile.modificationStamp: Long[MyPropertyDescriptor]

'cached' @ [39:13] ==> val cached: ClsJavaStubByVirtualFileCache.CachedJavaStub? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.get[LocalVariableDescriptor]

'cached' @ [39:31] ==> val cached: ClsJavaStubByVirtualFileCache.CachedJavaStub? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.get[LocalVariableDescriptor]

'modificationStamp' @ [39:38] ==> public final val modificationStamp: Long defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.CachedJavaStub[PropertyDescriptorImpl]

'fileModificationStamp' @ [39:59] ==> val fileModificationStamp: Long defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.get[LocalVariableDescriptor]

'cached' @ [40:20] ==> val cached: ClsJavaStubByVirtualFileCache.CachedJavaStub? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.get[LocalVariableDescriptor]

'javaFileStub' @ [40:27] ==> public final val javaFileStub: PsiJavaFileStubImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.CachedJavaStub[PropertyDescriptorImpl]

'createStub' @ [42:20] ==> private final fun createStub(file: VirtualFile): PsiJavaFileStub? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache[SimpleFunctionDescriptorImpl]

'classFile' @ [42:31] ==> value-parameter classFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.get[ValueParameterDescriptorImpl]

'cache' @ [43:9] ==> private final val cache: ConcurrentMap<(VirtualFile..VirtualFile?), (ClsJavaStubByVirtualFileCache.CachedJavaStub..ClsJavaStubByVirtualFileCache.CachedJavaStub?)> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache[PropertyDescriptorImpl]

'put' @ [43:15] ==> public abstract fun put(key: (VirtualFile..VirtualFile?), value: (ClsJavaStubByVirtualFileCache.CachedJavaStub..ClsJavaStubByVirtualFileCache.CachedJavaStub?)): ClsJavaStubByVirtualFileCache.CachedJavaStub? defined in java.util.concurrent.ConcurrentMap[DeserializedSimpleFunctionDescriptor]

'classFile' @ [43:19] ==> value-parameter classFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.get[ValueParameterDescriptorImpl]

'CachedJavaStub' @ [43:30] ==> public constructor CachedJavaStub(modificationStamp: Long, javaFileStub: PsiJavaFileStubImpl) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.CachedJavaStub[ClassConstructorDescriptorImpl]

'fileModificationStamp' @ [43:45] ==> val fileModificationStamp: Long defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.get[LocalVariableDescriptor]

'stub' @ [43:68] ==> val stub: PsiJavaFileStubImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.get[LocalVariableDescriptor]

'stub' @ [44:16] ==> val stub: PsiJavaFileStubImpl defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.get[LocalVariableDescriptor]

'file' @ [48:13] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.createStub[ValueParameterDescriptorImpl]

'fileType' @ [48:18] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'INSTANCE' @ [48:49] ==> public final val INSTANCE: (JavaClassFileType..JavaClassFileType?) defined in com.intellij.ide.highlighter.JavaClassFileType[JavaPropertyDescriptor]

'buildFileStub' @ [51:32] ==> @Nullable public open fun buildFileStub(@NotNull p0: VirtualFile, @NotNull p1: ByteArray): PsiJavaFileStub? defined in com.intellij.psi.impl.compiled.ClsFileImpl[JavaMethodDescriptor]

'file' @ [51:46] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.createStub[ValueParameterDescriptorImpl]

'file' @ [51:52] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.createStub[ValueParameterDescriptorImpl]

'contentsToByteArray' @ [51:57] ==> @NotNull public open fun contentsToByteArray(p0: Boolean): ByteArray defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'LOG' @ [54:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.Companion[PropertyDescriptorImpl]

'error' @ [54:17] ==> public open fun error(@NonNls p0: (String..String?), @Nullable p1: Throwable?): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [54:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'file' @ [54:63] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.createStub[ValueParameterDescriptorImpl]

'canonicalPath' @ [54:68] ==> public final val VirtualFile.canonicalPath: String?[MyPropertyDescriptor]

'e' @ [54:85] ==> val e: ClsFormatException defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.createStub[LocalVariableDescriptor]

'LOG' @ [57:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.Companion[PropertyDescriptorImpl]

'error' @ [57:17] ==> public open fun error(@NonNls p0: (String..String?), @Nullable p1: Throwable?): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [57:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'file' @ [57:63] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.createStub[ValueParameterDescriptorImpl]

'canonicalPath' @ [57:68] ==> public final val VirtualFile.canonicalPath: String?[MyPropertyDescriptor]

'e' @ [57:85] ==> val e: IOException defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.createStub[LocalVariableDescriptor]

'getInstance' @ [64:34] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'ClsJavaStubByVirtualFileCache' @ [64:46] ==> public companion object defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache[FakeCallableDescriptorForObject]

'java' @ [64:83] ==> public val <T> KClass<ClsJavaStubByVirtualFileCache>.java: Class<ClsJavaStubByVirtualFileCache> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ClsJavaStubByVirtualFileCache

'getService' @ [67:35] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(ClsJavaStubByVirtualFileCache..ClsJavaStubByVirtualFileCache?)>): (ClsJavaStubByVirtualFileCache..ClsJavaStubByVirtualFileCache?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ClsJavaStubByVirtualFileCache

'project' @ [67:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache.Companion.getInstance[ValueParameterDescriptorImpl]

'ClsJavaStubByVirtualFileCache' @ [67:55] ==> public companion object defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.ClsJavaStubByVirtualFileCache[FakeCallableDescriptorForObject]

'java' @ [67:92] ==> public val <T> KClass<ClsJavaStubByVirtualFileCache>.java: Class<ClsJavaStubByVirtualFileCache> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ClsJavaStubByVirtualFileCache

