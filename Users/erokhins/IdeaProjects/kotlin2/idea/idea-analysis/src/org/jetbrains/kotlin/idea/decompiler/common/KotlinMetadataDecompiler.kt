'ClassFileDecompilers.Full' @ [49:5] ==> public constructor Full() defined in com.intellij.psi.compiled.ClassFileDecompilers.Full[JavaClassConstructorDescriptor]

'KotlinMetadataStubBuilder' @ [50:31] ==> public constructor KotlinMetadataStubBuilder(version: Int, fileType: FileType, serializerProtocol: SerializerExtensionProtocol, readFile: (ByteArray, VirtualFile) -> FileWithMetadata?) defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder[ClassConstructorDescriptorImpl]

'stubVersion' @ [50:57] ==> value-parameter stubVersion: Int defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.<init>[ValueParameterDescriptorImpl]

'fileType' @ [50:70] ==> private final val fileType: FileType defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[PropertyDescriptorImpl]

'serializerProtocol' @ [50:80] ==> private final val serializerProtocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[PropertyDescriptorImpl]

'this' @ [50:100] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[LazyClassReceiverParameterDescriptor]

'DescriptorRenderer' @ [52:28] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [52:47] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'defaultDecompilerRendererOptions' @ [52:61] ==> public fun DescriptorRendererOptions.defaultDecompilerRendererOptions(): Unit defined in org.jetbrains.kotlin.idea.decompiler.textBuilder in file buildDecompiledText.kt[SimpleFunctionDescriptorImpl]

'file' @ [56:47] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.accepts[ValueParameterDescriptorImpl]

'fileType' @ [56:52] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'fileType' @ [56:64] ==> private final val fileType: FileType defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[PropertyDescriptorImpl]

'stubBuilder' @ [58:37] ==> private final val stubBuilder: KotlinMetadataStubBuilder defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[PropertyDescriptorImpl]

'KotlinDecompiledFileViewProvider' @ [61:16] ==> public constructor KotlinDecompiledFileViewProvider(manager: PsiManager, file: VirtualFile, physical: Boolean, factory: (KotlinDecompiledFileViewProvider) -> KtDecompiledFile?) defined in org.jetbrains.kotlin.idea.decompiler.KotlinDecompiledFileViewProvider[ClassConstructorDescriptorImpl]

'manager' @ [61:49] ==> value-parameter manager: PsiManager defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.createFileViewProvider[ValueParameterDescriptorImpl]

'file' @ [61:58] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.createFileViewProvider[ValueParameterDescriptorImpl]

'physical' @ [61:64] ==> value-parameter physical: Boolean defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.createFileViewProvider[ValueParameterDescriptorImpl]

'if (readFile(provider.virtualFile) == null) {
                null
            }
            else {
                KtDecompiledFile(provider, this::buildDecompiledText)
            }' @ [62:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtDecompiledFile?, elseBranch: KtDecompiledFile?): KtDecompiledFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtDecompiledFile?

'readFile' @ [62:17] ==> private final fun readFile(file: VirtualFile): FileWithMetadata? defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[SimpleFunctionDescriptorImpl]

'provider' @ [62:26] ==> value-parameter provider: KotlinDecompiledFileViewProvider defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.createFileViewProvider.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [62:35] ==> public final val KotlinDecompiledFileViewProvider.virtualFile: VirtualFile[MyPropertyDescriptor]

'KtDecompiledFile' @ [66:17] ==> public constructor KtDecompiledFile(provider: KotlinDecompiledFileViewProvider, buildDecompiledText: (VirtualFile) -> DecompiledText) defined in org.jetbrains.kotlin.idea.decompiler.KtDecompiledFile[ClassConstructorDescriptorImpl]

'provider' @ [66:34] ==> value-parameter provider: KotlinDecompiledFileViewProvider defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.createFileViewProvider.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [66:44] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[LazyClassReceiverParameterDescriptor]

