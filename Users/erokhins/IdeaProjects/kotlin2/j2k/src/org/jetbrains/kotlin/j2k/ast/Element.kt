'CommentsAndSpacesInheritance' @ [24:118] ==> public constructor CommentsAndSpacesInheritance(spacesBefore: SpacesInheritance = ..., commentsBefore: Boolean = ..., commentsAfter: Boolean = ..., commentsInside: Boolean = ...) defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[ClassConstructorDescriptorImpl]

'prototypes' @ [25:5] ==> public final var prototypes: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'if (prototype != null) listOf(PrototypeInfo(prototype, inheritance)) else listOf()' @ [25:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<PrototypeInfo>?, elseBranch: List<PrototypeInfo>?): List<PrototypeInfo>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<PrototypeInfo>?

'prototype' @ [25:22] ==> value-parameter prototype: PsiElement? defined in org.jetbrains.kotlin.j2k.ast.assignPrototype[ValueParameterDescriptorImpl]

'listOf' @ [25:41] ==> public fun <T> listOf(element: PrototypeInfo): List<PrototypeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PrototypeInfo

'PrototypeInfo' @ [25:48] ==> public constructor PrototypeInfo(element: PsiElement, commentsAndSpacesInheritance: CommentsAndSpacesInheritance) defined in org.jetbrains.kotlin.j2k.ast.PrototypeInfo[ClassConstructorDescriptorImpl]

'prototype' @ [25:62] ==> value-parameter prototype: PsiElement? defined in org.jetbrains.kotlin.j2k.ast.assignPrototype[ValueParameterDescriptorImpl]

'inheritance' @ [25:73] ==> value-parameter inheritance: CommentsAndSpacesInheritance = ... defined in org.jetbrains.kotlin.j2k.ast.assignPrototype[ValueParameterDescriptorImpl]

'listOf' @ [25:92] ==> @InlineOnly public inline fun <T> listOf(): List<PrototypeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PrototypeInfo

'this' @ [26:12] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.assignPrototype[ReceiverParameterDescriptorImpl]

'this' @ [30:5] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.assignPrototypes[ReceiverParameterDescriptorImpl]

'prototypes' @ [30:10] ==> public final var prototypes: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'prototypes' @ [30:23] ==> value-parameter vararg prototypes: PrototypeInfo defined in org.jetbrains.kotlin.j2k.ast.assignPrototypes[ValueParameterDescriptorImpl]

'asList' @ [30:34] ==> public fun <T> Array<out PrototypeInfo>.asList(): List<PrototypeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PrototypeInfo

'this' @ [31:12] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.assignPrototypes[ReceiverParameterDescriptorImpl]

'prototypes' @ [35:5] ==> public final var prototypes: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'listOf' @ [35:18] ==> @InlineOnly public inline fun <T> listOf(): List<PrototypeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PrototypeInfo

'this' @ [36:12] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.assignNoPrototype[ReceiverParameterDescriptorImpl]

'prototypes' @ [40:5] ==> public final var prototypes: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'element' @ [40:18] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.ast.assignPrototypesFrom[ValueParameterDescriptorImpl]

'prototypes' @ [40:26] ==> public final var prototypes: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'inheritance' @ [41:9] ==> value-parameter inheritance: CommentsAndSpacesInheritance? = ... defined in org.jetbrains.kotlin.j2k.ast.assignPrototypesFrom[ValueParameterDescriptorImpl]

'prototypes' @ [42:9] ==> public final var prototypes: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'prototypes' @ [42:22] ==> public final var prototypes: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'map' @ [42:34] ==> public inline fun <T, R> Iterable<PrototypeInfo>.map(transform: (PrototypeInfo) -> PrototypeInfo): List<PrototypeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PrototypeInfo
    <R> -> PrototypeInfo

'PrototypeInfo' @ [42:40] ==> public constructor PrototypeInfo(element: PsiElement, commentsAndSpacesInheritance: CommentsAndSpacesInheritance) defined in org.jetbrains.kotlin.j2k.ast.PrototypeInfo[ClassConstructorDescriptorImpl]

'it' @ [42:54] ==> value-parameter it: PrototypeInfo defined in org.jetbrains.kotlin.j2k.ast.assignPrototypesFrom.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [42:57] ==> public final val element: PsiElement defined in org.jetbrains.kotlin.j2k.ast.PrototypeInfo[PropertyDescriptorImpl]

'inheritance' @ [42:66] ==> value-parameter inheritance: CommentsAndSpacesInheritance? = ... defined in org.jetbrains.kotlin.j2k.ast.assignPrototypesFrom[ValueParameterDescriptorImpl]

'createdAt' @ [44:5] ==> public final var createdAt: String? defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'element' @ [44:17] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.ast.assignPrototypesFrom[ValueParameterDescriptorImpl]

'createdAt' @ [44:25] ==> public final var createdAt: String? defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'this' @ [45:12] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.assignPrototypesFrom[ReceiverParameterDescriptorImpl]

'BLANK_LINES_ONLY' @ [55:65] ==> enum entry BLANK_LINES_ONLY defined in org.jetbrains.kotlin.j2k.ast.SpacesInheritance[FakeCallableDescriptorForObject]

