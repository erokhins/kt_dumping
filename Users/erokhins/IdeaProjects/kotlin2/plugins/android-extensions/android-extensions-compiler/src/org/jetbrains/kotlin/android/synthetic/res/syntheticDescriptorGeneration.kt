'SimpleFunctionDescriptorImpl' @ [40:55] ==> protected/*protected and package*/ constructor SimpleFunctionDescriptorImpl(@NotNull p0: DeclarationDescriptor, @Nullable p1: SimpleFunctionDescriptor?, @NotNull p2: Annotations, @NotNull p3: Name, @NotNull p4: CallableMemberDescriptor.Kind, @NotNull p5: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaClassConstructorDescriptor]

'packageFragmentDescriptor' @ [41:13] ==> value-parameter packageFragmentDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.genClearCacheFunction[ValueParameterDescriptorImpl]

'EMPTY' @ [43:25] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'identifier' @ [44:18] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'CLEAR_FUNCTION_NAME' @ [44:42] ==> public final val CLEAR_FUNCTION_NAME: String defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[PropertyDescriptorImpl]

'SYNTHESIZED' @ [45:43] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'NO_SOURCE' @ [46:27] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'packageFragmentDescriptor' @ [48:20] ==> value-parameter packageFragmentDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.genClearCacheFunction[ValueParameterDescriptorImpl]

'builtIns' @ [48:46] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'unitType' @ [48:55] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'function' @ [49:5] ==> val function: <no name provided> defined in org.jetbrains.kotlin.android.synthetic.res.genClearCacheFunction[LocalVariableDescriptor]

'initialize' @ [49:14] ==> @NotNull public open fun initialize(@Nullable p0: KotlinType?, @Nullable p1: ReceiverParameterDescriptor?, @NotNull p2: (MutableList<out (TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>), @NotNull p3: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @Nullable p4: KotlinType?, @Nullable p5: Modality?, @NotNull p6: Visibility): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.android.synthetic.res.genClearCacheFunction.<no name provided>[JavaMethodDescriptor]

'receiverType' @ [49:25] ==> value-parameter receiverType: KotlinType defined in org.jetbrains.kotlin.android.synthetic.res.genClearCacheFunction[ValueParameterDescriptorImpl]

'emptyList' @ [49:45] ==> public fun <T> emptyList(): List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'emptyList' @ [49:58] ==> public fun <T> emptyList(): List<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'unitType' @ [49:71] ==> val unitType: SimpleType defined in org.jetbrains.kotlin.android.synthetic.res.genClearCacheFunction[LocalVariableDescriptor]

'FINAL' @ [49:90] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'PUBLIC' @ [49:110] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'function' @ [50:12] ==> val function: <no name provided> defined in org.jetbrains.kotlin.android.synthetic.res.genClearCacheFunction[LocalVariableDescriptor]

'resolvedWidget' @ [59:20] ==> value-parameter resolvedWidget: ResolvedWidget defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForWidget[ValueParameterDescriptorImpl]

'widget' @ [59:35] ==> public final val widget: AndroidResource.Widget defined in org.jetbrains.kotlin.android.synthetic.res.ResolvedWidget[PropertyDescriptorImpl]

'sourceElement' @ [59:42] ==> public final val sourceElement: PsiElement? defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource.Widget[PropertyDescriptorImpl]

'let' @ [59:57] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> XmlSourceElement): XmlSourceElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> XmlSourceElement

'XmlSourceElement' @ [59:63] ==> public constructor XmlSourceElement(psi: PsiElement) defined in org.jetbrains.kotlin.android.synthetic.res.XmlSourceElement[ClassConstructorDescriptorImpl]

'NO_SOURCE' @ [59:98] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'resolvedWidget' @ [61:27] ==> value-parameter resolvedWidget: ResolvedWidget defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForWidget[ValueParameterDescriptorImpl]

'viewClassDescriptor' @ [61:42] ==> public final val viewClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.android.synthetic.res.ResolvedWidget[PropertyDescriptorImpl]

