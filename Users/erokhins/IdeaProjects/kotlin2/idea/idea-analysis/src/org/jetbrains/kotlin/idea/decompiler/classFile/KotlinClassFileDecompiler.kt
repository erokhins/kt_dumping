'ClassFileDecompilers.Full' @ [42:35] ==> public constructor Full() defined in com.intellij.psi.compiled.ClassFileDecompilers.Full[JavaClassConstructorDescriptor]

'KotlinClsStubBuilder' @ [43:31] ==> public constructor KotlinClsStubBuilder() defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClsStubBuilder[ClassConstructorDescriptorImpl]

'IDEKotlinBinaryClassCache' @ [45:47] ==> public object IDEKotlinBinaryClassCache defined in org.jetbrains.kotlin.idea.caches in file IDEKotlinBinaryClassCache.kt[FakeCallableDescriptorForObject]

'isKotlinJvmCompiledFile' @ [45:73] ==> public final fun isKotlinJvmCompiledFile(file: VirtualFile, fileContent: ByteArray? = ...): Boolean defined in org.jetbrains.kotlin.idea.caches.IDEKotlinBinaryClassCache[SimpleFunctionDescriptorImpl]

'file' @ [45:97] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClassFileDecompiler.accepts[ValueParameterDescriptorImpl]

'stubBuilder' @ [47:37] ==> private final val stubBuilder: KotlinClsStubBuilder defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClassFileDecompiler[PropertyDescriptorImpl]

'manager' @ [50:23] ==> value-parameter manager: PsiManager defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClassFileDecompiler.createFileViewProvider[ValueParameterDescriptorImpl]

'project' @ [50:31] ==> public final val PsiManager.project: Project[MyPropertyDescriptor]

'KotlinDecompiledFileViewProvider' @ [51:16] ==> public constructor KotlinDecompiledFileViewProvider(manager: PsiManager, file: VirtualFile, physical: Boolean, factory: (KotlinDecompiledFileViewProvider) -> KtDecompiledFile?) defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider[ClassConstructorDescriptorImpl]

'manager' @ [51:49] ==> value-parameter manager: PsiManager defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClassFileDecompiler.createFileViewProvider[ValueParameterDescriptorImpl]

'file' @ [51:58] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClassFileDecompiler.createFileViewProvider[ValueParameterDescriptorImpl]

'physical' @ [51:64] ==> value-parameter physical: Boolean defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClassFileDecompiler.createFileViewProvider[ValueParameterDescriptorImpl]

'provider' @ [52:31] ==> value-parameter provider: KotlinDecompiledFileViewProvider defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClassFileDecompiler.createFileViewProvider.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [52:40] ==> public final val KotlinDecompiledFileViewProvider.virtualFile: VirtualFile[MyPropertyDescriptor]

