'CharFilter' @ [25:38] ==> public constructor CharFilter() defined in com.intellij.codeInsight.lookup.CharFilter[JavaClassConstructorDescriptor]

'Key' @ [27:47] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'Key' @ [29:69] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'Key' @ [30:47] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'Key' @ [32:47] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'lookup' @ [36:13] ==> value-parameter lookup: Lookup defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[ValueParameterDescriptorImpl]

'psiFile' @ [36:20] ==> public final val Lookup.psiFile: PsiFile?[MyPropertyDescriptor]

'!' @ [37:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'lookup' @ [37:14] ==> value-parameter lookup: Lookup defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[ValueParameterDescriptorImpl]

'isCompletion' @ [37:21] ==> public final val Lookup.isCompletion: Boolean[MyPropertyDescriptor]

'!!' @ [38:27] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: CompletionProcess?): CompletionProcess[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> CompletionProcess

'getCompletionService' @ [38:45] ==> public open fun getCompletionService(): (CompletionService..CompletionService?) defined in com.intellij.codeInsight.completion.CompletionService[JavaMethodDescriptor]

'currentCompletion' @ [38:68] ==> public final val CompletionService.currentCompletion: CompletionProcess?[MyPropertyDescriptor]

'isAutopopupCompletion' @ [38:88] ==> public final val CompletionProcess.isAutopopupCompletion: Boolean[MyPropertyDescriptor]

'isJavaIdentifierPart' @ [40:23] ==> public open fun isJavaIdentifierPart(p0: Char): Boolean defined in java.lang.Character[JavaMethodDescriptor]

'c' @ [40:44] ==> value-parameter c: Char defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[ValueParameterDescriptorImpl]

'c' @ [40:50] ==> value-parameter c: Char defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[ValueParameterDescriptorImpl]

'ADD_TO_PREFIX' @ [41:38] ==> enum entry ADD_TO_PREFIX defined in com.intellij.codeInsight.lookup.CharFilter.Result[FakeCallableDescriptorForObject]

'lookup' @ [44:27] ==> value-parameter lookup: Lookup defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[ValueParameterDescriptorImpl]

'currentItem' @ [44:34] ==> public final val Lookup.currentItem: LookupElement?[MyPropertyDescriptor]

'isAutopopup' @ [47:13] ==> val isAutopopup: Boolean defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[LocalVariableDescriptor]

'!' @ [47:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'lookup' @ [47:29] ==> value-parameter lookup: Lookup defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[ValueParameterDescriptorImpl]

'isSelectionTouched' @ [47:36] ==> public final val Lookup.isSelectionTouched: Boolean[MyPropertyDescriptor]

'currentItem' @ [47:58] ==> val currentItem: LookupElement? defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[LocalVariableDescriptor]

'getUserData' @ [47:71] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Unit..Unit?)>): Unit? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'SUPPRESS_ITEM_SELECTION_BY_CHARS_ON_TYPING' @ [47:83] ==> public final val SUPPRESS_ITEM_SELECTION_BY_CHARS_ON_TYPING: Key<Unit> defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.Companion[PropertyDescriptorImpl]

'HIDE_LOOKUP' @ [48:27] ==> enum entry HIDE_LOOKUP defined in com.intellij.codeInsight.lookup.CharFilter.Result[FakeCallableDescriptorForObject]

'c' @ [51:13] ==> value-parameter c: Char defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[ValueParameterDescriptorImpl]

'when {
                currentItem?.getUserData(HIDE_LOOKUP_ON_COLON) != null -> Result.HIDE_LOOKUP
                else -> CharFilter.Result.ADD_TO_PREFIX /* used in '::xxx'*/
            }' @ [52:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CharFilter.Result?, entry1: CharFilter.Result?): CharFilter.Result?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Result?

'currentItem' @ [53:17] ==> val currentItem: LookupElement? defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[LocalVariableDescriptor]

'getUserData' @ [53:30] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Unit..Unit?)>): Unit? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'HIDE_LOOKUP_ON_COLON' @ [53:42] ==> public final val HIDE_LOOKUP_ON_COLON: Key<Unit> defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.Companion[PropertyDescriptorImpl]

'HIDE_LOOKUP' @ [53:82] ==> enum entry HIDE_LOOKUP defined in com.intellij.codeInsight.lookup.CharFilter.Result[FakeCallableDescriptorForObject]

'ADD_TO_PREFIX' @ [54:43] ==> enum entry ADD_TO_PREFIX defined in com.intellij.codeInsight.lookup.CharFilter.Result[FakeCallableDescriptorForObject]

'!' @ [58:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'lookup' @ [58:14] ==> value-parameter lookup: Lookup defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[ValueParameterDescriptorImpl]

'isSelectionTouched' @ [58:21] ==> public final val Lookup.isSelectionTouched: Boolean[MyPropertyDescriptor]

'currentItem' @ [59:13] ==> val currentItem: LookupElement? defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[LocalVariableDescriptor]

'putUserDataDeep' @ [59:26] ==> public tailrec fun <T : Any> LookupElement.putUserDataDeep(key: Key<String>, value: String?): Unit defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> String

'JUST_TYPING_PREFIX' @ [59:42] ==> public final val JUST_TYPING_PREFIX: Key<String> defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.Companion[PropertyDescriptorImpl]

'lookup' @ [59:62] ==> value-parameter lookup: Lookup defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[ValueParameterDescriptorImpl]

'itemPattern' @ [59:69] ==> @NotNull public abstract fun itemPattern(@NotNull p0: LookupElement): String defined in com.intellij.codeInsight.lookup.Lookup[JavaMethodDescriptor]

'currentItem' @ [59:81] ==> val currentItem: LookupElement? defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[LocalVariableDescriptor]

'when (c) {
            '.' -> {
                if (prefixLength == 0 && isAutopopup && !lookup.isSelectionTouched) {
                    val caret = lookup.editor.caretModel.offset
                    if (caret > 0 && lookup.editor.document.charsSequence[caret - 1] == '.') {
                        return Result.HIDE_LOOKUP
                    }
                }
                Result.SELECT_ITEM_AND_FINISH_LOOKUP
            }

            '{' -> {
                if (currentItem?.getUserData(ACCEPT_OPENING_BRACE) != null)
                    Result.SELECT_ITEM_AND_FINISH_LOOKUP
                else
                    Result.HIDE_LOOKUP
            }

            ',', ' ', '(', '=', '!' -> Result.SELECT_ITEM_AND_FINISH_LOOKUP

            else -> CharFilter.Result.HIDE_LOOKUP
        }' @ [62:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CharFilter.Result?, entry1: CharFilter.Result?, entry2: CharFilter.Result?, entry3: CharFilter.Result?): CharFilter.Result?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Result?

'c' @ [62:22] ==> value-parameter c: Char defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[ValueParameterDescriptorImpl]

'prefixLength' @ [64:21] ==> value-parameter prefixLength: Int defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[ValueParameterDescriptorImpl]

'isAutopopup' @ [64:42] ==> val isAutopopup: Boolean defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[LocalVariableDescriptor]

'!' @ [64:57] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'lookup' @ [64:58] ==> value-parameter lookup: Lookup defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[ValueParameterDescriptorImpl]

'isSelectionTouched' @ [64:65] ==> public final val Lookup.isSelectionTouched: Boolean[MyPropertyDescriptor]

'lookup' @ [65:33] ==> value-parameter lookup: Lookup defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[ValueParameterDescriptorImpl]

'editor' @ [65:40] ==> public final val Lookup.editor: Editor[MyPropertyDescriptor]

'caretModel' @ [65:47] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [65:58] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'caret' @ [66:25] ==> val caret: Int defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[LocalVariableDescriptor]

'lookup' @ [66:38] ==> value-parameter lookup: Lookup defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[ValueParameterDescriptorImpl]

'editor' @ [66:45] ==> public final val Lookup.editor: Editor[MyPropertyDescriptor]

'document' @ [66:52] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'charsSequence' @ [66:61] ==> public final val Document.charsSequence: CharSequence[MyPropertyDescriptor]

'caret' @ [66:75] ==> val caret: Int defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[LocalVariableDescriptor]

'HIDE_LOOKUP' @ [67:39] ==> enum entry HIDE_LOOKUP defined in com.intellij.codeInsight.lookup.CharFilter.Result[FakeCallableDescriptorForObject]

'SELECT_ITEM_AND_FINISH_LOOKUP' @ [70:24] ==> enum entry SELECT_ITEM_AND_FINISH_LOOKUP defined in com.intellij.codeInsight.lookup.CharFilter.Result[FakeCallableDescriptorForObject]

'if (currentItem?.getUserData(ACCEPT_OPENING_BRACE) != null)
                    Result.SELECT_ITEM_AND_FINISH_LOOKUP
                else
                    Result.HIDE_LOOKUP' @ [74:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CharFilter.Result, elseBranch: CharFilter.Result): CharFilter.Result[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Result

'currentItem' @ [74:21] ==> val currentItem: LookupElement? defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.acceptChar[LocalVariableDescriptor]

'getUserData' @ [74:34] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Unit..Unit?)>): Unit? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'ACCEPT_OPENING_BRACE' @ [74:46] ==> public final val ACCEPT_OPENING_BRACE: Key<Unit> defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.Companion[PropertyDescriptorImpl]

'SELECT_ITEM_AND_FINISH_LOOKUP' @ [75:28] ==> enum entry SELECT_ITEM_AND_FINISH_LOOKUP defined in com.intellij.codeInsight.lookup.CharFilter.Result[FakeCallableDescriptorForObject]

'HIDE_LOOKUP' @ [77:28] ==> enum entry HIDE_LOOKUP defined in com.intellij.codeInsight.lookup.CharFilter.Result[FakeCallableDescriptorForObject]

'SELECT_ITEM_AND_FINISH_LOOKUP' @ [80:47] ==> enum entry SELECT_ITEM_AND_FINISH_LOOKUP defined in com.intellij.codeInsight.lookup.CharFilter.Result[FakeCallableDescriptorForObject]

'HIDE_LOOKUP' @ [82:39] ==> enum entry HIDE_LOOKUP defined in com.intellij.codeInsight.lookup.CharFilter.Result[FakeCallableDescriptorForObject]

