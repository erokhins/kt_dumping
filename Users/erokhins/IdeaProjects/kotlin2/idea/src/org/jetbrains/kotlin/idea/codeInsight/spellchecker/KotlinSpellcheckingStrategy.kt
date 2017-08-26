'SpellcheckingStrategy' @ [30:36] ==> public constructor SpellcheckingStrategy() defined in com.intellij.spellchecker.tokenizer.SpellcheckingStrategy[JavaClassConstructorDescriptor]

'TokenizerBase' @ [31:38] ==> public constructor TokenizerBase<T : (PsiElement..PsiElement?)>(p0: (Splitter..Splitter?)) defined in com.intellij.spellchecker.tokenizer.TokenizerBase[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtLiteralStringTemplateEntry

'getInstance' @ [31:100] ==> public open fun getInstance(): (PlainTextSplitter..PlainTextSplitter?) defined in com.intellij.spellchecker.inspections.PlainTextSplitter[JavaMethodDescriptor]

'EMPTY_TOKENIZER' @ [32:56] ==> public final val EMPTY_TOKENIZER: raw (Tokenizer<(PsiElement..PsiElement?)>..Tokenizer<*>?) defined in com.intellij.spellchecker.tokenizer.SpellcheckingStrategy[JavaPropertyDescriptor]

'Suppress' @ [35:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when {
            element is PsiNameIdentifierOwner || element is PsiComment ->
                super.getTokenizer(element)

            element is KtLiteralStringTemplateEntry -> plainTextTokenizer

            else ->
                emptyTokenizer
        }' @ [36:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Tokenizer<out PsiElement?>, entry1: Tokenizer<out PsiElement?>, entry2: Tokenizer<out PsiElement?>): Tokenizer<out PsiElement?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Tokenizer<out PsiElement?>

'element' @ [37:13] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.KotlinSpellcheckingStrategy.getTokenizer[ValueParameterDescriptorImpl]

'element' @ [37:50] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.KotlinSpellcheckingStrategy.getTokenizer[ValueParameterDescriptorImpl]

'super' @ [38:17] ==> <this> defined in org.jetbrains.kotlin.idea.KotlinSpellcheckingStrategy[LazyClassReceiverParameterDescriptor]

'getTokenizer' @ [38:23] ==> @NotNull public open fun getTokenizer(p0: (PsiElement..PsiElement?)): raw (Tokenizer<(PsiElement..PsiElement?)>..Tokenizer<*>) defined in com.intellij.spellchecker.tokenizer.SpellcheckingStrategy[JavaMethodDescriptor]

'element' @ [38:36] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.KotlinSpellcheckingStrategy.getTokenizer[ValueParameterDescriptorImpl]

'element' @ [40:13] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.KotlinSpellcheckingStrategy.getTokenizer[ValueParameterDescriptorImpl]

'plainTextTokenizer' @ [40:56] ==> private final val plainTextTokenizer: TokenizerBase<KtLiteralStringTemplateEntry> defined in org.jetbrains.kotlin.idea.KotlinSpellcheckingStrategy[PropertyDescriptorImpl]

'emptyTokenizer' @ [43:17] ==> private final val emptyTokenizer: raw (Tokenizer<(PsiElement..PsiElement?)>..Tokenizer<*>?) defined in org.jetbrains.kotlin.idea.KotlinSpellcheckingStrategy[PropertyDescriptorImpl]