'!' @ [72:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [72:14] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.readFile[ValueParameterDescriptorImpl]

'isValid' @ [72:19] ==> public final val VirtualFile.isValid: Boolean[MyPropertyDescriptor]

'readFile' @ [75:13] ==> public abstract fun readFile(bytes: ByteArray, file: VirtualFile): FileWithMetadata? defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[SimpleFunctionDescriptorImpl]

'file' @ [75:22] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.readFile[ValueParameterDescriptorImpl]

'contentsToByteArray' @ [75:27] ==> @NotNull public open fun contentsToByteArray(p0: Boolean): ByteArray defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'file' @ [75:55] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.readFile[ValueParameterDescriptorImpl]

'virtualFile' @ [87:13] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[ValueParameterDescriptorImpl]

'fileType' @ [87:25] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'fileType' @ [87:37] ==> private final val fileType: FileType defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[PropertyDescriptorImpl]

'error' @ [88:13] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'virtualFile' @ [88:43] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[ValueParameterDescriptorImpl]

'fileType' @ [88:55] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'readFile' @ [91:20] ==> private final fun readFile(file: VirtualFile): FileWithMetadata? defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[SimpleFunctionDescriptorImpl]

'virtualFile' @ [91:29] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[ValueParameterDescriptorImpl]

'when (file) {
            null -> {
                createIncompatibleAbiVersionDecompiledText(expectedBinaryVersion, invalidBinaryVersion)
            }
            is FileWithMetadata.Incompatible -> {
                createIncompatibleAbiVersionDecompiledText(expectedBinaryVersion, file.version)
            }
            is FileWithMetadata.Compatible -> {
                val packageFqName = file.packageFqName
                val resolver = KotlinMetadataDeserializerForDecompiler(
                        packageFqName, file.proto, file.nameResolver,
                        targetPlatform, serializerProtocol, flexibleTypeDeserializer
                )
                val declarations = arrayListOf<DeclarationDescriptor>()
                declarations.addAll(resolver.resolveDeclarationsInFacade(packageFqName))
                for (classProto in file.classesToDecompile) {
                    val classId = file.nameResolver.getClassId(classProto.fqName)
                    declarations.addIfNotNull(resolver.resolveTopLevelClass(classId))
                }
                buildDecompiledText(packageFqName, declarations, renderer)
            }
        }' @ [93:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DecompiledText, entry1: DecompiledText, entry2: DecompiledText): DecompiledText[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DecompiledText

'file' @ [93:22] ==> val file: FileWithMetadata? defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'createIncompatibleAbiVersionDecompiledText' @ [95:17] ==> public fun <V : BinaryVersion> createIncompatibleAbiVersionDecompiledText(expectedVersion: V, actualVersion: V): DecompiledText defined in org.jetbrains.kotlin.idea.decompiler.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : BinaryVersion> -> V

'expectedBinaryVersion' @ [95:60] ==> private final val expectedBinaryVersion: V defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[PropertyDescriptorImpl]

'invalidBinaryVersion' @ [95:83] ==> private final val invalidBinaryVersion: V defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[PropertyDescriptorImpl]

'createIncompatibleAbiVersionDecompiledText' @ [98:17] ==> public fun <V : BinaryVersion> createIncompatibleAbiVersionDecompiledText(expectedVersion: BinaryVersion, actualVersion: BinaryVersion): DecompiledText defined in org.jetbrains.kotlin.idea.decompiler.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : BinaryVersion> -> BinaryVersion

'expectedBinaryVersion' @ [98:60] ==> private final val expectedBinaryVersion: V defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[PropertyDescriptorImpl]

'file' @ [98:83] ==> val file: FileWithMetadata? defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'version' @ [98:88] ==> public final val version: BinaryVersion defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Incompatible[PropertyDescriptorImpl]

'file' @ [101:37] ==> val file: FileWithMetadata? defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'packageFqName' @ [101:42] ==> public final val packageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'KotlinMetadataDeserializerForDecompiler' @ [102:32] ==> public constructor KotlinMetadataDeserializerForDecompiler(packageFqName: FqName, proto: ProtoBuf.PackageFragment, nameResolver: NameResolver, targetPlatform: TargetPlatform, serializerProtocol: SerializerExtensionProtocol, flexibleTypeDeserializer: FlexibleTypeDeserializer) defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[ClassConstructorDescriptorImpl]

'packageFqName' @ [103:25] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'file' @ [103:40] ==> val file: FileWithMetadata? defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'proto' @ [103:45] ==> public final val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'file' @ [103:52] ==> val file: FileWithMetadata? defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'nameResolver' @ [103:57] ==> public final val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'targetPlatform' @ [104:25] ==> private final val targetPlatform: TargetPlatform defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[PropertyDescriptorImpl]

'serializerProtocol' @ [104:41] ==> private final val serializerProtocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[PropertyDescriptorImpl]

'flexibleTypeDeserializer' @ [104:61] ==> private final val flexibleTypeDeserializer: FlexibleTypeDeserializer defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[PropertyDescriptorImpl]

'arrayListOf' @ [106:36] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<DeclarationDescriptor> /* = ArrayList<DeclarationDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'declarations' @ [107:17] ==> val declarations: ArrayList<DeclarationDescriptor> /* = ArrayList<DeclarationDescriptor> */ defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'addAll' @ [107:30] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'resolver' @ [107:37] ==> val resolver: KotlinMetadataDeserializerForDecompiler defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'resolveDeclarationsInFacade' @ [107:46] ==> public open fun resolveDeclarationsInFacade(facadeFqName: FqName): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[SimpleFunctionDescriptorImpl]

'packageFqName' @ [107:74] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'file' @ [108:36] ==> val file: FileWithMetadata? defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'classesToDecompile' @ [108:41] ==> public open val classesToDecompile: List<ProtoBuf.Class> defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'file' @ [109:35] ==> val file: FileWithMetadata? defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'nameResolver' @ [109:40] ==> public final val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'getClassId' @ [109:53] ==> public open fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[DeserializedSimpleFunctionDescriptor]

'classProto' @ [109:64] ==> val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'fqName' @ [109:75] ==> public final val ProtoBuf.Class.fqName: Int[MyPropertyDescriptor]

