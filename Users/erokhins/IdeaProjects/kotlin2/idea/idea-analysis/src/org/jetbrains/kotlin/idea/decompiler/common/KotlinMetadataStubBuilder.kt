'ClsStubBuilder' @ [36:5] ==> public constructor ClsStubBuilder() defined in com.intellij.psi.compiled.ClsStubBuilder[JavaClassConstructorDescriptor]

'+' @ [37:37] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'STUB_VERSION' @ [37:58] ==> public const final val STUB_VERSION: Int defined in com.intellij.psi.impl.compiled.ClassFileStubBuilder[JavaPropertyDescriptor]

'version' @ [37:73] ==> private final val version: Int defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder[PropertyDescriptorImpl]

'content' @ [40:27] ==> value-parameter content: FileContent defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[ValueParameterDescriptorImpl]

'file' @ [40:35] ==> public final val FileContent.file: VirtualFile[MyPropertyDescriptor]

'assert' @ [41:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'virtualFile' @ [41:16] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'fileType' @ [41:28] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'fileType' @ [41:40] ==> private final val fileType: FileType defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder[PropertyDescriptorImpl]

'virtualFile' @ [41:76] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'fileType' @ [41:88] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'invoke' @ [42:20] ==> public abstract operator fun invoke(p1: ByteArray, p2: VirtualFile): FileWithMetadata? defined in kotlin.Function2[FunctionInvokeDescriptor]

'content' @ [42:29] ==> value-parameter content: FileContent defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[ValueParameterDescriptorImpl]

'content' @ [42:37] ==> public final val FileContent.content: ByteArray[MyPropertyDescriptor]

'virtualFile' @ [42:46] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'when (file) {
            is FileWithMetadata.Incompatible -> {
                return createIncompatibleAbiVersionFileStub()
            }
            is FileWithMetadata.Compatible -> {
                val packageProto = file.proto.`package`
                val packageFqName = file.packageFqName
                val nameResolver = file.nameResolver
                val components = ClsStubBuilderComponents(
                        ProtoBasedClassDataFinder(file.proto, nameResolver),
                        AnnotationLoaderForStubBuilderImpl(serializerProtocol),
                        virtualFile
                )
                val context = components.createContext(nameResolver, packageFqName, TypeTable(packageProto.typeTable))

                val fileStub = createFileStub(packageFqName, isScript = false)
                createDeclarationsStubs(
                        fileStub, context,
                        ProtoContainer.Package(packageFqName, context.nameResolver, context.typeTable, source = null),
                        packageProto
                )
                for (classProto in file.classesToDecompile) {
                    createClassStub(
                            fileStub, classProto, nameResolver, nameResolver.getClassId(classProto.fqName), source = null, context = context
                    )
                }
                return fileStub
            }
        }' @ [44:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'file' @ [44:15] ==> val file: FileWithMetadata defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'createIncompatibleAbiVersionFileStub' @ [46:24] ==> public fun createIncompatibleAbiVersionFileStub(): KotlinFileStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'file' @ [49:36] ==> val file: FileWithMetadata defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'proto' @ [49:41] ==> public final val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'`package`' @ [49:47] ==> public final val ProtoBuf.PackageFragment.`package`: (ProtoBuf.Package..ProtoBuf.Package?)[MyPropertyDescriptor]

'file' @ [50:37] ==> val file: FileWithMetadata defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'packageFqName' @ [50:42] ==> public final val packageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'file' @ [51:36] ==> val file: FileWithMetadata defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'nameResolver' @ [51:41] ==> public final val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'ClsStubBuilderComponents' @ [52:34] ==> public constructor ClsStubBuilderComponents(classDataFinder: ClassDataFinder, annotationLoader: AnnotationAndConstantLoader<ClassId, Unit, ClassIdWithTarget>, virtualFileForDebug: VirtualFile) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderComponents[ClassConstructorDescriptorImpl]