'CommentsAndSpacesInheritance' @ [61:25] ==> public constructor CommentsAndSpacesInheritance(spacesBefore: SpacesInheritance = ..., commentsBefore: Boolean = ..., commentsAfter: Boolean = ..., commentsInside: Boolean = ...) defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[ClassConstructorDescriptorImpl]

'NONE' @ [61:87] ==> enum entry NONE defined in org.jetbrains.kotlin.j2k.ast.SpacesInheritance[FakeCallableDescriptorForObject]

'CommentsAndSpacesInheritance' @ [62:27] ==> public constructor CommentsAndSpacesInheritance(spacesBefore: SpacesInheritance = ..., commentsBefore: Boolean = ..., commentsAfter: Boolean = ..., commentsInside: Boolean = ...) defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[ClassConstructorDescriptorImpl]

'LINE_BREAKS' @ [62:89] ==> enum entry LINE_BREAKS defined in org.jetbrains.kotlin.j2k.ast.SpacesInheritance[FakeCallableDescriptorForObject]

'CodeBuilder' @ [67:19] ==> public constructor CodeBuilder(topElement: PsiElement?, docConverter: DocCommentConverter) defined in org.jetbrains.kotlin.j2k.CodeBuilder[ClassConstructorDescriptorImpl]

'EmptyDocCommentConverter' @ [67:37] ==> public object EmptyDocCommentConverter : DocCommentConverter defined in org.jetbrains.kotlin.j2k in file DocCommentConverter.kt[FakeCallableDescriptorForObject]

'builder' @ [68:5] ==> val builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.canonicalCode[LocalVariableDescriptor]

'append' @ [68:13] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'this' @ [68:20] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.canonicalCode[ReceiverParameterDescriptorImpl]

'builder' @ [69:12] ==> val builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.canonicalCode[LocalVariableDescriptor]

'resultText' @ [69:20] ==> public final val resultText: String defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'canBeSingleton' @ [76:17] ==> protected open val canBeSingleton: Boolean defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'field' @ [77:17] ==> var field: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.Element.<set-prototypes>[SyntheticFieldDescriptor]

'listOf' @ [77:25] ==> @InlineOnly public inline fun <T> listOf(): List<PrototypeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PrototypeInfo

'field' @ [80:13] ==> var field: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.Element.<set-prototypes>[SyntheticFieldDescriptor]

'value' @ [80:21] ==> value-parameter value: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.Element.<set-prototypes>[ValueParameterDescriptorImpl]

'isEmpty' @ [84:17] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'if (saveCreationStacktraces)
                  Exception().stackTrace.joinToString("\n")
              else
                  null' @ [87:15] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'saveCreationStacktraces' @ [87:19] ==> public final var saveCreationStacktraces: Boolean defined in org.jetbrains.kotlin.j2k.ast.Element.Companion[PropertyDescriptorImpl]

'Exception' @ [88:19] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'stackTrace' @ [88:31] ==> public final var Exception.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'joinToString' @ [88:42] ==> public fun <T> Array<out (StackTraceElement..StackTraceElement?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((StackTraceElement..StackTraceElement?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.StackTraceElement..java.lang.StackTraceElement?)

'Element' @ [99:20] ==> public constructor Element() defined in org.jetbrains.kotlin.j2k.ast.Element[ClassConstructorDescriptorImpl]

'Element' @ [112:5] ==> public constructor Element() defined in org.jetbrains.kotlin.j2k.ast.Element[ClassConstructorDescriptorImpl]

'assignNoPrototype' @ [117:9] ==> public fun <TElement : Element> DeferredElement<TResult>.assignNoPrototype(): DeferredElement<TResult> defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> DeferredElement<TResult>

'assert' @ [125:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'result' @ [125:16] ==> private final var result: TResult? defined in org.jetbrains.kotlin.j2k.ast.DeferredElement[PropertyDescriptorImpl]

'result' @ [126:9] ==> private final var result: TResult? defined in org.jetbrains.kotlin.j2k.ast.DeferredElement[PropertyDescriptorImpl]

'invoke' @ [126:18] ==> public abstract operator fun invoke(p1: CodeConverter): TResult defined in kotlin.Function1[FunctionInvokeDescriptor]

'codeConverter' @ [126:28] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ast.DeferredElement.unfold[ValueParameterDescriptorImpl]

'resultNotNull' @ [130:9] ==> private final val resultNotNull: TResult defined in org.jetbrains.kotlin.j2k.ast.DeferredElement[PropertyDescriptorImpl]

'generateCode' @ [130:23] ==> public abstract fun generateCode(builder: CodeBuilder): Unit defined in org.jetbrains.kotlin.j2k.ast.Element[SimpleFunctionDescriptorImpl]

'builder' @ [130:36] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.DeferredElement.generateCode[ValueParameterDescriptorImpl]

'resultNotNull' @ [134:17] ==> private final val resultNotNull: TResult defined in org.jetbrains.kotlin.j2k.ast.DeferredElement[PropertyDescriptorImpl]

'isEmpty' @ [134:31] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'assert' @ [138:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'result' @ [138:20] ==> private final var result: TResult? defined in org.jetbrains.kotlin.j2k.ast.DeferredElement[PropertyDescriptorImpl]

'this' @ [138:79] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.DeferredElement[LazyClassReceiverParameterDescriptor]

'result' @ [139:20] ==> private final var result: TResult? defined in org.jetbrains.kotlin.j2k.ast.DeferredElement[PropertyDescriptorImpl]