'getService' @ [53:44] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(FileIndexFacade..FileIndexFacade?)>): (FileIndexFacade..FileIndexFacade?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FileIndexFacade

'project' @ [53:55] ==> val project: Project defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClassFileDecompiler.createFileViewProvider[LocalVariableDescriptor]

'FileIndexFacade' @ [53:64] ==> protected/*protected and package*/ constructor FileIndexFacade(p0: (Project..Project?)) defined in com.intellij.openapi.roots.FileIndexFacade[JavaClassConstructorDescriptor]

'java' @ [53:87] ==> public val <T> KClass<FileIndexFacade>.java: Class<FileIndexFacade> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FileIndexFacade

'!' @ [54:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'fileIndex' @ [54:18] ==> val fileIndex: (FileIndexFacade..FileIndexFacade?) defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClassFileDecompiler.createFileViewProvider.<anonymous>[LocalVariableDescriptor]

'isInLibraryClasses' @ [54:28] ==> public abstract fun isInLibraryClasses(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.FileIndexFacade[JavaMethodDescriptor]

'virtualFile' @ [54:47] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClassFileDecompiler.createFileViewProvider.<anonymous>[LocalVariableDescriptor]

'fileIndex' @ [54:63] ==> val fileIndex: (FileIndexFacade..FileIndexFacade?) defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClassFileDecompiler.createFileViewProvider.<anonymous>[LocalVariableDescriptor]

'isInSource' @ [54:73] ==> public abstract fun isInSource(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.FileIndexFacade[JavaMethodDescriptor]

'virtualFile' @ [54:84] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClassFileDecompiler.createFileViewProvider.<anonymous>[LocalVariableDescriptor]

'if (isKotlinInternalCompiledFile(virtualFile))
                null
            else
                KtClsFile(provider)' @ [56:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtDecompiledFile?, elseBranch: KtDecompiledFile?): KtDecompiledFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtDecompiledFile?

'isKotlinInternalCompiledFile' @ [56:17] ==> public fun isKotlinInternalCompiledFile(file: VirtualFile, fileContent: ByteArray? = ...): Boolean defined in org.jetbrains.kotlin.idea.decompiler.classFile in file ClassFileDecompilerUtil.kt[SimpleFunctionDescriptorImpl]

'virtualFile' @ [56:46] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClassFileDecompiler.createFileViewProvider.<anonymous>[LocalVariableDescriptor]

'KtClsFile' @ [59:17] ==> public constructor KtClsFile(provider: KotlinDecompiledFileViewProvider) defined in org.jetbrains.kotlin.idea.decompiler.classFile.KtClsFile[ClassConstructorDescriptorImpl]

'provider' @ [59:27] ==> value-parameter provider: KotlinDecompiledFileViewProvider defined in org.jetbrains.kotlin.idea.decompiler.classFile.KotlinClassFileDecompiler.createFileViewProvider.<anonymous>[ValueParameterDescriptorImpl]

'KtDecompiledFile' @ [64:63] ==> public constructor KtDecompiledFile(provider: KotlinDecompiledFileViewProvider, buildDecompiledText: (VirtualFile) -> DecompiledText) defined in org.jetbrains.kotlin.idea.decompiler.KtDecompiledFile[ClassConstructorDescriptorImpl]

'provider' @ [64:80] ==> value-parameter provider: KotlinDecompiledFileViewProvider defined in org.jetbrains.kotlin.idea.decompiler.classFile.KtClsFile.<init>[ValueParameterDescriptorImpl]

'buildDecompiledTextForClassFile' @ [64:100] ==> public fun buildDecompiledTextForClassFile(classFile: VirtualFile, resolver: ResolverForDecompiler = ...): DecompiledText defined in org.jetbrains.kotlin.idea.decompiler.classFile in file KotlinClassFileDecompiler.kt[SimpleFunctionDescriptorImpl]

'file' @ [64:132] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.KtClsFile.<init>.<anonymous>[ValueParameterDescriptorImpl]

'DescriptorRenderer' @ [66:47] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [66:66] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'defaultDecompilerRendererOptions' @ [67:5] ==> public fun DescriptorRendererOptions.defaultDecompilerRendererOptions(): Unit defined in org.jetbrains.kotlin.idea.decompiler.textBuilder in file buildDecompiledText.kt[SimpleFunctionDescriptorImpl]

'typeNormalizer' @ [68:5] ==> public abstract var typeNormalizer: (KotlinType) -> KotlinType defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'if (type.isFlexible()) type.asFlexibleType().lowerBound else type' @ [68:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'type' @ [68:36] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.decompiler.classFile.decompilerRendererForClassFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isFlexible' @ [68:41] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'type' @ [68:55] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.decompiler.classFile.decompilerRendererForClassFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'asFlexibleType' @ [68:60] ==> public fun KotlinType.asFlexibleType(): FlexibleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'lowerBound' @ [68:77] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'type' @ [68:93] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.decompiler.classFile.decompilerRendererForClassFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'DeserializerForClassfileDecompiler' @ [73:43] ==> public fun DeserializerForClassfileDecompiler(classFile: VirtualFile): DeserializerForClassfileDecompiler defined in org.jetbrains.kotlin.idea.decompiler.classFile in file DeserializerForClassfileDecompiler.kt[SimpleFunctionDescriptorImpl]

'classFile' @ [73:78] ==> value-parameter classFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[ValueParameterDescriptorImpl]

'component1' @ [75:10] ==> public final operator fun component1(): KotlinClassHeader defined in org.jetbrains.kotlin.idea.caches.IDEKotlinBinaryClassCache.KotlinBinaryHeaderData[SimpleFunctionDescriptorImpl]

'component2' @ [75:23] ==> public final operator fun component2(): ClassId defined in org.jetbrains.kotlin.idea.caches.IDEKotlinBinaryClassCache.KotlinBinaryHeaderData[SimpleFunctionDescriptorImpl]

'IDEKotlinBinaryClassCache' @ [75:34] ==> public object IDEKotlinBinaryClassCache defined in org.jetbrains.kotlin.idea.caches in file IDEKotlinBinaryClassCache.kt[FakeCallableDescriptorForObject]

'getKotlinBinaryClassHeaderData' @ [75:60] ==> public final fun getKotlinBinaryClassHeaderData(file: VirtualFile, fileContent: ByteArray? = ...): IDEKotlinBinaryClassCache.KotlinBinaryHeaderData? defined in org.jetbrains.kotlin.idea.caches.IDEKotlinBinaryClassCache[SimpleFunctionDescriptorImpl]

'classFile' @ [75:91] ==> value-parameter classFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[ValueParameterDescriptorImpl]

'error' @ [76:37] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [76:43] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'classFile' @ [76:116] ==> value-parameter classFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[ValueParameterDescriptorImpl]

'!' @ [78:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classHeader' @ [78:10] ==> val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[LocalVariableDescriptor]

'metadataVersion' @ [78:22] ==> public final val metadataVersion: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'isCompatible' @ [78:38] ==> public open fun isCompatible(): Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[DeserializedSimpleFunctionDescriptor]

'createIncompatibleAbiVersionDecompiledText' @ [79:16] ==> public fun <V : BinaryVersion> createIncompatibleAbiVersionDecompiledText(expectedVersion: JvmMetadataVersion, actualVersion: JvmMetadataVersion): DecompiledText defined in org.jetbrains.kotlin.idea.decompiler.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : BinaryVersion> -> JvmMetadataVersion

'JvmMetadataVersion' @ [79:59] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[FakeCallableDescriptorForObject]

'INSTANCE' @ [79:78] ==> @field:JvmField public final val INSTANCE: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion.Companion[DeserializedPropertyDescriptor]

'classHeader' @ [79:88] ==> val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[LocalVariableDescriptor]

'metadataVersion' @ [79:100] ==> public final val metadataVersion: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'buildDecompiledText' @ [83:13] ==> public fun buildDecompiledText(packageFqName: FqName, descriptors: List<DeclarationDescriptor>, descriptorRenderer: DescriptorRenderer, indexers: Collection<DecompiledTextIndexer<*>> = ...): DecompiledText defined in org.jetbrains.kotlin.idea.decompiler.textBuilder[SimpleFunctionDescriptorImpl]

'classId' @ [83:33] ==> val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[LocalVariableDescriptor]

'packageFqName' @ [83:41] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'declarations' @ [83:56] ==> value-parameter declarations: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile.buildText[ValueParameterDescriptorImpl]

'decompilerRendererForClassFiles' @ [83:70] ==> private val decompilerRendererForClassFiles: DescriptorRenderer defined in org.jetbrains.kotlin.idea.decompiler.classFile in file KotlinClassFileDecompiler.kt[PropertyDescriptorImpl]

'listOf' @ [83:103] ==> public fun <T> listOf(vararg elements: DecompiledTextIndexer<Any>): List<DecompiledTextIndexer<Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DecompiledTextIndexer<Any>

'ByDescriptorIndexer' @ [83:110] ==> public object ByDescriptorIndexer : DecompiledTextIndexer<String> defined in org.jetbrains.kotlin.idea.decompiler.navigation in file findDecompiledDeclaration.kt[FakeCallableDescriptorForObject]

'BySignatureIndexer' @ [83:131] ==> public val BySignatureIndexer: DecompiledTextIndexer<*> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses in file LightMemberOriginForCompiledElement.kt[PropertyDescriptorImpl]

'when (classHeader.kind) {
        KotlinClassHeader.Kind.FILE_FACADE ->
            buildText(resolver.resolveDeclarationsInFacade(classId.asSingleFqName()))
        KotlinClassHeader.Kind.CLASS -> {
            buildText(listOfNotNull(resolver.resolveTopLevelClass(classId)))
        }
        KotlinClassHeader.Kind.MULTIFILE_CLASS -> {
            val partClasses = findMultifileClassParts(classFile, classId, classHeader)
            val partMembers = partClasses.flatMap { partClass ->
                resolver.resolveDeclarationsInFacade(partClass.classId.asSingleFqName())
            }
            buildText(partMembers)
        }
        else ->
            throw UnsupportedOperationException("Unknown header kind: $classHeader, class $classId")
    }' @ [85:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DecompiledText, entry1: DecompiledText, entry2: DecompiledText, entry3: DecompiledText): DecompiledText[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DecompiledText

'classHeader' @ [85:18] ==> val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[LocalVariableDescriptor]

'kind' @ [85:30] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'FILE_FACADE' @ [86:32] ==> enum entry FILE_FACADE defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'buildText' @ [87:13] ==> local final fun buildText(declarations: List<DeclarationDescriptor>): DecompiledText defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[SimpleFunctionDescriptorImpl]

'resolver' @ [87:23] ==> value-parameter resolver: ResolverForDecompiler = ... defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[ValueParameterDescriptorImpl]

'resolveDeclarationsInFacade' @ [87:32] ==> public abstract fun resolveDeclarationsInFacade(facadeFqName: FqName): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.ResolverForDecompiler[SimpleFunctionDescriptorImpl]

'classId' @ [87:60] ==> val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[LocalVariableDescriptor]

'asSingleFqName' @ [87:68] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'CLASS' @ [88:32] ==> enum entry CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'buildText' @ [89:13] ==> local final fun buildText(declarations: List<DeclarationDescriptor>): DecompiledText defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[SimpleFunctionDescriptorImpl]

'listOfNotNull' @ [89:23] ==> public fun <T : Any> listOfNotNull(element: ClassDescriptor?): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassDescriptor

'resolver' @ [89:37] ==> value-parameter resolver: ResolverForDecompiler = ... defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[ValueParameterDescriptorImpl]

'resolveTopLevelClass' @ [89:46] ==> public abstract fun resolveTopLevelClass(classId: ClassId): ClassDescriptor? defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.ResolverForDecompiler[SimpleFunctionDescriptorImpl]

'classId' @ [89:67] ==> val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[LocalVariableDescriptor]

'MULTIFILE_CLASS' @ [91:32] ==> enum entry MULTIFILE_CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'findMultifileClassParts' @ [92:31] ==> public fun findMultifileClassParts(file: VirtualFile, classId: ClassId, header: KotlinClassHeader): List<KotlinJvmBinaryClass> defined in org.jetbrains.kotlin.idea.decompiler.classFile[SimpleFunctionDescriptorImpl]

'classFile' @ [92:55] ==> value-parameter classFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[ValueParameterDescriptorImpl]

'classId' @ [92:66] ==> val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[LocalVariableDescriptor]

'classHeader' @ [92:75] ==> val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[LocalVariableDescriptor]

'partClasses' @ [93:31] ==> val partClasses: List<KotlinJvmBinaryClass> defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[LocalVariableDescriptor]

'flatMap' @ [93:43] ==> public inline fun <T, R> Iterable<KotlinJvmBinaryClass>.flatMap(transform: (KotlinJvmBinaryClass) -> Iterable<DeclarationDescriptor>): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinJvmBinaryClass
    <R> -> DeclarationDescriptor

'resolver' @ [94:17] ==> value-parameter resolver: ResolverForDecompiler = ... defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[ValueParameterDescriptorImpl]

'resolveDeclarationsInFacade' @ [94:26] ==> public abstract fun resolveDeclarationsInFacade(facadeFqName: FqName): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.ResolverForDecompiler[SimpleFunctionDescriptorImpl]

'partClass' @ [94:54] ==> value-parameter partClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile.<anonymous>[ValueParameterDescriptorImpl]

'classId' @ [94:64] ==> public abstract val classId: ClassId defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[DeserializedPropertyDescriptor]

'asSingleFqName' @ [94:72] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'buildText' @ [96:13] ==> local final fun buildText(declarations: List<DeclarationDescriptor>): DecompiledText defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[SimpleFunctionDescriptorImpl]

'partMembers' @ [96:23] ==> val partMembers: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[LocalVariableDescriptor]

'UnsupportedOperationException' @ [99:19] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'classHeader' @ [99:72] ==> val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[LocalVariableDescriptor]

'classId' @ [99:92] ==> val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.classFile.buildDecompiledTextForClassFile[LocalVariableDescriptor]

