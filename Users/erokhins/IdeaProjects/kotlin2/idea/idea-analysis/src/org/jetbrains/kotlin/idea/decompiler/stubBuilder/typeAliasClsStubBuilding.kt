'context' @ [34:21] ==> value-parameter context: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[ValueParameterDescriptorImpl]

'nameResolver' @ [34:29] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'getName' @ [34:42] ==> @NotNull public abstract fun getName(p0: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'typeAliasProto' @ [34:50] ==> value-parameter typeAliasProto: ProtoBuf.TypeAlias defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[ValueParameterDescriptorImpl]

'name' @ [34:65] ==> public final val ProtoBuf.TypeAlias.name: Int[MyPropertyDescriptor]

'when (protoContainer) {
        is ProtoContainer.Class -> protoContainer.classId.createNestedClassId(shortName)
        is ProtoContainer.Package -> ClassId.topLevel(protoContainer.fqName.child(shortName))
    }' @ [36:19] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassId, entry1: ClassId): ClassId[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassId

'protoContainer' @ [36:25] ==> value-parameter protoContainer: ProtoContainer defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[ValueParameterDescriptorImpl]

'protoContainer' @ [37:36] ==> value-parameter protoContainer: ProtoContainer defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[ValueParameterDescriptorImpl]

'classId' @ [37:51] ==> public final val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedPropertyDescriptor]

'createNestedClassId' @ [37:59] ==> @NotNull public open fun createNestedClassId(@NotNull p0: Name): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'shortName' @ [37:79] ==> val shortName: Name defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[LocalVariableDescriptor]