'declarations' @ [110:21] ==> val declarations: ArrayList<DeclarationDescriptor> /* = ArrayList<DeclarationDescriptor> */ defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'addIfNotNull' @ [110:34] ==> public fun <T : Any> MutableCollection<DeclarationDescriptor>.addIfNotNull(t: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> DeclarationDescriptor

'resolver' @ [110:47] ==> val resolver: KotlinMetadataDeserializerForDecompiler defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'resolveTopLevelClass' @ [110:56] ==> public open fun resolveTopLevelClass(classId: ClassId): ClassDescriptor? defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDeserializerForDecompiler[SimpleFunctionDescriptorImpl]

'classId' @ [110:77] ==> val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'buildDecompiledText' @ [112:17] ==> public fun buildDecompiledText(packageFqName: FqName, descriptors: List<DeclarationDescriptor>, descriptorRenderer: DescriptorRenderer, indexers: Collection<DecompiledTextIndexer<*>> = ...): DecompiledText defined in org.jetbrains.kotlin.idea.decompiler.textBuilder[SimpleFunctionDescriptorImpl]

'packageFqName' @ [112:37] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'declarations' @ [112:52] ==> val declarations: ArrayList<DeclarationDescriptor> /* = ArrayList<DeclarationDescriptor> */ defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler.buildDecompiledText[LocalVariableDescriptor]

'renderer' @ [112:66] ==> private final val renderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[PropertyDescriptorImpl]

'FileWithMetadata' @ [119:54] ==> private constructor FileWithMetadata() defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata[ClassConstructorDescriptorImpl]

'FileWithMetadata' @ [124:9] ==> private constructor FileWithMetadata() defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata[ClassConstructorDescriptorImpl]

'NameResolverImpl' @ [125:28] ==> public constructor NameResolverImpl(strings: ProtoBuf.StringTable, qualifiedNames: ProtoBuf.QualifiedNameTable) defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[DeserializedClassConstructorDescriptor]

'proto' @ [125:45] ==> public final val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'strings' @ [125:51] ==> public final val ProtoBuf.PackageFragment.strings: (ProtoBuf.StringTable..ProtoBuf.StringTable?)[MyPropertyDescriptor]

'proto' @ [125:60] ==> public final val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'qualifiedNames' @ [125:66] ==> public final val ProtoBuf.PackageFragment.qualifiedNames: (ProtoBuf.QualifiedNameTable..ProtoBuf.QualifiedNameTable?)[MyPropertyDescriptor]

'nameResolver' @ [126:29] ==> public final val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'getPackageFqName' @ [126:42] ==> public final fun getPackageFqName(index: Int): FqName defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[DeserializedSimpleFunctionDescriptor]

'proto' @ [126:59] ==> public final val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'`package`' @ [126:65] ==> public final val ProtoBuf.PackageFragment.`package`: (ProtoBuf.Package..ProtoBuf.Package?)[MyPropertyDescriptor]

'getExtension' @ [126:75] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>?)): (Int..Int?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Int

'serializerProtocol' @ [126:88] ==> value-parameter serializerProtocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible.<init>[ValueParameterDescriptorImpl]

'packageFqName' @ [126:107] ==> public final val packageFqName: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Int> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'proto' @ [129:17] ==> public final val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'class_List' @ [129:23] ==> public final val ProtoBuf.PackageFragment.class_List: (MutableList<(ProtoBuf.Class..ProtoBuf.Class?)>..List<(ProtoBuf.Class..ProtoBuf.Class?)>?)[MyPropertyDescriptor]

'filter' @ [129:34] ==> public inline fun <T> Iterable<(ProtoBuf.Class..ProtoBuf.Class?)>.filter(predicate: ((ProtoBuf.Class..ProtoBuf.Class?)) -> Boolean): List<(ProtoBuf.Class..ProtoBuf.Class?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Class..org.jetbrains.kotlin.serialization.ProtoBuf.Class?)

'nameResolver' @ [130:35] ==> public final val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'getClassId' @ [130:48] ==> public open fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[DeserializedSimpleFunctionDescriptor]

'proto' @ [130:59] ==> value-parameter proto: (ProtoBuf.Class..ProtoBuf.Class?) defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible.classesToDecompile.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [130:65] ==> public final val ProtoBuf.Class.fqName: Int[MyPropertyDescriptor]

'!' @ [131:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classId' @ [131:22] ==> val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible.classesToDecompile.<anonymous>[LocalVariableDescriptor]

'isNestedClass' @ [131:30] ==> public final val ClassId.isNestedClass: Boolean[MyPropertyDescriptor]

'classId' @ [131:47] ==> val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible.classesToDecompile.<anonymous>[LocalVariableDescriptor]

'ClassDeserializer' @ [131:59] ==> public companion object defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer[FakeCallableDescriptorForObject]

'BLACK_LIST' @ [131:77] ==> public final val BLACK_LIST: Set<ClassId> defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.Companion[DeserializedPropertyDescriptor]