'classDescriptor' @ [62:16] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForWidget[LocalVariableDescriptor]

'let' @ [62:33] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> SimpleType): SimpleType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> SimpleType

'classDescriptor' @ [63:27] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForWidget[LocalVariableDescriptor]

'defaultType' @ [63:43] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'if (defaultType.constructor.parameters.isEmpty()) {
            defaultType
        }
        else {
            KotlinTypeFactory.simpleNotNullType(
                    Annotations.EMPTY, classDescriptor, defaultType.constructor.parameters.map(::StarProjectionImpl))
        }' @ [65:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'defaultType' @ [65:13] ==> val defaultType: SimpleType defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForWidget.<anonymous>[LocalVariableDescriptor]

'constructor' @ [65:25] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'parameters' @ [65:37] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [65:48] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'defaultType' @ [66:13] ==> val defaultType: SimpleType defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForWidget.<anonymous>[LocalVariableDescriptor]

'simpleNotNullType' @ [69:31] ==> @JvmStatic public final fun simpleNotNullType(annotations: Annotations, descriptor: ClassDescriptor, arguments: List<TypeProjection>): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'EMPTY' @ [70:33] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'classDescriptor' @ [70:40] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForWidget[LocalVariableDescriptor]

'defaultType' @ [70:57] ==> val defaultType: SimpleType defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForWidget.<anonymous>[LocalVariableDescriptor]

'constructor' @ [70:69] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'parameters' @ [70:81] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'map' @ [70:92] ==> public inline fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.map(transform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> StarProjectionImpl): List<StarProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> StarProjectionImpl

'StarProjectionImpl' @ [70:98] ==> public constructor StarProjectionImpl(typeParameter: TypeParameterDescriptor) defined in org.jetbrains.kotlin.types.StarProjectionImpl[DeserializedClassConstructorDescriptor]

'context' @ [72:10] ==> value-parameter context: SyntheticElementResolveContext defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForWidget[ValueParameterDescriptorImpl]

'view' @ [72:18] ==> public final val view: SimpleType defined in org.jetbrains.kotlin.android.synthetic.descriptors.SyntheticElementResolveContext[PropertyDescriptorImpl]

'genProperty' @ [74:12] ==> private fun genProperty(resource: AndroidResource, receiverType: KotlinType, type: SimpleType, containingDeclaration: AndroidSyntheticPackageFragmentDescriptor, sourceElement: SourceElement, errorType: String?): PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.res in file syntheticDescriptorGeneration.kt[SimpleFunctionDescriptorImpl]

'resolvedWidget' @ [74:24] ==> value-parameter resolvedWidget: ResolvedWidget defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForWidget[ValueParameterDescriptorImpl]

'widget' @ [74:39] ==> public final val widget: AndroidResource.Widget defined in org.jetbrains.kotlin.android.synthetic.res.ResolvedWidget[PropertyDescriptorImpl]

'receiverType' @ [74:47] ==> value-parameter receiverType: KotlinType defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForWidget[ValueParameterDescriptorImpl]

'type' @ [74:61] ==> val type: SimpleType defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForWidget[LocalVariableDescriptor]

'packageFragmentDescriptor' @ [74:67] ==> value-parameter packageFragmentDescriptor: AndroidSyntheticPackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForWidget[ValueParameterDescriptorImpl]

'sourceEl' @ [74:94] ==> val sourceEl: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForWidget[LocalVariableDescriptor]

'resolvedWidget' @ [74:104] ==> value-parameter resolvedWidget: ResolvedWidget defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForWidget[ValueParameterDescriptorImpl]

'errorType' @ [74:119] ==> public final val errorType: String? defined in org.jetbrains.kotlin.android.synthetic.res.ResolvedWidget[PropertyDescriptorImpl]

'fragment' @ [83:25] ==> value-parameter fragment: AndroidResource.Fragment defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForFragment[ValueParameterDescriptorImpl]

