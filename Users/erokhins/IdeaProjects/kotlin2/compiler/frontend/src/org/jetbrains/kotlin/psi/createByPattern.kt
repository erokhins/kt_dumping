'createByPattern' @ [34:11] ==> public fun <TElement : KtElement> createByPattern(pattern: String, vararg args: Any, reformat: Boolean = ..., factory: (String) -> KtExpression): KtExpression defined in org.jetbrains.kotlin.psi[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : KtElement> -> KtExpression

'pattern' @ [34:27] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.createExpressionByPattern[ValueParameterDescriptorImpl]

'args' @ [34:37] ==> value-parameter vararg args: Any defined in org.jetbrains.kotlin.psi.createExpressionByPattern[ValueParameterDescriptorImpl]

'reformat' @ [34:54] ==> value-parameter reformat: Boolean = ... defined in org.jetbrains.kotlin.psi.createExpressionByPattern[ValueParameterDescriptorImpl]

'createExpression' @ [34:66] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'it' @ [34:83] ==> value-parameter it: String defined in org.jetbrains.kotlin.psi.createExpressionByPattern.<anonymous>[ValueParameterDescriptorImpl]

'createByPattern' @ [37:11] ==> public fun <TElement : KtElement> createByPattern(pattern: String, vararg args: Any, reformat: Boolean = ..., factory: (String) -> KtValueArgumentList): KtValueArgumentList defined in org.jetbrains.kotlin.psi[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : KtElement> -> KtValueArgumentList

'pattern' @ [37:27] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.createValueArgumentListByPattern[ValueParameterDescriptorImpl]

'args' @ [37:37] ==> value-parameter vararg args: Any defined in org.jetbrains.kotlin.psi.createValueArgumentListByPattern[ValueParameterDescriptorImpl]

'reformat' @ [37:54] ==> value-parameter reformat: Boolean = ... defined in org.jetbrains.kotlin.psi.createValueArgumentListByPattern[ValueParameterDescriptorImpl]

'createCallArguments' @ [37:66] ==> public final fun createCallArguments(text: String): KtValueArgumentList defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'it' @ [37:86] ==> value-parameter it: String defined in org.jetbrains.kotlin.psi.createValueArgumentListByPattern.<anonymous>[ValueParameterDescriptorImpl]

'createByPattern' @ [40:11] ==> public fun <TElement : KtElement> createByPattern(pattern: String, vararg args: Any, reformat: Boolean = ..., factory: (String) -> TDeclaration): TDeclaration defined in org.jetbrains.kotlin.psi[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : KtElement> -> TDeclaration

'pattern' @ [40:27] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.createDeclarationByPattern[ValueParameterDescriptorImpl]

'args' @ [40:37] ==> value-parameter vararg args: Any defined in org.jetbrains.kotlin.psi.createDeclarationByPattern[ValueParameterDescriptorImpl]

'reformat' @ [40:54] ==> value-parameter reformat: Boolean = ... defined in org.jetbrains.kotlin.psi.createDeclarationByPattern[ValueParameterDescriptorImpl]

'createDeclaration' @ [40:66] ==> public final fun <TDeclaration : KtDeclaration> createDeclaration(text: String): TDeclaration defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]
Inferred types:
    <TDeclaration : KtDeclaration> -> TDeclaration

'it' @ [40:98] ==> value-parameter it: String defined in org.jetbrains.kotlin.psi.createDeclarationByPattern.<anonymous>[ValueParameterDescriptorImpl]

'createByPattern' @ [43:11] ==> public fun <TElement : KtElement> createByPattern(pattern: String, vararg args: Any, reformat: Boolean = ..., factory: (String) -> KtDestructuringDeclaration): KtDestructuringDeclaration defined in org.jetbrains.kotlin.psi[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : KtElement> -> KtDestructuringDeclaration

'pattern' @ [43:27] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.createDestructuringDeclarationByPattern[ValueParameterDescriptorImpl]

'args' @ [43:37] ==> value-parameter vararg args: Any defined in org.jetbrains.kotlin.psi.createDestructuringDeclarationByPattern[ValueParameterDescriptorImpl]

'reformat' @ [43:54] ==> value-parameter reformat: Boolean = ... defined in org.jetbrains.kotlin.psi.createDestructuringDeclarationByPattern[ValueParameterDescriptorImpl]

'createDestructuringDeclaration' @ [43:66] ==> public final fun createDestructuringDeclaration(text: String): KtDestructuringDeclaration defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'it' @ [43:97] ==> value-parameter it: String defined in org.jetbrains.kotlin.psi.createDestructuringDeclarationByPattern.<anonymous>[ValueParameterDescriptorImpl]

'ArgumentType<T>' @ [47:97] ==> public constructor ArgumentType<T : Any>(klass: Class<T>) defined in org.jetbrains.kotlin.psi.ArgumentType[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> T

'klass' @ [47:113] ==> value-parameter klass: Class<T> defined in org.jetbrains.kotlin.psi.PlainTextArgumentType.<init>[ValueParameterDescriptorImpl]

'ArgumentType<T>' @ [49:156] ==> public constructor ArgumentType<T : Any>(klass: Class<T>) defined in org.jetbrains.kotlin.psi.ArgumentType[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> T

'klass' @ [49:172] ==> value-parameter klass: Class<T> defined in org.jetbrains.kotlin.psi.PsiElementPlaceholderArgumentType.<init>[ValueParameterDescriptorImpl]

'PsiElementPlaceholderArgumentType<T, T>' @ [53:73] ==> public constructor PsiElementPlaceholderArgumentType<T : Any, TPlaceholder : PsiElement>(klass: Class<T>, placeholderClass: Class<T>) defined in org.jetbrains.kotlin.psi.PsiElementPlaceholderArgumentType[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> T
    <TPlaceholder : PsiElement> -> T

'klass' @ [53:113] ==> value-parameter klass: Class<T> defined in org.jetbrains.kotlin.psi.PsiElementArgumentType.<init>[ValueParameterDescriptorImpl]

'klass' @ [53:120] ==> value-parameter klass: Class<T> defined in org.jetbrains.kotlin.psi.PsiElementArgumentType.<init>[ValueParameterDescriptorImpl]

'isNodeGenerated' @ [57:37] ==> public open fun isNodeGenerated(p0: (ASTNode..ASTNode?)): Boolean defined in com.intellij.psi.impl.source.codeStyle.CodeEditUtil[JavaMethodDescriptor]

'argument' @ [57:53] ==> value-parameter argument: T defined in org.jetbrains.kotlin.psi.PsiElementArgumentType.replacePlaceholderElement[ValueParameterDescriptorImpl]

'node' @ [57:62] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'placeholder' @ [58:22] ==> value-parameter placeholder: T defined in org.jetbrains.kotlin.psi.PsiElementArgumentType.replacePlaceholderElement[ValueParameterDescriptorImpl]

'replace' @ [58:34] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'argument' @ [58:42] ==> value-parameter argument: T defined in org.jetbrains.kotlin.psi.PsiElementArgumentType.replacePlaceholderElement[ValueParameterDescriptorImpl]

'reformat' @ [59:13] ==> val reformat: Boolean defined in org.jetbrains.kotlin.psi.PsiElementArgumentType.replacePlaceholderElement[LocalVariableDescriptor]

'result' @ [60:13] ==> var result: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.PsiElementArgumentType.replacePlaceholderElement[LocalVariableDescriptor]

'getInstance' @ [60:39] ==> public open fun getInstance(@NotNull p0: Project): (CodeStyleManager..CodeStyleManager?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'result' @ [60:51] ==> var result: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.PsiElementArgumentType.replacePlaceholderElement[LocalVariableDescriptor]

'project' @ [60:58] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'reformat' @ [60:67] ==> @NotNull public abstract fun reformat(@NotNull p0: PsiElement, p1: Boolean): PsiElement defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'result' @ [60:76] ==> var result: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.PsiElementArgumentType.replacePlaceholderElement[LocalVariableDescriptor]

'PsiChildRange' @ [62:16] ==> public companion object defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[FakeCallableDescriptorForObject]

'singleElement' @ [62:30] ==> public final fun singleElement(element: PsiElement): PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange.Companion[SimpleFunctionDescriptorImpl]

'result' @ [62:44] ==> var result: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.PsiElementArgumentType.replacePlaceholderElement[LocalVariableDescriptor]

'PsiElementPlaceholderArgumentType<PsiChildRange, KtElement>' @ [66:44] ==> public constructor PsiElementPlaceholderArgumentType<T : Any, TPlaceholder : PsiElement>(klass: Class<PsiChildRange>, placeholderClass: Class<KtElement>) defined in org.jetbrains.kotlin.psi.PsiElementPlaceholderArgumentType[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> PsiChildRange
    <TPlaceholder : PsiElement> -> KtElement

'PsiChildRange' @ [66:104] ==> public companion object defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[FakeCallableDescriptorForObject]

'java' @ [66:125] ==> public val <T> KClass<PsiChildRange>.java: Class<PsiChildRange> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiChildRange

'java' @ [66:148] ==> public val <T> KClass<KtElement>.java: Class<KtElement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtElement

'placeholder' @ [68:23] ==> value-parameter placeholder: KtElement defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[ValueParameterDescriptorImpl]

'project' @ [68:35] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'getInstance' @ [69:49] ==> public open fun getInstance(@NotNull p0: Project): (CodeStyleManager..CodeStyleManager?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'project' @ [69:61] ==> val project: Project defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[LocalVariableDescriptor]

'if (!argument.isEmpty) {
            val first = placeholder.parent.addRangeBefore(argument.first!!, argument.last!!, placeholder)
            val last = placeholder.prevSibling
            placeholder.delete()

            codeStyleManager.reformatNewlyAddedElement(first.node.treeParent, first.node)
            if (last != first) {
                codeStyleManager.reformatNewlyAddedElement(last.node.treeParent, last.node)
            }
            PsiChildRange(first, last)
        }
        else {
            placeholder.delete()
            PsiChildRange.EMPTY
        }' @ [71:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiChildRange, elseBranch: PsiChildRange): PsiChildRange[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiChildRange

'!' @ [71:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'argument' @ [71:21] ==> value-parameter argument: PsiChildRange defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[ValueParameterDescriptorImpl]

'isEmpty' @ [71:30] ==> public final val isEmpty: Boolean defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'placeholder' @ [72:25] ==> value-parameter placeholder: KtElement defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[ValueParameterDescriptorImpl]

'parent' @ [72:37] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addRangeBefore' @ [72:44] ==> public abstract fun addRangeBefore(@NotNull p0: PsiElement, @NotNull p1: PsiElement, p2: (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'argument' @ [72:59] ==> value-parameter argument: PsiChildRange defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[ValueParameterDescriptorImpl]

'first' @ [72:68] ==> public final val first: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'argument' @ [72:77] ==> value-parameter argument: PsiChildRange defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[ValueParameterDescriptorImpl]

'last' @ [72:86] ==> public final val last: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'placeholder' @ [72:94] ==> value-parameter placeholder: KtElement defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[ValueParameterDescriptorImpl]

'placeholder' @ [73:24] ==> value-parameter placeholder: KtElement defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[ValueParameterDescriptorImpl]

'prevSibling' @ [73:36] ==> public final val KtElement.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'placeholder' @ [74:13] ==> value-parameter placeholder: KtElement defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[ValueParameterDescriptorImpl]

'delete' @ [74:25] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'codeStyleManager' @ [76:13] ==> val codeStyleManager: (CodeStyleManager..CodeStyleManager?) defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[LocalVariableDescriptor]

'reformatNewlyAddedElement' @ [76:30] ==> public abstract fun reformatNewlyAddedElement(@NotNull p0: ASTNode, @NotNull p1: ASTNode): Unit defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'first' @ [76:56] ==> val first: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[LocalVariableDescriptor]

'node' @ [76:62] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'treeParent' @ [76:67] ==> public final val ASTNode.treeParent: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'first' @ [76:79] ==> val first: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[LocalVariableDescriptor]

'node' @ [76:85] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'last' @ [77:17] ==> val last: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[LocalVariableDescriptor]

'first' @ [77:25] ==> val first: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[LocalVariableDescriptor]

'codeStyleManager' @ [78:17] ==> val codeStyleManager: (CodeStyleManager..CodeStyleManager?) defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[LocalVariableDescriptor]

'reformatNewlyAddedElement' @ [78:34] ==> public abstract fun reformatNewlyAddedElement(@NotNull p0: ASTNode, @NotNull p1: ASTNode): Unit defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'last' @ [78:60] ==> val last: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[LocalVariableDescriptor]

'node' @ [78:65] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'treeParent' @ [78:70] ==> public final val ASTNode.treeParent: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'last' @ [78:82] ==> val last: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[LocalVariableDescriptor]

'node' @ [78:87] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'PsiChildRange' @ [80:13] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[ClassConstructorDescriptorImpl]

'first' @ [80:27] ==> val first: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[LocalVariableDescriptor]

'last' @ [80:34] ==> val last: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[LocalVariableDescriptor]

'placeholder' @ [83:13] ==> value-parameter placeholder: KtElement defined in org.jetbrains.kotlin.psi.PsiChildRangeArgumentType.replacePlaceholderElement[ValueParameterDescriptorImpl]

'delete' @ [83:25] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'PsiChildRange' @ [84:13] ==> public companion object defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[FakeCallableDescriptorForObject]

'EMPTY' @ [84:27] ==> public final val EMPTY: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange.Companion[PropertyDescriptorImpl]

'listOf' @ [89:40] ==> public fun <T> listOf(vararg elements: ArgumentType<out Any>): List<ArgumentType<out Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArgumentType<out Any>

'PsiElementArgumentType' @ [90:9] ==> public constructor PsiElementArgumentType<T : PsiElement>(klass: Class<KtExpression>) defined in org.jetbrains.kotlin.psi.PsiElementArgumentType[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtExpression

'java' @ [90:52] ==> public val <T> KClass<KtExpression>.java: Class<KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'PsiElementArgumentType' @ [91:9] ==> public constructor PsiElementArgumentType<T : PsiElement>(klass: Class<KtTypeReference>) defined in org.jetbrains.kotlin.psi.PsiElementArgumentType[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtTypeReference

'java' @ [91:55] ==> public val <T> KClass<KtTypeReference>.java: Class<KtTypeReference> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtTypeReference

'PlainTextArgumentType' @ [92:9] ==> public constructor PlainTextArgumentType<T : Any>(klass: Class<String>, toPlainText: (String) -> String) defined in org.jetbrains.kotlin.psi.PlainTextArgumentType[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> String

'String' @ [92:31] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [92:45] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'it' @ [92:67] ==> value-parameter it: String defined in org.jetbrains.kotlin.psi.SUPPORTED_ARGUMENT_TYPES.<anonymous>[ValueParameterDescriptorImpl]

'PlainTextArgumentType' @ [93:9] ==> public constructor PlainTextArgumentType<T : Any>(klass: Class<Name>, toPlainText: (Name) -> String) defined in org.jetbrains.kotlin.psi.PlainTextArgumentType[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> Name

'Name' @ [93:31] ==> private constructor Name(@NotNull p0: String, p1: Boolean) defined in org.jetbrains.kotlin.name.Name[JavaClassConstructorDescriptor]

'java' @ [93:43] ==> public val <T> KClass<Name>.java: Class<Name> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Name

'Name' @ [93:63] ==> private constructor Name(@NotNull p0: String, p1: Boolean) defined in org.jetbrains.kotlin.name.Name[JavaClassConstructorDescriptor]

'PsiChildRangeArgumentType' @ [94:9] ==> private object PsiChildRangeArgumentType : PsiElementPlaceholderArgumentType<PsiChildRange, KtElement> defined in org.jetbrains.kotlin.psi in file createByPattern.kt[FakeCallableDescriptorForObject]

'args' @ [98:25] ==> value-parameter vararg args: Any defined in org.jetbrains.kotlin.psi.createByPattern[ValueParameterDescriptorImpl]

'map' @ [98:30] ==> public inline fun <T, R> Array<out Any>.map(transform: (Any) -> ArgumentType<out Any>): List<ArgumentType<out Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any
    <R> -> ArgumentType<out Any>

'SUPPORTED_ARGUMENT_TYPES' @ [99:9] ==> private val SUPPORTED_ARGUMENT_TYPES: List<ArgumentType<out Any>> defined in org.jetbrains.kotlin.psi in file createByPattern.kt[PropertyDescriptorImpl]

'firstOrNull' @ [99:34] ==> public inline fun <T> Iterable<ArgumentType<out Any>>.firstOrNull(predicate: (ArgumentType<out Any>) -> Boolean): ArgumentType<out Any>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArgumentType<out Any>

'it' @ [99:48] ==> value-parameter it: ArgumentType<out Any> defined in org.jetbrains.kotlin.psi.createByPattern.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'klass' @ [99:51] ==> public final val klass: Class<out Any> defined in org.jetbrains.kotlin.psi.ArgumentType[PropertyDescriptorImpl]

'isInstance' @ [99:57] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'arg' @ [99:68] ==> value-parameter arg: Any defined in org.jetbrains.kotlin.psi.createByPattern.<anonymous>[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [100:22] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'arg' @ [100:77] ==> value-parameter arg: Any defined in org.jetbrains.kotlin.psi.createByPattern.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [100:88] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'SUPPORTED_ARGUMENT_TYPES' @ [100:115] ==> private val SUPPORTED_ARGUMENT_TYPES: List<ArgumentType<out Any>> defined in org.jetbrains.kotlin.psi in file createByPattern.kt[PropertyDescriptorImpl]

'joinToString' @ [100:140] ==> public fun <T> Iterable<ArgumentType<out Any>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((ArgumentType<out Any>) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArgumentType<out Any>

'it' @ [100:155] ==> value-parameter it: ArgumentType<out Any> defined in org.jetbrains.kotlin.psi.createByPattern.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'klass' @ [100:158] ==> public final val klass: Class<out Any> defined in org.jetbrains.kotlin.psi.ArgumentType[PropertyDescriptorImpl]

'simpleName' @ [100:164] ==> public final val <T : (Any..Any?)> Class<out Any>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'Suppress' @ [104:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'args' @ [105:16] ==> value-parameter vararg args: Any defined in org.jetbrains.kotlin.psi.createByPattern[ValueParameterDescriptorImpl]

'zip' @ [105:21] ==> public infix fun <T, R> Array<out Any>.zip(other: Iterable<ArgumentType<out Any>>): List<Pair<Any, ArgumentType<out Any>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any
    <R> -> ArgumentType<out Any>

'argumentTypes' @ [105:25] ==> val argumentTypes: List<ArgumentType<out Any>> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'map' @ [105:40] ==> public inline fun <T, R> Iterable<Pair<Any, ArgumentType<out Any>>>.map(transform: (Pair<Any, ArgumentType<out Any>>) -> Any): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Any, ArgumentType<out Any>>
    <R> -> Any

'component1' @ [106:14] ==> public final operator fun component1(): Any defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [106:19] ==> public final operator fun component2(): ArgumentType<out Any> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'it' @ [106:27] ==> value-parameter it: Pair<Any, ArgumentType<out Any>> defined in org.jetbrains.kotlin.psi.createByPattern.<anonymous>[ValueParameterDescriptorImpl]

'if (type is PlainTextArgumentType)
            (type.toPlainText as Function1<Any, String>).invoke(arg) // TODO: see KT-7833
        else
            arg' @ [107:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'type' @ [107:13] ==> val type: ArgumentType<out Any> defined in org.jetbrains.kotlin.psi.createByPattern.<anonymous>[LocalVariableDescriptor]

'type' @ [108:14] ==> val type: ArgumentType<out Any> defined in org.jetbrains.kotlin.psi.createByPattern.<anonymous>[LocalVariableDescriptor]

'toPlainText' @ [108:19] ==> public final val toPlainText: (Nothing) -> String defined in org.jetbrains.kotlin.psi.PlainTextArgumentType[PropertyDescriptorImpl]

'invoke' @ [108:58] ==> public abstract operator fun invoke(p1: Any): String defined in kotlin.Function1[FunctionInvokeDescriptor]

'arg' @ [108:65] ==> val arg: Any defined in org.jetbrains.kotlin.psi.createByPattern.<anonymous>[LocalVariableDescriptor]

'arg' @ [110:13] ==> val arg: Any defined in org.jetbrains.kotlin.psi.createByPattern.<anonymous>[LocalVariableDescriptor]

'component1' @ [113:10] ==> public final operator fun component1(): String defined in org.jetbrains.kotlin.psi.PatternData[SimpleFunctionDescriptorImpl]

'component2' @ [113:25] ==> public final operator fun component2(): Map<Int, List<Placeholder>> defined in org.jetbrains.kotlin.psi.PatternData[SimpleFunctionDescriptorImpl]

'processPattern' @ [113:44] ==> private fun processPattern(pattern: String, args: List<Any>): PatternData defined in org.jetbrains.kotlin.psi[SimpleFunctionDescriptorImpl]

'pattern' @ [113:59] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.createByPattern[ValueParameterDescriptorImpl]

'args' @ [113:68] ==> val args: List<Any> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'invoke' @ [115:25] ==> public abstract operator fun invoke(p1: String): TElement defined in kotlin.Function1[FunctionInvokeDescriptor]

'processedText' @ [115:33] ==> val processedText: String defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'trim' @ [115:47] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'resultElement' @ [116:19] ==> var resultElement: TElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'project' @ [116:33] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'resultElement' @ [118:17] ==> var resultElement: TElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'startOffset' @ [118:31] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'getInstance' @ [120:46] ==> public open fun getInstance(p0: (Project..Project?)): (SmartPointerManager..SmartPointerManager?) defined in com.intellij.psi.SmartPointerManager[JavaMethodDescriptor]

'project' @ [120:58] ==> val project: Project defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'HashMap' @ [122:20] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> SmartPsiElementPointer<PsiElement>
    <V : (Any..Any?)> -> Int

'component1' @ [125:11] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Int, List<Placeholder>>.component1(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> List<Placeholder>

'component2' @ [125:14] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Int, List<Placeholder>>.component2(): List<Placeholder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> List<Placeholder>

'allPlaceholders' @ [125:31] ==> val allPlaceholders: Map<Int, List<Placeholder>> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'args' @ [126:19] ==> val args: List<Any> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'n' @ [126:24] ==> val n: Int defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'arg' @ [127:13] ==> val arg: Any defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'argumentTypes' @ [128:36] ==> val argumentTypes: List<ArgumentType<out Any>> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'n' @ [128:50] ==> val n: Int defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'placeholderClass' @ [128:97] ==> public final val placeholderClass: Class<out PsiElement> defined in org.jetbrains.kotlin.psi.PsiElementPlaceholderArgumentType[PropertyDescriptorImpl]

'component1' @ [130:15] ==> public final operator fun component1(): TextRange defined in org.jetbrains.kotlin.psi.Placeholder[SimpleFunctionDescriptorImpl]

'component2' @ [130:22] ==> public final operator fun component2(): String defined in org.jetbrains.kotlin.psi.Placeholder[SimpleFunctionDescriptorImpl]

'placeholders' @ [130:28] ==> val placeholders: List<Placeholder> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'resultElement' @ [131:25] ==> var resultElement: TElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'findElementAt' @ [131:39] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'range' @ [131:53] ==> val range: TextRange defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'startOffset' @ [131:59] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'token' @ [132:29] ==> val token: PsiElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'parentsWithSelf' @ [132:35] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'element' @ [133:36] ==> val element: PsiElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'textRange' @ [133:44] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'shiftRight' @ [133:54] ==> @NotNull public open fun shiftRight(p0: Int): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'-' @ [133:65] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'start' @ [133:66] ==> val start: Int defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'elementRange' @ [134:21] ==> val elementRange: TextRange defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'range' @ [134:37] ==> val range: TextRange defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'expectedElementType' @ [134:46] ==> val expectedElementType: Class<out PsiElement> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'isInstance' @ [134:66] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'element' @ [134:77] ==> val element: PsiElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'pointerManager' @ [135:35] ==> val pointerManager: (SmartPointerManager..SmartPointerManager?) defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'createSmartPsiElementPointer' @ [135:50] ==> @NotNull public abstract fun <E : (PsiElement..PsiElement?)> createSmartPsiElementPointer(@NotNull p0: PsiElement): SmartPsiElementPointer<(PsiElement..PsiElement?)> defined in com.intellij.psi.SmartPointerManager[JavaMethodDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> PsiElement

'element' @ [135:79] ==> val element: PsiElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'pointers' @ [136:21] ==> val pointers: HashMap<SmartPsiElementPointer<PsiElement>, Int> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'put' @ [136:30] ==> public open fun put(key: SmartPsiElementPointer<PsiElement>, value: Int): Int? defined in java.util.HashMap[JavaMethodDescriptor]

'pointer' @ [136:34] ==> val pointer: SmartPsiElementPointer<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'n' @ [136:43] ==> val n: Int defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'!' @ [140:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'range' @ [140:22] ==> val range: TextRange defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'contains' @ [140:28] ==> public open operator fun contains(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'elementRange' @ [140:37] ==> val elementRange: TextRange defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'IllegalArgumentException' @ [141:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'pattern' @ [141:71] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.createByPattern[ValueParameterDescriptorImpl]

'expectedElementType' @ [141:87] ==> val expectedElementType: Class<out PsiElement> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'simpleName' @ [141:107] ==> public final val <T : (Any..Any?)> Class<out PsiElement>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiElement

'n' @ [141:131] ==> val n: Int defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'processedText' @ [141:143] ==> val processedText: String defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'getInstance' @ [147:45] ==> public open fun getInstance(@NotNull p0: Project): (CodeStyleManager..CodeStyleManager?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'project' @ [147:57] ==> val project: Project defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'reformat' @ [149:9] ==> value-parameter reformat: Boolean = ... defined in org.jetbrains.kotlin.psi.createByPattern[ValueParameterDescriptorImpl]

'allPlaceholders' @ [150:39] ==> val allPlaceholders: Map<Int, List<Placeholder>> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'filter' @ [151:18] ==> public inline fun <K, V> Map<out Int, List<Placeholder>>.filter(predicate: (Map.Entry<Int, List<Placeholder>>) -> Boolean): Map<Int, List<Placeholder>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> List<Placeholder>

'args' @ [151:27] ==> val args: List<Any> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'it' @ [151:32] ==> value-parameter it: Map.Entry<Int, List<Placeholder>> defined in org.jetbrains.kotlin.psi.createByPattern.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [151:35] ==> public abstract val key: Int defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'flatMap' @ [152:18] ==> public inline fun <K, V, R> Map<out Int, List<Placeholder>>.flatMap(transform: (Map.Entry<Int, List<Placeholder>>) -> Iterable<Placeholder>): List<Placeholder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> List<Placeholder>
    <R> -> Placeholder

'it' @ [152:28] ==> value-parameter it: Map.Entry<Int, List<Placeholder>> defined in org.jetbrains.kotlin.psi.createByPattern.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [152:31] ==> public abstract val value: List<Placeholder> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'map' @ [153:18] ==> public inline fun <T, R> Iterable<Placeholder>.map(transform: (Placeholder) -> TextRange): List<TextRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Placeholder
    <R> -> TextRange

'it' @ [153:24] ==> value-parameter it: Placeholder defined in org.jetbrains.kotlin.psi.createByPattern.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [153:27] ==> public final val range: TextRange defined in org.jetbrains.kotlin.psi.Placeholder[PropertyDescriptorImpl]

'filterNot' @ [154:18] ==> public inline fun <T> Iterable<TextRange>.filterNot(predicate: (TextRange) -> Boolean): List<TextRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange

'it' @ [154:30] ==> value-parameter it: TextRange defined in org.jetbrains.kotlin.psi.createByPattern.<anonymous>[ValueParameterDescriptorImpl]

'isEmpty' @ [154:33] ==> public final val TextRange.isEmpty: Boolean[MyPropertyDescriptor]

'sortedByDescending' @ [155:18] ==> public inline fun <T, R : Comparable<Int>> Iterable<TextRange>.sortedByDescending(crossinline selector: (TextRange) -> Int?): List<TextRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange
    <R : Comparable<R>> -> Int

'it' @ [155:39] ==> value-parameter it: TextRange defined in org.jetbrains.kotlin.psi.createByPattern.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [155:42] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'resultElement' @ [158:9] ==> var resultElement: TElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'if (stringPlaceholderRanges.none()) {
            codeStyleManager.reformat(resultElement, true) as TElement
        }
        else {
            var bound = resultElement.endOffset - 1
            for (range in stringPlaceholderRanges) {
                // we extend reformatting range by 1 to the right because otherwise some of spaces are not reformatted
                resultElement = codeStyleManager.reformatRange(resultElement, range.endOffset + start, bound + 1, true) as TElement
                bound = range.startOffset + start
            }
            codeStyleManager.reformatRange(resultElement, start, bound + 1, true) as TElement
        }' @ [158:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TElement, elseBranch: TElement): TElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TElement

'stringPlaceholderRanges' @ [158:29] ==> val stringPlaceholderRanges: List<TextRange> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'none' @ [158:53] ==> public fun <T> Iterable<TextRange>.none(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange

'codeStyleManager' @ [159:13] ==> val codeStyleManager: (CodeStyleManager..CodeStyleManager?) defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'reformat' @ [159:30] ==> @NotNull public abstract fun reformat(@NotNull p0: PsiElement, p1: Boolean): PsiElement defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'resultElement' @ [159:39] ==> var resultElement: TElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'resultElement' @ [162:25] ==> var resultElement: TElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'endOffset' @ [162:39] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'stringPlaceholderRanges' @ [163:27] ==> val stringPlaceholderRanges: List<TextRange> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'resultElement' @ [165:17] ==> var resultElement: TElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'codeStyleManager' @ [165:33] ==> val codeStyleManager: (CodeStyleManager..CodeStyleManager?) defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'reformatRange' @ [165:50] ==> public abstract fun reformatRange(@NotNull p0: PsiElement, p1: Int, p2: Int, p3: Boolean): (PsiElement..PsiElement?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'resultElement' @ [165:64] ==> var resultElement: TElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'range' @ [165:79] ==> val range: TextRange defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'endOffset' @ [165:85] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'start' @ [165:97] ==> val start: Int defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'bound' @ [165:104] ==> var bound: Int defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'bound' @ [166:17] ==> var bound: Int defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'range' @ [166:25] ==> val range: TextRange defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'startOffset' @ [166:31] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'start' @ [166:45] ==> val start: Int defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'codeStyleManager' @ [168:13] ==> val codeStyleManager: (CodeStyleManager..CodeStyleManager?) defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'reformatRange' @ [168:30] ==> public abstract fun reformatRange(@NotNull p0: PsiElement, p1: Int, p2: Int, p3: Boolean): (PsiElement..PsiElement?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'resultElement' @ [168:44] ==> var resultElement: TElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'start' @ [168:59] ==> val start: Int defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'bound' @ [168:66] ==> var bound: Int defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'setNodeGeneratedRecursively' @ [172:22] ==> public open fun setNodeGeneratedRecursively(p0: (ASTNode..ASTNode?), p1: Boolean): Unit defined in com.intellij.psi.impl.source.codeStyle.CodeEditUtil[JavaMethodDescriptor]

'resultElement' @ [172:50] ==> var resultElement: TElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'node' @ [172:64] ==> public final val KtElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'component1' @ [174:11] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<SmartPsiElementPointer<PsiElement>, Int>.component1(): SmartPsiElementPointer<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> SmartPsiElementPointer<PsiElement>
    <V> -> Int

'component2' @ [174:20] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<SmartPsiElementPointer<PsiElement>, Int>.component2(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> SmartPsiElementPointer<PsiElement>
    <V> -> Int

'pointers' @ [174:26] ==> val pointers: HashMap<SmartPsiElementPointer<PsiElement>, Int> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'pointer' @ [175:23] ==> val pointer: SmartPsiElementPointer<PsiElement> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'element' @ [175:31] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<PsiElement>.element: PsiElement?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> PsiElement

'element' @ [176:13] ==> var element: PsiElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'element' @ [177:13] ==> var element: PsiElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'element' @ [177:23] ==> var element: PsiElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'parent' @ [177:31] ==> public final val KtFunctionLiteral.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'Suppress' @ [179:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'argumentTypes' @ [180:28] ==> val argumentTypes: List<ArgumentType<out Any>> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'n' @ [180:42] ==> val n: Int defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'argumentType' @ [181:21] ==> val argumentType: PsiElementPlaceholderArgumentType<in Any, in PsiElement> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'replacePlaceholderElement' @ [181:34] ==> public abstract fun replacePlaceholderElement(placeholder: PsiElement, argument: Any): PsiChildRange defined in org.jetbrains.kotlin.psi.PsiElementPlaceholderArgumentType[SimpleFunctionDescriptorImpl]

'element' @ [181:60] ==> var element: PsiElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'args' @ [181:69] ==> val args: List<Any> defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'n' @ [181:74] ==> val n: Int defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'element' @ [183:13] ==> var element: PsiElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'resultElement' @ [183:24] ==> var resultElement: TElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'assert' @ [184:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'range' @ [184:20] ==> val range: PsiChildRange defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'first' @ [184:26] ==> public final val first: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'range' @ [184:35] ==> val range: PsiChildRange defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'last' @ [184:41] ==> public final val last: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'resultElement' @ [185:13] ==> var resultElement: TElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'range' @ [185:29] ==> val range: PsiChildRange defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'first' @ [185:35] ==> public final val first: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[PropertyDescriptorImpl]

'reformat' @ [189:9] ==> value-parameter reformat: Boolean = ... defined in org.jetbrains.kotlin.psi.createByPattern[ValueParameterDescriptorImpl]

'codeStyleManager' @ [190:9] ==> val codeStyleManager: (CodeStyleManager..CodeStyleManager?) defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'adjustLineIndent' @ [190:26] ==> public abstract fun adjustLineIndent(@NotNull p0: PsiFile, p1: (TextRange..TextRange?)): Unit defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'resultElement' @ [190:43] ==> var resultElement: TElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'containingFile' @ [190:57] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'resultElement' @ [190:73] ==> var resultElement: TElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'textRange' @ [190:87] ==> public final val KtElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'resultElement' @ [192:12] ==> var resultElement: TElement defined in org.jetbrains.kotlin.psi.createByPattern[LocalVariableDescriptor]

'LinkedHashMap' @ [200:18] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Int
    <V : (Any..Any?)> -> MutableList<Placeholder>

'if (0 <= i && i < pattern.length) pattern[i] else null' @ [202:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Char?, elseBranch: Char?): Char?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Char?

'<=' @ [202:34] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'i' @ [202:39] ==> value-parameter i: Int defined in org.jetbrains.kotlin.psi.processPattern.charOrNull[ValueParameterDescriptorImpl]

'i' @ [202:44] ==> value-parameter i: Int defined in org.jetbrains.kotlin.psi.processPattern.charOrNull[ValueParameterDescriptorImpl]

'pattern' @ [202:48] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.processPattern[ValueParameterDescriptorImpl]

'length' @ [202:56] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'pattern' @ [202:64] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.processPattern[ValueParameterDescriptorImpl]

'i' @ [202:72] ==> value-parameter i: Int defined in org.jetbrains.kotlin.psi.processPattern.charOrNull[ValueParameterDescriptorImpl]

'!' @ [205:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'condition' @ [205:14] ==> value-parameter condition: Boolean defined in org.jetbrains.kotlin.psi.processPattern.check[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [206:19] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'pattern' @ [206:63] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.processPattern[ValueParameterDescriptorImpl]

'message' @ [206:75] ==> value-parameter message: String defined in org.jetbrains.kotlin.psi.processPattern.check[ValueParameterDescriptorImpl]

'buildString' @ [210:16] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'i' @ [212:16] ==> var i: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'pattern' @ [212:20] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.processPattern[ValueParameterDescriptorImpl]

'length' @ [212:28] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'pattern' @ [213:21] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.processPattern[ValueParameterDescriptorImpl]

'i' @ [213:29] ==> var i: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'if (c == '$') {
                val nextChar = charOrNull(++i)
                if (nextChar == '$') {
                    append(nextChar)
                }
                else {
                    check(nextChar?.isDigit() ?: false, "unclosed '$'")

                    val lastIndex = (i..pattern.length - 1).firstOrNull { !pattern[it].isDigit() } ?: pattern.length
                    val n = pattern.substring(i, lastIndex).toInt()
                    check(n >= 0, "invalid placeholder number: $n")
                    i = lastIndex

                    val arg: Any? = if (n < args.size) args[n] else null /* report wrong number of arguments later */
                    val placeholderText = if (charOrNull(i) != ':' || charOrNull(i + 1) != '\'') {
                        arg as? String ?: "xyz"
                    }
                    else {
                        check(arg !is String, "do not specify placeholder text for $$n - plain text argument passed")
                        i += 2 // skip ':' and '\''
                        val endIndex = pattern.indexOf('\'', i)
                        check(endIndex >= 0, "unclosed placeholder text")
                        check(endIndex > i, "empty placeholder text")
                        val text = pattern.substring(i, endIndex)
                        i = endIndex + 1
                        text
                    }

                    append(placeholderText)
                    val range = TextRange(length - placeholderText.length, length)
                    ranges.getOrPut(n, { ArrayList() }).add(Placeholder(range, placeholderText))
                    continue
                }
            }
            else {
                append(c)
            }' @ [215:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'c' @ [215:17] ==> val c: Char defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'charOrNull' @ [216:32] ==> local final fun charOrNull(i: Int): Char? defined in org.jetbrains.kotlin.psi.processPattern[SimpleFunctionDescriptorImpl]

'++' @ [216:43] ==> public final operator fun inc(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'i' @ [216:45] ==> var i: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'if (nextChar == '$') {
                    append(nextChar)
                }
                else {
                    check(nextChar?.isDigit() ?: false, "unclosed '$'")

                    val lastIndex = (i..pattern.length - 1).firstOrNull { !pattern[it].isDigit() } ?: pattern.length
                    val n = pattern.substring(i, lastIndex).toInt()
                    check(n >= 0, "invalid placeholder number: $n")
                    i = lastIndex

                    val arg: Any? = if (n < args.size) args[n] else null /* report wrong number of arguments later */
                    val placeholderText = if (charOrNull(i) != ':' || charOrNull(i + 1) != '\'') {
                        arg as? String ?: "xyz"
                    }
                    else {
                        check(arg !is String, "do not specify placeholder text for $$n - plain text argument passed")
                        i += 2 // skip ':' and '\''
                        val endIndex = pattern.indexOf('\'', i)
                        check(endIndex >= 0, "unclosed placeholder text")
                        check(endIndex > i, "empty placeholder text")
                        val text = pattern.substring(i, endIndex)
                        i = endIndex + 1
                        text
                    }

                    append(placeholderText)
                    val range = TextRange(length - placeholderText.length, length)
                    ranges.getOrPut(n, { ArrayList() }).add(Placeholder(range, placeholderText))
                    continue
                }' @ [217:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'nextChar' @ [217:21] ==> val nextChar: Char? defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'append' @ [218:21] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'nextChar' @ [218:28] ==> val nextChar: Char? defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'check' @ [221:21] ==> local final fun check(condition: Boolean, message: String): Unit defined in org.jetbrains.kotlin.psi.processPattern[SimpleFunctionDescriptorImpl]

'nextChar' @ [221:27] ==> val nextChar: Char? defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'isDigit' @ [221:37] ==> @InlineOnly public inline fun Char.isDigit(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'?:' @ [223:37] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Int?, right: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Int

'i' @ [223:38] ==> var i: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'pattern' @ [223:41] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.processPattern[ValueParameterDescriptorImpl]

'length' @ [223:49] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'firstOrNull' @ [223:61] ==> public inline fun <T> Iterable<Int>.firstOrNull(predicate: (Int) -> Boolean): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'!' @ [223:75] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'pattern' @ [223:76] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.processPattern[ValueParameterDescriptorImpl]

'it' @ [223:84] ==> value-parameter it: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isDigit' @ [223:88] ==> @InlineOnly public inline fun Char.isDigit(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pattern' @ [223:103] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.processPattern[ValueParameterDescriptorImpl]

'length' @ [223:111] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'pattern' @ [224:29] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.processPattern[ValueParameterDescriptorImpl]

'substring' @ [224:37] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'i' @ [224:47] ==> var i: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'lastIndex' @ [224:50] ==> val lastIndex: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'toInt' @ [224:61] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'check' @ [225:21] ==> local final fun check(condition: Boolean, message: String): Unit defined in org.jetbrains.kotlin.psi.processPattern[SimpleFunctionDescriptorImpl]

'n' @ [225:27] ==> val n: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'n' @ [225:65] ==> val n: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'i' @ [226:21] ==> var i: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'lastIndex' @ [226:25] ==> val lastIndex: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'if (n < args.size) args[n] else null' @ [228:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'n' @ [228:41] ==> val n: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'args' @ [228:45] ==> value-parameter args: List<Any> defined in org.jetbrains.kotlin.psi.processPattern[ValueParameterDescriptorImpl]

'size' @ [228:50] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'args' @ [228:56] ==> value-parameter args: List<Any> defined in org.jetbrains.kotlin.psi.processPattern[ValueParameterDescriptorImpl]

'n' @ [228:61] ==> val n: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'if (charOrNull(i) != ':' || charOrNull(i + 1) != '\'') {
                        arg as? String ?: "xyz"
                    }
                    else {
                        check(arg !is String, "do not specify placeholder text for $$n - plain text argument passed")
                        i += 2 // skip ':' and '\''
                        val endIndex = pattern.indexOf('\'', i)
                        check(endIndex >= 0, "unclosed placeholder text")
                        check(endIndex > i, "empty placeholder text")
                        val text = pattern.substring(i, endIndex)
                        i = endIndex + 1
                        text
                    }' @ [229:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'charOrNull' @ [229:47] ==> local final fun charOrNull(i: Int): Char? defined in org.jetbrains.kotlin.psi.processPattern[SimpleFunctionDescriptorImpl]

'i' @ [229:58] ==> var i: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'charOrNull' @ [229:71] ==> local final fun charOrNull(i: Int): Char? defined in org.jetbrains.kotlin.psi.processPattern[SimpleFunctionDescriptorImpl]

'i' @ [229:82] ==> var i: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'arg' @ [230:25] ==> val arg: Any? defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'check' @ [233:25] ==> local final fun check(condition: Boolean, message: String): Unit defined in org.jetbrains.kotlin.psi.processPattern[SimpleFunctionDescriptorImpl]

'arg' @ [233:31] ==> val arg: Any? defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'n' @ [233:86] ==> val n: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'i' @ [234:25] ==> var i: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'pattern' @ [235:40] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.processPattern[ValueParameterDescriptorImpl]

'indexOf' @ [235:48] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'i' @ [235:62] ==> var i: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'check' @ [236:25] ==> local final fun check(condition: Boolean, message: String): Unit defined in org.jetbrains.kotlin.psi.processPattern[SimpleFunctionDescriptorImpl]

'endIndex' @ [236:31] ==> val endIndex: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'check' @ [237:25] ==> local final fun check(condition: Boolean, message: String): Unit defined in org.jetbrains.kotlin.psi.processPattern[SimpleFunctionDescriptorImpl]

'endIndex' @ [237:31] ==> val endIndex: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'i' @ [237:42] ==> var i: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'pattern' @ [238:36] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.processPattern[ValueParameterDescriptorImpl]

'substring' @ [238:44] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'i' @ [238:54] ==> var i: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'endIndex' @ [238:57] ==> val endIndex: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'i' @ [239:25] ==> var i: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'endIndex' @ [239:29] ==> val endIndex: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'text' @ [240:25] ==> val text: String defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'append' @ [243:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'placeholderText' @ [243:28] ==> val placeholderText: String defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'TextRange' @ [244:33] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'length' @ [244:43] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'placeholderText' @ [244:52] ==> val placeholderText: String defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'length' @ [244:68] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'length' @ [244:76] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'ranges' @ [245:21] ==> val ranges: LinkedHashMap<Int, MutableList<Placeholder>> defined in org.jetbrains.kotlin.psi.processPattern[LocalVariableDescriptor]

'getOrPut' @ [245:28] ==> public inline fun <K, V> MutableMap<Int, MutableList<Placeholder>>.getOrPut(key: Int, defaultValue: () -> MutableList<Placeholder>): MutableList<Placeholder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> MutableList<Placeholder>

'n' @ [245:37] ==> val n: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'ArrayList' @ [245:42] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Placeholder

'add' @ [245:57] ==> public abstract fun add(element: Placeholder): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'Placeholder' @ [245:61] ==> public constructor Placeholder(range: TextRange, text: String) defined in org.jetbrains.kotlin.psi.Placeholder[ClassConstructorDescriptorImpl]

'range' @ [245:73] ==> val range: TextRange defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'placeholderText' @ [245:80] ==> val placeholderText: String defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'append' @ [250:17] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'c' @ [250:24] ==> val c: Char defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'i' @ [252:13] ==> var i: Int defined in org.jetbrains.kotlin.psi.processPattern.<anonymous>[LocalVariableDescriptor]

'!' @ [256:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ranges' @ [256:10] ==> val ranges: LinkedHashMap<Int, MutableList<Placeholder>> defined in org.jetbrains.kotlin.psi.processPattern[LocalVariableDescriptor]

'isEmpty' @ [256:17] ==> public open fun isEmpty(): Boolean defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'ranges' @ [257:19] ==> val ranges: LinkedHashMap<Int, MutableList<Placeholder>> defined in org.jetbrains.kotlin.psi.processPattern[LocalVariableDescriptor]

'keys' @ [257:26] ==> public open val keys: MutableSet<Int> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'max' @ [257:31] ==> public fun <T : Comparable<Int>> Iterable<Int>.max(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'..' @ [258:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'max' @ [258:22] ==> val max: Int defined in org.jetbrains.kotlin.psi.processPattern[LocalVariableDescriptor]

'check' @ [259:13] ==> local final fun check(condition: Boolean, message: String): Unit defined in org.jetbrains.kotlin.psi.processPattern[SimpleFunctionDescriptorImpl]

'ranges' @ [259:19] ==> val ranges: LinkedHashMap<Int, MutableList<Placeholder>> defined in org.jetbrains.kotlin.psi.processPattern[LocalVariableDescriptor]

'contains' @ [259:26] ==> @InlineOnly public operator inline fun <@OnlyInputTypes K, V> Map<out Int, MutableList<Placeholder>>.contains(key: Int): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> Int
    <V> -> MutableList<Placeholder>

'i' @ [259:35] ==> val i: Int defined in org.jetbrains.kotlin.psi.processPattern[LocalVariableDescriptor]

'i' @ [259:46] ==> val i: Int defined in org.jetbrains.kotlin.psi.processPattern[LocalVariableDescriptor]

'args' @ [263:9] ==> value-parameter args: List<Any> defined in org.jetbrains.kotlin.psi.processPattern[ValueParameterDescriptorImpl]

'size' @ [263:14] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'ranges' @ [263:22] ==> val ranges: LinkedHashMap<Int, MutableList<Placeholder>> defined in org.jetbrains.kotlin.psi.processPattern[LocalVariableDescriptor]

'size' @ [263:29] ==> public open val size: Int defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'IllegalArgumentException' @ [264:15] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'ranges' @ [264:80] ==> val ranges: LinkedHashMap<Int, MutableList<Placeholder>> defined in org.jetbrains.kotlin.psi.processPattern[LocalVariableDescriptor]

'size' @ [264:87] ==> public open val size: Int defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'args' @ [264:104] ==> value-parameter args: List<Any> defined in org.jetbrains.kotlin.psi.processPattern[ValueParameterDescriptorImpl]

'size' @ [264:109] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'PatternData' @ [267:12] ==> public constructor PatternData(processedText: String, placeholders: Map<Int, List<Placeholder>>) defined in org.jetbrains.kotlin.psi.PatternData[ClassConstructorDescriptorImpl]

'text' @ [267:24] ==> val text: String defined in org.jetbrains.kotlin.psi.processPattern[LocalVariableDescriptor]

'ranges' @ [267:30] ==> val ranges: LinkedHashMap<Int, MutableList<Placeholder>> defined in org.jetbrains.kotlin.psi.processPattern[LocalVariableDescriptor]

'StringBuilder' @ [271:34] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'ArrayList' @ [272:29] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Any

'patternBuilder' @ [275:9] ==> private final val patternBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'append' @ [275:24] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'text' @ [275:31] ==> value-parameter text: String defined in org.jetbrains.kotlin.psi.BuilderByPattern.appendFixedText[ValueParameterDescriptorImpl]

'this' @ [276:16] ==> <this> defined in org.jetbrains.kotlin.psi.BuilderByPattern[LazyClassReceiverParameterDescriptor]

'patternBuilder' @ [280:9] ==> private final val patternBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'append' @ [280:24] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'+' @ [280:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arguments' @ [280:37] ==> private final val arguments: ArrayList<Any> defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'size' @ [280:47] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'arguments' @ [281:9] ==> private final val arguments: ArrayList<Any> defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'add' @ [281:19] ==> public open fun add(element: Any): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'text' @ [281:23] ==> value-parameter text: String defined in org.jetbrains.kotlin.psi.BuilderByPattern.appendNonFormattedText[ValueParameterDescriptorImpl]

'this' @ [282:16] ==> <this> defined in org.jetbrains.kotlin.psi.BuilderByPattern[LazyClassReceiverParameterDescriptor]

'expression' @ [286:13] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.psi.BuilderByPattern.appendExpression[ValueParameterDescriptorImpl]

'patternBuilder' @ [287:13] ==> private final val patternBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'append' @ [287:28] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'+' @ [287:35] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arguments' @ [287:41] ==> private final val arguments: ArrayList<Any> defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'size' @ [287:51] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'arguments' @ [288:13] ==> private final val arguments: ArrayList<Any> defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'add' @ [288:23] ==> public open fun add(element: Any): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expression' @ [288:27] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.psi.BuilderByPattern.appendExpression[ValueParameterDescriptorImpl]

'this' @ [290:16] ==> <this> defined in org.jetbrains.kotlin.psi.BuilderByPattern[LazyClassReceiverParameterDescriptor]

'component1' @ [294:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [294:22] ==> public final operator fun component2(): KtExpression? defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'expressions' @ [294:37] ==> value-parameter expressions: Iterable<KtExpression?> defined in org.jetbrains.kotlin.psi.BuilderByPattern.appendExpressions[ValueParameterDescriptorImpl]

'withIndex' @ [294:49] ==> public fun <T> Iterable<KtExpression?>.withIndex(): Iterable<IndexedValue<KtExpression?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression?

'index' @ [295:17] ==> val index: Int defined in org.jetbrains.kotlin.psi.BuilderByPattern.appendExpressions[LocalVariableDescriptor]

'appendFixedText' @ [296:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<TElement> defined in org.jetbrains.kotlin.psi.BuilderByPattern[SimpleFunctionDescriptorImpl]

'separator' @ [296:33] ==> value-parameter separator: String = ... defined in org.jetbrains.kotlin.psi.BuilderByPattern.appendExpressions[ValueParameterDescriptorImpl]

'appendExpression' @ [298:13] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<TElement> defined in org.jetbrains.kotlin.psi.BuilderByPattern[SimpleFunctionDescriptorImpl]

'expression' @ [298:30] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.psi.BuilderByPattern.appendExpressions[LocalVariableDescriptor]

'this' @ [300:16] ==> <this> defined in org.jetbrains.kotlin.psi.BuilderByPattern[LazyClassReceiverParameterDescriptor]

'typeRef' @ [304:13] ==> value-parameter typeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.BuilderByPattern.appendTypeReference[ValueParameterDescriptorImpl]

'patternBuilder' @ [305:13] ==> private final val patternBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'append' @ [305:28] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'+' @ [305:35] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arguments' @ [305:41] ==> private final val arguments: ArrayList<Any> defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'size' @ [305:51] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'arguments' @ [306:13] ==> private final val arguments: ArrayList<Any> defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'add' @ [306:23] ==> public open fun add(element: Any): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'typeRef' @ [306:27] ==> value-parameter typeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.BuilderByPattern.appendTypeReference[ValueParameterDescriptorImpl]

'this' @ [308:16] ==> <this> defined in org.jetbrains.kotlin.psi.BuilderByPattern[LazyClassReceiverParameterDescriptor]

'patternBuilder' @ [312:9] ==> private final val patternBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'append' @ [312:24] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'+' @ [312:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arguments' @ [312:37] ==> private final val arguments: ArrayList<Any> defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'size' @ [312:47] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'arguments' @ [313:9] ==> private final val arguments: ArrayList<Any> defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'add' @ [313:19] ==> public open fun add(element: Any): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'name' @ [313:23] ==> value-parameter name: Name defined in org.jetbrains.kotlin.psi.BuilderByPattern.appendName[ValueParameterDescriptorImpl]

'this' @ [314:16] ==> <this> defined in org.jetbrains.kotlin.psi.BuilderByPattern[LazyClassReceiverParameterDescriptor]

'patternBuilder' @ [318:9] ==> private final val patternBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'append' @ [318:24] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'+' @ [318:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arguments' @ [318:37] ==> private final val arguments: ArrayList<Any> defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'size' @ [318:47] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'arguments' @ [319:9] ==> private final val arguments: ArrayList<Any> defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'add' @ [319:19] ==> public open fun add(element: Any): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'range' @ [319:23] ==> value-parameter range: PsiChildRange defined in org.jetbrains.kotlin.psi.BuilderByPattern.appendChildRange[ValueParameterDescriptorImpl]

'this' @ [320:16] ==> <this> defined in org.jetbrains.kotlin.psi.BuilderByPattern[LazyClassReceiverParameterDescriptor]

'invoke' @ [324:16] ==> public abstract operator fun invoke(p1: String, p2: Array<out Any>): TElement defined in kotlin.Function2[FunctionInvokeDescriptor]

'patternBuilder' @ [324:24] ==> private final val patternBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'toString' @ [324:39] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'arguments' @ [324:51] ==> private final val arguments: ArrayList<Any> defined in org.jetbrains.kotlin.psi.BuilderByPattern[PropertyDescriptorImpl]

'toArray' @ [324:61] ==> public open fun toArray(): (Array<(Any..Any?)>..Array<out (Any..Any?)>?) defined in java.util.ArrayList[JavaMethodDescriptor]

'buildByPattern' @ [329:12] ==> public fun <TElement> buildByPattern(factory: (String, Array<out Any>) -> KtExpression, build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement> -> KtExpression

'this' @ [329:46] ==> <this> defined in org.jetbrains.kotlin.psi.buildExpression[ReceiverParameterDescriptorImpl]

'createExpressionByPattern' @ [329:51] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[SimpleFunctionDescriptorImpl]

'pattern' @ [329:77] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.buildExpression.<anonymous>[ValueParameterDescriptorImpl]

'args' @ [329:87] ==> value-parameter args: Array<out Any> defined in org.jetbrains.kotlin.psi.buildExpression.<anonymous>[ValueParameterDescriptorImpl]

'build' @ [329:96] ==> value-parameter build: BuilderByPattern<KtExpression>.() -> Unit defined in org.jetbrains.kotlin.psi.buildExpression[ValueParameterDescriptorImpl]

'buildByPattern' @ [333:12] ==> public fun <TElement> buildByPattern(factory: (String, Array<out Any>) -> KtValueArgumentList, build: BuilderByPattern<KtValueArgumentList>.() -> Unit): KtValueArgumentList defined in org.jetbrains.kotlin.psi[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement> -> KtValueArgumentList

'this' @ [333:46] ==> <this> defined in org.jetbrains.kotlin.psi.buildValueArgumentList[ReceiverParameterDescriptorImpl]

'createValueArgumentListByPattern' @ [333:51] ==> public fun KtPsiFactory.createValueArgumentListByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtValueArgumentList defined in org.jetbrains.kotlin.psi[SimpleFunctionDescriptorImpl]

'pattern' @ [333:84] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.buildValueArgumentList.<anonymous>[ValueParameterDescriptorImpl]

'args' @ [333:94] ==> value-parameter args: Array<out Any> defined in org.jetbrains.kotlin.psi.buildValueArgumentList.<anonymous>[ValueParameterDescriptorImpl]

'build' @ [333:103] ==> value-parameter build: BuilderByPattern<KtValueArgumentList>.() -> Unit defined in org.jetbrains.kotlin.psi.buildValueArgumentList[ValueParameterDescriptorImpl]

'buildByPattern' @ [337:12] ==> public fun <TElement> buildByPattern(factory: (String, Array<out Any>) -> KtDeclaration, build: BuilderByPattern<KtDeclaration>.() -> Unit): KtDeclaration defined in org.jetbrains.kotlin.psi[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement> -> KtDeclaration

'this' @ [337:46] ==> <this> defined in org.jetbrains.kotlin.psi.buildDeclaration[ReceiverParameterDescriptorImpl]

'createDeclarationByPattern' @ [337:51] ==> public fun <TDeclaration : KtDeclaration> KtPsiFactory.createDeclarationByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtDeclaration defined in org.jetbrains.kotlin.psi[SimpleFunctionDescriptorImpl]
Inferred types:
    <TDeclaration : KtDeclaration> -> KtDeclaration

'pattern' @ [337:78] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.buildDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'args' @ [337:88] ==> value-parameter args: Array<out Any> defined in org.jetbrains.kotlin.psi.buildDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'build' @ [337:97] ==> value-parameter build: BuilderByPattern<KtDeclaration>.() -> Unit defined in org.jetbrains.kotlin.psi.buildDeclaration[ValueParameterDescriptorImpl]

'buildByPattern' @ [341:12] ==> public fun <TElement> buildByPattern(factory: (String, Array<out Any>) -> KtDestructuringDeclaration, build: BuilderByPattern<KtDestructuringDeclaration>.() -> Unit): KtDestructuringDeclaration defined in org.jetbrains.kotlin.psi[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement> -> KtDestructuringDeclaration

'this' @ [341:46] ==> <this> defined in org.jetbrains.kotlin.psi.buildDestructuringDeclaration[ReceiverParameterDescriptorImpl]

'createDestructuringDeclarationByPattern' @ [341:51] ==> public fun KtPsiFactory.createDestructuringDeclarationByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtDestructuringDeclaration defined in org.jetbrains.kotlin.psi[SimpleFunctionDescriptorImpl]

'pattern' @ [341:91] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.psi.buildDestructuringDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'args' @ [341:101] ==> value-parameter args: Array<out Any> defined in org.jetbrains.kotlin.psi.buildDestructuringDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'build' @ [341:110] ==> value-parameter build: BuilderByPattern<KtDestructuringDeclaration>.() -> Unit defined in org.jetbrains.kotlin.psi.buildDestructuringDeclaration[ValueParameterDescriptorImpl]

'BuilderByPattern' @ [345:19] ==> public constructor BuilderByPattern<TElement>() defined in org.jetbrains.kotlin.psi.BuilderByPattern[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement> -> TElement

'builder' @ [346:5] ==> val builder: BuilderByPattern<TElement> defined in org.jetbrains.kotlin.psi.buildByPattern[LocalVariableDescriptor]

'invoke' @ [346:13] ==> public abstract operator fun BuilderByPattern<TElement>.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'builder' @ [347:12] ==> val builder: BuilderByPattern<TElement> defined in org.jetbrains.kotlin.psi.buildByPattern[LocalVariableDescriptor]

'create' @ [347:20] ==> public final fun create(factory: (String, Array<out Any>) -> TElement): TElement defined in org.jetbrains.kotlin.psi.BuilderByPattern[SimpleFunctionDescriptorImpl]

'factory' @ [347:27] ==> value-parameter factory: (String, Array<out Any>) -> TElement defined in org.jetbrains.kotlin.psi.buildByPattern[ValueParameterDescriptorImpl]