'ProtoBasedClassDataFinder' @ [53:25] ==> public constructor ProtoBasedClassDataFinder(proto: ProtoBuf.PackageFragment, nameResolver: NameResolver, classSource: (ClassId) -> SourceElement = ...) defined in org.jetbrains.kotlin.serialization.deserialization.ProtoBasedClassDataFinder[DeserializedClassConstructorDescriptor]

'file' @ [53:51] ==> val file: FileWithMetadata defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'proto' @ [53:56] ==> public final val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'nameResolver' @ [53:63] ==> val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'AnnotationLoaderForStubBuilderImpl' @ [54:25] ==> public constructor AnnotationLoaderForStubBuilderImpl(protocol: SerializerExtensionProtocol) defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl[ClassConstructorDescriptorImpl]

'serializerProtocol' @ [54:60] ==> private final val serializerProtocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder[PropertyDescriptorImpl]

'virtualFile' @ [55:25] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'components' @ [57:31] ==> val components: ClsStubBuilderComponents defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'createContext' @ [57:42] ==> public final fun createContext(nameResolver: NameResolver, packageFqName: FqName, typeTable: TypeTable): ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderComponents[SimpleFunctionDescriptorImpl]

'nameResolver' @ [57:56] ==> val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'packageFqName' @ [57:70] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'TypeTable' @ [57:85] ==> public constructor TypeTable(typeTable: ProtoBuf.TypeTable) defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable[DeserializedClassConstructorDescriptor]

'packageProto' @ [57:95] ==> val packageProto: (ProtoBuf.Package..ProtoBuf.Package?) defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'typeTable' @ [57:108] ==> public final val ProtoBuf.Package.typeTable: (ProtoBuf.TypeTable..ProtoBuf.TypeTable?)[MyPropertyDescriptor]

'createFileStub' @ [59:32] ==> public fun createFileStub(packageFqName: FqName, isScript: Boolean): KotlinFileStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'packageFqName' @ [59:47] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'createDeclarationsStubs' @ [60:17] ==> public fun createDeclarationsStubs(parentStub: StubElement<out PsiElement>, outerContext: ClsStubBuilderContext, protoContainer: ProtoContainer, packageProto: ProtoBuf.Package): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file CallableClsStubBuilder.kt[SimpleFunctionDescriptorImpl]

'fileStub' @ [61:25] ==> val fileStub: KotlinFileStubImpl defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'context' @ [61:35] ==> val context: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'Package' @ [62:40] ==> public constructor Package(fqName: FqName, nameResolver: NameResolver, typeTable: TypeTable, source: SourceElement?) defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Package[DeserializedClassConstructorDescriptor]

'packageFqName' @ [62:48] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'context' @ [62:63] ==> val context: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'nameResolver' @ [62:71] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'context' @ [62:85] ==> val context: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'typeTable' @ [62:93] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'packageProto' @ [63:25] ==> val packageProto: (ProtoBuf.Package..ProtoBuf.Package?) defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'file' @ [65:36] ==> val file: FileWithMetadata defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'classesToDecompile' @ [65:41] ==> public open val classesToDecompile: List<ProtoBuf.Class> defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'createClassStub' @ [66:21] ==> public fun createClassStub(parent: StubElement<out PsiElement>, classProto: ProtoBuf.Class, nameResolver: NameResolver, classId: ClassId, source: SourceElement?, context: ClsStubBuilderContext): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file ClassClsStubBuilder.kt[SimpleFunctionDescriptorImpl]

'fileStub' @ [67:29] ==> val fileStub: KotlinFileStubImpl defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'classProto' @ [67:39] ==> val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'nameResolver' @ [67:51] ==> val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'nameResolver' @ [67:65] ==> val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'getClassId' @ [67:78] ==> public open fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[DeserializedSimpleFunctionDescriptor]

'classProto' @ [67:89] ==> val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'fqName' @ [67:100] ==> public final val ProtoBuf.Class.fqName: Int[MyPropertyDescriptor]

'context' @ [67:134] ==> val context: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

'fileStub' @ [70:24] ==> val fileStub: KotlinFileStubImpl defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataStubBuilder.buildFileStub[LocalVariableDescriptor]

