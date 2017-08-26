'setOf' @ [44:48] ==> public fun <T> setOf(element: (FqName..FqName?)): Set<(FqName..FqName?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)

'FQ_NAMES' @ [44:69] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'parameterName' @ [44:78] ==> public final val parameterName: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'emptyList' @ [47:139] ==> public fun <T> emptyList(): List<ClassIdWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassIdWithTarget

'type' @ [48:13] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[ValueParameterDescriptorImpl]

'hasAbbreviatedType' @ [48:18] ==> public open fun hasAbbreviatedType(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'createTypeReferenceStub' @ [48:47] ==> public final fun createTypeReferenceStub(parent: StubElement<out PsiElement>, type: ProtoBuf.Type, additionalAnnotations: () -> List<ClassIdWithTarget> = ...): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'parent' @ [48:71] ==> value-parameter parent: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[ValueParameterDescriptorImpl]

'type' @ [48:79] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[ValueParameterDescriptorImpl]

'abbreviatedType' @ [48:84] ==> public final val ProtoBuf.Type.abbreviatedType: (ProtoBuf.Type..ProtoBuf.Type?)[MyPropertyDescriptor]

'additionalAnnotations' @ [48:101] ==> value-parameter additionalAnnotations: () -> List<ClassIdWithTarget> = ... defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[ValueParameterDescriptorImpl]

'KotlinPlaceHolderStubImpl' @ [49:29] ==> public constructor KotlinPlaceHolderStubImpl<T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinPlaceHolderStubImpl[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)> -> KtTypeReference

'parent' @ [49:72] ==> value-parameter parent: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[ValueParameterDescriptorImpl]

'TYPE_REFERENCE' @ [49:99] ==> public final val TYPE_REFERENCE: (KtPlaceHolderStubElementType<(KtTypeReference..KtTypeReference?)>..KtPlaceHolderStubElementType<(KtTypeReference..KtTypeReference?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'c' @ [51:27] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'components' @ [51:29] ==> public final val components: ClsStubBuilderComponents defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'annotationLoader' @ [51:40] ==> public final val annotationLoader: AnnotationAndConstantLoader<ClassId, Unit, ClassIdWithTarget> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderComponents[PropertyDescriptorImpl]

'loadTypeAnnotations' @ [51:57] ==> public abstract fun loadTypeAnnotations(proto: ProtoBuf.Type, nameResolver: NameResolver): List<ClassId> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoader[DeserializedSimpleFunctionDescriptor]

'type' @ [51:77] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[ValueParameterDescriptorImpl]

'c' @ [51:83] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'nameResolver' @ [51:85] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'filterNot' @ [51:99] ==> public inline fun <T> Iterable<ClassId>.filterNot(predicate: (ClassId) -> Boolean): List<ClassId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId

'!' @ [52:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [52:36] ==> value-parameter it: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub.<anonymous>[ValueParameterDescriptorImpl]

'isNestedClass' @ [52:39] ==> public final val ClassId.isNestedClass: Boolean[MyPropertyDescriptor]

'isTopLevelClass' @ [53:13] ==> val isTopLevelClass: Boolean defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub.<anonymous>[LocalVariableDescriptor]

'it' @ [53:32] ==> value-parameter it: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub.<anonymous>[ValueParameterDescriptorImpl]

'asSingleFqName' @ [53:35] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'ANNOTATIONS_NOT_LOADED_FOR_TYPES' @ [53:55] ==> private val ANNOTATIONS_NOT_LOADED_FOR_TYPES: Set<(FqName..FqName?)> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file TypeClsStubBuilder.kt[PropertyDescriptorImpl]

'invoke' @ [56:30] ==> public abstract operator fun invoke(): List<ClassIdWithTarget> defined in kotlin.Function0[FunctionInvokeDescriptor]

'annotations' @ [56:56] ==> val annotations: List<ClassId> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[LocalVariableDescriptor]

'map' @ [56:68] ==> public inline fun <T, R> Iterable<ClassId>.map(transform: (ClassId) -> ClassIdWithTarget): List<ClassIdWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId
    <R> -> ClassIdWithTarget

'ClassIdWithTarget' @ [56:74] ==> public constructor ClassIdWithTarget(classId: ClassId, target: AnnotationUseSiteTarget?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassIdWithTarget[ClassConstructorDescriptorImpl]

'it' @ [56:92] ==> value-parameter it: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub.<anonymous>[ValueParameterDescriptorImpl]

'when {
            type.hasClassName() || type.hasTypeAliasName() ->
                createClassReferenceTypeStub(typeReference, type, allAnnotations)
            type.hasTypeParameter() ->
                createTypeParameterStub(typeReference, type, c.typeParameters[type.typeParameter], allAnnotations)
            type.hasTypeParameterName() ->
                createTypeParameterStub(typeReference, type, c.nameResolver.getName(type.typeParameterName), allAnnotations)
        }' @ [58:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'type' @ [59:13] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[ValueParameterDescriptorImpl]

'hasClassName' @ [59:18] ==> public open fun hasClassName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'type' @ [59:36] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[ValueParameterDescriptorImpl]

'hasTypeAliasName' @ [59:41] ==> public open fun hasTypeAliasName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'createClassReferenceTypeStub' @ [60:17] ==> private final fun createClassReferenceTypeStub(parent: KotlinStubBaseImpl<*>, type: ProtoBuf.Type, annotations: List<ClassIdWithTarget>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'typeReference' @ [60:46] ==> val typeReference: KotlinPlaceHolderStubImpl<KtTypeReference> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[LocalVariableDescriptor]

'type' @ [60:61] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[ValueParameterDescriptorImpl]

'allAnnotations' @ [60:67] ==> val allAnnotations: List<ClassIdWithTarget> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[LocalVariableDescriptor]

'type' @ [61:13] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[ValueParameterDescriptorImpl]

'hasTypeParameter' @ [61:18] ==> public open fun hasTypeParameter(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'createTypeParameterStub' @ [62:17] ==> private final fun createTypeParameterStub(parent: KotlinStubBaseImpl<*>, type: ProtoBuf.Type, name: Name, annotations: List<ClassIdWithTarget>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'typeReference' @ [62:41] ==> val typeReference: KotlinPlaceHolderStubImpl<KtTypeReference> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[LocalVariableDescriptor]

'type' @ [62:56] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[ValueParameterDescriptorImpl]

'c' @ [62:62] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'typeParameters' @ [62:64] ==> public final val typeParameters: TypeParameters defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'type' @ [62:79] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[ValueParameterDescriptorImpl]

'typeParameter' @ [62:84] ==> public final val ProtoBuf.Type.typeParameter: Int[MyPropertyDescriptor]

'allAnnotations' @ [62:100] ==> val allAnnotations: List<ClassIdWithTarget> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[LocalVariableDescriptor]

'type' @ [63:13] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[ValueParameterDescriptorImpl]

'hasTypeParameterName' @ [63:18] ==> public open fun hasTypeParameterName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'createTypeParameterStub' @ [64:17] ==> private final fun createTypeParameterStub(parent: KotlinStubBaseImpl<*>, type: ProtoBuf.Type, name: Name, annotations: List<ClassIdWithTarget>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'typeReference' @ [64:41] ==> val typeReference: KotlinPlaceHolderStubImpl<KtTypeReference> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[LocalVariableDescriptor]

'type' @ [64:56] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[ValueParameterDescriptorImpl]

'c' @ [64:62] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'nameResolver' @ [64:64] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'getName' @ [64:77] ==> @NotNull public abstract fun getName(p0: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'type' @ [64:85] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[ValueParameterDescriptorImpl]

'typeParameterName' @ [64:90] ==> public final val ProtoBuf.Type.typeParameterName: Int[MyPropertyDescriptor]

'allAnnotations' @ [64:110] ==> val allAnnotations: List<ClassIdWithTarget> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeReferenceStub[LocalVariableDescriptor]

'if (type.nullable) KotlinPlaceHolderStubImpl<KtNullableType>(parent, KtStubElementTypes.NULLABLE_TYPE)
            else parent' @ [69:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinStubBaseImpl<*>, elseBranch: KotlinStubBaseImpl<*>): KotlinStubBaseImpl<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinStubBaseImpl<*>

'type' @ [69:17] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.nullableTypeParent[ValueParameterDescriptorImpl]

'nullable' @ [69:22] ==> public final val ProtoBuf.Type.nullable: Boolean[MyPropertyDescriptor]

'KotlinPlaceHolderStubImpl' @ [69:32] ==> public constructor KotlinPlaceHolderStubImpl<T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinPlaceHolderStubImpl[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)> -> KtNullableType

'parent' @ [69:74] ==> value-parameter parent: KotlinStubBaseImpl<*> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.nullableTypeParent[ValueParameterDescriptorImpl]

'NULLABLE_TYPE' @ [69:101] ==> public final val NULLABLE_TYPE: (KtPlaceHolderStubElementType<(KtNullableType..KtNullableType?)>..KtPlaceHolderStubElementType<(KtNullableType..KtNullableType?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'parent' @ [70:18] ==> value-parameter parent: KotlinStubBaseImpl<*> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.nullableTypeParent[ValueParameterDescriptorImpl]

'createTypeAnnotationStubs' @ [73:9] ==> private final fun createTypeAnnotationStubs(parent: KotlinStubBaseImpl<*>, type: ProtoBuf.Type, annotations: List<ClassIdWithTarget>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'parent' @ [73:35] ==> value-parameter parent: KotlinStubBaseImpl<*> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterStub[ValueParameterDescriptorImpl]

'type' @ [73:43] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterStub[ValueParameterDescriptorImpl]

'annotations' @ [73:49] ==> value-parameter annotations: List<ClassIdWithTarget> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterStub[ValueParameterDescriptorImpl]

'createStubForTypeName' @ [74:9] ==> public fun createStubForTypeName(typeClassId: ClassId, parent: StubElement<out PsiElement>, bindTypeArguments: (KotlinUserTypeStub, Int) -> Unit = ...): KotlinUserTypeStub defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'topLevel' @ [74:39] ==> @NotNull public open fun topLevel(@NotNull p0: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'topLevel' @ [74:55] ==> @NotNull public open fun topLevel(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'name' @ [74:64] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterStub[ValueParameterDescriptorImpl]

'nullableTypeParent' @ [74:72] ==> private final fun nullableTypeParent(parent: KotlinStubBaseImpl<*>, type: ProtoBuf.Type): KotlinStubBaseImpl<*> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'parent' @ [74:91] ==> value-parameter parent: KotlinStubBaseImpl<*> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterStub[ValueParameterDescriptorImpl]

'type' @ [74:99] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterStub[ValueParameterDescriptorImpl]

'type' @ [78:13] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'hasFlexibleTypeCapabilitiesId' @ [78:18] ==> public open fun hasFlexibleTypeCapabilitiesId(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'c' @ [79:22] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'nameResolver' @ [79:24] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'getString' @ [79:37] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'type' @ [79:47] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'flexibleTypeCapabilitiesId' @ [79:52] ==> public final val ProtoBuf.Type.flexibleTypeCapabilitiesId: Int[MyPropertyDescriptor]

'id' @ [81:17] ==> val id: String defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[LocalVariableDescriptor]

'id' @ [81:47] ==> public final val id: String defined in org.jetbrains.kotlin.serialization.js.DynamicTypeDeserializer[DeserializedPropertyDescriptor]

'KotlinPlaceHolderStubImpl' @ [82:17] ==> public constructor KotlinPlaceHolderStubImpl<T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinPlaceHolderStubImpl[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)> -> KtDynamicType

'nullableTypeParent' @ [82:58] ==> private final fun nullableTypeParent(parent: KotlinStubBaseImpl<*>, type: ProtoBuf.Type): KotlinStubBaseImpl<*> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'parent' @ [82:77] ==> value-parameter parent: KotlinStubBaseImpl<*> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'type' @ [82:85] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'DYNAMIC_TYPE' @ [82:111] ==> public final val DYNAMIC_TYPE: (KtPlaceHolderStubElementType<(KtDynamicType..KtDynamicType?)>..KtPlaceHolderStubElementType<(KtDynamicType..KtDynamicType?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'assert' @ [87:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'type' @ [87:16] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'hasClassName' @ [87:21] ==> public open fun hasClassName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'type' @ [87:39] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'hasTypeAliasName' @ [87:44] ==> public open fun hasTypeAliasName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'c' @ [91:23] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'nameResolver' @ [91:25] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'getClassId' @ [91:38] ==> @NotNull public abstract fun getClassId(p0: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'if (type.hasClassName()) type.className else type.typeAliasName' @ [91:49] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'type' @ [91:53] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'hasClassName' @ [91:58] ==> public open fun hasClassName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'type' @ [91:74] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'className' @ [91:79] ==> public final val ProtoBuf.Type.className: Int[MyPropertyDescriptor]

'type' @ [91:94] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'typeAliasName' @ [91:99] ==> public final val ProtoBuf.Type.typeAliasName: Int[MyPropertyDescriptor]

'isBuiltinFunctionClass' @ [92:41] ==> public fun isBuiltinFunctionClass(classId: ClassId): Boolean defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'classId' @ [92:64] ==> val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[LocalVariableDescriptor]

'type' @ [93:44] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'argumentList' @ [93:49] ==> public final val ProtoBuf.Type.argumentList: (MutableList<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>..List<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>?)[MyPropertyDescriptor]

'none' @ [93:62] ==> public inline fun <T> Iterable<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>.none(predicate: ((ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument..org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument?)

'it' @ [93:69] ==> value-parameter it: (ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub.<anonymous>[ValueParameterDescriptorImpl]

'projection' @ [93:72] ==> public final val ProtoBuf.Type.Argument.projection: (ProtoBuf.Type.Argument.Projection..ProtoBuf.Type.Argument.Projection?)[MyPropertyDescriptor]

'STAR' @ [93:97] ==> enum entry STAR defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument.Projection[FakeCallableDescriptorForObject]

'shouldBuildAsFunctionType' @ [94:13] ==> val shouldBuildAsFunctionType: Boolean defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[LocalVariableDescriptor]

'component1' @ [95:18] ==> public final operator fun component1(): List<ClassIdWithTarget> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [95:40] ==> public final operator fun component2(): List<ClassIdWithTarget> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'annotations' @ [96:21] ==> value-parameter annotations: List<ClassIdWithTarget> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'partition' @ [96:33] ==> public inline fun <T> Iterable<ClassIdWithTarget>.partition(predicate: (ClassIdWithTarget) -> Boolean): Pair<List<ClassIdWithTarget>, List<ClassIdWithTarget>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassIdWithTarget

'it' @ [96:45] ==> value-parameter it: ClassIdWithTarget defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub.<anonymous>[ValueParameterDescriptorImpl]

'classId' @ [96:48] ==> public final val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassIdWithTarget[PropertyDescriptorImpl]

'asSingleFqName' @ [96:56] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'FQ_NAMES' @ [96:91] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'extensionFunctionType' @ [96:100] ==> public final val extensionFunctionType: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'createTypeAnnotationStubs' @ [98:13] ==> private final fun createTypeAnnotationStubs(parent: KotlinStubBaseImpl<*>, type: ProtoBuf.Type, annotations: List<ClassIdWithTarget>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'parent' @ [98:39] ==> value-parameter parent: KotlinStubBaseImpl<*> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'type' @ [98:47] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'notExtensionAnnotations' @ [98:53] ==> val notExtensionAnnotations: List<ClassIdWithTarget> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[LocalVariableDescriptor]

'extensionAnnotations' @ [100:31] ==> val extensionAnnotations: List<ClassIdWithTarget> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[LocalVariableDescriptor]

'isNotEmpty' @ [100:52] ==> @InlineOnly public inline fun <T> Collection<ClassIdWithTarget>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassIdWithTarget

'createFunctionTypeStub' @ [101:13] ==> private final fun createFunctionTypeStub(parent: StubElement<out PsiElement>, type: ProtoBuf.Type, isExtensionFunctionType: Boolean, isSuspend: Boolean): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'nullableTypeParent' @ [101:36] ==> private final fun nullableTypeParent(parent: KotlinStubBaseImpl<*>, type: ProtoBuf.Type): KotlinStubBaseImpl<*> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'parent' @ [101:55] ==> value-parameter parent: KotlinStubBaseImpl<*> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'type' @ [101:63] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'type' @ [101:70] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'isExtension' @ [101:76] ==> val isExtension: Boolean defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[LocalVariableDescriptor]

'SUSPEND_TYPE' @ [101:95] ==> public final val SUSPEND_TYPE: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [101:108] ==> @NotNull public open fun get(p0: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'type' @ [101:112] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'flags' @ [101:117] ==> public final val ProtoBuf.Type.flags: Int[MyPropertyDescriptor]

'createTypeAnnotationStubs' @ [106:9] ==> private final fun createTypeAnnotationStubs(parent: KotlinStubBaseImpl<*>, type: ProtoBuf.Type, annotations: List<ClassIdWithTarget>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'parent' @ [106:35] ==> value-parameter parent: KotlinStubBaseImpl<*> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'type' @ [106:43] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'annotations' @ [106:49] ==> value-parameter annotations: List<ClassIdWithTarget> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'generateSequence' @ [108:30] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: ProtoBuf.Type?, nextFunction: (ProtoBuf.Type) -> ProtoBuf.Type?): Sequence<ProtoBuf.Type> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Type

'type' @ [108:47] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'it' @ [108:55] ==> value-parameter it: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub.<anonymous>[ValueParameterDescriptorImpl]

'outerType' @ [108:58] ==> public fun ProtoBuf.Type.outerType(typeTable: TypeTable): ProtoBuf.Type? defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'c' @ [108:68] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'typeTable' @ [108:70] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'toList' @ [108:83] ==> public fun <T> Sequence<ProtoBuf.Type>.toList(): List<ProtoBuf.Type> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'createStubForTypeName' @ [110:9] ==> public fun createStubForTypeName(typeClassId: ClassId, parent: StubElement<out PsiElement>, bindTypeArguments: (KotlinUserTypeStub, Int) -> Unit = ...): KotlinUserTypeStub defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'classId' @ [110:31] ==> val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[LocalVariableDescriptor]

'nullableTypeParent' @ [110:40] ==> private final fun nullableTypeParent(parent: KotlinStubBaseImpl<*>, type: ProtoBuf.Type): KotlinStubBaseImpl<*> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'parent' @ [110:59] ==> value-parameter parent: KotlinStubBaseImpl<*> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'type' @ [110:67] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[ValueParameterDescriptorImpl]

'outerTypeChain' @ [112:13] ==> val outerTypeChain: List<ProtoBuf.Type> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub[LocalVariableDescriptor]

'getOrNull' @ [112:28] ==> public fun <T> List<ProtoBuf.Type>.getOrNull(index: Int): ProtoBuf.Type? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'index' @ [112:38] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [112:46] ==> @InlineOnly public inline fun <T, R> ProtoBuf.Type.let(block: (ProtoBuf.Type) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> Unit

'createTypeArgumentListStub' @ [112:52] ==> private final fun createTypeArgumentListStub(typeStub: KotlinUserTypeStub, typeArgumentProtoList: List<ProtoBuf.Type.Argument>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'userTypeStub' @ [112:79] ==> value-parameter userTypeStub: KotlinUserTypeStub defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [112:93] ==> value-parameter it: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createClassReferenceTypeStub.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'argumentList' @ [112:96] ==> public final val ProtoBuf.Type.argumentList: (MutableList<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>..List<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>?)[MyPropertyDescriptor]

'getTypeModifiersAsWritten' @ [117:29] ==> private final fun getTypeModifiersAsWritten(type: ProtoBuf.Type): Set<KtModifierKeywordToken> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'type' @ [117:55] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeAnnotationStubs[ValueParameterDescriptorImpl]

'annotations' @ [118:13] ==> value-parameter annotations: List<ClassIdWithTarget> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeAnnotationStubs[ValueParameterDescriptorImpl]

'isEmpty' @ [118:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'typeModifiers' @ [118:38] ==> val typeModifiers: Set<KtModifierKeywordToken> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeAnnotationStubs[LocalVariableDescriptor]

'isEmpty' @ [118:52] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'ModifierMaskUtils' @ [119:33] ==> public object ModifierMaskUtils defined in org.jetbrains.kotlin.psi.stubs.impl[FakeCallableDescriptorForObject]

'computeMask' @ [119:51] ==> @JvmStatic public final fun computeMask(hasModifier: (KtModifierKeywordToken) -> Boolean): Int defined in org.jetbrains.kotlin.psi.stubs.impl.ModifierMaskUtils[DeserializedSimpleFunctionDescriptor]

'it' @ [119:65] ==> value-parameter it: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeAnnotationStubs.<anonymous>[ValueParameterDescriptorImpl]

'typeModifiers' @ [119:71] ==> val typeModifiers: Set<KtModifierKeywordToken> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeAnnotationStubs[LocalVariableDescriptor]

'KotlinModifierListStubImpl' @ [120:29] ==> public constructor KotlinModifierListStubImpl(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: Int, @NotNull p2: KtModifierListElementType<*>) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinModifierListStubImpl[JavaClassConstructorDescriptor]

'parent' @ [120:56] ==> value-parameter parent: KotlinStubBaseImpl<*> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeAnnotationStubs[ValueParameterDescriptorImpl]

'typeModifiersMask' @ [120:64] ==> val typeModifiersMask: Int defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeAnnotationStubs[LocalVariableDescriptor]

'MODIFIER_LIST' @ [120:102] ==> public final val MODIFIER_LIST: (KtModifierListElementType<(KtDeclarationModifierList..KtDeclarationModifierList?)>..KtModifierListElementType<(KtDeclarationModifierList..KtDeclarationModifierList?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'createTargetedAnnotationStubs' @ [121:9] ==> public fun createTargetedAnnotationStubs(annotationIds: List<ClassIdWithTarget>, parent: KotlinStubBaseImpl<*>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'annotations' @ [121:39] ==> value-parameter annotations: List<ClassIdWithTarget> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeAnnotationStubs[ValueParameterDescriptorImpl]

'modifiersList' @ [121:52] ==> val modifiersList: KotlinModifierListStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeAnnotationStubs[LocalVariableDescriptor]

'!' @ [125:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [125:14] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.getTypeModifiersAsWritten[ValueParameterDescriptorImpl]

'hasClassName' @ [125:19] ==> public open fun hasClassName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'!' @ [125:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [125:38] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.getTypeModifiersAsWritten[ValueParameterDescriptorImpl]

'hasTypeAliasName' @ [125:43] ==> public open fun hasTypeAliasName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'emptySet' @ [125:70] ==> public fun <T> emptySet(): Set<KtModifierKeywordToken> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtModifierKeywordToken

'hashSetOf' @ [127:22] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<KtModifierKeywordToken> /* = HashSet<KtModifierKeywordToken> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtModifierKeywordToken

'SUSPEND_TYPE' @ [129:19] ==> public final val SUSPEND_TYPE: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [129:32] ==> @NotNull public open fun get(p0: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'type' @ [129:36] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.getTypeModifiersAsWritten[ValueParameterDescriptorImpl]

'flags' @ [129:41] ==> public final val ProtoBuf.Type.flags: Int[MyPropertyDescriptor]

'result' @ [130:13] ==> val result: HashSet<KtModifierKeywordToken> /* = HashSet<KtModifierKeywordToken> */ defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.getTypeModifiersAsWritten[LocalVariableDescriptor]

'add' @ [130:20] ==> public open fun add(element: KtModifierKeywordToken): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'SUSPEND_KEYWORD' @ [130:33] ==> public final val SUSPEND_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'result' @ [133:16] ==> val result: HashSet<KtModifierKeywordToken> /* = HashSet<KtModifierKeywordToken> */ defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.getTypeModifiersAsWritten[LocalVariableDescriptor]

'typeArgumentProtoList' @ [137:13] ==> value-parameter typeArgumentProtoList: List<ProtoBuf.Type.Argument> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeArgumentListStub[ValueParameterDescriptorImpl]

'isEmpty' @ [137:35] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'KotlinPlaceHolderStubImpl' @ [140:37] ==> public constructor KotlinPlaceHolderStubImpl<T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinPlaceHolderStubImpl[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)> -> KtTypeArgumentList

'typeStub' @ [140:83] ==> value-parameter typeStub: KotlinUserTypeStub defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeArgumentListStub[ValueParameterDescriptorImpl]

'TYPE_ARGUMENT_LIST' @ [140:112] ==> public final val TYPE_ARGUMENT_LIST: (KtPlaceHolderStubElementType<(KtTypeArgumentList..KtTypeArgumentList?)>..KtPlaceHolderStubElementType<(KtTypeArgumentList..KtTypeArgumentList?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'typeArgumentProtoList' @ [141:9] ==> value-parameter typeArgumentProtoList: List<ProtoBuf.Type.Argument> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeArgumentListStub[ValueParameterDescriptorImpl]

'forEach' @ [141:31] ==> @HidesMembers public inline fun <T> Iterable<ProtoBuf.Type.Argument>.forEach(action: (ProtoBuf.Type.Argument) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Argument

'typeArgumentProto' @ [142:34] ==> value-parameter typeArgumentProto: ProtoBuf.Type.Argument defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeArgumentListStub.<anonymous>[ValueParameterDescriptorImpl]

'projection' @ [142:52] ==> public final val ProtoBuf.Type.Argument.projection: (ProtoBuf.Type.Argument.Projection..ProtoBuf.Type.Argument.Projection?)[MyPropertyDescriptor]

'toProjectionKind' @ [142:63] ==> private final fun ProtoBuf.Type.Argument.Projection.toProjectionKind(): KtProjectionKind defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'KotlinTypeProjectionStubImpl' @ [143:34] ==> public constructor KotlinTypeProjectionStubImpl(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: Int) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinTypeProjectionStubImpl[JavaClassConstructorDescriptor]

'typeArgumentsListStub' @ [143:63] ==> val typeArgumentsListStub: KotlinPlaceHolderStubImpl<KtTypeArgumentList> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeArgumentListStub[LocalVariableDescriptor]

'projectionKind' @ [143:86] ==> val projectionKind: KtProjectionKind defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeArgumentListStub.<anonymous>[LocalVariableDescriptor]

'ordinal' @ [143:101] ==> public final val ordinal: Int defined in org.jetbrains.kotlin.psi.KtProjectionKind[DeserializedPropertyDescriptor]

'projectionKind' @ [144:17] ==> val projectionKind: KtProjectionKind defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeArgumentListStub.<anonymous>[LocalVariableDescriptor]

'STAR' @ [144:52] ==> enum entry STAR defined in org.jetbrains.kotlin.psi.KtProjectionKind[FakeCallableDescriptorForObject]

'projectionKind' @ [145:44] ==> val projectionKind: KtProjectionKind defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeArgumentListStub.<anonymous>[LocalVariableDescriptor]

'token' @ [145:59] ==> public final val KtProjectionKind.token: KtSingleValueToken?[MyPropertyDescriptor]

'createModifierListStub' @ [146:17] ==> public fun createModifierListStub(parent: StubElement<out PsiElement>, modifiers: Collection<KtModifierKeywordToken>): KotlinModifierListStubImpl? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'typeProjection' @ [146:40] ==> val typeProjection: KotlinTypeProjectionStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeArgumentListStub.<anonymous>[LocalVariableDescriptor]

'listOfNotNull' @ [146:56] ==> public fun <T : Any> listOfNotNull(element: KtModifierKeywordToken?): List<KtModifierKeywordToken> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtModifierKeywordToken

'modifierKeywordToken' @ [146:70] ==> val modifierKeywordToken: KtModifierKeywordToken? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeArgumentListStub.<anonymous>[LocalVariableDescriptor]

'createTypeReferenceStub' @ [147:17] ==> public final fun createTypeReferenceStub(parent: StubElement<out PsiElement>, type: ProtoBuf.Type, additionalAnnotations: () -> List<ClassIdWithTarget> = ...): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'typeProjection' @ [147:41] ==> val typeProjection: KotlinTypeProjectionStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeArgumentListStub.<anonymous>[LocalVariableDescriptor]

'typeArgumentProto' @ [147:57] ==> value-parameter typeArgumentProto: ProtoBuf.Type.Argument defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeArgumentListStub.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [147:75] ==> public fun ProtoBuf.Type.Argument.type(typeTable: TypeTable): ProtoBuf.Type? defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'c' @ [147:80] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'typeTable' @ [147:82] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'when (this) {
        Projection.IN -> KtProjectionKind.IN
        Projection.OUT -> KtProjectionKind.OUT
        Projection.INV -> KtProjectionKind.NONE
        Projection.STAR -> KtProjectionKind.STAR
    }' @ [152:49] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtProjectionKind, entry1: KtProjectionKind, entry2: KtProjectionKind, entry3: KtProjectionKind): KtProjectionKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtProjectionKind

'this' @ [152:55] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.toProjectionKind[ReceiverParameterDescriptorImpl]

'IN' @ [153:20] ==> enum entry IN defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument.Projection[FakeCallableDescriptorForObject]

'IN' @ [153:43] ==> enum entry IN defined in org.jetbrains.kotlin.psi.KtProjectionKind[FakeCallableDescriptorForObject]

'OUT' @ [154:20] ==> enum entry OUT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument.Projection[FakeCallableDescriptorForObject]

'OUT' @ [154:44] ==> enum entry OUT defined in org.jetbrains.kotlin.psi.KtProjectionKind[FakeCallableDescriptorForObject]

'INV' @ [155:20] ==> enum entry INV defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument.Projection[FakeCallableDescriptorForObject]

'NONE' @ [155:44] ==> enum entry NONE defined in org.jetbrains.kotlin.psi.KtProjectionKind[FakeCallableDescriptorForObject]

'STAR' @ [156:20] ==> enum entry STAR defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument.Projection[FakeCallableDescriptorForObject]

'STAR' @ [156:45] ==> enum entry STAR defined in org.jetbrains.kotlin.psi.KtProjectionKind[FakeCallableDescriptorForObject]

'type' @ [160:32] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[ValueParameterDescriptorImpl]

'argumentList' @ [160:37] ==> public final val ProtoBuf.Type.argumentList: (MutableList<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>..List<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>?)[MyPropertyDescriptor]

'KotlinPlaceHolderStubImpl' @ [161:28] ==> public constructor KotlinPlaceHolderStubImpl<T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinPlaceHolderStubImpl[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)> -> KtFunctionType

'parent' @ [161:70] ==> value-parameter parent: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[ValueParameterDescriptorImpl]

'FUNCTION_TYPE' @ [161:97] ==> public final val FUNCTION_TYPE: (KtPlaceHolderStubElementType<(KtFunctionType..KtFunctionType?)>..KtPlaceHolderStubElementType<(KtFunctionType..KtFunctionType?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'isExtensionFunctionType' @ [162:13] ==> value-parameter isExtensionFunctionType: Boolean defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[ValueParameterDescriptorImpl]

'KotlinPlaceHolderStubImpl' @ [164:23] ==> public constructor KotlinPlaceHolderStubImpl<T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinPlaceHolderStubImpl[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)> -> KtFunctionTypeReceiver

'functionType' @ [164:73] ==> val functionType: KotlinPlaceHolderStubImpl<KtFunctionType> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'FUNCTION_TYPE_RECEIVER' @ [164:106] ==> public final val FUNCTION_TYPE_RECEIVER: (KtPlaceHolderStubElementType<(KtFunctionTypeReceiver..KtFunctionTypeReceiver?)>..KtPlaceHolderStubElementType<(KtFunctionTypeReceiver..KtFunctionTypeReceiver?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'typeArgumentList' @ [165:37] ==> val typeArgumentList: (MutableList<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>..List<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'first' @ [165:54] ==> public fun <T> List<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>.first(): (ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument..org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument?)

'type' @ [165:62] ==> public fun ProtoBuf.Type.Argument.type(typeTable: TypeTable): ProtoBuf.Type? defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'c' @ [165:67] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'typeTable' @ [165:69] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'createTypeReferenceStub' @ [166:13] ==> public final fun createTypeReferenceStub(parent: StubElement<out PsiElement>, type: ProtoBuf.Type, additionalAnnotations: () -> List<ClassIdWithTarget> = ...): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'functionTypeReceiverStub' @ [166:37] ==> val functionTypeReceiverStub: KotlinPlaceHolderStubImpl<KtFunctionTypeReceiver> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'receiverTypeProto' @ [166:63] ==> val receiverTypeProto: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'KotlinPlaceHolderStubImpl' @ [169:29] ==> public constructor KotlinPlaceHolderStubImpl<T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinPlaceHolderStubImpl[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)> -> KtParameterList

'functionType' @ [169:72] ==> val functionType: KotlinPlaceHolderStubImpl<KtFunctionType> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'VALUE_PARAMETER_LIST' @ [169:105] ==> public final val VALUE_PARAMETER_LIST: (KtPlaceHolderStubElementType<(KtParameterList..KtParameterList?)>..KtPlaceHolderStubElementType<(KtParameterList..KtParameterList?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'typeArgumentList' @ [171:19] ==> val typeArgumentList: (MutableList<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>..List<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'subList' @ [171:36] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): MutableList<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'if (isExtensionFunctionType) 1 else 0' @ [171:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'isExtensionFunctionType' @ [171:48] ==> value-parameter isExtensionFunctionType: Boolean defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[ValueParameterDescriptorImpl]

'typeArgumentList' @ [171:83] ==> val typeArgumentList: (MutableList<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>..List<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'size' @ [171:100] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'component1' @ [174:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [174:22] ==> public final operator fun component2(): (ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'typeArgumentsWithoutReceiverAndReturnType' @ [174:35] ==> val typeArgumentsWithoutReceiverAndReturnType: MutableList<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'withIndex' @ [174:77] ==> public fun <T> Iterable<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>.withIndex(): Iterable<IndexedValue<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument..org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument?)

'isSuspend' @ [175:17] ==> value-parameter isSuspend: Boolean defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[ValueParameterDescriptorImpl]

'index' @ [175:30] ==> val index: Int defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'typeArgumentsWithoutReceiverAndReturnType' @ [175:39] ==> val typeArgumentsWithoutReceiverAndReturnType: MutableList<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'size' @ [175:81] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'argument' @ [176:37] ==> val argument: (ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'type' @ [176:46] ==> public fun ProtoBuf.Type.Argument.type(typeTable: TypeTable): ProtoBuf.Type? defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'c' @ [176:51] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'typeTable' @ [176:53] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'parameterType' @ [177:21] ==> val parameterType: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'hasClassName' @ [177:35] ==> public open fun hasClassName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'parameterType' @ [177:53] ==> val parameterType: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'argumentCount' @ [177:67] ==> public final val ProtoBuf.Type.argumentCount: Int[MyPropertyDescriptor]

'c' @ [178:35] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'nameResolver' @ [178:37] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'getClassId' @ [178:50] ==> @NotNull public abstract fun getClassId(p0: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'parameterType' @ [178:61] ==> val parameterType: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'className' @ [178:75] ==> public final val ProtoBuf.Type.className: Int[MyPropertyDescriptor]

'classId' @ [179:34] ==> val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'asSingleFqName' @ [179:42] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'fqName' @ [180:25] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'CONTINUATION_INTERFACE_FQ_NAME' @ [180:51] ==> public final val CONTINUATION_INTERFACE_FQ_NAME: (FqName..FqName?) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaPropertyDescriptor]

'suspendParameterType' @ [181:25] ==> var suspendParameterType: ProtoBuf.Type? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'parameterType' @ [181:48] ==> val parameterType: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'KotlinParameterStubImpl' @ [186:29] ==> public constructor KotlinParameterStubImpl(parent: StubElement<out PsiElement>?, fqName: StringRef?, name: StringRef?, isMutable: Boolean, hasValOrVar: Boolean, hasDefaultValue: Boolean) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinParameterStubImpl[DeserializedClassConstructorDescriptor]

'parameterList' @ [187:21] ==> val parameterList: KotlinPlaceHolderStubImpl<KtParameterList> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'createTypeReferenceStub' @ [190:13] ==> public final fun createTypeReferenceStub(parent: StubElement<out PsiElement>, type: ProtoBuf.Type, additionalAnnotations: () -> List<ClassIdWithTarget> = ...): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [190:37] ==> val parameter: KotlinParameterStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'argument' @ [190:48] ==> val argument: (ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'type' @ [190:57] ==> public fun ProtoBuf.Type.Argument.type(typeTable: TypeTable): ProtoBuf.Type? defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'c' @ [190:62] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'typeTable' @ [190:64] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'if (suspendParameterType == null) {
            val returnType = typeArgumentList.last().type(c.typeTable)!!
            createTypeReferenceStub(functionType, returnType)
        }
        else {
            createTypeReferenceStub(functionType, suspendParameterType.getArgument(0).type)
        }' @ [194:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'suspendParameterType' @ [194:13] ==> var suspendParameterType: ProtoBuf.Type? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'typeArgumentList' @ [195:30] ==> val typeArgumentList: (MutableList<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>..List<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'last' @ [195:47] ==> public fun <T> List<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>.last(): (ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument..org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument?)

'type' @ [195:54] ==> public fun ProtoBuf.Type.Argument.type(typeTable: TypeTable): ProtoBuf.Type? defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'c' @ [195:59] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'typeTable' @ [195:61] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'createTypeReferenceStub' @ [196:13] ==> public final fun createTypeReferenceStub(parent: StubElement<out PsiElement>, type: ProtoBuf.Type, additionalAnnotations: () -> List<ClassIdWithTarget> = ...): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'functionType' @ [196:37] ==> val functionType: KotlinPlaceHolderStubImpl<KtFunctionType> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'returnType' @ [196:51] ==> val returnType: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'createTypeReferenceStub' @ [199:13] ==> public final fun createTypeReferenceStub(parent: StubElement<out PsiElement>, type: ProtoBuf.Type, additionalAnnotations: () -> List<ClassIdWithTarget> = ...): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'functionType' @ [199:37] ==> val functionType: KotlinPlaceHolderStubImpl<KtFunctionType> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'suspendParameterType' @ [199:51] ==> var suspendParameterType: ProtoBuf.Type? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createFunctionTypeStub[LocalVariableDescriptor]

'getArgument' @ [199:72] ==> public open fun getArgument(p0: Int): (ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'type' @ [199:87] ==> public final val ProtoBuf.Type.Argument.type: (ProtoBuf.Type..ProtoBuf.Type?)[MyPropertyDescriptor]

'KotlinPlaceHolderStubImpl' @ [209:33] ==> public constructor KotlinPlaceHolderStubImpl<T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinPlaceHolderStubImpl[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)> -> KtParameterList

'parent' @ [209:76] ==> value-parameter parent: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[ValueParameterDescriptorImpl]

'VALUE_PARAMETER_LIST' @ [209:103] ==> public final val VALUE_PARAMETER_LIST: (KtPlaceHolderStubElementType<(KtParameterList..KtParameterList?)>..KtPlaceHolderStubElementType<(KtParameterList..KtParameterList?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'component1' @ [210:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [210:22] ==> public final operator fun component2(): ProtoBuf.ValueParameter defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'parameters' @ [210:46] ==> value-parameter parameters: List<ProtoBuf.ValueParameter> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[ValueParameterDescriptorImpl]

'withIndex' @ [210:57] ==> public fun <T> Iterable<ProtoBuf.ValueParameter>.withIndex(): Iterable<IndexedValue<ProtoBuf.ValueParameter>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameter

'c' @ [211:24] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'nameResolver' @ [211:26] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'getName' @ [211:39] ==> @NotNull public abstract fun getName(p0: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'valueParameterProto' @ [211:47] ==> val valueParameterProto: ProtoBuf.ValueParameter defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'name' @ [211:67] ==> public final val ProtoBuf.ValueParameter.name: Int[MyPropertyDescriptor]

'KotlinParameterStubImpl' @ [212:33] ==> public constructor KotlinParameterStubImpl(parent: StubElement<out PsiElement>?, fqName: StringRef?, name: StringRef?, isMutable: Boolean, hasValOrVar: Boolean, hasDefaultValue: Boolean) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinParameterStubImpl[DeserializedClassConstructorDescriptor]

'parameterListStub' @ [213:21] ==> val parameterListStub: KotlinPlaceHolderStubImpl<KtParameterList> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'name' @ [214:28] ==> val name: Name defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'ref' @ [214:33] ==> public fun Name.ref(): StringRef defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'valueParameterProto' @ [220:37] ==> val valueParameterProto: ProtoBuf.ValueParameter defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'varargElementType' @ [220:57] ==> public fun ProtoBuf.ValueParameter.varargElementType(typeTable: TypeTable): ProtoBuf.Type? defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'c' @ [220:75] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'typeTable' @ [220:77] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'varargElementType' @ [221:29] ==> val varargElementType: ProtoBuf.Type? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'valueParameterProto' @ [221:50] ==> val valueParameterProto: ProtoBuf.ValueParameter defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'type' @ [221:70] ==> public fun ProtoBuf.ValueParameter.type(typeTable: TypeTable): ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'c' @ [221:75] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'typeTable' @ [221:77] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'arrayListOf' @ [222:29] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<KtModifierKeywordToken> /* = ArrayList<KtModifierKeywordToken> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtModifierKeywordToken

'varargElementType' @ [224:17] ==> val varargElementType: ProtoBuf.Type? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'modifiers' @ [224:46] ==> val modifiers: ArrayList<KtModifierKeywordToken> /* = ArrayList<KtModifierKeywordToken> */ defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'add' @ [224:56] ==> public open fun add(element: KtModifierKeywordToken): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'VARARG_KEYWORD' @ [224:69] ==> public final val VARARG_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'IS_CROSSINLINE' @ [225:23] ==> public final val IS_CROSSINLINE: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [225:38] ==> @NotNull public open fun get(p0: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'valueParameterProto' @ [225:42] ==> val valueParameterProto: ProtoBuf.ValueParameter defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'flags' @ [225:62] ==> public final val ProtoBuf.ValueParameter.flags: Int[MyPropertyDescriptor]

'modifiers' @ [225:72] ==> val modifiers: ArrayList<KtModifierKeywordToken> /* = ArrayList<KtModifierKeywordToken> */ defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'add' @ [225:82] ==> public open fun add(element: KtModifierKeywordToken): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'CROSSINLINE_KEYWORD' @ [225:95] ==> public final val CROSSINLINE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'IS_NOINLINE' @ [226:23] ==> public final val IS_NOINLINE: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [226:35] ==> @NotNull public open fun get(p0: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'valueParameterProto' @ [226:39] ==> val valueParameterProto: ProtoBuf.ValueParameter defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'flags' @ [226:59] ==> public final val ProtoBuf.ValueParameter.flags: Int[MyPropertyDescriptor]

'modifiers' @ [226:69] ==> val modifiers: ArrayList<KtModifierKeywordToken> /* = ArrayList<KtModifierKeywordToken> */ defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'add' @ [226:79] ==> public open fun add(element: KtModifierKeywordToken): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'NOINLINE_KEYWORD' @ [226:92] ==> public final val NOINLINE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'createModifierListStub' @ [228:32] ==> public fun createModifierListStub(parent: StubElement<out PsiElement>, modifiers: Collection<KtModifierKeywordToken>): KotlinModifierListStubImpl? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'parameterStub' @ [228:55] ==> val parameterStub: KotlinParameterStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'modifiers' @ [228:70] ==> val modifiers: ArrayList<KtModifierKeywordToken> /* = ArrayList<KtModifierKeywordToken> */ defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'c' @ [229:40] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'components' @ [229:42] ==> public final val components: ClsStubBuilderComponents defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'annotationLoader' @ [229:53] ==> public final val annotationLoader: AnnotationAndConstantLoader<ClassId, Unit, ClassIdWithTarget> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderComponents[PropertyDescriptorImpl]

'loadValueParameterAnnotations' @ [229:70] ==> public abstract fun loadValueParameterAnnotations(container: ProtoContainer, callableProto: MessageLite, kind: AnnotatedCallableKind, parameterIndex: Int, proto: ProtoBuf.ValueParameter): List<ClassId> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoader[DeserializedSimpleFunctionDescriptor]

'container' @ [230:21] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[ValueParameterDescriptorImpl]

'callableProto' @ [230:32] ==> value-parameter callableProto: MessageLite defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[ValueParameterDescriptorImpl]

'callableProto' @ [230:47] ==> value-parameter callableProto: MessageLite defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[ValueParameterDescriptorImpl]

'annotatedCallableKind' @ [230:61] ==> public val MessageLite.annotatedCallableKind: AnnotatedCallableKind defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[PropertyDescriptorImpl]

'index' @ [230:84] ==> val index: Int defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'valueParameterProto' @ [230:91] ==> val valueParameterProto: ProtoBuf.ValueParameter defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'parameterAnnotations' @ [232:17] ==> val parameterAnnotations: List<ClassId> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'isNotEmpty' @ [232:38] ==> @InlineOnly public inline fun <T> Collection<ClassId>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId

'createAnnotationStubs' @ [233:17] ==> public fun createAnnotationStubs(annotationIds: List<ClassId>, parent: KotlinStubBaseImpl<*>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'parameterAnnotations' @ [233:39] ==> val parameterAnnotations: List<ClassId> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'modifierList' @ [233:61] ==> val modifierList: KotlinModifierListStubImpl? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'createEmptyModifierListStub' @ [233:77] ==> public fun createEmptyModifierListStub(parent: KotlinStubBaseImpl<*>): KotlinModifierListStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'parameterStub' @ [233:105] ==> val parameterStub: KotlinParameterStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'createTypeReferenceStub' @ [236:13] ==> public final fun createTypeReferenceStub(parent: StubElement<out PsiElement>, type: ProtoBuf.Type, additionalAnnotations: () -> List<ClassIdWithTarget> = ...): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'parameterStub' @ [236:37] ==> val parameterStub: KotlinParameterStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'typeProto' @ [236:52] ==> val typeProto: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createValueParameterListStub[LocalVariableDescriptor]

'typeParameterProtoList' @ [244:13] ==> value-parameter typeParameterProtoList: List<ProtoBuf.TypeParameter> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[ValueParameterDescriptorImpl]

'isEmpty' @ [244:36] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'listOf' @ [244:54] ==> @InlineOnly public inline fun <T> listOf(): List<Pair<Name, ProtoBuf.Type>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Name, Type>

'KotlinPlaceHolderStubImpl' @ [246:37] ==> public constructor KotlinPlaceHolderStubImpl<T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinPlaceHolderStubImpl[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)> -> KtTypeParameterList

'parent' @ [246:84] ==> value-parameter parent: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[ValueParameterDescriptorImpl]

'TYPE_PARAMETER_LIST' @ [246:111] ==> public final val TYPE_PARAMETER_LIST: (KtPlaceHolderStubElementType<(KtTypeParameterList..KtTypeParameterList?)>..KtPlaceHolderStubElementType<(KtTypeParameterList..KtTypeParameterList?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'arrayListOf' @ [247:43] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Pair<Name, ProtoBuf.Type>> /* = ArrayList<Pair<Name, ProtoBuf.Type>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Name, Type>

'typeParameterProtoList' @ [248:23] ==> value-parameter typeParameterProtoList: List<ProtoBuf.TypeParameter> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[ValueParameterDescriptorImpl]

'c' @ [249:24] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'nameResolver' @ [249:26] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'getName' @ [249:39] ==> @NotNull public abstract fun getName(p0: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'proto' @ [249:47] ==> val proto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'name' @ [249:53] ==> public final val ProtoBuf.TypeParameter.name: Int[MyPropertyDescriptor]

'KotlinTypeParameterStubImpl' @ [250:37] ==> public constructor KotlinTypeParameterStubImpl(parent: StubElement<out PsiElement>?, name: StringRef?, isInVariance: Boolean, isOutVariance: Boolean) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinTypeParameterStubImpl[DeserializedClassConstructorDescriptor]

'typeParameterListStub' @ [251:21] ==> val typeParameterListStub: KotlinPlaceHolderStubImpl<KtTypeParameterList> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'name' @ [252:28] ==> val name: Name defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'ref' @ [252:33] ==> public fun Name.ref(): StringRef defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'proto' @ [253:36] ==> val proto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'variance' @ [253:42] ==> public final val ProtoBuf.TypeParameter.variance: (ProtoBuf.TypeParameter.Variance..ProtoBuf.TypeParameter.Variance?)[MyPropertyDescriptor]

'IN' @ [253:63] ==> enum entry IN defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter.Variance[FakeCallableDescriptorForObject]

'proto' @ [254:37] ==> val proto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'variance' @ [254:43] ==> public final val ProtoBuf.TypeParameter.variance: (ProtoBuf.TypeParameter.Variance..ProtoBuf.TypeParameter.Variance?)[MyPropertyDescriptor]

'OUT' @ [254:64] ==> enum entry OUT defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter.Variance[FakeCallableDescriptorForObject]

'createTypeParameterModifierListStub' @ [256:13] ==> private final fun createTypeParameterModifierListStub(typeParameterStub: KotlinTypeParameterStubImpl, typeParameterProto: ProtoBuf.TypeParameter): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'typeParameterStub' @ [256:49] ==> val typeParameterStub: KotlinTypeParameterStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'proto' @ [256:68] ==> val proto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'proto' @ [257:36] ==> val proto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'upperBounds' @ [257:42] ==> public fun ProtoBuf.TypeParameter.upperBounds(typeTable: TypeTable): List<ProtoBuf.Type> defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'c' @ [257:54] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'typeTable' @ [257:56] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'upperBoundProtos' @ [258:17] ==> val upperBoundProtos: List<ProtoBuf.Type> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'isNotEmpty' @ [258:34] ==> @InlineOnly public inline fun <T> Collection<ProtoBuf.Type>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'upperBoundProtos' @ [259:34] ==> val upperBoundProtos: List<ProtoBuf.Type> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'first' @ [259:51] ==> public fun <T> List<ProtoBuf.Type>.first(): ProtoBuf.Type defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'!' @ [260:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'upperBound' @ [260:22] ==> val upperBound: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'isDefaultUpperBound' @ [260:33] ==> private final fun ProtoBuf.Type.isDefaultUpperBound(): Boolean defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'createTypeReferenceStub' @ [261:21] ==> public final fun createTypeReferenceStub(parent: StubElement<out PsiElement>, type: ProtoBuf.Type, additionalAnnotations: () -> List<ClassIdWithTarget> = ...): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'typeParameterStub' @ [261:45] ==> val typeParameterStub: KotlinTypeParameterStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'upperBound' @ [261:64] ==> val upperBound: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'protosForTypeConstraintList' @ [263:17] ==> val protosForTypeConstraintList: ArrayList<Pair<Name, ProtoBuf.Type>> /* = ArrayList<Pair<Name, ProtoBuf.Type>> */ defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'addAll' @ [263:45] ==> public open fun addAll(elements: Collection<Pair<Name, ProtoBuf.Type>>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'upperBoundProtos' @ [263:52] ==> val upperBoundProtos: List<ProtoBuf.Type> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'drop' @ [263:69] ==> public fun <T> Iterable<ProtoBuf.Type>.drop(n: Int): List<ProtoBuf.Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'map' @ [263:77] ==> public inline fun <T, R> Iterable<ProtoBuf.Type>.map(transform: (ProtoBuf.Type) -> Pair<Name, ProtoBuf.Type>): List<Pair<Name, ProtoBuf.Type>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> Pair<Name, Type>

'Pair' @ [263:83] ==> public constructor Pair<out A, out B>(first: Name, second: ProtoBuf.Type) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Name
    <out B> -> Type

'name' @ [263:88] ==> val name: Name defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'it' @ [263:94] ==> value-parameter it: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub.<anonymous>[ValueParameterDescriptorImpl]

'protosForTypeConstraintList' @ [266:16] ==> val protosForTypeConstraintList: ArrayList<Pair<Name, ProtoBuf.Type>> /* = ArrayList<Pair<Name, ProtoBuf.Type>> */ defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterListStub[LocalVariableDescriptor]

'protosForTypeConstraintList' @ [273:13] ==> value-parameter protosForTypeConstraintList: List<Pair<Name, ProtoBuf.Type>> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeConstraintListStub[ValueParameterDescriptorImpl]

'isEmpty' @ [273:41] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'KotlinPlaceHolderStubImpl' @ [276:38] ==> public constructor KotlinPlaceHolderStubImpl<T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinPlaceHolderStubImpl[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)> -> KtTypeConstraintList

'parent' @ [276:86] ==> value-parameter parent: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeConstraintListStub[ValueParameterDescriptorImpl]

'TYPE_CONSTRAINT_LIST' @ [276:113] ==> public final val TYPE_CONSTRAINT_LIST: (KtPlaceHolderStubElementType<(KtTypeConstraintList..KtTypeConstraintList?)>..KtPlaceHolderStubElementType<(KtTypeConstraintList..KtTypeConstraintList?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'component1' @ [277:15] ==> public final operator fun component1(): Name defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [277:21] ==> public final operator fun component2(): ProtoBuf.Type defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'protosForTypeConstraintList' @ [277:30] ==> value-parameter protosForTypeConstraintList: List<Pair<Name, ProtoBuf.Type>> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeConstraintListStub[ValueParameterDescriptorImpl]

'KotlinPlaceHolderStubImpl' @ [278:38] ==> public constructor KotlinPlaceHolderStubImpl<T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinPlaceHolderStubImpl[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)> -> KtTypeConstraint

'typeConstraintListStub' @ [278:82] ==> val typeConstraintListStub: KotlinPlaceHolderStubImpl<KtTypeConstraintList> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeConstraintListStub[LocalVariableDescriptor]

'TYPE_CONSTRAINT' @ [278:125] ==> public final val TYPE_CONSTRAINT: (KtPlaceHolderStubElementType<(KtTypeConstraint..KtTypeConstraint?)>..KtPlaceHolderStubElementType<(KtTypeConstraint..KtTypeConstraint?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'KotlinNameReferenceExpressionStubImpl' @ [279:13] ==> public constructor KotlinNameReferenceExpressionStubImpl(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), @NotNull p1: StringRef) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinNameReferenceExpressionStubImpl[JavaClassConstructorDescriptor]

'typeConstraintStub' @ [279:51] ==> val typeConstraintStub: KotlinPlaceHolderStubImpl<KtTypeConstraint> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeConstraintListStub[LocalVariableDescriptor]

'name' @ [279:71] ==> val name: Name defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeConstraintListStub[LocalVariableDescriptor]

'ref' @ [279:76] ==> public fun Name.ref(): StringRef defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'createTypeReferenceStub' @ [280:13] ==> public final fun createTypeReferenceStub(parent: StubElement<out PsiElement>, type: ProtoBuf.Type, additionalAnnotations: () -> List<ClassIdWithTarget> = ...): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'typeConstraintStub' @ [280:37] ==> val typeConstraintStub: KotlinPlaceHolderStubImpl<KtTypeConstraint> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeConstraintListStub[LocalVariableDescriptor]

'type' @ [280:57] ==> val type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeConstraintListStub[LocalVariableDescriptor]

'ArrayList' @ [288:25] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtModifierKeywordToken

'when (typeParameterProto.variance) {
            Variance.IN -> modifiers.add(KtTokens.IN_KEYWORD)
            Variance.OUT -> modifiers.add(KtTokens.OUT_KEYWORD)
            Variance.INV -> { /* do nothing */ }
            null ->  { /* do nothing */ }
        }' @ [289:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'typeParameterProto' @ [289:15] ==> value-parameter typeParameterProto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterModifierListStub[ValueParameterDescriptorImpl]

'variance' @ [289:34] ==> public final val ProtoBuf.TypeParameter.variance: (ProtoBuf.TypeParameter.Variance..ProtoBuf.TypeParameter.Variance?)[MyPropertyDescriptor]

'IN' @ [290:22] ==> enum entry IN defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter.Variance[FakeCallableDescriptorForObject]

'modifiers' @ [290:28] ==> val modifiers: ArrayList<KtModifierKeywordToken> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterModifierListStub[LocalVariableDescriptor]

'add' @ [290:38] ==> public open fun add(element: KtModifierKeywordToken): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'IN_KEYWORD' @ [290:51] ==> public final val IN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OUT' @ [291:22] ==> enum entry OUT defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter.Variance[FakeCallableDescriptorForObject]

'modifiers' @ [291:29] ==> val modifiers: ArrayList<KtModifierKeywordToken> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterModifierListStub[LocalVariableDescriptor]

'add' @ [291:39] ==> public open fun add(element: KtModifierKeywordToken): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'OUT_KEYWORD' @ [291:52] ==> public final val OUT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INV' @ [292:22] ==> enum entry INV defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter.Variance[FakeCallableDescriptorForObject]

'typeParameterProto' @ [295:13] ==> value-parameter typeParameterProto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterModifierListStub[ValueParameterDescriptorImpl]

'reified' @ [295:32] ==> public final val ProtoBuf.TypeParameter.reified: Boolean[MyPropertyDescriptor]

'modifiers' @ [296:13] ==> val modifiers: ArrayList<KtModifierKeywordToken> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterModifierListStub[LocalVariableDescriptor]

'add' @ [296:23] ==> public open fun add(element: KtModifierKeywordToken): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'REIFIED_KEYWORD' @ [296:36] ==> public final val REIFIED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'createModifierListStub' @ [299:28] ==> public fun createModifierListStub(parent: StubElement<out PsiElement>, modifiers: Collection<KtModifierKeywordToken>): KotlinModifierListStubImpl? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'typeParameterStub' @ [299:51] ==> value-parameter typeParameterStub: KotlinTypeParameterStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterModifierListStub[ValueParameterDescriptorImpl]

'modifiers' @ [299:70] ==> val modifiers: ArrayList<KtModifierKeywordToken> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterModifierListStub[LocalVariableDescriptor]

'c' @ [301:27] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'components' @ [301:29] ==> public final val components: ClsStubBuilderComponents defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'annotationLoader' @ [301:40] ==> public final val annotationLoader: AnnotationAndConstantLoader<ClassId, Unit, ClassIdWithTarget> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderComponents[PropertyDescriptorImpl]

'loadTypeParameterAnnotations' @ [301:57] ==> public abstract fun loadTypeParameterAnnotations(proto: ProtoBuf.TypeParameter, nameResolver: NameResolver): List<ClassId> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoader[DeserializedSimpleFunctionDescriptor]

'typeParameterProto' @ [301:86] ==> value-parameter typeParameterProto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterModifierListStub[ValueParameterDescriptorImpl]

'c' @ [301:106] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'nameResolver' @ [301:108] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'annotations' @ [302:13] ==> val annotations: List<ClassId> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterModifierListStub[LocalVariableDescriptor]

'isNotEmpty' @ [302:25] ==> @InlineOnly public inline fun <T> Collection<ClassId>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId

'createAnnotationStubs' @ [303:13] ==> public fun createAnnotationStubs(annotationIds: List<ClassId>, parent: KotlinStubBaseImpl<*>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'annotations' @ [304:21] ==> val annotations: List<ClassId> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterModifierListStub[LocalVariableDescriptor]

'modifierList' @ [305:21] ==> val modifierList: KotlinModifierListStubImpl? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterModifierListStub[LocalVariableDescriptor]

'createEmptyModifierListStub' @ [305:37] ==> public fun createEmptyModifierListStub(parent: KotlinStubBaseImpl<*>): KotlinModifierListStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'typeParameterStub' @ [305:65] ==> value-parameter typeParameterStub: KotlinTypeParameterStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.createTypeParameterModifierListStub[ValueParameterDescriptorImpl]

'this' @ [310:16] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.isDefaultUpperBound[ReceiverParameterDescriptorImpl]

'hasClassName' @ [310:21] ==> public open fun hasClassName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'c' @ [311:16] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[PropertyDescriptorImpl]

'nameResolver' @ [311:18] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'getClassId' @ [311:31] ==> @NotNull public abstract fun getClassId(p0: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'className' @ [311:42] ==> public final val ProtoBuf.Type.className: Int[MyPropertyDescriptor]

'let' @ [311:53] ==> @InlineOnly public inline fun <T, R> ClassId.let(block: (ClassId) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId
    <R> -> Boolean

'==' @ [311:59] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'FQ_NAMES' @ [311:74] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'any' @ [311:83] ==> public final val any: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'it' @ [311:90] ==> value-parameter it: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.isDefaultUpperBound.<anonymous>[ValueParameterDescriptorImpl]

'asSingleFqName' @ [311:93] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'toUnsafe' @ [311:110] ==> @NotNull public open fun toUnsafe(): FqNameUnsafe defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'this' @ [312:16] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder.isDefaultUpperBound[ReceiverParameterDescriptorImpl]

'nullable' @ [312:21] ==> public final val ProtoBuf.Type.nullable: Boolean[MyPropertyDescriptor]

