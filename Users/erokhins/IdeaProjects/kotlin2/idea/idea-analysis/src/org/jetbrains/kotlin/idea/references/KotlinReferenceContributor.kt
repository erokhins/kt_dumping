'AbstractKotlinReferenceContributor' @ [29:38] ==> public constructor AbstractKotlinReferenceContributor() defined in org.jetbrains.kotlin.idea.references.AbstractKotlinReferenceContributor[ClassConstructorDescriptorImpl]

'with' @ [31:9] ==> @InlineOnly public inline fun <T, R> with(receiver: PsiReferenceRegistrar, block: PsiReferenceRegistrar.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReferenceRegistrar
    <R> -> Unit

'registrar' @ [31:14] ==> value-parameter registrar: PsiReferenceRegistrar defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor.registerReferenceProviders[ValueParameterDescriptorImpl]

'registerProvider' @ [32:13] ==> protected final inline fun <reified E : KtElement> PsiReferenceRegistrar.registerProvider(priority: Double, crossinline factory: (KtSimpleNameExpression) -> PsiReference?): Unit defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified E : KtElement> -> KtSimpleNameExpression

'registerMultiProvider' @ [34:13] ==> protected final inline fun <reified E : KtElement> PsiReferenceRegistrar.registerMultiProvider(priority: Double, crossinline factory: (KtNameReferenceExpression) -> Array<PsiReference>): Unit defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified E : KtElement> -> KtNameReferenceExpression

'it' @ [35:21] ==> value-parameter it: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor.registerReferenceProviders.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getReferencedNameElementType' @ [35:24] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'IDENTIFIER' @ [35:67] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'emptyArray' @ [35:108] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<PsiReference> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiReference

'it' @ [36:21] ==> value-parameter it: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor.registerReferenceProviders.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parents' @ [36:24] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'any' @ [36:32] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [36:38] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor.registerReferenceProviders.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [36:65] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor.registerReferenceProviders.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [36:93] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor.registerReferenceProviders.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'emptyArray' @ [37:50] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<PsiReference> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiReference

'when (it.readWriteAccess(useResolveForReadWrite = false)) {
                    ReferenceAccess.READ ->
                        arrayOf<PsiReference>(SyntheticPropertyAccessorReference.Getter(it))
                    ReferenceAccess.WRITE ->
                        arrayOf<PsiReference>(SyntheticPropertyAccessorReference.Setter(it))
                    ReferenceAccess.READ_WRITE ->
                        arrayOf<PsiReference>(SyntheticPropertyAccessorReference.Getter(it), SyntheticPropertyAccessorReference.Setter(it))
                }' @ [40:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Array<PsiReference>, entry1: Array<PsiReference>, entry2: Array<PsiReference>): Array<PsiReference>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Array<PsiReference>

'it' @ [40:23] ==> value-parameter it: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor.registerReferenceProviders.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'readWriteAccess' @ [40:26] ==> public fun KtExpression.readWriteAccess(useResolveForReadWrite: Boolean): ReferenceAccess defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[SimpleFunctionDescriptorImpl]

'READ' @ [41:37] ==> enum entry READ defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'arrayOf' @ [42:25] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiReference): Array<PsiReference> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiReference

'Getter' @ [42:82] ==> public constructor Getter(expression: KtNameReferenceExpression) defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.Getter[ClassConstructorDescriptorImpl]

'it' @ [42:89] ==> value-parameter it: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor.registerReferenceProviders.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'WRITE' @ [43:37] ==> enum entry WRITE defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'arrayOf' @ [44:25] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiReference): Array<PsiReference> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiReference

'Setter' @ [44:82] ==> public constructor Setter(expression: KtNameReferenceExpression) defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.Setter[ClassConstructorDescriptorImpl]

'it' @ [44:89] ==> value-parameter it: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor.registerReferenceProviders.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'READ_WRITE' @ [45:37] ==> enum entry READ_WRITE defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'arrayOf' @ [46:25] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiReference): Array<PsiReference> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiReference

'Getter' @ [46:82] ==> public constructor Getter(expression: KtNameReferenceExpression) defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.Getter[ClassConstructorDescriptorImpl]

'it' @ [46:89] ==> value-parameter it: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor.registerReferenceProviders.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Setter' @ [46:129] ==> public constructor Setter(expression: KtNameReferenceExpression) defined in org.jetbrains.kotlin.idea.references.SyntheticPropertyAccessorReference.Setter[ClassConstructorDescriptorImpl]

'it' @ [46:136] ==> value-parameter it: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor.registerReferenceProviders.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'registerProvider' @ [50:13] ==> protected final inline fun <reified E : KtElement> PsiReferenceRegistrar.registerProvider(priority: Double, crossinline factory: (KtConstructorDelegationReferenceExpression) -> PsiReference?): Unit defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified E : KtElement> -> KtConstructorDelegationReferenceExpression

'registerProvider' @ [52:13] ==> protected final inline fun <reified E : KtElement> PsiReferenceRegistrar.registerProvider(priority: Double, crossinline factory: (KtCallExpression) -> PsiReference?): Unit defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified E : KtElement> -> KtCallExpression

'registerProvider' @ [54:13] ==> protected final inline fun <reified E : KtElement> PsiReferenceRegistrar.registerProvider(priority: Double, crossinline factory: (KtArrayAccessExpression) -> PsiReference?): Unit defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified E : KtElement> -> KtArrayAccessExpression

'registerProvider' @ [56:13] ==> protected final inline fun <reified E : KtElement> PsiReferenceRegistrar.registerProvider(priority: Double, crossinline factory: (KtCollectionLiteralExpression) -> PsiReference?): Unit defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified E : KtElement> -> KtCollectionLiteralExpression

'registerProvider' @ [58:13] ==> protected final inline fun <reified E : KtElement> PsiReferenceRegistrar.registerProvider(priority: Double, crossinline factory: (KtForExpression) -> PsiReference?): Unit defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified E : KtElement> -> KtForExpression

'registerProvider' @ [60:13] ==> protected final inline fun <reified E : KtElement> PsiReferenceRegistrar.registerProvider(priority: Double, crossinline factory: (KtPropertyDelegate) -> PsiReference?): Unit defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified E : KtElement> -> KtPropertyDelegate

'registerProvider' @ [62:13] ==> protected final inline fun <reified E : KtElement> PsiReferenceRegistrar.registerProvider(priority: Double, crossinline factory: (KtDestructuringDeclarationEntry) -> PsiReference?): Unit defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified E : KtElement> -> KtDestructuringDeclarationEntry

'registerProvider' @ [64:13] ==> protected final inline fun <reified E : KtElement> PsiReferenceRegistrar.registerProvider(priority: Double, crossinline factory: (KDocName) -> PsiReference?): Unit defined in org.jetbrains.kotlin.idea.references.KotlinReferenceContributor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified E : KtElement> -> KDocName

