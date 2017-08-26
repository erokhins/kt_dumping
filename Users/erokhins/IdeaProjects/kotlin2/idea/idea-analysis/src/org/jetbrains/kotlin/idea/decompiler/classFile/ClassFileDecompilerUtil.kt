'apply' @ [32:69] ==> @InlineOnly public inline fun <T> String.apply(block: String.() -> Unit): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'getService' @ [33:20] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Class<(FileAttributeService..FileAttributeService?)>): (FileAttributeService..FileAttributeService?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FileAttributeService

'java' @ [33:59] ==> public val <T> KClass<FileAttributeService>.java: Class<FileAttributeService> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FileAttributeService

'register' @ [33:66] ==> public open fun register(id: String, version: Int, fixedSize: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.caches.FileAttributeService[SimpleFunctionDescriptorImpl]

'this' @ [33:75] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.classFile.KOTLIN_COMPILED_FILE_ATTRIBUTE.<anonymous>[ReceiverParameterDescriptorImpl]

'create' @ [36:15] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(IsKotlinBinary..IsKotlinBinary?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> IsKotlinBinary

'KOTLIN_COMPILED_FILE_ATTRIBUTE' @ [36:38] ==> public val KOTLIN_COMPILED_FILE_ATTRIBUTE: String defined in org.jetbrains.kotlin.idea.decompiler.classFile in file ClassFileDecompilerUtil.kt[PropertyDescriptorImpl]

'!' @ [42:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'IDEKotlinBinaryClassCache' @ [42:10] ==> public object IDEKotlinBinaryClassCache defined in org.jetbrains.kotlin.idea.caches in file IDEKotlinBinaryClassCache.kt[FakeCallableDescriptorForObject]

'isKotlinJvmCompiledFile' @ [42:36] ==> public final fun isKotlinJvmCompiledFile(file: VirtualFile, fileContent: ByteArray? = ...): Boolean defined in org.jetbrains.kotlin.idea.caches.IDEKotlinBinaryClassCache[SimpleFunctionDescriptorImpl]

'file' @ [42:60] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.isKotlinWithCompatibleAbiVersion[ValueParameterDescriptorImpl]

'IDEKotlinBinaryClassCache' @ [44:23] ==> public object IDEKotlinBinaryClassCache defined in org.jetbrains.kotlin.idea.caches in file IDEKotlinBinaryClassCache.kt[FakeCallableDescriptorForObject]

'getKotlinBinaryClassHeaderData' @ [44:49] ==> public final fun getKotlinBinaryClassHeaderData(file: VirtualFile, fileContent: ByteArray? = ...): IDEKotlinBinaryClassCache.KotlinBinaryHeaderData? defined in org.jetbrains.kotlin.idea.caches.IDEKotlinBinaryClassCache[SimpleFunctionDescriptorImpl]

'file' @ [44:80] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.isKotlinWithCompatibleAbiVersion[ValueParameterDescriptorImpl]

'kotlinClass' @ [45:12] ==> val kotlinClass: IDEKotlinBinaryClassCache.KotlinBinaryHeaderData? defined in org.jetbrains.kotlin.idea.decompiler.classFile.isKotlinWithCompatibleAbiVersion[LocalVariableDescriptor]

'kotlinClass' @ [45:35] ==> val kotlinClass: IDEKotlinBinaryClassCache.KotlinBinaryHeaderData? defined in org.jetbrains.kotlin.idea.decompiler.classFile.isKotlinWithCompatibleAbiVersion[LocalVariableDescriptor]

'classHeader' @ [45:47] ==> public final val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.idea.caches.IDEKotlinBinaryClassCache.KotlinBinaryHeaderData[PropertyDescriptorImpl]

'metadataVersion' @ [45:59] ==> public final val metadataVersion: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'isCompatible' @ [45:75] ==> public open fun isCompatible(): Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[DeserializedSimpleFunctionDescriptor]

'!' @ [53:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'IDEKotlinBinaryClassCache' @ [53:10] ==> public object IDEKotlinBinaryClassCache defined in org.jetbrains.kotlin.idea.caches in file IDEKotlinBinaryClassCache.kt[FakeCallableDescriptorForObject]

'isKotlinJvmCompiledFile' @ [53:36] ==> public final fun isKotlinJvmCompiledFile(file: VirtualFile, fileContent: ByteArray? = ...): Boolean defined in org.jetbrains.kotlin.idea.caches.IDEKotlinBinaryClassCache[SimpleFunctionDescriptorImpl]

'file' @ [53:60] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.isKotlinInternalCompiledFile[ValueParameterDescriptorImpl]

'fileContent' @ [53:66] ==> value-parameter fileContent: ByteArray? = ... defined in org.jetbrains.kotlin.idea.decompiler.classFile.isKotlinInternalCompiledFile[ValueParameterDescriptorImpl]

'if (fileContent == null)
                ClassFileViewProvider.isInnerClass(file)
            else
                ClassFileViewProvider.isInnerClass(file, fileContent)' @ [58:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'fileContent' @ [58:17] ==> value-parameter fileContent: ByteArray? = ... defined in org.jetbrains.kotlin.idea.decompiler.classFile.isKotlinInternalCompiledFile[ValueParameterDescriptorImpl]

'isInnerClass' @ [59:39] ==> public open fun isInnerClass(@NotNull p0: VirtualFile): Boolean defined in com.intellij.psi.ClassFileViewProvider[JavaMethodDescriptor]

'file' @ [59:52] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.isKotlinInternalCompiledFile[ValueParameterDescriptorImpl]

'isInnerClass' @ [61:39] ==> public open fun isInnerClass(@NotNull p0: VirtualFile, @NotNull p1: ByteArray): Boolean defined in com.intellij.psi.ClassFileViewProvider[JavaMethodDescriptor]

'file' @ [61:52] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.isKotlinInternalCompiledFile[ValueParameterDescriptorImpl]

'fileContent' @ [61:58] ==> value-parameter fileContent: ByteArray? = ... defined in org.jetbrains.kotlin.idea.decompiler.classFile.isKotlinInternalCompiledFile[ValueParameterDescriptorImpl]

'innerClass' @ [63:9] ==> val innerClass: Boolean defined in org.jetbrains.kotlin.idea.decompiler.classFile.isKotlinInternalCompiledFile[LocalVariableDescriptor]

'component1' @ [67:10] ==> public final operator fun component1(): KotlinClassHeader defined in org.jetbrains.kotlin.idea.caches.IDEKotlinBinaryClassCache.KotlinBinaryHeaderData[SimpleFunctionDescriptorImpl]

'component2' @ [67:18] ==> public final operator fun component2(): ClassId defined in org.jetbrains.kotlin.idea.caches.IDEKotlinBinaryClassCache.KotlinBinaryHeaderData[SimpleFunctionDescriptorImpl]

'IDEKotlinBinaryClassCache' @ [67:29] ==> public object IDEKotlinBinaryClassCache defined in org.jetbrains.kotlin.idea.caches in file IDEKotlinBinaryClassCache.kt[FakeCallableDescriptorForObject]

'getKotlinBinaryClassHeaderData' @ [67:55] ==> public final fun getKotlinBinaryClassHeaderData(file: VirtualFile, fileContent: ByteArray? = ...): IDEKotlinBinaryClassCache.KotlinBinaryHeaderData? defined in org.jetbrains.kotlin.idea.caches.IDEKotlinBinaryClassCache[SimpleFunctionDescriptorImpl]

'file' @ [67:86] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.isKotlinInternalCompiledFile[ValueParameterDescriptorImpl]

'fileContent' @ [67:92] ==> value-parameter fileContent: ByteArray? = ... defined in org.jetbrains.kotlin.idea.decompiler.classFile.isKotlinInternalCompiledFile[ValueParameterDescriptorImpl]

'classId' @ [68:9] ==> val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.classFile.isKotlinInternalCompiledFile[LocalVariableDescriptor]

'isLocal' @ [68:17] ==> public final val ClassId.isLocal: Boolean[MyPropertyDescriptor]

'header' @ [70:12] ==> val header: KotlinClassHeader defined in org.jetbrains.kotlin.idea.decompiler.classFile.isKotlinInternalCompiledFile[LocalVariableDescriptor]

'kind' @ [70:19] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'SYNTHETIC_CLASS' @ [70:50] ==> enum entry SYNTHETIC_CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'header' @ [71:12] ==> val header: KotlinClassHeader defined in org.jetbrains.kotlin.idea.decompiler.classFile.isKotlinInternalCompiledFile[LocalVariableDescriptor]

'kind' @ [71:19] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'MULTIFILE_CLASS_PART' @ [71:50] ==> enum entry MULTIFILE_CLASS_PART defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'classId' @ [75:25] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.classFile.findMultifileClassParts[ValueParameterDescriptorImpl]

'packageFqName' @ [75:33] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'DirectoryBasedClassFinder' @ [76:23] ==> public constructor DirectoryBasedClassFinder(packageDirectory: VirtualFile, directoryPackageFqName: FqName) defined in org.jetbrains.kotlin.idea.decompiler.classFile.DirectoryBasedClassFinder[ClassConstructorDescriptorImpl]

'file' @ [76:49] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.findMultifileClassParts[ValueParameterDescriptorImpl]

'parent' @ [76:54] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'packageFqName' @ [76:64] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.classFile.findMultifileClassParts[LocalVariableDescriptor]

'header' @ [77:21] ==> value-parameter header: KotlinClassHeader defined in org.jetbrains.kotlin.idea.decompiler.classFile.findMultifileClassParts[ValueParameterDescriptorImpl]

'data' @ [77:28] ==> public final val data: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'emptyList' @ [77:43] ==> public fun <T> emptyList(): List<KotlinJvmBinaryClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinJvmBinaryClass

'partNames' @ [78:12] ==> val partNames: Array<String> defined in org.jetbrains.kotlin.idea.decompiler.classFile.findMultifileClassParts[LocalVariableDescriptor]

'mapNotNull' @ [78:22] ==> public inline fun <T, R : Any> Array<out String>.mapNotNull(transform: (String) -> KotlinJvmBinaryClass?): List<KotlinJvmBinaryClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Any> -> KotlinJvmBinaryClass

'partsFinder' @ [79:9] ==> val partsFinder: DirectoryBasedClassFinder defined in org.jetbrains.kotlin.idea.decompiler.classFile.findMultifileClassParts[LocalVariableDescriptor]

'findKotlinClass' @ [79:21] ==> public open fun findKotlinClass(classId: ClassId): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.idea.decompiler.classFile.DirectoryBasedClassFinder[SimpleFunctionDescriptorImpl]

'ClassId' @ [79:37] ==> public constructor ClassId(@NotNull p0: FqName, @NotNull p1: Name) defined in org.jetbrains.kotlin.name.ClassId[JavaClassConstructorDescriptor]

'packageFqName' @ [79:45] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.classFile.findMultifileClassParts[LocalVariableDescriptor]

'identifier' @ [79:65] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [79:76] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.decompiler.classFile.findMultifileClassParts.<anonymous>[ValueParameterDescriptorImpl]

'substringAfterLast' @ [79:79] ==> public fun String.substringAfterLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