'sourceElement' @ [83:34] ==> public final val sourceElement: PsiElement? defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource.Fragment[PropertyDescriptorImpl]

'let' @ [83:49] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> XmlSourceElement): XmlSourceElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> XmlSourceElement

'XmlSourceElement' @ [83:55] ==> public constructor XmlSourceElement(psi: PsiElement) defined in org.jetbrains.kotlin.android.synthetic.res.XmlSourceElement[ClassConstructorDescriptorImpl]

'NO_SOURCE' @ [83:90] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'genProperty' @ [84:12] ==> private fun genProperty(resource: AndroidResource, receiverType: KotlinType, type: SimpleType, containingDeclaration: AndroidSyntheticPackageFragmentDescriptor, sourceElement: SourceElement, errorType: String?): PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.res in file syntheticDescriptorGeneration.kt[SimpleFunctionDescriptorImpl]

'fragment' @ [84:24] ==> value-parameter fragment: AndroidResource.Fragment defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForFragment[ValueParameterDescriptorImpl]

'receiverType' @ [84:34] ==> value-parameter receiverType: KotlinType defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForFragment[ValueParameterDescriptorImpl]

'type' @ [84:48] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForFragment[ValueParameterDescriptorImpl]

'packageFragmentDescriptor' @ [84:54] ==> value-parameter packageFragmentDescriptor: AndroidSyntheticPackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForFragment[ValueParameterDescriptorImpl]

'sourceElement' @ [84:81] ==> val sourceElement: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.android.synthetic.res.genPropertyForFragment[LocalVariableDescriptor]

'PropertyDescriptorImpl' @ [95:55] ==> protected/*protected and package*/ constructor PropertyDescriptorImpl(@NotNull p0: DeclarationDescriptor, @Nullable p1: PropertyDescriptor?, @NotNull p2: Annotations, @NotNull p3: Modality, @NotNull p4: Visibility, p5: Boolean, @NotNull p6: Name, @NotNull p7: CallableMemberDescriptor.Kind, @NotNull p8: SourceElement, p9: Boolean, p10: Boolean, p11: Boolean, p12: Boolean, p13: Boolean, p14: Boolean) defined in org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl[JavaClassConstructorDescriptor]

'containingDeclaration' @ [96:13] ==> value-parameter containingDeclaration: AndroidSyntheticPackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.genProperty[ValueParameterDescriptorImpl]

'EMPTY' @ [98:25] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'FINAL' @ [99:22] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'PUBLIC' @ [100:26] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'identifier' @ [102:18] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'resource' @ [102:29] ==> value-parameter resource: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.genProperty[ValueParameterDescriptorImpl]

'id' @ [102:38] ==> public final val id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource[PropertyDescriptorImpl]

'name' @ [102:41] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[PropertyDescriptorImpl]

'SYNTHESIZED' @ [103:43] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'sourceElement' @ [104:13] ==> value-parameter sourceElement: SourceElement defined in org.jetbrains.kotlin.android.synthetic.res.genProperty[ValueParameterDescriptorImpl]

'errorType' @ [112:34] ==> value-parameter errorType: String? defined in org.jetbrains.kotlin.android.synthetic.res.genProperty[ValueParameterDescriptorImpl]

'type' @ [113:39] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.android.synthetic.res.genProperty[ValueParameterDescriptorImpl]

'shouldBeCached' @ [113:44] ==> private val SimpleType.shouldBeCached: Boolean defined in org.jetbrains.kotlin.android.synthetic.res in file syntheticDescriptorGeneration.kt[PropertyDescriptorImpl]

'resource' @ [114:33] ==> value-parameter resource: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.genProperty[ValueParameterDescriptorImpl]

'KotlinTypeFactory' @ [118:24] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'flexibleType' @ [118:42] ==> @JvmStatic public final fun flexibleType(lowerBound: SimpleType, upperBound: SimpleType): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'type' @ [118:55] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.android.synthetic.res.genProperty[ValueParameterDescriptorImpl]

