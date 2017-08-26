'KotlinQuickFixAction<KtPrimaryConstructor>' @ [28:69] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtPrimaryConstructor) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtPrimaryConstructor

'element' @ [28:112] ==> value-parameter element: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.quickfix.MissingConstructorKeywordFix.<init>[ValueParameterDescriptorImpl]

'text' @ [29:44] ==> public final val MissingConstructorKeywordFix.text: String[MyPropertyDescriptor]

'element' @ [33:9] ==> protected final val element: KtPrimaryConstructor? defined in org.jetbrains.kotlin.idea.quickfix.MissingConstructorKeywordFix[PropertyDescriptorImpl]

'addConstructorKeyword' @ [33:18] ==> public fun KtPrimaryConstructor.addConstructorKeyword(): PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.quickfixUtil in file quickfixUtil.kt[SimpleFunctionDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [36:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [38:17] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.MissingConstructorKeywordFix.Companion.createAction[ValueParameterDescriptorImpl]

'createIntentionForFirstParentOfType' @ [38:28] ==> public inline fun <reified T : PsiElement> Diagnostic.createIntentionForFirstParentOfType(factory: (KtPrimaryConstructor) -> KotlinQuickFixAction<KtPrimaryConstructor>?): KotlinQuickFixAction<KtPrimaryConstructor>? defined in org.jetbrains.kotlin.idea.quickfix.quickfixUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtPrimaryConstructor

