'if (this is LookupElementDecorator<*>) {
        getDelegate().putUserDataDeep(key, value)
    }
    else {
        putUserData(key, value)
    }' @ [53:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'this' @ [53:9] ==> <this> defined in org.jetbrains.kotlin.idea.completion.putUserDataDeep[ReceiverParameterDescriptorImpl]

'getDelegate' @ [54:9] ==> public open fun getDelegate(): (LookupElement..LookupElement?) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'putUserDataDeep' @ [54:23] ==> public tailrec fun <T : Any> LookupElement.putUserDataDeep(key: Key<T>, value: T?): Unit defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'key' @ [54:39] ==> value-parameter key: Key<T> defined in org.jetbrains.kotlin.idea.completion.putUserDataDeep[ValueParameterDescriptorImpl]

'value' @ [54:44] ==> value-parameter value: T? defined in org.jetbrains.kotlin.idea.completion.putUserDataDeep[ValueParameterDescriptorImpl]

'putUserData' @ [57:9] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(T..T?)>, @Nullable p1: T?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'key' @ [57:21] ==> value-parameter key: Key<T> defined in org.jetbrains.kotlin.idea.completion.putUserDataDeep[ValueParameterDescriptorImpl]

'value' @ [57:26] ==> value-parameter value: T? defined in org.jetbrains.kotlin.idea.completion.putUserDataDeep[ValueParameterDescriptorImpl]

'if (this is LookupElementDecorator<*>) {
        getDelegate().getUserDataDeep(key)
    }
    else {
        getUserData(key)
    }' @ [62:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'this' @ [62:16] ==> <this> defined in org.jetbrains.kotlin.idea.completion.getUserDataDeep[ReceiverParameterDescriptorImpl]

'getDelegate' @ [63:9] ==> public open fun getDelegate(): (LookupElement..LookupElement?) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'getUserDataDeep' @ [63:23] ==> public tailrec fun <T : Any> LookupElement.getUserDataDeep(key: Key<T>): T? defined in org.jetbrains.kotlin.idea.completion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'key' @ [63:39] ==> value-parameter key: Key<T> defined in org.jetbrains.kotlin.idea.completion.getUserDataDeep[ValueParameterDescriptorImpl]

'getUserData' @ [66:9] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(T..T?)>): T? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'key' @ [66:21] ==> value-parameter key: Key<T> defined in org.jetbrains.kotlin.idea.completion.getUserDataDeep[ValueParameterDescriptorImpl]

'Key' @ [81:25] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ItemPriority

'putUserData' @ [84:5] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(ItemPriority..ItemPriority?)>, @Nullable p1: ItemPriority?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ItemPriority

'ITEM_PRIORITY_KEY' @ [84:17] ==> public val ITEM_PRIORITY_KEY: Key<ItemPriority> defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'priority' @ [84:36] ==> value-parameter priority: ItemPriority defined in org.jetbrains.kotlin.idea.completion.assignPriority[ValueParameterDescriptorImpl]

'this' @ [85:12] ==> <this> defined in org.jetbrains.kotlin.idea.completion.assignPriority[ReceiverParameterDescriptorImpl]

'Key' @ [88:35] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'Key' @ [90:24] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'applyPolicy' @ [92:85] ==> @NotNull public open fun applyPolicy(@NotNull p0: LookupElement): LookupElement defined in com.intellij.codeInsight.lookup.AutoCompletionPolicy[JavaMethodDescriptor]

'this' @ [92:97] ==> <this> defined in org.jetbrains.kotlin.idea.completion.suppressAutoInsertion[ReceiverParameterDescriptorImpl]

'LookupElementDecorator<LookupElement>' @ [95:20] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'this' @ [95:58] ==> <this> defined in org.jetbrains.kotlin.idea.completion.withReceiverCast[ReceiverParameterDescriptorImpl]

'super' @ [97:13] ==> <this> defined in org.jetbrains.kotlin.idea.completion.withReceiverCast.<no name provided>[LazyClassReceiverParameterDescriptor]

'handleInsert' @ [97:19] ==> public open fun handleInsert(p0: (InsertionContext..InsertionContext?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'context' @ [97:32] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.withReceiverCast.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'CastReceiverInsertHandler' @ [98:13] ==> public object CastReceiverInsertHandler defined in org.jetbrains.kotlin.idea.completion.handlers in file CastReceiverInsertHandler.kt[FakeCallableDescriptorForObject]

'postHandleInsert' @ [98:39] ==> public final fun postHandleInsert(context: InsertionContext, item: LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.handlers.CastReceiverInsertHandler[SimpleFunctionDescriptorImpl]

'context' @ [98:56] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.withReceiverCast.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'delegate' @ [98:65] ==> public final val <no name provided>.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'Key' @ [103:41] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'putUserData' @ [106:5] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Unit..Unit?)>, @Nullable p1: Unit?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'KEEP_OLD_ARGUMENT_LIST_ON_TAB_KEY' @ [106:17] ==> public val KEEP_OLD_ARGUMENT_LIST_ON_TAB_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[PropertyDescriptorImpl]

'Unit' @ [106:52] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'this' @ [107:12] ==> <this> defined in org.jetbrains.kotlin.idea.completion.keepOldArgumentListOnTab[ReceiverParameterDescriptorImpl]

'!' @ [111:22] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [111:23] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.completion.asNameFilter.<anonymous>[ValueParameterDescriptorImpl]

'isSpecial' @ [111:28] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'prefixMatches' @ [111:41] ==> public abstract fun prefixMatches(@NotNull p0: String): Boolean defined in com.intellij.codeInsight.completion.PrefixMatcher[JavaMethodDescriptor]

'name' @ [111:55] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.completion.asNameFilter.<anonymous>[ValueParameterDescriptorImpl]

'identifier' @ [111:60] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'prefixMatches' @ [114:60] ==> public abstract fun prefixMatches(@NotNull p0: String): Boolean defined in com.intellij.codeInsight.completion.PrefixMatcher[JavaMethodDescriptor]

'name' @ [114:74] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.completion.asStringNameFilter.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [117:22] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [117:23] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.completion.toNameFilter.<anonymous>[ValueParameterDescriptorImpl]

'isSpecial' @ [117:28] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'this' @ [117:41] ==> <this> defined in org.jetbrains.kotlin.idea.completion.toNameFilter[ReceiverParameterDescriptorImpl]

'name' @ [117:46] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.completion.toNameFilter.<anonymous>[ValueParameterDescriptorImpl]

'identifier' @ [117:51] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'this' @ [121:13] ==> <this> defined in org.jetbrains.kotlin.idea.completion.or[ReceiverParameterDescriptorImpl]

'it' @ [121:18] ==> value-parameter it: T defined in org.jetbrains.kotlin.idea.completion.or.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [121:25] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [121:37] ==> value-parameter it: T defined in org.jetbrains.kotlin.idea.completion.or.<anonymous>[ValueParameterDescriptorImpl]

'tailFragments' @ [124:17] ==> public final val LookupElementPresentation.tailFragments: (MutableList<(LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?)>..List<(LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?)>)[MyPropertyDescriptor]

'clearTail' @ [125:5] ==> public open fun clearTail(): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'appendTailText' @ [126:5] ==> public open fun appendTailText(@NotNull p0: String, p1: Boolean): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'text' @ [126:20] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.completion.prependTailText[ValueParameterDescriptorImpl]

'grayed' @ [126:26] ==> value-parameter grayed: Boolean defined in org.jetbrains.kotlin.idea.completion.prependTailText[ValueParameterDescriptorImpl]

'tails' @ [127:5] ==> val tails: (MutableList<(LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?)>..List<(LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?)>) defined in org.jetbrains.kotlin.idea.completion.prependTailText[LocalVariableDescriptor]

'forEach' @ [127:11] ==> @HidesMembers public inline fun <T> Iterable<(LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?)>.forEach(action: ((LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.codeInsight.lookup.LookupElementPresentation.TextFragment..com.intellij.codeInsight.lookup.LookupElementPresentation.TextFragment?)

'appendTailText' @ [127:21] ==> public open fun appendTailText(@NotNull p0: String, p1: Boolean): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'it' @ [127:36] ==> value-parameter it: (LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?) defined in org.jetbrains.kotlin.idea.completion.prependTailText.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [127:39] ==> public final val text: (String..String?) defined in com.intellij.codeInsight.lookup.LookupElementPresentation.TextFragment[JavaPropertyDescriptor]

'it' @ [127:45] ==> value-parameter it: (LookupElementPresentation.TextFragment..LookupElementPresentation.TextFragment?) defined in org.jetbrains.kotlin.idea.completion.prependTailText.<anonymous>[ValueParameterDescriptorImpl]

'isGrayed' @ [127:48] ==> public final val LookupElementPresentation.TextFragment.isGrayed: Boolean[MyPropertyDescriptor]

'CallableWeight' @ [143:21] ==> public constructor CallableWeight(enum: CallableWeightEnum, receiverIndex: Int?) defined in org.jetbrains.kotlin.idea.completion.CallableWeight[ClassConstructorDescriptorImpl]

'local' @ [143:55] ==> enum entry local defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'CallableWeight' @ [144:30] ==> public constructor CallableWeight(enum: CallableWeightEnum, receiverIndex: Int?) defined in org.jetbrains.kotlin.idea.completion.CallableWeight[ClassConstructorDescriptorImpl]

'globalOrStatic' @ [144:64] ==> enum entry globalOrStatic defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'CallableWeight' @ [145:36] ==> public constructor CallableWeight(enum: CallableWeightEnum, receiverIndex: Int?) defined in org.jetbrains.kotlin.idea.completion.CallableWeight[ClassConstructorDescriptorImpl]

'receiverCastRequired' @ [145:70] ==> enum entry receiverCastRequired defined in org.jetbrains.kotlin.idea.completion.CallableWeightEnum[FakeCallableDescriptorForObject]

'Key' @ [149:27] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CallableWeight

'startOffset' @ [152:18] ==> public final val InsertionContext.startOffset: Int[MyPropertyDescriptor]

'document' @ [153:17] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'charsSequence' @ [153:26] ==> public final val Document.charsSequence: CharSequence[MyPropertyDescriptor]

'offset' @ [154:12] ==> var offset: Int defined in org.jetbrains.kotlin.idea.completion.isAfterDot[LocalVariableDescriptor]

'offset' @ [155:9] ==> var offset: Int defined in org.jetbrains.kotlin.idea.completion.isAfterDot[LocalVariableDescriptor]

'chars' @ [156:17] ==> val chars: CharSequence defined in org.jetbrains.kotlin.idea.completion.isAfterDot[LocalVariableDescriptor]

'offset' @ [156:23] ==> var offset: Int defined in org.jetbrains.kotlin.idea.completion.isAfterDot[LocalVariableDescriptor]

'!' @ [157:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isWhitespace' @ [157:24] ==> public open fun isWhitespace(p0: Char): Boolean defined in java.lang.Character[JavaMethodDescriptor]

'c' @ [157:37] ==> val c: Char defined in org.jetbrains.kotlin.idea.completion.isAfterDot[LocalVariableDescriptor]

'c' @ [158:20] ==> val c: Char defined in org.jetbrains.kotlin.idea.completion.isAfterDot[LocalVariableDescriptor]

'prefixMatcher' @ [166:18] ==> value-parameter prefixMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.shouldCompleteThisItems[ValueParameterDescriptorImpl]

'prefix' @ [166:32] ==> public final val PrefixMatcher.prefix: String[MyPropertyDescriptor]

'prefix' @ [168:12] ==> val prefix: String defined in org.jetbrains.kotlin.idea.completion.shouldCompleteThisItems[LocalVariableDescriptor]

'startsWith' @ [168:19] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

's' @ [168:30] ==> val s: String defined in org.jetbrains.kotlin.idea.completion.shouldCompleteThisItems[LocalVariableDescriptor]

's' @ [168:36] ==> val s: String defined in org.jetbrains.kotlin.idea.completion.shouldCompleteThisItems[LocalVariableDescriptor]

'startsWith' @ [168:38] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [168:49] ==> val prefix: String defined in org.jetbrains.kotlin.idea.completion.shouldCompleteThisItems[LocalVariableDescriptor]

'KeywordLookupObject' @ [171:104] ==> public constructor KeywordLookupObject() defined in org.jetbrains.kotlin.idea.completion.KeywordLookupObject[ClassConstructorDescriptorImpl]

'createKeywordElement' @ [173:50] ==> private fun createKeywordElement(keyword: String, tail: String = ..., lookupObject: KeywordLookupObject = ...): LookupElementBuilder defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'labelName' @ [173:79] ==> public final val labelName: Name? defined in org.jetbrains.kotlin.idea.completion.ThisItemLookupObject[PropertyDescriptorImpl]

'labelNameToTail' @ [173:89] ==> private fun Name?.labelNameToTail(): String defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [173:123] ==> <this> defined in org.jetbrains.kotlin.idea.completion.createLookupElement[ReceiverParameterDescriptorImpl]

'withTypeText' @ [174:10] ==> @Contract public open fun withTypeText(@Nullable p0: String?): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'BasicLookupElementFactory' @ [174:23] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[FakeCallableDescriptorForObject]

'SHORT_NAMES_RENDERER' @ [174:49] ==> public final val SHORT_NAMES_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.Companion[PropertyDescriptorImpl]

'renderType' @ [174:70] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'receiverParameter' @ [174:81] ==> public final val receiverParameter: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.completion.ThisItemLookupObject[PropertyDescriptorImpl]

'type' @ [174:99] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'position' @ [177:17] ==> value-parameter position: KtExpression defined in org.jetbrains.kotlin.idea.completion.thisExpressionItems[ValueParameterDescriptorImpl]

'getResolutionScope' @ [177:26] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [177:45] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.thisExpressionItems[ValueParameterDescriptorImpl]

'resolutionFacade' @ [177:61] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.thisExpressionItems[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [179:22] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'position' @ [179:35] ==> value-parameter position: KtExpression defined in org.jetbrains.kotlin.idea.completion.thisExpressionItems[ValueParameterDescriptorImpl]

'ArrayList' @ [181:18] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ThisItemLookupObject

'component1' @ [182:11] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ReceiverParameterDescriptor, ReceiverExpressionFactory?>.component1(): ReceiverParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ReceiverParameterDescriptor
    <V> -> ReceiverExpressionFactory?

'component2' @ [182:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ReceiverParameterDescriptor, ReceiverExpressionFactory?>.component2(): ReceiverExpressionFactory? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ReceiverParameterDescriptor
    <V> -> ReceiverExpressionFactory?

'scope' @ [182:43] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.completion.thisExpressionItems[LocalVariableDescriptor]

'getImplicitReceiversWithInstanceToExpression' @ [182:49] ==> public fun LexicalScope.getImplicitReceiversWithInstanceToExpression(): Map<ReceiverParameterDescriptor, ReceiverExpressionFactory?> defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'expressionFactory' @ [183:13] ==> val expressionFactory: ReceiverExpressionFactory? defined in org.jetbrains.kotlin.idea.completion.thisExpressionItems[LocalVariableDescriptor]

'expressionFactory' @ [185:26] ==> val expressionFactory: ReceiverExpressionFactory? defined in org.jetbrains.kotlin.idea.completion.thisExpressionItems[LocalVariableDescriptor]

'createExpression' @ [185:44] ==> public abstract fun createExpression(psiFactory: KtPsiFactory, shortThis: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.util.ReceiverExpressionFactory[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [185:61] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.completion.thisExpressionItems[LocalVariableDescriptor]

'!' @ [185:85] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'prefix' @ [185:86] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.idea.completion.thisExpressionItems[ValueParameterDescriptorImpl]

'startsWith' @ [185:93] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'result' @ [186:9] ==> val result: ArrayList<ThisItemLookupObject> defined in org.jetbrains.kotlin.idea.completion.thisExpressionItems[LocalVariableDescriptor]

'add' @ [186:16] ==> public open fun add(element: ThisItemLookupObject): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ThisItemLookupObject' @ [186:20] ==> public constructor ThisItemLookupObject(receiverParameter: ReceiverParameterDescriptor, labelName: Name?) defined in org.jetbrains.kotlin.idea.completion.ThisItemLookupObject[ClassConstructorDescriptorImpl]

'receiver' @ [186:41] ==> val receiver: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.completion.thisExpressionItems[LocalVariableDescriptor]

'expression' @ [186:51] ==> val expression: KtThisExpression defined in org.jetbrains.kotlin.idea.completion.thisExpressionItems[LocalVariableDescriptor]

'getLabelNameAsName' @ [186:62] ==> public final fun getLabelNameAsName(): Name? defined in org.jetbrains.kotlin.psi.KtThisExpression[DeserializedSimpleFunctionDescriptor]

'result' @ [188:12] ==> val result: ArrayList<ThisItemLookupObject> defined in org.jetbrains.kotlin.idea.completion.thisExpressionItems[LocalVariableDescriptor]

'ArrayList' @ [192:18] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LookupElement

'position' @ [193:20] ==> value-parameter position: KtElement defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [193:29] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'parent' @ [194:13] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'parent' @ [195:30] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'returnType' @ [195:37] ==> private fun KtDeclarationWithBody.returnType(bindingContext: BindingContext): KotlinType? defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [195:48] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[ValueParameterDescriptorImpl]

'returnType' @ [196:26] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'isUnit' @ [196:63] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [196:70] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'if (parent is KtFunctionLiteral) {
                val (label, call) = parent.findLabelAndCall()
                if (label != null) {
                    result.add(createKeywordElementWithSpace("return", tail = label.labelNameToTail(), addSpaceAfter = !isUnit))
                }

                // check if the current function literal is inlined and stop processing outer declarations if it's not
                val callee = call?.calleeExpression as? KtReferenceExpression ?: break // not inlined
                if (!InlineUtil.isInline(bindingContext[BindingContext.REFERENCE_TARGET, callee])) break // not inlined
            }
            else {
                if (parent.hasBlockBody()) {
                    result.add(createKeywordElementWithSpace("return", addSpaceAfter = !isUnit))

                    if (returnType != null) {
                        if (returnType.nullability() == TypeNullability.NULLABLE) {
                            result.add(createKeywordElement("return null"))
                        }

                        if (KotlinBuiltIns.isBooleanOrNullableBoolean(returnType)) {
                            result.add(createKeywordElement("return true"))
                            result.add(createKeywordElement("return false"))
                        }
                        else if (KotlinBuiltIns.isCollectionOrNullableCollection(returnType) || KotlinBuiltIns.isListOrNullableList(returnType) || KotlinBuiltIns.isIterableOrNullableIterable(returnType)) {
                            result.add(createKeywordElement("return", tail = " emptyList()"))
                        }
                        else if (KotlinBuiltIns.isSetOrNullableSet(returnType)) {
                            result.add(createKeywordElement("return", tail = " emptySet()"))
                        }
                    }
                }
                break
            }' @ [197:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parent' @ [197:17] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'component1' @ [198:22] ==> public final operator fun component1(): Name? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [198:29] ==> public final operator fun component2(): KtCallExpression? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'parent' @ [198:37] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'findLabelAndCall' @ [198:44] ==> public fun KtFunctionLiteral.findLabelAndCall(): Pair<Name?, KtCallExpression?> defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'label' @ [199:21] ==> val label: Name? defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'result' @ [200:21] ==> val result: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'add' @ [200:28] ==> public open fun add(element: LookupElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'createKeywordElementWithSpace' @ [200:32] ==> private fun createKeywordElementWithSpace(keyword: String, tail: String = ..., addSpaceAfter: Boolean = ..., lookupObject: KeywordLookupObject = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'label' @ [200:79] ==> val label: Name? defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'labelNameToTail' @ [200:85] ==> private fun Name?.labelNameToTail(): String defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'!' @ [200:120] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnit' @ [200:121] ==> val isUnit: Boolean defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'call' @ [204:30] ==> val call: KtCallExpression? defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'calleeExpression' @ [204:36] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'!' @ [205:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInline' @ [205:33] ==> public open fun isInline(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'bindingContext' @ [205:42] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [205:72] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'callee' @ [205:90] ==> val callee: KtReferenceExpression defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'parent' @ [208:21] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'hasBlockBody' @ [208:28] ==> public abstract fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'result' @ [209:21] ==> val result: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'add' @ [209:28] ==> public open fun add(element: LookupElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'createKeywordElementWithSpace' @ [209:32] ==> private fun createKeywordElementWithSpace(keyword: String, tail: String = ..., addSpaceAfter: Boolean = ..., lookupObject: KeywordLookupObject = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'!' @ [209:88] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnit' @ [209:89] ==> val isUnit: Boolean defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'returnType' @ [211:25] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'returnType' @ [212:29] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'nullability' @ [212:40] ==> public fun KotlinType.nullability(): TypeNullability defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'NULLABLE' @ [212:73] ==> enum entry NULLABLE defined in org.jetbrains.kotlin.types.typeUtil.TypeNullability[FakeCallableDescriptorForObject]

'result' @ [213:29] ==> val result: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'add' @ [213:36] ==> public open fun add(element: LookupElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'createKeywordElement' @ [213:40] ==> private fun createKeywordElement(keyword: String, tail: String = ..., lookupObject: KeywordLookupObject = ...): LookupElementBuilder defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'if (KotlinBuiltIns.isBooleanOrNullableBoolean(returnType)) {
                            result.add(createKeywordElement("return true"))
                            result.add(createKeywordElement("return false"))
                        }
                        else if (KotlinBuiltIns.isCollectionOrNullableCollection(returnType) || KotlinBuiltIns.isListOrNullableList(returnType) || KotlinBuiltIns.isIterableOrNullableIterable(returnType)) {
                            result.add(createKeywordElement("return", tail = " emptyList()"))
                        }
                        else if (KotlinBuiltIns.isSetOrNullableSet(returnType)) {
                            result.add(createKeywordElement("return", tail = " emptySet()"))
                        }' @ [216:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'isBooleanOrNullableBoolean' @ [216:44] ==> public open fun isBooleanOrNullableBoolean(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [216:71] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'result' @ [217:29] ==> val result: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'add' @ [217:36] ==> public open fun add(element: LookupElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'createKeywordElement' @ [217:40] ==> private fun createKeywordElement(keyword: String, tail: String = ..., lookupObject: KeywordLookupObject = ...): LookupElementBuilder defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'result' @ [218:29] ==> val result: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'add' @ [218:36] ==> public open fun add(element: LookupElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'createKeywordElement' @ [218:40] ==> private fun createKeywordElement(keyword: String, tail: String = ..., lookupObject: KeywordLookupObject = ...): LookupElementBuilder defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'if (KotlinBuiltIns.isCollectionOrNullableCollection(returnType) || KotlinBuiltIns.isListOrNullableList(returnType) || KotlinBuiltIns.isIterableOrNullableIterable(returnType)) {
                            result.add(createKeywordElement("return", tail = " emptyList()"))
                        }
                        else if (KotlinBuiltIns.isSetOrNullableSet(returnType)) {
                            result.add(createKeywordElement("return", tail = " emptySet()"))
                        }' @ [220:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'isCollectionOrNullableCollection' @ [220:49] ==> public open fun isCollectionOrNullableCollection(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [220:82] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'isListOrNullableList' @ [220:112] ==> public open fun isListOrNullableList(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [220:133] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'isIterableOrNullableIterable' @ [220:163] ==> public open fun isIterableOrNullableIterable(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [220:192] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'result' @ [221:29] ==> val result: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'add' @ [221:36] ==> public open fun add(element: LookupElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'createKeywordElement' @ [221:40] ==> private fun createKeywordElement(keyword: String, tail: String = ..., lookupObject: KeywordLookupObject = ...): LookupElementBuilder defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'isSetOrNullableSet' @ [223:49] ==> public open fun isSetOrNullableSet(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [223:68] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'result' @ [224:29] ==> val result: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'add' @ [224:36] ==> public open fun add(element: LookupElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'createKeywordElement' @ [224:40] ==> private fun createKeywordElement(keyword: String, tail: String = ..., lookupObject: KeywordLookupObject = ...): LookupElementBuilder defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'result' @ [232:12] ==> val result: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.returnExpressionItems[LocalVariableDescriptor]

'bindingContext' @ [236:20] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.returnType[ValueParameterDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [236:50] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [236:77] ==> <this> defined in org.jetbrains.kotlin.idea.completion.returnType[ReceiverParameterDescriptorImpl]

'callable' @ [237:12] ==> val callable: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.returnType[LocalVariableDescriptor]

'returnType' @ [237:21] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'if (this != null) "@" + render() else ""' @ [240:47] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'this' @ [240:51] ==> <this> defined in org.jetbrains.kotlin.idea.completion.labelNameToTail[ReceiverParameterDescriptorImpl]

'+' @ [240:65] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'render' @ [240:71] ==> public fun Name.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'KeywordLookupObject' @ [246:45] ==> public constructor KeywordLookupObject() defined in org.jetbrains.kotlin.idea.completion.KeywordLookupObject[ClassConstructorDescriptorImpl]

'createKeywordElement' @ [248:19] ==> private fun createKeywordElement(keyword: String, tail: String = ..., lookupObject: KeywordLookupObject = ...): LookupElementBuilder defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'keyword' @ [248:40] ==> value-parameter keyword: String defined in org.jetbrains.kotlin.idea.completion.createKeywordElementWithSpace[ValueParameterDescriptorImpl]

'tail' @ [248:49] ==> value-parameter tail: String = ... defined in org.jetbrains.kotlin.idea.completion.createKeywordElementWithSpace[ValueParameterDescriptorImpl]

'lookupObject' @ [248:55] ==> value-parameter lookupObject: KeywordLookupObject = ... defined in org.jetbrains.kotlin.idea.completion.createKeywordElementWithSpace[ValueParameterDescriptorImpl]

'if (addSpaceAfter) {
        object: LookupElementDecorator<LookupElement>(element) {
            override fun handleInsert(context: InsertionContext) {
                WithTailInsertHandler.SPACE.handleInsert(context, delegate)
            }
        }
    }
    else {
        element
    }' @ [249:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LookupElement, elseBranch: LookupElement): LookupElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LookupElement

'addSpaceAfter' @ [249:16] ==> value-parameter addSpaceAfter: Boolean = ... defined in org.jetbrains.kotlin.idea.completion.createKeywordElementWithSpace[ValueParameterDescriptorImpl]

'LookupElementDecorator<LookupElement>' @ [250:17] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'element' @ [250:55] ==> val element: LookupElementBuilder defined in org.jetbrains.kotlin.idea.completion.createKeywordElementWithSpace[LocalVariableDescriptor]

'WithTailInsertHandler' @ [252:17] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[FakeCallableDescriptorForObject]

'SPACE' @ [252:39] ==> public final val SPACE: WithTailInsertHandler defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler.Companion[PropertyDescriptorImpl]

'handleInsert' @ [252:45] ==> public open fun handleInsert(context: InsertionContext, item: LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[SimpleFunctionDescriptorImpl]

'context' @ [252:58] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.createKeywordElementWithSpace.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'delegate' @ [252:67] ==> public final val <no name provided>.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'element' @ [257:9] ==> val element: LookupElementBuilder defined in org.jetbrains.kotlin.idea.completion.createKeywordElementWithSpace[LocalVariableDescriptor]

'KeywordLookupObject' @ [264:45] ==> public constructor KeywordLookupObject() defined in org.jetbrains.kotlin.idea.completion.KeywordLookupObject[ClassConstructorDescriptorImpl]

'create' @ [266:40] ==> public open fun create(@NotNull p0: Any, @NotNull p1: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'lookupObject' @ [266:47] ==> value-parameter lookupObject: KeywordLookupObject = ... defined in org.jetbrains.kotlin.idea.completion.createKeywordElement[ValueParameterDescriptorImpl]

'keyword' @ [266:61] ==> value-parameter keyword: String defined in org.jetbrains.kotlin.idea.completion.createKeywordElement[ValueParameterDescriptorImpl]

'tail' @ [266:71] ==> value-parameter tail: String = ... defined in org.jetbrains.kotlin.idea.completion.createKeywordElement[ValueParameterDescriptorImpl]

'element' @ [267:5] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.createKeywordElement[LocalVariableDescriptor]

'element' @ [267:15] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.createKeywordElement[LocalVariableDescriptor]

'withPresentableText' @ [267:23] ==> @Contract public open fun withPresentableText(@NotNull p0: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'keyword' @ [267:43] ==> value-parameter keyword: String defined in org.jetbrains.kotlin.idea.completion.createKeywordElement[ValueParameterDescriptorImpl]

'element' @ [268:5] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.createKeywordElement[LocalVariableDescriptor]

'element' @ [268:15] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.createKeywordElement[LocalVariableDescriptor]

'withBoldness' @ [268:23] ==> @Contract public open fun withBoldness(p0: Boolean): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'tail' @ [269:9] ==> value-parameter tail: String = ... defined in org.jetbrains.kotlin.idea.completion.createKeywordElement[ValueParameterDescriptorImpl]

'isNotEmpty' @ [269:14] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'element' @ [270:9] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.createKeywordElement[LocalVariableDescriptor]

'element' @ [270:19] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.createKeywordElement[LocalVariableDescriptor]

'withTailText' @ [270:27] ==> @Contract public open fun withTailText(@Nullable p0: String?, p1: Boolean): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'tail' @ [270:40] ==> value-parameter tail: String = ... defined in org.jetbrains.kotlin.idea.completion.createKeywordElement[ValueParameterDescriptorImpl]

'element' @ [272:12] ==> var element: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.createKeywordElement[LocalVariableDescriptor]

'ArrayList' @ [276:18] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LookupElement

'position' @ [279:20] ==> value-parameter position: KtElement defined in org.jetbrains.kotlin.idea.completion.breakOrContinueExpressionItems[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [279:29] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'when (parent) {
            is KtLoopExpression -> {
                if (result.isEmpty()) {
                    result.add(createKeywordElement(breakOrContinue))
                }

                val label = (parent.parent as? KtLabeledExpression)?.getLabelNameAsName()
                if (label != null) {
                    result.add(createKeywordElement(breakOrContinue, tail = label.labelNameToTail()))
                }
            }

            is KtDeclarationWithBody -> break@parentsLoop //TODO: support non-local break's&continue's when they are supported by compiler
        }' @ [280:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [280:15] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.completion.breakOrContinueExpressionItems[LocalVariableDescriptor]

'result' @ [282:21] ==> val result: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.breakOrContinueExpressionItems[LocalVariableDescriptor]

'isEmpty' @ [282:28] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'result' @ [283:21] ==> val result: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.breakOrContinueExpressionItems[LocalVariableDescriptor]

'add' @ [283:28] ==> public open fun add(element: LookupElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'createKeywordElement' @ [283:32] ==> private fun createKeywordElement(keyword: String, tail: String = ..., lookupObject: KeywordLookupObject = ...): LookupElementBuilder defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'breakOrContinue' @ [283:53] ==> value-parameter breakOrContinue: String defined in org.jetbrains.kotlin.idea.completion.breakOrContinueExpressionItems[ValueParameterDescriptorImpl]

'parent' @ [286:30] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.completion.breakOrContinueExpressionItems[LocalVariableDescriptor]

'parent' @ [286:37] ==> public final val KtLoopExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getLabelNameAsName' @ [286:70] ==> public final fun getLabelNameAsName(): Name? defined in org.jetbrains.kotlin.psi.KtLabeledExpression[DeserializedSimpleFunctionDescriptor]

'label' @ [287:21] ==> val label: Name? defined in org.jetbrains.kotlin.idea.completion.breakOrContinueExpressionItems[LocalVariableDescriptor]

'result' @ [288:21] ==> val result: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.breakOrContinueExpressionItems[LocalVariableDescriptor]

'add' @ [288:28] ==> public open fun add(element: LookupElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'createKeywordElement' @ [288:32] ==> private fun createKeywordElement(keyword: String, tail: String = ..., lookupObject: KeywordLookupObject = ...): LookupElementBuilder defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'breakOrContinue' @ [288:53] ==> value-parameter breakOrContinue: String defined in org.jetbrains.kotlin.idea.completion.breakOrContinueExpressionItems[ValueParameterDescriptorImpl]

'label' @ [288:77] ==> val label: Name? defined in org.jetbrains.kotlin.idea.completion.breakOrContinueExpressionItems[LocalVariableDescriptor]

'labelNameToTail' @ [288:83] ==> private fun Name?.labelNameToTail(): String defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'result' @ [295:12] ==> val result: ArrayList<LookupElement> defined in org.jetbrains.kotlin.idea.completion.breakOrContinueExpressionItems[LocalVariableDescriptor]

'type' @ [299:9] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType[ValueParameterDescriptorImpl]

'isError' @ [299:14] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'if (type.isFunctionType) {
        val text = IdeDescriptorRenderers.SOURCE_CODE_SHORT_NAMES_IN_TYPES.renderType(type)
        val baseLookupElement = LookupElementBuilder.create(text).withIcon(KotlinIcons.LAMBDA)
        BaseTypeLookupElement(type, baseLookupElement)
    }
    else {
        val classifier = type.constructor.declarationDescriptor ?: return null
        val baseLookupElement = createLookupElement(classifier, qualifyNestedClasses = true, includeClassTypeArguments = false)

        val itemText = IdeDescriptorRenderers.SOURCE_CODE_SHORT_NAMES_IN_TYPES.renderType(type)

        val typeLookupElement = object : BaseTypeLookupElement(type, baseLookupElement) {
            override fun renderElement(presentation: LookupElementPresentation) {
                super.renderElement(presentation)
                presentation.itemText = itemText
            }
        }

        // if type is simply classifier without anything else, use classifier's lookup element to avoid duplicates (works after "as" in basic completion)
        if (typeLookupElement.fullText == IdeDescriptorRenderers.SOURCE_CODE.renderClassifierName(classifier))
            baseLookupElement
        else
            typeLookupElement
    }' @ [301:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LookupElement?, elseBranch: LookupElement?): LookupElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LookupElement?

'type' @ [301:16] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType[ValueParameterDescriptorImpl]

'isFunctionType' @ [301:21] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'IdeDescriptorRenderers' @ [302:20] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [302:43] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [302:76] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [302:87] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType[ValueParameterDescriptorImpl]

'create' @ [303:54] ==> @NotNull public open fun create(@NotNull p0: String): LookupElementBuilder defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'text' @ [303:61] ==> val text: String defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType[LocalVariableDescriptor]

'withIcon' @ [303:67] ==> @Contract public open fun withIcon(@Nullable p0: Icon?): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'LAMBDA' @ [303:88] ==> public final val LAMBDA: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'BaseTypeLookupElement' @ [304:9] ==> public constructor BaseTypeLookupElement(type: KotlinType, baseLookupElement: LookupElement) defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement[ClassConstructorDescriptorImpl]

'type' @ [304:31] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType[ValueParameterDescriptorImpl]

'baseLookupElement' @ [304:37] ==> val baseLookupElement: (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType[LocalVariableDescriptor]

'type' @ [307:26] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType[ValueParameterDescriptorImpl]

'constructor' @ [307:31] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [307:43] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'createLookupElement' @ [308:33] ==> public final fun createLookupElement(descriptor: DeclarationDescriptor, qualifyNestedClasses: Boolean = ..., includeClassTypeArguments: Boolean = ..., parametersAndTypeGrayed: Boolean = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'classifier' @ [308:53] ==> val classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType[LocalVariableDescriptor]

'IdeDescriptorRenderers' @ [310:24] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [310:47] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [310:80] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [310:91] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType[ValueParameterDescriptorImpl]

'BaseTypeLookupElement' @ [312:42] ==> public constructor BaseTypeLookupElement(type: KotlinType, baseLookupElement: LookupElement) defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement[ClassConstructorDescriptorImpl]

'type' @ [312:64] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType[ValueParameterDescriptorImpl]

'baseLookupElement' @ [312:70] ==> val baseLookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType[LocalVariableDescriptor]

'super' @ [314:17] ==> <this> defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType.<no name provided>[LazyClassReceiverParameterDescriptor]

'renderElement' @ [314:23] ==> public open fun renderElement(presentation: LookupElementPresentation): Unit defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement[SimpleFunctionDescriptorImpl]

'presentation' @ [314:37] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'presentation' @ [315:17] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [315:30] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'itemText' @ [315:41] ==> val itemText: String defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType[LocalVariableDescriptor]

'if (typeLookupElement.fullText == IdeDescriptorRenderers.SOURCE_CODE.renderClassifierName(classifier))
            baseLookupElement
        else
            typeLookupElement' @ [320:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LookupElement, elseBranch: LookupElement): LookupElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LookupElement

'typeLookupElement' @ [320:13] ==> val typeLookupElement: <no name provided> defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType[LocalVariableDescriptor]

'fullText' @ [320:31] ==> public final val fullText: String defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType.<no name provided>[PropertyDescriptorImpl]

'IdeDescriptorRenderers' @ [320:43] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [320:66] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderClassifierName' @ [320:78] ==> public abstract fun renderClassifierName(klass: ClassifierDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'classifier' @ [320:99] ==> val classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType[LocalVariableDescriptor]

'baseLookupElement' @ [321:13] ==> val baseLookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType[LocalVariableDescriptor]

'typeLookupElement' @ [323:13] ==> val typeLookupElement: <no name provided> defined in org.jetbrains.kotlin.idea.completion.createLookupElementForType[LocalVariableDescriptor]

'LookupElementDecorator<LookupElement>' @ [327:96] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'baseLookupElement' @ [327:134] ==> value-parameter baseLookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement.<init>[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [328:20] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [328:43] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [328:55] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [328:66] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement.<init>[ValueParameterDescriptorImpl]

'other' @ [330:40] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement.equals[ValueParameterDescriptorImpl]

'fullText' @ [330:74] ==> public final val fullText: String defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement[PropertyDescriptorImpl]

'other' @ [330:86] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement.equals[ValueParameterDescriptorImpl]

'fullText' @ [330:92] ==> public final val fullText: String defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement[PropertyDescriptorImpl]

'fullText' @ [331:31] ==> public final val fullText: String defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement[PropertyDescriptorImpl]

'hashCode' @ [331:40] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'delegate' @ [334:9] ==> public final val BaseTypeLookupElement.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'renderElement' @ [334:18] ==> public open fun renderElement(p0: (LookupElementPresentation..LookupElementPresentation?)): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]

'presentation' @ [334:32] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement.renderElement[ValueParameterDescriptorImpl]

'context' @ [338:9] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement.handleInsert[ValueParameterDescriptorImpl]

'document' @ [338:17] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'replaceString' @ [338:26] ==> public abstract fun replaceString(p0: Int, p1: Int, @NotNull p2: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'context' @ [338:40] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement.handleInsert[ValueParameterDescriptorImpl]

'startOffset' @ [338:48] ==> public final val InsertionContext.startOffset: Int[MyPropertyDescriptor]

'context' @ [338:61] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement.handleInsert[ValueParameterDescriptorImpl]

'tailOffset' @ [338:69] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'fullText' @ [338:81] ==> public final val fullText: String defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement[PropertyDescriptorImpl]

'context' @ [339:9] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement.handleInsert[ValueParameterDescriptorImpl]

'tailOffset' @ [339:17] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'context' @ [339:30] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement.handleInsert[ValueParameterDescriptorImpl]

'startOffset' @ [339:38] ==> public final val InsertionContext.startOffset: Int[MyPropertyDescriptor]

'fullText' @ [339:52] ==> public final val fullText: String defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement[PropertyDescriptorImpl]

'length' @ [339:61] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'shortenReferences' @ [340:9] ==> public fun shortenReferences(context: InsertionContext, startOffset: Int, endOffset: Int): Unit defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [340:27] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement.handleInsert[ValueParameterDescriptorImpl]

'context' @ [340:36] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement.handleInsert[ValueParameterDescriptorImpl]

'startOffset' @ [340:44] ==> public final val InsertionContext.startOffset: Int[MyPropertyDescriptor]

'context' @ [340:57] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.BaseTypeLookupElement.handleInsert[ValueParameterDescriptorImpl]

'tailOffset' @ [340:65] ==> public final var InsertionContext.tailOffset: Int[MyPropertyDescriptor]

'getInstance' @ [345:24] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'context' @ [345:36] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.shortenReferences[ValueParameterDescriptorImpl]

'project' @ [345:44] ==> public final val InsertionContext.project: (Project..Project?)[MyPropertyDescriptor]

'commitAllDocuments' @ [345:53] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'ShortenReferences' @ [346:5] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [346:23] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [346:31] ==> public final fun process(file: KtFile, startOffset: Int, endOffset: Int): Unit defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'context' @ [346:39] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.shortenReferences[ValueParameterDescriptorImpl]

'file' @ [346:47] ==> public final val InsertionContext.file: PsiFile[MyPropertyDescriptor]

'startOffset' @ [346:63] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.idea.completion.shortenReferences[ValueParameterDescriptorImpl]

'endOffset' @ [346:76] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.idea.completion.shortenReferences[ValueParameterDescriptorImpl]

'and' @ [349:80] ==> @SafeVarargs @NotNull public open fun <E : (Any..Any?)> and(vararg p0: (ElementPattern<out (T..T?)>..ElementPattern<out (T..T?)>?)): ElementPattern<(T..T?)> defined in com.intellij.patterns.StandardPatterns[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'this' @ [349:84] ==> <this> defined in org.jetbrains.kotlin.idea.completion.and[ReceiverParameterDescriptorImpl]

'rhs' @ [349:90] ==> value-parameter rhs: ElementPattern<T> defined in org.jetbrains.kotlin.idea.completion.and[ValueParameterDescriptorImpl]

'and' @ [350:77] ==> @SafeVarargs @NotNull public open fun <E : (Any..Any?)> and(vararg p0: (ElementPattern<out (T..T?)>..ElementPattern<out (T..T?)>?)): ElementPattern<(T..T?)> defined in com.intellij.patterns.StandardPatterns[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'this' @ [350:81] ==> <this> defined in org.jetbrains.kotlin.idea.completion.andNot[ReceiverParameterDescriptorImpl]

'not' @ [350:104] ==> @NotNull public open fun <E : (Any..Any?)> not(p0: (ElementPattern<(T..T?)>..ElementPattern<(T..T?)>?)): ObjectPattern.Capture<(T..T?)> defined in com.intellij.patterns.StandardPatterns[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'rhs' @ [350:108] ==> value-parameter rhs: ElementPattern<T> defined in org.jetbrains.kotlin.idea.completion.andNot[ValueParameterDescriptorImpl]

'or' @ [351:79] ==> @SafeVarargs @NotNull public open fun <E : (Any..Any?)> or(@NotNull vararg p0: (ElementPattern<out (T..T?)>..ElementPattern<out (T..T?)>?)): ElementPattern<(T..T?)> defined in com.intellij.patterns.StandardPatterns[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'this' @ [351:82] ==> <this> defined in org.jetbrains.kotlin.idea.completion.or[ReceiverParameterDescriptorImpl]

'rhs' @ [351:88] ==> value-parameter rhs: ElementPattern<T> defined in org.jetbrains.kotlin.idea.completion.or[ValueParameterDescriptorImpl]

'character' @ [353:54] ==> @NotNull public open fun character(): CharPattern defined in com.intellij.patterns.StandardPatterns[JavaMethodDescriptor]

'equalTo' @ [353:66] ==> @NotNull public open fun equalTo(@NotNull p0: Char): CharPattern defined in com.intellij.patterns.CharPattern[JavaMethodDescriptor]

'char' @ [353:74] ==> value-parameter char: Char defined in org.jetbrains.kotlin.idea.completion.singleCharPattern[ValueParameterDescriptorImpl]

'memberDescriptor' @ [359:21] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember[ValueParameterDescriptorImpl]

'containingDeclaration' @ [359:38] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'if (container.isCompanionObject)
        container.containingDeclaration as? ClassDescriptor ?: return null
    else
        container' @ [360:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassDescriptor, elseBranch: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassDescriptor

'container' @ [360:31] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember[LocalVariableDescriptor]

'isCompanionObject' @ [360:41] ==> public final val ClassDescriptor.isCompanionObject: Boolean[MyPropertyDescriptor]

'container' @ [361:9] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember[LocalVariableDescriptor]

'containingDeclaration' @ [361:19] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'container' @ [363:9] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember[LocalVariableDescriptor]

'container' @ [365:27] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember[LocalVariableDescriptor]

'importableFqName' @ [365:37] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'classDescriptor' @ [366:33] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember[LocalVariableDescriptor]

'name' @ [366:49] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [366:54] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'LookupElementDecorator<LookupElement>' @ [368:20] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'this' @ [368:58] ==> <this> defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember[ReceiverParameterDescriptorImpl]

'if (classNameAsLookupString) setOf(delegate.lookupString, qualifierPresentation) else super.getAllLookupStrings()' @ [370:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Set<String>, elseBranch: Set<String>): Set<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Set<String>

'classNameAsLookupString' @ [370:24] ==> value-parameter classNameAsLookupString: Boolean defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember[ValueParameterDescriptorImpl]

'setOf' @ [370:49] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'delegate' @ [370:55] ==> public final val <no name provided>.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'lookupString' @ [370:64] ==> public final val LookupElement.lookupString: String[MyPropertyDescriptor]

'qualifierPresentation' @ [370:78] ==> val qualifierPresentation: String defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember[LocalVariableDescriptor]

'super' @ [370:106] ==> <this> defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>[LazyClassReceiverParameterDescriptor]

'getAllLookupStrings' @ [370:112] ==> public open fun getAllLookupStrings(): (MutableSet<(String..String?)>..Set<(String..String?)>?) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'delegate' @ [374:13] ==> public final val <no name provided>.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'renderElement' @ [374:22] ==> public open fun renderElement(p0: (LookupElementPresentation..LookupElementPresentation?)): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]

'presentation' @ [374:36] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'presentation' @ [376:13] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [376:26] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'qualifierPresentation' @ [376:37] ==> val qualifierPresentation: String defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember[LocalVariableDescriptor]

'presentation' @ [376:67] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [376:80] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'+' @ [378:28] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getFqName' @ [378:51] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [378:61] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember[LocalVariableDescriptor]

'containingDeclaration' @ [378:77] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'if (memberDescriptor is FunctionDescriptor) {
                presentation.appendTailText(tailText, true)
            }
            else {
                presentation.setTailText(tailText, true)
            }' @ [379:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'memberDescriptor' @ [379:17] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember[ValueParameterDescriptorImpl]

'presentation' @ [380:17] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'appendTailText' @ [380:30] ==> public open fun appendTailText(@NotNull p0: String, p1: Boolean): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'tailText' @ [380:45] ==> val tailText: String defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.renderElement[LocalVariableDescriptor]

'presentation' @ [383:17] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'setTailText' @ [383:30] ==> public open fun setTailText(@Nullable p0: String?, p1: Boolean): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'tailText' @ [383:42] ==> val tailText: String defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.renderElement[LocalVariableDescriptor]

'presentation' @ [386:17] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'typeText' @ [386:30] ==> public final var LookupElementPresentation.typeText: String?[MyPropertyDescriptor]

'isNullOrEmpty' @ [386:39] ==> @InlineOnly public inline fun CharSequence?.isNullOrEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'presentation' @ [387:17] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'typeText' @ [387:30] ==> public final var LookupElementPresentation.typeText: String?[MyPropertyDescriptor]

'BasicLookupElementFactory' @ [387:41] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[FakeCallableDescriptorForObject]

'SHORT_NAMES_RENDERER' @ [387:67] ==> public final val SHORT_NAMES_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory.Companion[PropertyDescriptorImpl]

'renderType' @ [387:88] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [387:99] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember[LocalVariableDescriptor]

'defaultType' @ [387:115] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'getInstance' @ [392:57] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'context' @ [392:69] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'project' @ [392:77] ==> public final val InsertionContext.project: (Project..Project?)[MyPropertyDescriptor]

'context' @ [393:24] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'file' @ [393:32] ==> public final val InsertionContext.file: PsiFile[MyPropertyDescriptor]

'file' @ [395:35] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.handleInsert[LocalVariableDescriptor]

'importDirectives' @ [395:40] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'any' @ [395:57] ==> public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.any(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'!' @ [395:63] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [395:64] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.handleInsert.<anonymous>[ValueParameterDescriptorImpl]

'isAllUnder' @ [395:67] ==> public final val KtImportDirective.isAllUnder: Boolean[MyPropertyDescriptor]

'it' @ [395:81] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.handleInsert.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [395:84] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'fqName' @ [395:96] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'parent' @ [395:104] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'containerFqName' @ [395:116] ==> val containerFqName: FqName defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember[LocalVariableDescriptor]

'addMemberImport' @ [397:17] ==> val addMemberImport: Boolean defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.handleInsert[LocalVariableDescriptor]

'psiDocumentManager' @ [398:17] ==> val psiDocumentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.handleInsert[LocalVariableDescriptor]

'commitAllDocuments' @ [398:36] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'ImportInsertHelper' @ [399:17] ==> public companion object defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[FakeCallableDescriptorForObject]

'getInstance' @ [399:36] ==> @JvmStatic public final fun getInstance(project: Project): ImportInsertHelper defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper.Companion[DeserializedSimpleFunctionDescriptor]

'context' @ [399:48] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'project' @ [399:56] ==> public final val InsertionContext.project: (Project..Project?)[MyPropertyDescriptor]

'importDescriptor' @ [399:65] ==> public abstract fun importDescriptor(file: KtFile, descriptor: DeclarationDescriptor, forceAllUnderImport: Boolean = ...): ImportDescriptorResult defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[DeserializedSimpleFunctionDescriptor]

'file' @ [399:82] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.handleInsert[LocalVariableDescriptor]

'memberDescriptor' @ [399:88] ==> value-parameter memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember[ValueParameterDescriptorImpl]

'psiDocumentManager' @ [400:17] ==> val psiDocumentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.handleInsert[LocalVariableDescriptor]

'doPostponedOperationsAndUnblockDocument' @ [400:36] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'context' @ [400:76] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'document' @ [400:84] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'super' @ [403:13] ==> <this> defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>[LazyClassReceiverParameterDescriptor]

'handleInsert' @ [403:19] ==> public open fun handleInsert(p0: (InsertionContext..InsertionContext?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'context' @ [403:32] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.decorateAsStaticMember.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'classify' @ [409:26] ==> public final fun classify(fqName: FqName, isPackage: Boolean): ImportableFqNameClassifier.Classification defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [409:35] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.isImportableDescriptorImported[ValueParameterDescriptorImpl]

'importableFqName' @ [409:46] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'classification' @ [410:12] ==> val classification: ImportableFqNameClassifier.Classification defined in org.jetbrains.kotlin.idea.completion.isImportableDescriptorImported[LocalVariableDescriptor]

'notImported' @ [410:72] ==> enum entry notImported defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'classification' @ [411:15] ==> val classification: ImportableFqNameClassifier.Classification defined in org.jetbrains.kotlin.idea.completion.isImportableDescriptorImported[LocalVariableDescriptor]

'siblingImported' @ [411:75] ==> enum entry siblingImported defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'!' @ [416:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containsOffset' @ [416:14] ==> public open fun containsOffset(p0: (OffsetKey..OffsetKey?)): Boolean defined in com.intellij.codeInsight.completion.OffsetMap[JavaMethodDescriptor]

'key' @ [416:29] ==> value-parameter key: OffsetKey defined in org.jetbrains.kotlin.idea.completion.tryGetOffset[ValueParameterDescriptorImpl]

'getOffset' @ [417:16] ==> public open fun getOffset(p0: (OffsetKey..OffsetKey?)): Int defined in com.intellij.codeInsight.completion.OffsetMap[JavaMethodDescriptor]

'key' @ [417:26] ==> value-parameter key: OffsetKey defined in org.jetbrains.kotlin.idea.completion.tryGetOffset[ValueParameterDescriptorImpl]

'takeIf' @ [417:31] ==> @InlineOnly @SinceKotlin public inline fun <T> Int.takeIf(predicate: (Int) -> Boolean): Int? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [417:40] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.completion.tryGetOffset.<anonymous>[ValueParameterDescriptorImpl]

'-' @ [417:46] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'CopyableUserDataProperty' @ [424:76] ==> public constructor CopyableUserDataProperty<in R : PsiElement, T : Any>(key: Key<(LookupElement) -> Boolean>) defined in org.jetbrains.kotlin.psi.CopyableUserDataProperty[DeserializedClassConstructorDescriptor]
Inferred types:
    <in R : PsiElement> -> KtCodeFragment
    <T : Any> -> Function1<LookupElement, Boolean>

'create' @ [424:105] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<((LookupElement) -> Boolean..((LookupElement) -> Boolean)?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Function1<LookupElement, Boolean>

'original' @ [427:13] ==> public final val DeclarationDescriptor.original: DeclarationDescriptor[MyPropertyDescriptor]

'name' @ [427:22] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'name' @ [427:30] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

