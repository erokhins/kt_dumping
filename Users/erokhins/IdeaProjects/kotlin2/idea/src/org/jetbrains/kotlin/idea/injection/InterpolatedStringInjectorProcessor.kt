'?:' @ [32:5] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Language?, right: Language): Language[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Language

'getLanguage' @ [32:19] ==> @Nullable public open fun getLanguage(@NotNull p0: BaseInjection): Language? defined in org.intellij.plugins.intelliLang.inject.InjectorUtils[JavaMethodDescriptor]

'injection' @ [32:31] ==> value-parameter injection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[ValueParameterDescriptorImpl]

'literal' @ [34:20] ==> value-parameter literal: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[ValueParameterDescriptorImpl]

'children' @ [34:28] ==> public final val KtStringTemplateExpression.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'toList' @ [34:37] ==> public fun <T> Array<out (PsiElement..PsiElement?)>.toList(): List<(PsiElement..PsiElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'children' @ [35:15] ==> val children: List<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'size' @ [35:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'children' @ [37:9] ==> val children: List<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'isEmpty' @ [37:18] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [39:18] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Trinity<PsiLanguageInjectionHost, InjectedLanguage, TextRange>

'assertProperRange' @ [42:19] ==> public open fun assertProperRange(@NotNull p0: Segment, @NotNull p1: Any): Unit defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'range' @ [42:37] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts.addInjectionRange[ValueParameterDescriptorImpl]

'injection' @ [42:44] ==> value-parameter injection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[ValueParameterDescriptorImpl]

'!!' @ [43:32] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: InjectedLanguage?): InjectedLanguage[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> InjectedLanguage

'create' @ [43:49] ==> @Nullable public open fun create(@Nullable p0: String?, p1: (String..String?), p2: (String..String?), p3: Boolean): InjectedLanguage? defined in org.intellij.plugins.intelliLang.inject.InjectedLanguage[JavaMethodDescriptor]

'injection' @ [43:56] ==> value-parameter injection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[ValueParameterDescriptorImpl]

'injectedLanguageId' @ [43:66] ==> public final var BaseInjection.injectedLanguageId: String[MyPropertyDescriptor]

'prefix' @ [43:86] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts.addInjectionRange[ValueParameterDescriptorImpl]

'suffix' @ [43:94] ==> value-parameter suffix: String defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts.addInjectionRange[ValueParameterDescriptorImpl]

'result' @ [44:9] ==> val result: ArrayList<Trinity<PsiLanguageInjectionHost, InjectedLanguage, TextRange>> defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'add' @ [44:16] ==> public open fun add(element: Trinity<PsiLanguageInjectionHost, InjectedLanguage, TextRange>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'create' @ [44:28] ==> public open fun <A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> create(p0: (PsiLanguageInjectionHost..PsiLanguageInjectionHost?), p1: (InjectedLanguage..InjectedLanguage?), p2: (TextRange..TextRange?)): (Trinity<(PsiLanguageInjectionHost..PsiLanguageInjectionHost?), (InjectedLanguage..InjectedLanguage?), (TextRange..TextRange?)>..Trinity<(PsiLanguageInjectionHost..PsiLanguageInjectionHost?), (InjectedLanguage..InjectedLanguage?), (TextRange..TextRange?)>?) defined in com.intellij.openapi.util.Trinity[JavaMethodDescriptor]
Inferred types:
    <A : (Any..Any?)> -> PsiLanguageInjectionHost
    <B : (Any..Any?)> -> InjectedLanguage
    <C : (Any..Any?)> -> TextRange

'literal' @ [44:35] ==> value-parameter literal: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[ValueParameterDescriptorImpl]

'injectedLanguage' @ [44:44] ==> val injectedLanguage: InjectedLanguage defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts.addInjectionRange[LocalVariableDescriptor]

'range' @ [44:62] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts.addInjectionRange[ValueParameterDescriptorImpl]

'injection' @ [49:18] ==> value-parameter injection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[ValueParameterDescriptorImpl]

'prefix' @ [49:28] ==> public final var BaseInjection.prefix: String[MyPropertyDescriptor]

'children' @ [50:21] ==> val children: List<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'lastOrNull' @ [50:30] ==> public fun <T> List<(PsiElement..PsiElement?)>.lastOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'i' @ [53:12] ==> var i: Int defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'len' @ [53:16] ==> val len: Int defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'children' @ [54:21] ==> val children: List<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'i' @ [54:30] ==> var i: Int defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'child' @ [55:34] ==> val child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'startOffsetInParent' @ [55:40] ==> public final val PsiElement.startOffsetInParent: Int[MyPropertyDescriptor]

'when (child) {
            is KtLiteralStringTemplateEntry, is KtEscapeStringTemplateEntry -> {
                val partSize = children.subList(i, len).asSequence()
                        .takeWhile { it is KtLiteralStringTemplateEntry || it is KtEscapeStringTemplateEntry }
                        .count()
                i += partSize - 1
                children[i]
            }
            is KtSimpleNameStringTemplateEntry -> {
                unparsable = true
                child.expression?.text ?: NO_VALUE_NAME
            }
            is KtBlockStringTemplateEntry -> {
                unparsable = true
                NO_VALUE_NAME
            }
            else -> {
                unparsable = true
                child
            }
        }' @ [57:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Any..Any?), entry1: (Any..Any?), entry2: (Any..Any?), entry3: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'child' @ [57:26] ==> val child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'children' @ [59:32] ==> val children: List<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'subList' @ [59:41] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<(PsiElement..PsiElement?)> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'i' @ [59:49] ==> var i: Int defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'len' @ [59:52] ==> val len: Int defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'asSequence' @ [59:57] ==> public fun <T> Iterable<(PsiElement..PsiElement?)>.asSequence(): Sequence<(PsiElement..PsiElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'takeWhile' @ [60:26] ==> public fun <T> Sequence<(PsiElement..PsiElement?)>.takeWhile(predicate: ((PsiElement..PsiElement?)) -> Boolean): Sequence<(PsiElement..PsiElement?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [60:38] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [60:76] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts.<anonymous>[ValueParameterDescriptorImpl]

'count' @ [61:26] ==> public fun <T> Sequence<(PsiElement..PsiElement?)>.count(): Int defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'i' @ [62:17] ==> var i: Int defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'partSize' @ [62:22] ==> val partSize: Int defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'children' @ [63:17] ==> val children: List<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'i' @ [63:26] ==> var i: Int defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'unparsable' @ [66:17] ==> var unparsable: Boolean defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'child' @ [67:17] ==> val child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'expression' @ [67:23] ==> public final val KtSimpleNameStringTemplateEntry.expression: KtExpression?[MyPropertyDescriptor]

'text' @ [67:35] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'NO_VALUE_NAME' @ [67:43] ==> private val NO_VALUE_NAME: String defined in org.jetbrains.kotlin.idea.injection in file InterpolatedStringInjectorProcessor.kt[PropertyDescriptorImpl]

'unparsable' @ [70:17] ==> var unparsable: Boolean defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'NO_VALUE_NAME' @ [71:17] ==> private val NO_VALUE_NAME: String defined in org.jetbrains.kotlin.idea.injection in file InterpolatedStringInjectorProcessor.kt[PropertyDescriptorImpl]

'unparsable' @ [74:17] ==> var unparsable: Boolean defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'child' @ [75:17] ==> val child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'if (child == lastChild) injection.suffix else ""' @ [79:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'child' @ [79:26] ==> val child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'lastChild' @ [79:35] ==> val lastChild: PsiElement? defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'injection' @ [79:46] ==> value-parameter injection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[ValueParameterDescriptorImpl]

'suffix' @ [79:56] ==> public final var BaseInjection.suffix: String[MyPropertyDescriptor]

'if (part is PsiElement) {
            addInjectionRange(TextRange.create(partOffsetInParent, part.startOffsetInParent + part.textLength), prefix, suffix)
        }
        else if (!prefix.isEmpty() || i == 0) {
            addInjectionRange(TextRange.from(partOffsetInParent, 0), prefix, suffix)
        }' @ [81:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'part' @ [81:13] ==> val part: (Any..Any?) defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'addInjectionRange' @ [82:13] ==> local final fun addInjectionRange(range: TextRange, prefix: String, suffix: String): Unit defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[SimpleFunctionDescriptorImpl]

'create' @ [82:41] ==> @NotNull public open fun create(p0: Int, p1: Int): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'partOffsetInParent' @ [82:48] ==> val partOffsetInParent: Int defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'part' @ [82:68] ==> val part: (Any..Any?) defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'startOffsetInParent' @ [82:73] ==> public final val PsiElement.startOffsetInParent: Int[MyPropertyDescriptor]

'part' @ [82:95] ==> val part: (Any..Any?) defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'textLength' @ [82:100] ==> public final val PsiElement.textLength: Int[MyPropertyDescriptor]

'prefix' @ [82:113] ==> var prefix: String defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'suffix' @ [82:121] ==> val suffix: String defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'!' @ [84:18] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'prefix' @ [84:19] ==> var prefix: String defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'isEmpty' @ [84:26] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'i' @ [84:39] ==> var i: Int defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'addInjectionRange' @ [85:13] ==> local final fun addInjectionRange(range: TextRange, prefix: String, suffix: String): Unit defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[SimpleFunctionDescriptorImpl]

'from' @ [85:41] ==> @NotNull public open fun from(p0: Int, p1: Int): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'partOffsetInParent' @ [85:46] ==> val partOffsetInParent: Int defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'prefix' @ [85:70] ==> var prefix: String defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'suffix' @ [85:78] ==> val suffix: String defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'prefix' @ [88:9] ==> var prefix: String defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'part' @ [88:18] ==> val part: (Any..Any?) defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'i' @ [89:9] ==> var i: Int defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'lastChild' @ [92:9] ==> val lastChild: PsiElement? defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'!' @ [92:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'prefix' @ [92:31] ==> var prefix: String defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'isEmpty' @ [92:38] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'addInjectionRange' @ [94:9] ==> local final fun addInjectionRange(range: TextRange, prefix: String, suffix: String): Unit defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[SimpleFunctionDescriptorImpl]

'from' @ [94:37] ==> @NotNull public open fun from(p0: Int, p1: Int): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'lastChild' @ [94:42] ==> val lastChild: PsiElement? defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'startOffsetInParent' @ [94:52] ==> public final val PsiElement.startOffsetInParent: Int[MyPropertyDescriptor]

'lastChild' @ [94:74] ==> val lastChild: PsiElement? defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'textLength' @ [94:84] ==> public final val PsiElement.textLength: Int[MyPropertyDescriptor]

'prefix' @ [94:100] ==> var prefix: String defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'injection' @ [94:108] ==> value-parameter injection: BaseInjection defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[ValueParameterDescriptorImpl]

'suffix' @ [94:118] ==> public final var BaseInjection.suffix: String[MyPropertyDescriptor]

'InjectionSplitResult' @ [97:12] ==> public constructor InjectionSplitResult(isUnparsable: Boolean, ranges: List<Trinity<PsiLanguageInjectionHost, InjectedLanguage, TextRange>>) defined in org.jetbrains.kotlin.idea.injection.InjectionSplitResult[ClassConstructorDescriptorImpl]

'unparsable' @ [97:33] ==> var unparsable: Boolean defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

'result' @ [97:45] ==> val result: ArrayList<Trinity<PsiLanguageInjectionHost, InjectedLanguage, TextRange>> defined in org.jetbrains.kotlin.idea.injection.splitLiteralToInjectionParts[LocalVariableDescriptor]

