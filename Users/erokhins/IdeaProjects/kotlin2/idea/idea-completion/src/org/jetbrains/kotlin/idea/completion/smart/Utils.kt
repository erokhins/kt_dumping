'context' @ [53:22] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler.handleInsert[ValueParameterDescriptorImpl]

'editor' @ [53:30] ==> public final val InsertionContext.editor: Editor[MyPropertyDescriptor]

'caretModel' @ [53:37] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [53:48] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'offset' @ [54:27] ==> val offset: Int defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler.handleInsert[LocalVariableDescriptor]

'item' @ [54:36] ==> value-parameter item: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler.handleInsert[ValueParameterDescriptorImpl]

'lookupString' @ [54:41] ==> public final val LookupElement.lookupString: String[MyPropertyDescriptor]

'length' @ [54:54] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'context' @ [55:9] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler.handleInsert[ValueParameterDescriptorImpl]

'document' @ [55:17] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'deleteString' @ [55:26] ==> public abstract fun deleteString(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'startOffset' @ [55:39] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler.handleInsert[LocalVariableDescriptor]

'offset' @ [55:52] ==> val offset: Int defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler.handleInsert[LocalVariableDescriptor]

'context' @ [56:9] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler.handleInsert[ValueParameterDescriptorImpl]

'document' @ [56:17] ==> public final val InsertionContext.document: Document[MyPropertyDescriptor]

'insertString' @ [56:26] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'startOffset' @ [56:39] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler.handleInsert[LocalVariableDescriptor]

'textBeforeCaret' @ [56:52] ==> private final val textBeforeCaret: String defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler[PropertyDescriptorImpl]

'textAfterCaret' @ [56:70] ==> private final val textAfterCaret: String defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler[PropertyDescriptorImpl]

'context' @ [57:9] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler.handleInsert[ValueParameterDescriptorImpl]

'editor' @ [57:17] ==> public final val InsertionContext.editor: Editor[MyPropertyDescriptor]

'caretModel' @ [57:24] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [57:35] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'startOffset' @ [57:48] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler.handleInsert[LocalVariableDescriptor]

'textBeforeCaret' @ [57:62] ==> private final val textBeforeCaret: String defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler[PropertyDescriptorImpl]

'length' @ [57:78] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'shortenRefs' @ [59:13] ==> private final val shortenRefs: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler[PropertyDescriptorImpl]

'shortenReferences' @ [60:13] ==> public fun shortenReferences(context: InsertionContext, startOffset: Int, endOffset: Int): Unit defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [60:31] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler.handleInsert[ValueParameterDescriptorImpl]

'startOffset' @ [60:40] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler.handleInsert[LocalVariableDescriptor]

'startOffset' @ [60:53] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler.handleInsert[LocalVariableDescriptor]

'textBeforeCaret' @ [60:67] ==> private final val textBeforeCaret: String defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler[PropertyDescriptorImpl]

'length' @ [60:83] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'textAfterCaret' @ [60:92] ==> private final val textAfterCaret: String defined in org.jetbrains.kotlin.idea.completion.smart.ArtificialElementInsertHandler[PropertyDescriptorImpl]

'length' @ [60:107] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'tails' @ [66:12] ==> value-parameter tails: Collection<Tail?> defined in org.jetbrains.kotlin.idea.completion.smart.mergeTails[ValueParameterDescriptorImpl]

'singleOrNull' @ [66:18] ==> public fun <T> Iterable<Tail?>.singleOrNull(): Tail? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Tail?

'tails' @ [66:36] ==> value-parameter tails: Collection<Tail?> defined in org.jetbrains.kotlin.idea.completion.smart.mergeTails[ValueParameterDescriptorImpl]

'toSet' @ [66:42] ==> public fun <T> Iterable<Tail?>.toSet(): Set<Tail?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Tail?

'singleOrNull' @ [66:50] ==> public fun <T> Iterable<Tail?>.singleOrNull(): Tail? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Tail?

'when (tail) {
        null -> this

        Tail.COMMA -> object: LookupElementDecorator<LookupElement>(this) {
            override fun handleInsert(context: InsertionContext) {
                WithTailInsertHandler.COMMA.handleInsert(context, delegate)
            }
        }

        Tail.RPARENTH -> object: LookupElementDecorator<LookupElement>(this) {
            override fun handleInsert(context: InsertionContext) {
                WithTailInsertHandler.RPARENTH.handleInsert(context, delegate)
            }
        }

        Tail.RBRACKET -> object: LookupElementDecorator<LookupElement>(this) {
            override fun handleInsert(context: InsertionContext) {
                WithTailInsertHandler.RBRACKET.handleInsert(context, delegate)
            }
        }

        Tail.ELSE -> object: LookupElementDecorator<LookupElement>(this) {
            override fun handleInsert(context: InsertionContext) {
                WithTailInsertHandler.ELSE.handleInsert(context, delegate)
            }
        }

        Tail.RBRACE -> object: LookupElementDecorator<LookupElement>(this) {
            override fun handleInsert(context: InsertionContext) {
                WithTailInsertHandler.RBRACE.handleInsert(context, delegate)
            }
        }
    }' @ [70:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LookupElement, entry1: LookupElement, entry2: LookupElement, entry3: LookupElement, entry4: LookupElement, entry5: LookupElement): LookupElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> LookupElement

'tail' @ [70:18] ==> value-parameter tail: Tail? defined in org.jetbrains.kotlin.idea.completion.smart.addTail[ValueParameterDescriptorImpl]

'this' @ [71:17] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addTail[ReceiverParameterDescriptorImpl]

'COMMA' @ [73:14] ==> enum entry COMMA defined in org.jetbrains.kotlin.idea.core.Tail[FakeCallableDescriptorForObject]

'LookupElementDecorator<LookupElement>' @ [73:31] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'this' @ [73:69] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addTail[ReceiverParameterDescriptorImpl]

'WithTailInsertHandler' @ [75:17] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[FakeCallableDescriptorForObject]

