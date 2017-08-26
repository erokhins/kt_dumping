'AbstractKotlinReferenceContributor' @ [33:44] ==> public constructor AbstractKotlinReferenceContributor() defined in org.jetbrains.kotlin.idea.references.AbstractKotlinReferenceContributor[DeserializedClassConstructorDescriptor]

'FilePathReferenceProvider' @ [34:46] ==> public constructor FilePathReferenceProvider() defined in com.intellij.psi.impl.source.resolve.reference.impl.providers.FilePathReferenceProvider[JavaClassConstructorDescriptor]

'element' @ [36:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor.KotlinFilePathReferenceProvider.getReferencesByElement[ValueParameterDescriptorImpl]

'EMPTY_ARRAY' @ [36:77] ==> public final val EMPTY_ARRAY: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>?) defined in com.intellij.psi.PsiReference[JavaPropertyDescriptor]

'!' @ [37:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [37:18] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor.KotlinFilePathReferenceProvider.getReferencesByElement[ValueParameterDescriptorImpl]

'isPlain' @ [37:26] ==> public fun KtStringTemplateExpression.isPlain(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'EMPTY_ARRAY' @ [37:57] ==> public final val EMPTY_ARRAY: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>?) defined in com.intellij.psi.PsiReference[JavaPropertyDescriptor]

'getReferencesByElement' @ [38:20] ==> @NotNull public open fun getReferencesByElement(@NotNull p0: PsiElement, p1: (String..String?), p2: Int, p3: Boolean): (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>) defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor.KotlinFilePathReferenceProvider[JavaMethodDescriptor]

'element' @ [38:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor.KotlinFilePathReferenceProvider.getReferencesByElement[ValueParameterDescriptorImpl]

'element' @ [38:52] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor.KotlinFilePathReferenceProvider.getReferencesByElement[ValueParameterDescriptorImpl]

'plainContent' @ [38:60] ==> public val KtStringTemplateExpression.plainContent: String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [38:74] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor.KotlinFilePathReferenceProvider.getReferencesByElement[ValueParameterDescriptorImpl]

'getContentRange' @ [38:82] ==> public fun KtStringTemplateExpression.getContentRange(): TextRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'startOffset' @ [38:100] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'map' @ [39:22] ==> public inline fun <T, R> Array<out (PsiReference..PsiReference?)>.map(transform: ((PsiReference..PsiReference?)) -> (PsiReference..PsiReference?)): List<(PsiReference..PsiReference?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <R> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'if (it is FileReference) {
                            object: FileReference(it.fileReferenceSet, it.rangeInElement, it.index, it.text) {
                                override fun getVariants(): Array<out Any> {
                                    return super.getVariants()
                                            .map {
                                                (it as? LookupElement)?.apply {
                                                    putUserData(KotlinCompletionCharFilter.SUPPRESS_ITEM_SELECTION_BY_CHARS_ON_TYPING, Unit)
                                                } ?: it
                                            }
                                            .toTypedArray()
                                }
                            }
                        }
                        else it' @ [40:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiReference..PsiReference?), elseBranch: (PsiReference..PsiReference?)): (PsiReference..PsiReference?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'it' @ [40:29] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor.KotlinFilePathReferenceProvider.getReferencesByElement.<anonymous>[ValueParameterDescriptorImpl]

'FileReference' @ [41:37] ==> public constructor FileReference(@NotNull p0: FileReferenceSet, p1: (TextRange..TextRange?), p2: Int, p3: (String..String?)) defined in com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReference[JavaClassConstructorDescriptor]

'it' @ [41:51] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor.KotlinFilePathReferenceProvider.getReferencesByElement.<anonymous>[ValueParameterDescriptorImpl]

'fileReferenceSet' @ [41:54] ==> public final val FileReference.fileReferenceSet: FileReferenceSet[MyPropertyDescriptor]

'it' @ [41:72] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor.KotlinFilePathReferenceProvider.getReferencesByElement.<anonymous>[ValueParameterDescriptorImpl]

'rangeInElement' @ [41:75] ==> public final val FileReference.rangeInElement: (TextRange..TextRange?)[MyPropertyDescriptor]

'it' @ [41:91] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor.KotlinFilePathReferenceProvider.getReferencesByElement.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [41:94] ==> public final val FileReference.index: Int[MyPropertyDescriptor]

'it' @ [41:101] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor.KotlinFilePathReferenceProvider.getReferencesByElement.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [41:104] ==> public final val FileReference.text: (String..String?)[MyPropertyDescriptor]

'super' @ [43:44] ==> <this> defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor.KotlinFilePathReferenceProvider.getReferencesByElement.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'getVariants' @ [43:50] ==> @NotNull public open fun getVariants(): (Array<(Any..Any?)>..Array<out (Any..Any?)>) defined in com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReference[JavaMethodDescriptor]

'map' @ [44:46] ==> public inline fun <T, R> Array<out (Any..Any?)>.map(transform: ((Any..Any?)) -> (Any..Any?)): List<(Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)
    <R> -> (kotlin.Any..kotlin.Any?)

'?:' @ [45:49] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Any?, right: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'it' @ [45:50] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor.KotlinFilePathReferenceProvider.getReferencesByElement.<anonymous>.<no name provided>.getVariants.<anonymous>[ValueParameterDescriptorImpl]

'apply' @ [45:73] ==> @InlineOnly public inline fun <T> LookupElement.apply(block: LookupElement.() -> Unit): LookupElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement

'putUserData' @ [46:53] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Unit..Unit?)>, @Nullable p1: Unit?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'KotlinCompletionCharFilter' @ [46:65] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter[FakeCallableDescriptorForObject]

'SUPPRESS_ITEM_SELECTION_BY_CHARS_ON_TYPING' @ [46:92] ==> public final val SUPPRESS_ITEM_SELECTION_BY_CHARS_ON_TYPING: Key<Unit> defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.Companion[DeserializedPropertyDescriptor]

'Unit' @ [46:136] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'it' @ [47:54] ==> value-parameter it: (Any..Any?) defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor.KotlinFilePathReferenceProvider.getReferencesByElement.<anonymous>.<no name provided>.getVariants.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [49:46] ==> public inline fun <reified T> Collection<(Any..Any?)>.toTypedArray(): Array<(Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (kotlin.Any..kotlin.Any?)

'it' @ [53:30] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor.KotlinFilePathReferenceProvider.getReferencesByElement.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [55:22] ==> public inline fun <reified T> Collection<(PsiReference..PsiReference?)>.toTypedArray(): Array<(PsiReference..PsiReference?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'registrar' @ [60:9] ==> value-parameter registrar: PsiReferenceRegistrar defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor.registerReferenceProviders[ValueParameterDescriptorImpl]

'registerReferenceProvider' @ [60:19] ==> public open fun registerReferenceProvider(@NotNull p0: ElementPattern<out (PsiElement..PsiElement?)>, @NotNull p1: PsiReferenceProvider): Unit defined in com.intellij.psi.PsiReferenceRegistrar[JavaMethodDescriptor]

'psiElement' @ [61:34] ==> public open fun <T : (PsiElement..PsiElement?)> psiElement(p0: (Class<(KtStringTemplateExpression..KtStringTemplateExpression?)>..Class<(KtStringTemplateExpression..KtStringTemplateExpression?)>?)): (PsiElementPattern.Capture<(KtStringTemplateExpression..KtStringTemplateExpression?)>..PsiElementPattern.Capture<(KtStringTemplateExpression..KtStringTemplateExpression?)>?) defined in com.intellij.patterns.PlatformPatterns[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtStringTemplateExpression

'KtStringTemplateExpression' @ [61:45] ==> public constructor KtStringTemplateExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtStringTemplateExpression[JavaClassConstructorDescriptor]

'java' @ [61:79] ==> public val <T> KClass<KtStringTemplateExpression>.java: Class<KtStringTemplateExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtStringTemplateExpression

'KotlinFilePathReferenceProvider' @ [62:17] ==> public object KotlinFilePathReferenceProvider : FilePathReferenceProvider defined in org.jetbrains.kotlin.idea.references.KotlinFilePathReferenceContributor[FakeCallableDescriptorForObject]