'topLevel' @ [38:46] ==> @NotNull public open fun topLevel(@NotNull p0: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'protoContainer' @ [38:55] ==> value-parameter protoContainer: ProtoContainer defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[ValueParameterDescriptorImpl]

'fqName' @ [38:70] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Package[DeserializedPropertyDescriptor]

'child' @ [38:77] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'shortName' @ [38:83] ==> val shortName: Name defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[LocalVariableDescriptor]

'KotlinTypeAliasStubImpl' @ [42:9] ==> public constructor KotlinTypeAliasStubImpl(parent: StubElement<out PsiElement>?, name: StringRef?, qualifiedName: StringRef?, isTopLevel: Boolean) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinTypeAliasStubImpl[DeserializedClassConstructorDescriptor]

'parent' @ [43:17] ==> value-parameter parent: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[ValueParameterDescriptorImpl]

'classId' @ [43:25] ==> val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[LocalVariableDescriptor]

'shortClassName' @ [43:33] ==> public final val ClassId.shortClassName: Name[MyPropertyDescriptor]

'ref' @ [43:48] ==> public fun Name.ref(): StringRef defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder[SimpleFunctionDescriptorImpl]

'classId' @ [43:55] ==> val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[LocalVariableDescriptor]

'asSingleFqName' @ [43:63] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'ref' @ [43:80] ==> public fun FqName.ref(): StringRef defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder[SimpleFunctionDescriptorImpl]

'!' @ [44:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classId' @ [44:31] ==> val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[LocalVariableDescriptor]

'isNestedClass' @ [44:39] ==> public final val ClassId.isNestedClass: Boolean[MyPropertyDescriptor]

'createModifierListStubForDeclaration' @ [46:24] ==> public fun createModifierListStubForDeclaration(parent: StubElement<out PsiElement>, flags: Int, flagsToTranslate: List<FlagsToModifiers> = ..., additionalModifiers: List<KtModifierKeywordToken> = ...): KotlinModifierListStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder[SimpleFunctionDescriptorImpl]

'typeAlias' @ [46:61] ==> val typeAlias: KotlinTypeAliasStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[LocalVariableDescriptor]

'typeAliasProto' @ [46:72] ==> value-parameter typeAliasProto: ProtoBuf.TypeAlias defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[ValueParameterDescriptorImpl]

'flags' @ [46:87] ==> public final val ProtoBuf.TypeAlias.flags: Int[MyPropertyDescriptor]

'arrayListOf' @ [46:94] ==> public fun <T> arrayListOf(vararg elements: FlagsToModifiers): ArrayList<FlagsToModifiers> /* = ArrayList<FlagsToModifiers> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlagsToModifiers

'VISIBILITY' @ [46:106] ==> public val VISIBILITY: FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[PropertyDescriptorImpl]

'listOf' @ [46:119] ==> @InlineOnly public inline fun <T> listOf(): List<KtModifierKeywordToken> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtModifierKeywordToken

'TypeClsStubBuilder' @ [48:27] ==> public constructor TypeClsStubBuilder(c: ClsStubBuilderContext) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[ClassConstructorDescriptorImpl]

'context' @ [48:46] ==> value-parameter context: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[ValueParameterDescriptorImpl]

'typeStubBuilder' @ [49:27] ==> val typeStubBuilder: TypeClsStubBuilder defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[LocalVariableDescriptor]

'createTypeParameterListStub' @ [49:43] ==> public final fun createTypeParameterListStub(parent: StubElement<out PsiElement>, typeParameterProtoList: List<ProtoBuf.TypeParameter>): List<Pair<Name, ProtoBuf.Type>> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'typeAlias' @ [49:71] ==> val typeAlias: KotlinTypeAliasStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[LocalVariableDescriptor]

'typeAliasProto' @ [49:82] ==> value-parameter typeAliasProto: ProtoBuf.TypeAlias defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[ValueParameterDescriptorImpl]

'typeParameterList' @ [49:97] ==> public final val ProtoBuf.TypeAlias.typeParameterList: (MutableList<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>..List<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>?)[MyPropertyDescriptor]

'assert' @ [50:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'restConstraints' @ [50:12] ==> val restConstraints: List<Pair<Name, ProtoBuf.Type>> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[LocalVariableDescriptor]

'isEmpty' @ [50:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'HAS_ANNOTATIONS' @ [54:15] ==> public final val HAS_ANNOTATIONS: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [54:31] ==> @NotNull public open fun get(p0: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'typeAliasProto' @ [54:35] ==> value-parameter typeAliasProto: ProtoBuf.TypeAlias defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[ValueParameterDescriptorImpl]

'flags' @ [54:50] ==> public final val ProtoBuf.TypeAlias.flags: Int[MyPropertyDescriptor]

'createAnnotationStubs' @ [55:9] ==> public fun createAnnotationStubs(annotationIds: List<ClassId>, parent: KotlinStubBaseImpl<*>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder[SimpleFunctionDescriptorImpl]

'typeAliasProto' @ [55:31] ==> value-parameter typeAliasProto: ProtoBuf.TypeAlias defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[ValueParameterDescriptorImpl]

'annotationList' @ [55:46] ==> public final val ProtoBuf.TypeAlias.annotationList: (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)[MyPropertyDescriptor]

'map' @ [55:61] ==> public inline fun <T, R> Iterable<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>.map(transform: ((ProtoBuf.Annotation..ProtoBuf.Annotation?)) -> ClassId): List<ClassId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Annotation..org.jetbrains.kotlin.serialization.ProtoBuf.Annotation?)
    <R> -> ClassId

'context' @ [55:67] ==> value-parameter context: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[ValueParameterDescriptorImpl]

'nameResolver' @ [55:75] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'getClassId' @ [55:88] ==> @NotNull public abstract fun getClassId(p0: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'it' @ [55:99] ==> value-parameter it: (ProtoBuf.Annotation..ProtoBuf.Annotation?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [55:102] ==> public final val ProtoBuf.Annotation.id: Int[MyPropertyDescriptor]

'modifierList' @ [55:109] ==> val modifierList: KotlinModifierListStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[LocalVariableDescriptor]

'typeStubBuilder' @ [58:5] ==> val typeStubBuilder: TypeClsStubBuilder defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[LocalVariableDescriptor]

'createTypeReferenceStub' @ [58:21] ==> public final fun createTypeReferenceStub(parent: StubElement<out PsiElement>, type: ProtoBuf.Type, additionalAnnotations: () -> List<ClassIdWithTarget> = ...): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'typeAlias' @ [58:45] ==> val typeAlias: KotlinTypeAliasStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[LocalVariableDescriptor]

'typeAliasProto' @ [58:56] ==> value-parameter typeAliasProto: ProtoBuf.TypeAlias defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createTypeAliasStub[ValueParameterDescriptorImpl]

'underlyingType' @ [58:71] ==> public final val ProtoBuf.TypeAlias.underlyingType: (ProtoBuf.Type..ProtoBuf.Type?)[MyPropertyDescriptor]