'type' @ [118:61] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.android.synthetic.res.genProperty[ValueParameterDescriptorImpl]

'makeNullableAsSpecified' @ [118:66] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[DeserializedSimpleFunctionDescriptor]

'property' @ [119:5] ==> val property: <no name provided> defined in org.jetbrains.kotlin.android.synthetic.res.genProperty[LocalVariableDescriptor]

'setType' @ [119:14] ==> public open fun setType(@NotNull p0: KotlinType, @ReadOnly @NotNull p1: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, @Nullable p2: ReceiverParameterDescriptor?, @Nullable p3: KotlinType?): Unit defined in org.jetbrains.kotlin.android.synthetic.res.genProperty.<no name provided>[JavaMethodDescriptor]

'flexibleType' @ [120:13] ==> val flexibleType: UnwrappedType defined in org.jetbrains.kotlin.android.synthetic.res.genProperty[LocalVariableDescriptor]

'emptyList' @ [121:13] ==> public fun <T> emptyList(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'receiverType' @ [123:13] ==> value-parameter receiverType: KotlinType defined in org.jetbrains.kotlin.android.synthetic.res.genProperty[ValueParameterDescriptorImpl]

'PropertyGetterDescriptorImpl' @ [125:18] ==> public constructor PropertyGetterDescriptorImpl(@NotNull p0: PropertyDescriptor, @NotNull p1: Annotations, @NotNull p2: Modality, @NotNull p3: Visibility, p4: Boolean, p5: Boolean, p6: Boolean, @NotNull p7: CallableMemberDescriptor.Kind, @Nullable p8: PropertyGetterDescriptor?, @NotNull p9: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.PropertyGetterDescriptorImpl[JavaClassConstructorDescriptor]

'property' @ [126:13] ==> val property: <no name provided> defined in org.jetbrains.kotlin.android.synthetic.res.genProperty[LocalVariableDescriptor]

'EMPTY' @ [127:25] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'FINAL' @ [128:22] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'PUBLIC' @ [129:26] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'SYNTHESIZED' @ [133:43] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'NO_SOURCE' @ [135:27] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'getter' @ [138:5] ==> val getter: PropertyGetterDescriptorImpl defined in org.jetbrains.kotlin.android.synthetic.res.genProperty[LocalVariableDescriptor]

'initialize' @ [138:12] ==> public open fun initialize(p0: (KotlinType..KotlinType?)): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyGetterDescriptorImpl[JavaMethodDescriptor]

'property' @ [140:5] ==> val property: <no name provided> defined in org.jetbrains.kotlin.android.synthetic.res.genProperty[LocalVariableDescriptor]

'initialize' @ [140:14] ==> public open fun initialize(@Nullable p0: PropertyGetterDescriptorImpl?, @Nullable p1: PropertySetterDescriptor?): Unit defined in org.jetbrains.kotlin.android.synthetic.res.genProperty.<no name provided>[JavaMethodDescriptor]

'getter' @ [140:25] ==> val getter: PropertyGetterDescriptorImpl defined in org.jetbrains.kotlin.android.synthetic.res.genProperty[LocalVariableDescriptor]

'property' @ [142:12] ==> val property: <no name provided> defined in org.jetbrains.kotlin.android.synthetic.res.genProperty[LocalVariableDescriptor]

'constructor' @ [147:31] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [147:43] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'fqNameUnsafe' @ [147:66] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [147:80] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'viewClassFqName' @ [148:16] ==> val viewClassFqName: String defined in org.jetbrains.kotlin.android.synthetic.res.<get-shouldBeCached>[LocalVariableDescriptor]

'VIEWSTUB_FQNAME' @ [148:48] ==> public final val VIEWSTUB_FQNAME: String defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[PropertyDescriptorImpl]

'errorType' @ [164:13] ==> public abstract val errorType: String? defined in org.jetbrains.kotlin.android.synthetic.res.AndroidSyntheticProperty[PropertyDescriptorImpl]