'COMMA' @ [75:39] ==> public final val COMMA: WithTailInsertHandler defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler.Companion[PropertyDescriptorImpl]

'handleInsert' @ [75:45] ==> public open fun handleInsert(context: InsertionContext, item: LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[SimpleFunctionDescriptorImpl]

'context' @ [75:58] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.addTail.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'delegate' @ [75:67] ==> public final val <no name provided>.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'RPARENTH' @ [79:14] ==> enum entry RPARENTH defined in org.jetbrains.kotlin.idea.core.Tail[FakeCallableDescriptorForObject]

'LookupElementDecorator<LookupElement>' @ [79:34] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'this' @ [79:72] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addTail[ReceiverParameterDescriptorImpl]

'WithTailInsertHandler' @ [81:17] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[FakeCallableDescriptorForObject]

'RPARENTH' @ [81:39] ==> public final val RPARENTH: WithTailInsertHandler defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler.Companion[PropertyDescriptorImpl]

'handleInsert' @ [81:48] ==> public open fun handleInsert(context: InsertionContext, item: LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[SimpleFunctionDescriptorImpl]

'context' @ [81:61] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.addTail.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'delegate' @ [81:70] ==> public final val <no name provided>.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'RBRACKET' @ [85:14] ==> enum entry RBRACKET defined in org.jetbrains.kotlin.idea.core.Tail[FakeCallableDescriptorForObject]

'LookupElementDecorator<LookupElement>' @ [85:34] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'this' @ [85:72] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addTail[ReceiverParameterDescriptorImpl]

'WithTailInsertHandler' @ [87:17] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[FakeCallableDescriptorForObject]

'RBRACKET' @ [87:39] ==> public final val RBRACKET: WithTailInsertHandler defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler.Companion[PropertyDescriptorImpl]

'handleInsert' @ [87:48] ==> public open fun handleInsert(context: InsertionContext, item: LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[SimpleFunctionDescriptorImpl]

'context' @ [87:61] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.addTail.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'delegate' @ [87:70] ==> public final val <no name provided>.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'ELSE' @ [91:14] ==> enum entry ELSE defined in org.jetbrains.kotlin.idea.core.Tail[FakeCallableDescriptorForObject]

'LookupElementDecorator<LookupElement>' @ [91:30] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'this' @ [91:68] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addTail[ReceiverParameterDescriptorImpl]

'WithTailInsertHandler' @ [93:17] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[FakeCallableDescriptorForObject]

'ELSE' @ [93:39] ==> public final val ELSE: WithTailInsertHandler defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler.Companion[PropertyDescriptorImpl]

'handleInsert' @ [93:44] ==> public open fun handleInsert(context: InsertionContext, item: LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[SimpleFunctionDescriptorImpl]

'context' @ [93:57] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.addTail.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'delegate' @ [93:66] ==> public final val <no name provided>.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'RBRACE' @ [97:14] ==> enum entry RBRACE defined in org.jetbrains.kotlin.idea.core.Tail[FakeCallableDescriptorForObject]

'LookupElementDecorator<LookupElement>' @ [97:32] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'this' @ [97:70] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addTail[ReceiverParameterDescriptorImpl]

'WithTailInsertHandler' @ [99:17] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[FakeCallableDescriptorForObject]

'RBRACE' @ [99:39] ==> public final val RBRACE: WithTailInsertHandler defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler.Companion[PropertyDescriptorImpl]

'handleInsert' @ [99:46] ==> public open fun handleInsert(context: InsertionContext, item: LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[SimpleFunctionDescriptorImpl]

'context' @ [99:59] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.addTail.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'delegate' @ [99:68] ==> public final val <no name provided>.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'this' @ [106:25] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.withOptions[ReceiverParameterDescriptorImpl]

'options' @ [107:9] ==> value-parameter options: ItemOptions defined in org.jetbrains.kotlin.idea.completion.smart.withOptions[ValueParameterDescriptorImpl]

'starPrefix' @ [107:17] ==> public final val starPrefix: Boolean defined in org.jetbrains.kotlin.idea.core.ItemOptions[DeserializedPropertyDescriptor]

'lookupElement' @ [108:9] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.withOptions[LocalVariableDescriptor]

'LookupElementDecorator<LookupElement>' @ [108:34] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'this' @ [108:72] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.withOptions[ReceiverParameterDescriptorImpl]

'super' @ [110:17] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.withOptions.<no name provided>[LazyClassReceiverParameterDescriptor]

'renderElement' @ [110:23] ==> public open fun renderElement(p0: (LookupElementPresentation..LookupElementPresentation?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'presentation' @ [110:37] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.withOptions.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'presentation' @ [111:17] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.withOptions.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [111:30] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'+' @ [111:41] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'presentation' @ [111:47] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.withOptions.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [111:60] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'WithExpressionPrefixInsertHandler' @ [115:17] ==> public constructor WithExpressionPrefixInsertHandler(prefix: String) defined in org.jetbrains.kotlin.idea.completion.handlers.WithExpressionPrefixInsertHandler[ClassConstructorDescriptorImpl]

'handleInsert' @ [115:56] ==> public open fun handleInsert(context: InsertionContext, item: LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.handlers.WithExpressionPrefixInsertHandler[SimpleFunctionDescriptorImpl]

'context' @ [115:69] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.withOptions.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'delegate' @ [115:78] ==> public final val <no name provided>.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'lookupElement' @ [119:12] ==> var lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.withOptions[LocalVariableDescriptor]

'matchedExpectedInfos' @ [124:65] ==> value-parameter matchedExpectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.addTailAndNameSimilarity[ValueParameterDescriptorImpl]

'addTail' @ [126:25] ==> public fun LookupElement.addTail(tail: Tail?): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'mergeTails' @ [126:33] ==> public fun mergeTails(tails: Collection<Tail?>): Tail? defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'matchedExpectedInfos' @ [126:44] ==> value-parameter matchedExpectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.addTailAndNameSimilarity[ValueParameterDescriptorImpl]

'map' @ [126:65] ==> public inline fun <T, R> Iterable<ExpectedInfo>.map(transform: (ExpectedInfo) -> Tail?): List<Tail?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo
    <R> -> Tail?

'it' @ [126:71] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.addTailAndNameSimilarity.<anonymous>[ValueParameterDescriptorImpl]

'tail' @ [126:74] ==> public final val tail: Tail? defined in org.jetbrains.kotlin.idea.core.ExpectedInfo[DeserializedPropertyDescriptor]

'calcNameSimilarity' @ [127:22] ==> public fun calcNameSimilarity(name: String, expectedInfos: Collection<ExpectedInfo>): Int defined in org.jetbrains.kotlin.idea.completion.smart in file NameSimilarity.kt[SimpleFunctionDescriptorImpl]

'lookupElement' @ [127:41] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.addTailAndNameSimilarity[LocalVariableDescriptor]

'lookupString' @ [127:55] ==> public final val LookupElement.lookupString: String[MyPropertyDescriptor]

'nameSimilarityExpectedInfos' @ [127:69] ==> value-parameter nameSimilarityExpectedInfos: Collection<ExpectedInfo> = ... defined in org.jetbrains.kotlin.idea.completion.smart.addTailAndNameSimilarity[ValueParameterDescriptorImpl]

'similarity' @ [128:9] ==> val similarity: Int defined in org.jetbrains.kotlin.idea.completion.smart.addTailAndNameSimilarity[LocalVariableDescriptor]

'lookupElement' @ [129:9] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.addTailAndNameSimilarity[LocalVariableDescriptor]

'putUserData' @ [129:23] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Int..Int?)>, @Nullable p1: Int?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Int..kotlin.Int?)

'NAME_SIMILARITY_KEY' @ [129:35] ==> public val NAME_SIMILARITY_KEY: Key<Int> defined in org.jetbrains.kotlin.idea.completion.smart in file NameSimilarity.kt[PropertyDescriptorImpl]

'similarity' @ [129:56] ==> val similarity: Int defined in org.jetbrains.kotlin.idea.completion.smart.addTailAndNameSimilarity[LocalVariableDescriptor]

'lookupElement' @ [131:12] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.addTailAndNameSimilarity[LocalVariableDescriptor]

'substitutor' @ [139:21] ==> public final val substitutor: TypeSubstitutor? defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[PropertyDescriptorImpl]

'!' @ [139:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'makeNotNullable' @ [139:45] ==> public final val makeNotNullable: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[PropertyDescriptorImpl]

'ExpectedInfoMatch' @ [142:23] ==> private constructor ExpectedInfoMatch(substitutor: TypeSubstitutor?, makeNotNullable: Boolean) defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[ClassConstructorDescriptorImpl]

'ExpectedInfoMatch' @ [143:51] ==> private constructor ExpectedInfoMatch(substitutor: TypeSubstitutor?, makeNotNullable: Boolean) defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[ClassConstructorDescriptorImpl]

'substitutor' @ [143:69] ==> value-parameter substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch.Companion.match[ValueParameterDescriptorImpl]

'ExpectedInfoMatch' @ [144:60] ==> private constructor ExpectedInfoMatch(substitutor: TypeSubstitutor?, makeNotNullable: Boolean) defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[ClassConstructorDescriptorImpl]

'substitutor' @ [144:78] ==> value-parameter substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch.Companion.ifNotNullMatch[ValueParameterDescriptorImpl]

'asSequence' @ [149:20] ==> public fun <T> Iterable<FuzzyType>.asSequence(): Sequence<FuzzyType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FuzzyType

'sequence' @ [150:23] ==> val sequence: Sequence<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.smart.matchExpectedInfo[LocalVariableDescriptor]

'map' @ [150:32] ==> public fun <T, R> Sequence<FuzzyType>.map(transform: (FuzzyType) -> TypeSubstitutor?): Sequence<TypeSubstitutor?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FuzzyType
    <R> -> TypeSubstitutor?

'expectedInfo' @ [150:38] ==> value-parameter expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.matchExpectedInfo[ValueParameterDescriptorImpl]

'matchingSubstitutor' @ [150:51] ==> public final fun matchingSubstitutor(descriptorType: FuzzyType): TypeSubstitutor? defined in org.jetbrains.kotlin.idea.core.ExpectedInfo[DeserializedSimpleFunctionDescriptor]

'it' @ [150:71] ==> value-parameter it: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.matchExpectedInfo.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [150:77] ==> public fun <T> Sequence<TypeSubstitutor?>.firstOrNull(): TypeSubstitutor? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeSubstitutor?

'substitutor' @ [151:9] ==> val substitutor: TypeSubstitutor? defined in org.jetbrains.kotlin.idea.completion.smart.matchExpectedInfo[LocalVariableDescriptor]

'ExpectedInfoMatch' @ [152:16] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[FakeCallableDescriptorForObject]

'match' @ [152:34] ==> public final fun match(substitutor: TypeSubstitutor): ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch.Companion[SimpleFunctionDescriptorImpl]

'substitutor' @ [152:40] ==> val substitutor: TypeSubstitutor? defined in org.jetbrains.kotlin.idea.completion.smart.matchExpectedInfo[LocalVariableDescriptor]

'sequence' @ [155:9] ==> val sequence: Sequence<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.smart.matchExpectedInfo[LocalVariableDescriptor]

'any' @ [155:18] ==> public inline fun <T> Sequence<FuzzyType>.any(predicate: (FuzzyType) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FuzzyType

'it' @ [155:24] ==> value-parameter it: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.matchExpectedInfo.<anonymous>[ValueParameterDescriptorImpl]

'nullability' @ [155:27] ==> public fun FuzzyType.nullability(): TypeNullability defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'NULLABLE' @ [155:60] ==> enum entry NULLABLE defined in org.jetbrains.kotlin.types.typeUtil.TypeNullability[FakeCallableDescriptorForObject]

'sequence' @ [156:28] ==> val sequence: Sequence<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.smart.matchExpectedInfo[LocalVariableDescriptor]

'map' @ [156:37] ==> public fun <T, R> Sequence<FuzzyType>.map(transform: (FuzzyType) -> TypeSubstitutor?): Sequence<TypeSubstitutor?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FuzzyType
    <R> -> TypeSubstitutor?

'expectedInfo' @ [156:43] ==> value-parameter expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.matchExpectedInfo[ValueParameterDescriptorImpl]

'matchingSubstitutor' @ [156:56] ==> public final fun matchingSubstitutor(descriptorType: FuzzyType): TypeSubstitutor? defined in org.jetbrains.kotlin.idea.core.ExpectedInfo[DeserializedSimpleFunctionDescriptor]

'it' @ [156:76] ==> value-parameter it: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.matchExpectedInfo.<anonymous>[ValueParameterDescriptorImpl]

'makeNotNullable' @ [156:79] ==> public fun FuzzyType.makeNotNullable(): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [156:100] ==> public fun <T> Sequence<TypeSubstitutor?>.firstOrNull(): TypeSubstitutor? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeSubstitutor?

'substitutor2' @ [157:13] ==> val substitutor2: TypeSubstitutor? defined in org.jetbrains.kotlin.idea.completion.smart.matchExpectedInfo[LocalVariableDescriptor]

'ExpectedInfoMatch' @ [158:20] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[FakeCallableDescriptorForObject]

'ifNotNullMatch' @ [158:38] ==> public final fun ifNotNullMatch(substitutor: TypeSubstitutor): ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch.Companion[SimpleFunctionDescriptorImpl]

'substitutor2' @ [158:53] ==> val substitutor2: TypeSubstitutor? defined in org.jetbrains.kotlin.idea.completion.smart.matchExpectedInfo[LocalVariableDescriptor]

'ExpectedInfoMatch' @ [162:12] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[FakeCallableDescriptorForObject]

'noMatch' @ [162:30] ==> public final val noMatch: ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch.Companion[PropertyDescriptorImpl]

'listOf' @ [165:63] ==> public fun <T> listOf(element: FuzzyType): List<FuzzyType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FuzzyType

'this' @ [165:70] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.matchExpectedInfo[ReceiverParameterDescriptorImpl]

'matchExpectedInfo' @ [165:76] ==> public fun Collection<FuzzyType>.matchExpectedInfo(expectedInfo: ExpectedInfo): ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'expectedInfo' @ [165:94] ==> value-parameter expectedInfo: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.matchExpectedInfo[ValueParameterDescriptorImpl]

'Suppress' @ [175:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'descriptorsEqualWithSubstitution' @ [177:19] ==> public fun descriptorsEqualWithSubstitution(descriptor1: DeclarationDescriptor?, descriptor2: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'this' @ [177:52] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.ItemData[LazyClassReceiverParameterDescriptor]

'descriptor' @ [177:57] ==> public final val descriptor: TDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.ItemData[PropertyDescriptorImpl]

'other' @ [177:70] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.ItemData.equals[ValueParameterDescriptorImpl]

'descriptor' @ [177:91] ==> public final val descriptor: TDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.ItemData[PropertyDescriptorImpl]

'itemOptions' @ [177:106] ==> public final val itemOptions: ItemOptions defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.ItemData[PropertyDescriptorImpl]

'other' @ [178:18] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.ItemData.equals[ValueParameterDescriptorImpl]

'itemOptions' @ [178:39] ==> public final val itemOptions: ItemOptions defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.ItemData[PropertyDescriptorImpl]

'if (this.descriptor != null) this.descriptor!!.original.hashCode() else 0' @ [179:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'this' @ [179:39] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.ItemData[LazyClassReceiverParameterDescriptor]

'descriptor' @ [179:44] ==> public final val descriptor: TDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.ItemData[PropertyDescriptorImpl]

'this' @ [179:64] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.ItemData[LazyClassReceiverParameterDescriptor]

'descriptor' @ [179:69] ==> public final val descriptor: TDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.ItemData[PropertyDescriptorImpl]

'original' @ [179:82] ==> public final val DeclarationDescriptor.original: DeclarationDescriptor[MyPropertyDescriptor]

'hashCode' @ [179:91] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedSimpleFunctionDescriptor]

'invoke' @ [182:43] ==> public abstract operator fun invoke(p1: TDescriptor): Collection<LookupElement> defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [182:64] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.createLookupElements[ReceiverParameterDescriptorImpl]

'descriptor' @ [182:69] ==> public final val descriptor: TDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.ItemData[PropertyDescriptorImpl]

'map' @ [182:81] ==> public inline fun <T, R> Iterable<LookupElement>.map(transform: (LookupElement) -> LookupElement): List<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement
    <R> -> LookupElement

'it' @ [182:87] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.createLookupElements.<anonymous>[ValueParameterDescriptorImpl]

'withOptions' @ [182:90] ==> public fun LookupElement.withOptions(options: ItemOptions): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'this' @ [182:102] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.createLookupElements[ReceiverParameterDescriptorImpl]

'itemOptions' @ [182:107] ==> public final val itemOptions: ItemOptions defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.ItemData[PropertyDescriptorImpl]

'HashMap' @ [184:24] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ItemData<TDescriptor>
    <V : (Any..Any?)> -> MutableList<ExpectedInfo>

'HashMap' @ [185:29] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ItemData<TDescriptor>
    <V : (Any..Any?)> -> MutableList<ExpectedInfo>

'expectedInfos' @ [186:18] ==> value-parameter expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[ValueParameterDescriptorImpl]

'invoke' @ [187:30] ==> public abstract operator fun invoke(p1: ExpectedInfo): ExpectedInfoMatch defined in kotlin.Function1[FunctionInvokeDescriptor]

'info' @ [187:42] ==> val info: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'classification' @ [188:13] ==> val classification: ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'substitutor' @ [188:28] ==> public final val substitutor: TypeSubstitutor? defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[PropertyDescriptorImpl]

'Suppress' @ [189:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'descriptor' @ [190:41] ==> value-parameter descriptor: TDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[ValueParameterDescriptorImpl]

'substituteFixed' @ [190:52] ==> @Suppress private fun <T : DeclarationDescriptor?> TDescriptor.substituteFixed(substitutor: TypeSubstitutor): TDescriptor defined in org.jetbrains.kotlin.idea.completion.smart[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : DeclarationDescriptor?> -> TDescriptor

'classification' @ [190:68] ==> val classification: ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'substitutor' @ [190:83] ==> public final val substitutor: TypeSubstitutor? defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[PropertyDescriptorImpl]

'if (classification.makeNotNullable) makeNullableInfos else matchedInfos' @ [191:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: HashMap<ItemData<TDescriptor>, MutableList<ExpectedInfo>>, elseBranch: HashMap<ItemData<TDescriptor>, MutableList<ExpectedInfo>>): HashMap<ItemData<TDescriptor>, MutableList<ExpectedInfo>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> HashMap<ItemData<TDescriptor>, MutableList<ExpectedInfo>>

'classification' @ [191:27] ==> val classification: ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'makeNotNullable' @ [191:42] ==> public final val makeNotNullable: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[PropertyDescriptorImpl]

'makeNullableInfos' @ [191:59] ==> val makeNullableInfos: HashMap<ItemData<TDescriptor>, MutableList<ExpectedInfo>> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'matchedInfos' @ [191:82] ==> val matchedInfos: HashMap<ItemData<TDescriptor>, MutableList<ExpectedInfo>> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'map' @ [192:13] ==> val map: HashMap<ItemData<TDescriptor>, MutableList<ExpectedInfo>> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'getOrPut' @ [192:17] ==> public inline fun <K, V> MutableMap<ItemData<TDescriptor>, MutableList<ExpectedInfo>>.getOrPut(key: ItemData<TDescriptor>, defaultValue: () -> MutableList<ExpectedInfo>): MutableList<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ItemData<TDescriptor>
    <V> -> MutableList<ExpectedInfo>

'ItemData' @ [192:26] ==> public constructor ItemData(descriptor: TDescriptor, itemOptions: ItemOptions) defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.ItemData[ClassConstructorDescriptorImpl]

'substitutedDescriptor' @ [192:35] ==> val substitutedDescriptor: TDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'info' @ [192:58] ==> val info: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'itemOptions' @ [192:63] ==> public final val itemOptions: ItemOptions defined in org.jetbrains.kotlin.idea.core.ExpectedInfo[DeserializedPropertyDescriptor]

'ArrayList' @ [192:79] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ExpectedInfo

'add' @ [192:93] ==> public abstract fun add(element: ExpectedInfo): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'info' @ [192:97] ==> val info: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'if (!matchedInfos.isEmpty()) {
        for ((itemData, infos) in matchedInfos) {
            val lookupElements = itemData.createLookupElements()
            val nameSimilarityInfos = if (noNameSimilarityForReturnItself && descriptor is CallableDescriptor) {
                infos.filter { (it.additionalData as? ReturnValueAdditionalData)?.callable != descriptor } // do not calculate name similarity with function itself in its return
            }
            else
                infos
            lookupElements.mapTo(this) { it.addTailAndNameSimilarity(infos, nameSimilarityInfos) }
        }
    }
    else {
        for ((itemData, infos) in makeNullableInfos) {
            addLookupElementsForNullable({ itemData.createLookupElements() }, infos)
        }
    }' @ [196:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [196:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'matchedInfos' @ [196:10] ==> val matchedInfos: HashMap<ItemData<TDescriptor>, MutableList<ExpectedInfo>> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'isEmpty' @ [196:23] ==> public open fun isEmpty(): Boolean defined in java.util.HashMap[JavaMethodDescriptor]

'component1' @ [197:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ItemData<TDescriptor>, MutableList<ExpectedInfo>>.component1(): ItemData<TDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ItemData<TDescriptor>
    <V> -> MutableList<ExpectedInfo>

'component2' @ [197:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ItemData<TDescriptor>, MutableList<ExpectedInfo>>.component2(): MutableList<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ItemData<TDescriptor>
    <V> -> MutableList<ExpectedInfo>

'matchedInfos' @ [197:35] ==> val matchedInfos: HashMap<ItemData<TDescriptor>, MutableList<ExpectedInfo>> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'itemData' @ [198:34] ==> val itemData: ItemData<TDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'createLookupElements' @ [198:43] ==> local final fun ItemData<TDescriptor>.createLookupElements(): List<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[SimpleFunctionDescriptorImpl]

'if (noNameSimilarityForReturnItself && descriptor is CallableDescriptor) {
                infos.filter { (it.additionalData as? ReturnValueAdditionalData)?.callable != descriptor } // do not calculate name similarity with function itself in its return
            }
            else
                infos' @ [199:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<ExpectedInfo>, elseBranch: List<ExpectedInfo>): List<ExpectedInfo>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<ExpectedInfo>

'noNameSimilarityForReturnItself' @ [199:43] ==> value-parameter noNameSimilarityForReturnItself: Boolean = ... defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[ValueParameterDescriptorImpl]

'descriptor' @ [199:78] ==> value-parameter descriptor: TDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[ValueParameterDescriptorImpl]

'infos' @ [200:17] ==> val infos: MutableList<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'filter' @ [200:23] ==> public inline fun <T> Iterable<ExpectedInfo>.filter(predicate: (ExpectedInfo) -> Boolean): List<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'!=' @ [200:32] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[DeserializedSimpleFunctionDescriptor]

'it' @ [200:33] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.<anonymous>[ValueParameterDescriptorImpl]

'additionalData' @ [200:36] ==> public final val additionalData: ExpectedInfo.AdditionalData? defined in org.jetbrains.kotlin.idea.core.ExpectedInfo[DeserializedPropertyDescriptor]

'callable' @ [200:83] ==> public final val callable: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.ReturnValueAdditionalData[DeserializedPropertyDescriptor]

'descriptor' @ [200:95] ==> value-parameter descriptor: TDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[ValueParameterDescriptorImpl]

'infos' @ [203:17] ==> val infos: MutableList<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'lookupElements' @ [204:13] ==> val lookupElements: List<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'mapTo' @ [204:28] ==> public inline fun <T, R, C : MutableCollection<in LookupElement>> Iterable<LookupElement>.mapTo(destination: MutableCollection<LookupElement>, transform: (LookupElement) -> LookupElement): MutableCollection<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement
    <R> -> LookupElement
    <C : MutableCollection<in R>> -> MutableCollection<LookupElement>

'this' @ [204:34] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[ReceiverParameterDescriptorImpl]

'it' @ [204:42] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements.<anonymous>[ValueParameterDescriptorImpl]

'addTailAndNameSimilarity' @ [204:45] ==> public fun LookupElement.addTailAndNameSimilarity(matchedExpectedInfos: Collection<ExpectedInfo>, nameSimilarityExpectedInfos: Collection<ExpectedInfo> = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'infos' @ [204:70] ==> val infos: MutableList<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'nameSimilarityInfos' @ [204:77] ==> val nameSimilarityInfos: List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'component1' @ [208:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ItemData<TDescriptor>, MutableList<ExpectedInfo>>.component1(): ItemData<TDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ItemData<TDescriptor>
    <V> -> MutableList<ExpectedInfo>

'component2' @ [208:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ItemData<TDescriptor>, MutableList<ExpectedInfo>>.component2(): MutableList<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ItemData<TDescriptor>
    <V> -> MutableList<ExpectedInfo>

'makeNullableInfos' @ [208:35] ==> val makeNullableInfos: HashMap<ItemData<TDescriptor>, MutableList<ExpectedInfo>> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'addLookupElementsForNullable' @ [209:13] ==> private fun MutableCollection<LookupElement>.addLookupElementsForNullable(factory: () -> Collection<LookupElement>, matchedInfos: Collection<ExpectedInfo>): Unit defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'itemData' @ [209:44] ==> val itemData: ItemData<TDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'createLookupElements' @ [209:53] ==> local final fun ItemData<TDescriptor>.createLookupElements(): List<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[SimpleFunctionDescriptorImpl]

'infos' @ [209:79] ==> val infos: MutableList<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElements[LocalVariableDescriptor]

'Suppress' @ [214:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'this' @ [216:9] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.substituteFixed[ReceiverParameterDescriptorImpl]

'this' @ [216:44] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.substituteFixed[ReceiverParameterDescriptorImpl]

'this' @ [216:80] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.substituteFixed[ReceiverParameterDescriptorImpl]

'this' @ [217:16] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.substituteFixed[ReceiverParameterDescriptorImpl]

'this' @ [219:12] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.substituteFixed[ReceiverParameterDescriptorImpl]

'substitute' @ [219:17] ==> public abstract fun substitute(substitutor: TypeSubstitutor): DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.descriptors.Substitutable[DeserializedSimpleFunctionDescriptor]

'substitutor' @ [219:28] ==> value-parameter substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.completion.smart.substituteFixed[ValueParameterDescriptorImpl]

'this' @ [224:23] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.postProcess[ReceiverParameterDescriptorImpl]

'element' @ [225:9] ==> var element: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.postProcess[LocalVariableDescriptor]

'element' @ [225:19] ==> var element: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.postProcess[LocalVariableDescriptor]

'suppressAutoInsertion' @ [225:27] ==> public fun LookupElement.suppressAutoInsertion(): LookupElement defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [226:9] ==> var element: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.postProcess[LocalVariableDescriptor]

'element' @ [226:19] ==> var element: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.postProcess[LocalVariableDescriptor]

'assignSmartCompletionPriority' @ [226:27] ==> public fun LookupElement.assignSmartCompletionPriority(priority: SmartCompletionItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'NULLABLE' @ [226:85] ==> enum entry NULLABLE defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'element' @ [227:9] ==> var element: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.postProcess[LocalVariableDescriptor]

'element' @ [227:19] ==> var element: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.postProcess[LocalVariableDescriptor]

'addTailAndNameSimilarity' @ [227:27] ==> public fun LookupElement.addTailAndNameSimilarity(matchedExpectedInfos: Collection<ExpectedInfo>, nameSimilarityExpectedInfos: Collection<ExpectedInfo> = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'matchedInfos' @ [227:52] ==> value-parameter matchedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable[ValueParameterDescriptorImpl]

'element' @ [228:16] ==> var element: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.postProcess[LocalVariableDescriptor]

'invoke' @ [231:5] ==> public abstract operator fun invoke(): Collection<LookupElement> defined in kotlin.Function0[FunctionInvokeDescriptor]

'mapTo' @ [231:15] ==> public inline fun <T, R, C : MutableCollection<in LookupElement>> Iterable<LookupElement>.mapTo(destination: MutableCollection<LookupElement>, transform: (LookupElement) -> LookupElement): MutableCollection<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement
    <R> -> LookupElement
    <C : MutableCollection<in R>> -> MutableCollection<LookupElement>

'this' @ [231:21] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable[ReceiverParameterDescriptorImpl]

'LookupElementDecorator<LookupElement>' @ [232:17] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'it' @ [232:55] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.<anonymous>[ValueParameterDescriptorImpl]

'super' @ [234:17] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'renderElement' @ [234:23] ==> public open fun renderElement(p0: (LookupElementPresentation..LookupElementPresentation?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'presentation' @ [234:37] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.<anonymous>.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'presentation' @ [235:17] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.<anonymous>.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [235:30] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'+' @ [235:41] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'presentation' @ [235:49] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.<anonymous>.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [235:62] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'WithTailInsertHandler' @ [238:17] ==> public constructor WithTailInsertHandler(tailText: String, spaceBefore: Boolean, spaceAfter: Boolean, overwriteText: Boolean = ...) defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[ClassConstructorDescriptorImpl]

'handleInsert' @ [238:86] ==> public open fun handleInsert(context: InsertionContext, item: LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[SimpleFunctionDescriptorImpl]

'context' @ [238:99] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.<anonymous>.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'delegate' @ [238:108] ==> public final val <no name provided>.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'postProcess' @ [240:11] ==> local final fun LookupElement.postProcess(): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable[SimpleFunctionDescriptorImpl]

'invoke' @ [243:5] ==> public abstract operator fun invoke(): Collection<LookupElement> defined in kotlin.Function0[FunctionInvokeDescriptor]

'mapTo' @ [243:15] ==> public inline fun <T, R, C : MutableCollection<in LookupElement>> Iterable<LookupElement>.mapTo(destination: MutableCollection<LookupElement>, transform: (LookupElement) -> LookupElement): MutableCollection<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement
    <R> -> LookupElement
    <C : MutableCollection<in R>> -> MutableCollection<LookupElement>

'this' @ [243:21] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable[ReceiverParameterDescriptorImpl]

'LookupElementDecorator<LookupElement>' @ [244:17] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'it' @ [244:55] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.<anonymous>[ValueParameterDescriptorImpl]

'super' @ [246:17] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'renderElement' @ [246:23] ==> public open fun renderElement(p0: (LookupElementPresentation..LookupElementPresentation?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'presentation' @ [246:37] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.<anonymous>.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'presentation' @ [247:17] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.<anonymous>.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [247:30] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'+' @ [247:41] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'presentation' @ [247:49] ==> value-parameter presentation: LookupElementPresentation defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.<anonymous>.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'itemText' @ [247:62] ==> public final var LookupElementPresentation.itemText: String?[MyPropertyDescriptor]

'WithTailInsertHandler' @ [250:17] ==> public constructor WithTailInsertHandler(tailText: String, spaceBefore: Boolean, spaceAfter: Boolean, overwriteText: Boolean = ...) defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[ClassConstructorDescriptorImpl]

'handleInsert' @ [250:84] ==> public open fun handleInsert(context: InsertionContext, item: LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.handlers.WithTailInsertHandler[SimpleFunctionDescriptorImpl]

'context' @ [250:97] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable.<anonymous>.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'delegate' @ [250:106] ==> public final val <no name provided>.delegate: (LookupElement..LookupElement?)[MyPropertyDescriptor]

'postProcess' @ [252:11] ==> local final fun LookupElement.postProcess(): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.addLookupElementsForNullable[SimpleFunctionDescriptorImpl]

'!' @ [257:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptorKindFilter' @ [257:38] ==> public final val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.util.CallType.CALLABLE_REFERENCE[DeserializedPropertyDescriptor]

'accepts' @ [257:59] ==> public final fun accepts(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'this' @ [257:67] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.callableReferenceType[ReceiverParameterDescriptorImpl]

'DoubleColonExpressionResolver' @ [259:12] ==> public companion object defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[FakeCallableDescriptorForObject]

'createKCallableTypeForReference' @ [259:42] ==> public final fun createKCallableTypeForReference(descriptor: CallableDescriptor, lhs: DoubleColonLHS?, reflectionTypes: ReflectionTypes, scopeOwnerDescriptor: DeclarationDescriptor): KotlinType? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion[DeserializedSimpleFunctionDescriptor]

'this' @ [260:13] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.callableReferenceType[ReceiverParameterDescriptorImpl]

'lhs' @ [261:13] ==> value-parameter lhs: DoubleColonLHS? defined in org.jetbrains.kotlin.idea.completion.smart.callableReferenceType[ValueParameterDescriptorImpl]

'resolutionFacade' @ [262:13] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.callableReferenceType[ValueParameterDescriptorImpl]

'getFrontendService' @ [262:30] ==> public abstract fun <T : Any> getFrontendService(serviceClass: Class<ReflectionTypes>): ReflectionTypes defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ReflectionTypes

'ReflectionTypes' @ [262:49] ==> public companion object defined in org.jetbrains.kotlin.builtins.ReflectionTypes[FakeCallableDescriptorForObject]

'java' @ [262:72] ==> public val <T> KClass<ReflectionTypes>.java: Class<ReflectionTypes> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ReflectionTypes

'resolutionFacade' @ [263:13] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.callableReferenceType[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [263:30] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'toFuzzyType' @ [264:8] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [264:20] ==> public fun <T> emptyList(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'Key' @ [292:42] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SmartCompletionItemPriority

'putUserData' @ [295:5] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(SmartCompletionItemPriority..SmartCompletionItemPriority?)>, @Nullable p1: SmartCompletionItemPriority?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority..org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority?)

'SMART_COMPLETION_ITEM_PRIORITY_KEY' @ [295:17] ==> public val SMART_COMPLETION_ITEM_PRIORITY_KEY: Key<SmartCompletionItemPriority> defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[PropertyDescriptorImpl]

'priority' @ [295:53] ==> value-parameter priority: SmartCompletionItemPriority defined in org.jetbrains.kotlin.idea.completion.smart.assignSmartCompletionPriority[ValueParameterDescriptorImpl]

'this' @ [296:12] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.assignSmartCompletionPriority[ReceiverParameterDescriptorImpl]

'callTypeAndReceiver' @ [305:9] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [306:19] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion[ValueParameterDescriptorImpl]

'receiver' @ [306:39] ==> public final val receiver: KtExpression? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.CALLABLE_REFERENCE[DeserializedPropertyDescriptor]

'let' @ [306:49] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> DoubleColonLHS?): DoubleColonLHS? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> DoubleColonLHS?

'bindingContext' @ [306:55] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion[ValueParameterDescriptorImpl]

'DOUBLE_COLON_LHS' @ [306:85] ==> public final val DOUBLE_COLON_LHS: (WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [306:103] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion.<anonymous>[ValueParameterDescriptorImpl]

'listOfNotNull' @ [307:16] ==> public fun <T : Any> listOfNotNull(element: FuzzyType?): List<FuzzyType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> FuzzyType

'this' @ [307:31] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion[ReceiverParameterDescriptorImpl]

'callableReferenceType' @ [307:61] ==> public fun CallableDescriptor.callableReferenceType(resolutionFacade: ResolutionFacade, lhs: DoubleColonLHS?): FuzzyType? defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [307:83] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion[ValueParameterDescriptorImpl]

'lhs' @ [307:101] ==> val lhs: DoubleColonLHS? defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion[LocalVariableDescriptor]

'if (this is CallableDescriptor) {
        val returnType = fuzzyReturnType() ?: return emptyList()

        // skip declarations of types Nothing, Nothing?, dynamic or of generic parameter type which has no real bounds
        if (returnType.type.isNothing() ||
            returnType.type.isNullableNothing() ||
            returnType.type.isDynamic() ||
            returnType.isAlmostEverything()) {
            return emptyList()
        }

        return if (this is VariableDescriptor) { //TODO: generic properties!
            smartCastCalculator.types(this).map { it.toFuzzyType(emptyList()) }
        }
        else {
            listOf(returnType)
        }
    }
    else if (this is ClassDescriptor && kind.isSingleton) {
        return listOf(defaultType.toFuzzyType(emptyList()))
    }
    else {
        return emptyList()
    }' @ [310:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'this' @ [310:9] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion[ReceiverParameterDescriptorImpl]

'fuzzyReturnType' @ [311:26] ==> public fun CallableDescriptor.fuzzyReturnType(): FuzzyType? defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [311:54] ==> public fun <T> emptyList(): List<FuzzyType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FuzzyType

'returnType' @ [314:13] ==> val returnType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion[LocalVariableDescriptor]

'type' @ [314:24] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'isNothing' @ [314:29] ==> public fun KotlinType.isNothing(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'returnType' @ [315:13] ==> val returnType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion[LocalVariableDescriptor]

'type' @ [315:24] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'isNullableNothing' @ [315:29] ==> public fun KotlinType.isNullableNothing(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'returnType' @ [316:13] ==> val returnType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion[LocalVariableDescriptor]

'type' @ [316:24] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'isDynamic' @ [316:29] ==> public fun KotlinType.isDynamic(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'returnType' @ [317:13] ==> val returnType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion[LocalVariableDescriptor]

'isAlmostEverything' @ [317:24] ==> public fun FuzzyType.isAlmostEverything(): Boolean defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [318:20] ==> public fun <T> emptyList(): List<FuzzyType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FuzzyType

'if (this is VariableDescriptor) { //TODO: generic properties!
            smartCastCalculator.types(this).map { it.toFuzzyType(emptyList()) }
        }
        else {
            listOf(returnType)
        }' @ [321:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<FuzzyType>, elseBranch: Collection<FuzzyType>): Collection<FuzzyType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<FuzzyType>

'this' @ [321:20] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion[ReceiverParameterDescriptorImpl]

'smartCastCalculator' @ [322:13] ==> value-parameter smartCastCalculator: SmartCastCalculator defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion[ValueParameterDescriptorImpl]

'types' @ [322:33] ==> public final fun types(descriptor: VariableDescriptor): Collection<KotlinType> defined in org.jetbrains.kotlin.idea.core.SmartCastCalculator[DeserializedSimpleFunctionDescriptor]

'this' @ [322:39] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion[ReceiverParameterDescriptorImpl]

'map' @ [322:45] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> FuzzyType): List<FuzzyType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> FuzzyType

'it' @ [322:51] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion.<anonymous>[ValueParameterDescriptorImpl]

'toFuzzyType' @ [322:54] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [322:66] ==> public fun <T> emptyList(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'listOf' @ [325:13] ==> public fun <T> listOf(element: FuzzyType): List<FuzzyType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FuzzyType

'returnType' @ [325:20] ==> val returnType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion[LocalVariableDescriptor]

'if (this is ClassDescriptor && kind.isSingleton) {
        return listOf(defaultType.toFuzzyType(emptyList()))
    }
    else {
        return emptyList()
    }' @ [328:10] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'this' @ [328:14] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.fuzzyTypesForSmartCompletion[ReceiverParameterDescriptorImpl]

'kind' @ [328:41] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'isSingleton' @ [328:46] ==> public final val ClassKind.isSingleton: Boolean[MyPropertyDescriptor]

'listOf' @ [329:16] ==> public fun <T> listOf(element: FuzzyType): List<FuzzyType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FuzzyType

'defaultType' @ [329:23] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'toFuzzyType' @ [329:35] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [329:47] ==> public fun <T> emptyList(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'emptyList' @ [332:16] ==> public fun <T> emptyList(): List<FuzzyType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FuzzyType

'filter' @ [337:11] ==> public inline fun <T> Iterable<ExpectedInfo>.filter(predicate: (ExpectedInfo) -> Boolean): List<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'it' @ [337:20] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.filterFunctionExpected.<anonymous>[ValueParameterDescriptorImpl]

'fuzzyType' @ [337:23] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'it' @ [337:44] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.filterFunctionExpected.<anonymous>[ValueParameterDescriptorImpl]

'fuzzyType' @ [337:47] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'type' @ [337:59] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'isFunctionType' @ [337:64] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'filter' @ [340:11] ==> public inline fun <T> Iterable<ExpectedInfo>.filter(predicate: (ExpectedInfo) -> Boolean): List<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'it' @ [340:20] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.filterCallableExpected.<anonymous>[ValueParameterDescriptorImpl]

'fuzzyType' @ [340:23] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'ReflectionTypes' @ [340:44] ==> public companion object defined in org.jetbrains.kotlin.builtins.ReflectionTypes[FakeCallableDescriptorForObject]

'isCallableType' @ [340:60] ==> public final fun isCallableType(type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.ReflectionTypes.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [340:75] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.smart.filterCallableExpected.<anonymous>[ValueParameterDescriptorImpl]

'fuzzyType' @ [340:78] ==> public val ExpectedInfo.fuzzyType: FuzzyType? defined in org.jetbrains.kotlin.idea.core[DeserializedPropertyDescriptor]

'type' @ [340:90] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

