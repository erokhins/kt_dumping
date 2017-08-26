'KotlinQuickFixAction<KtTypeReference>' @ [35:4] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtTypeReference) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtTypeReference

'typeReference' @ [35:42] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.<init>[ValueParameterDescriptorImpl]

'text' @ [38:44] ==> public final val TypeOfAnnotationMemberFix.text: String[MyPropertyDescriptor]

'element' @ [41:26] ==> protected final val element: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix[PropertyDescriptorImpl]

'psiElement' @ [42:9] ==> val psiElement: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.invoke[LocalVariableDescriptor]

'replace' @ [42:20] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]

'KtPsiFactory' @ [42:28] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [42:41] ==> val psiElement: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.invoke[LocalVariableDescriptor]

'createType' @ [42:53] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'fixedType' @ [42:64] ==> private final val fixedType: String defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix[PropertyDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [45:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [47:33] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [47:44] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'typeReference' @ [48:24] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.createAction[LocalVariableDescriptor]

'analyze' @ [48:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [48:62] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'TYPE' @ [48:86] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeReference' @ [48:92] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.createAction[LocalVariableDescriptor]

'type' @ [50:28] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.createAction[LocalVariableDescriptor]

'getArrayItemType' @ [50:33] ==> private final fun KotlinType.getArrayItemType(): KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion[SimpleFunctionDescriptorImpl]

'itemType' @ [51:32] ==> val itemType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.createAction[LocalVariableDescriptor]

'constructor' @ [51:41] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [51:53] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'name' @ [51:76] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [51:82] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'if (itemType.isItemTypeToFix()) {
                "${itemTypeName}Array"
            }
            else {
                return null
            }' @ [52:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'itemType' @ [52:42] ==> val itemType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.createAction[LocalVariableDescriptor]

'isItemTypeToFix' @ [52:51] ==> private final fun KotlinType.isItemTypeToFix(): Boolean defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion[SimpleFunctionDescriptorImpl]

'itemTypeName' @ [53:20] ==> val itemTypeName: String defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.createAction[LocalVariableDescriptor]

'TypeOfAnnotationMemberFix' @ [59:20] ==> public constructor TypeOfAnnotationMemberFix(typeReference: KtTypeReference, fixedType: String) defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix[ClassConstructorDescriptorImpl]

'typeReference' @ [59:46] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.createAction[LocalVariableDescriptor]

'fixedArrayTypeText' @ [59:61] ==> val fixedArrayTypeText: String defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.createAction[LocalVariableDescriptor]

'!' @ [63:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isArray' @ [63:33] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [63:41] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.getArrayItemType[ReceiverParameterDescriptorImpl]

'arguments' @ [67:29] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'singleOrNull' @ [67:39] ==> public fun <T> List<TypeProjection>.singleOrNull(): TypeProjection? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'boxedType' @ [68:17] ==> val boxedType: TypeProjection defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.getArrayItemType[LocalVariableDescriptor]

'isStarProjection' @ [68:27] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'boxedType' @ [72:20] ==> val boxedType: TypeProjection defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.getArrayItemType[LocalVariableDescriptor]

'type' @ [72:30] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'isByte' @ [76:32] ==> public open fun isByte(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [76:39] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.isItemTypeToFix[ReceiverParameterDescriptorImpl]

'isChar' @ [77:35] ==> public open fun isChar(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [77:42] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.isItemTypeToFix[ReceiverParameterDescriptorImpl]

'isShort' @ [78:35] ==> public open fun isShort(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [78:43] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.isItemTypeToFix[ReceiverParameterDescriptorImpl]

'isInt' @ [79:35] ==> public open fun isInt(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [79:41] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.isItemTypeToFix[ReceiverParameterDescriptorImpl]

'isLong' @ [80:35] ==> public open fun isLong(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [80:42] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.isItemTypeToFix[ReceiverParameterDescriptorImpl]

'isFloat' @ [81:35] ==> public open fun isFloat(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [81:43] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.isItemTypeToFix[ReceiverParameterDescriptorImpl]

'isDouble' @ [82:35] ==> public open fun isDouble(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [82:44] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.isItemTypeToFix[ReceiverParameterDescriptorImpl]

'isBoolean' @ [83:35] ==> public open fun isBoolean(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [83:45] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.TypeOfAnnotationMemberFix.Companion.isItemTypeToFix[ReceiverParameterDescriptorImpl]

