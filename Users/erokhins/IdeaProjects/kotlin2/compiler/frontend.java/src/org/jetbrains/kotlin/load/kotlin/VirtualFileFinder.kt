'findVirtualFileWithHeader' @ [31:20] ==> public abstract fun findVirtualFileWithHeader(classId: ClassId): VirtualFile? defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder[SimpleFunctionDescriptorImpl]

'classId' @ [31:46] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.findKotlinClass[ValueParameterDescriptorImpl]

'KotlinBinaryClassCache' @ [32:16] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.KotlinBinaryClassCache[FakeCallableDescriptorForObject]

'getKotlinBinaryClass' @ [32:39] ==> public final fun getKotlinBinaryClass(file: VirtualFile, fileContent: ByteArray? = ...): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.KotlinBinaryClassCache.Companion[SimpleFunctionDescriptorImpl]

'file' @ [32:60] ==> val file: VirtualFile defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.findKotlinClass[LocalVariableDescriptor]

'?:' @ [36:20] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: VirtualFile?, right: VirtualFile): VirtualFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> VirtualFile

'javaClass' @ [36:21] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.findKotlinClass[ValueParameterDescriptorImpl]

'virtualFile' @ [36:63] ==> public abstract val virtualFile: VirtualFile? defined in org.jetbrains.kotlin.load.java.structure.impl.VirtualFileBoundJavaClass[PropertyDescriptorImpl]

'javaClass' @ [38:13] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.findKotlinClass[ValueParameterDescriptorImpl]

'outerClass' @ [38:23] ==> public abstract val outerClass: JavaClass? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'file' @ [41:13] ==> var file: VirtualFile defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.findKotlinClass[LocalVariableDescriptor]

'file' @ [41:20] ==> var file: VirtualFile defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.findKotlinClass[LocalVariableDescriptor]

'parent' @ [41:25] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'findChild' @ [41:34] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'classFileName' @ [41:44] ==> private final fun classFileName(jClass: JavaClass): String defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder[SimpleFunctionDescriptorImpl]

'javaClass' @ [41:58] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.findKotlinClass[ValueParameterDescriptorImpl]

'sure' @ [41:81] ==> public inline fun <T : Any> VirtualFile?.sure(message: () -> String): VirtualFile defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> VirtualFile

'javaClass' @ [41:117] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.findKotlinClass[ValueParameterDescriptorImpl]

'KotlinBinaryClassCache' @ [44:16] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.KotlinBinaryClassCache[FakeCallableDescriptorForObject]

'getKotlinBinaryClass' @ [44:39] ==> public final fun getKotlinBinaryClass(file: VirtualFile, fileContent: ByteArray? = ...): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.KotlinBinaryClassCache.Companion[SimpleFunctionDescriptorImpl]

'file' @ [44:60] ==> var file: VirtualFile defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.findKotlinClass[LocalVariableDescriptor]

'jClass' @ [48:26] ==> value-parameter jClass: JavaClass defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.classFileName[ValueParameterDescriptorImpl]

'name' @ [48:33] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'asString' @ [48:38] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'jClass' @ [49:26] ==> value-parameter jClass: JavaClass defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.classFileName[ValueParameterDescriptorImpl]

'outerClass' @ [49:33] ==> public abstract val outerClass: JavaClass? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'simpleName' @ [49:54] ==> val simpleName: String defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.classFileName[LocalVariableDescriptor]

'classFileName' @ [50:16] ==> private final fun classFileName(jClass: JavaClass): String defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder[SimpleFunctionDescriptorImpl]

'outerClass' @ [50:30] ==> val outerClass: JavaClass defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.classFileName[LocalVariableDescriptor]

'simpleName' @ [50:50] ==> val simpleName: String defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.classFileName[LocalVariableDescriptor]

'VirtualFileFinderFactory' @ [55:17] ==> public companion object SERVICE defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinderFactory[FakeCallableDescriptorForObject]

'getInstance' @ [55:42] ==> public final fun getInstance(project: Project): VirtualFileFinderFactory defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinderFactory.SERVICE[SimpleFunctionDescriptorImpl]

'project' @ [55:54] ==> value-parameter project: Project defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.SERVICE.getInstance[ValueParameterDescriptorImpl]

'create' @ [55:63] ==> public abstract fun create(scope: GlobalSearchScope): VirtualFileFinder defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinderFactory[SimpleFunctionDescriptorImpl]

'allScope' @ [55:88] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [55:97] ==> value-parameter project: Project defined in org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.SERVICE.getInstance[ValueParameterDescriptorImpl]

