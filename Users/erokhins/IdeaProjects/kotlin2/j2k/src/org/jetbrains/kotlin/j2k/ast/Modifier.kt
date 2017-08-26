'' @ [22:11] ==> private constructor Modifier(str: String) defined in org.jetbrains.kotlin.j2k.ast.Modifier[ClassConstructorDescriptorImpl]

'' @ [23:14] ==> private constructor Modifier(str: String) defined in org.jetbrains.kotlin.j2k.ast.Modifier[ClassConstructorDescriptorImpl]

'' @ [24:12] ==> private constructor Modifier(str: String) defined in org.jetbrains.kotlin.j2k.ast.Modifier[ClassConstructorDescriptorImpl]

'' @ [25:13] ==> private constructor Modifier(str: String) defined in org.jetbrains.kotlin.j2k.ast.Modifier[ClassConstructorDescriptorImpl]

'' @ [26:15] ==> private constructor Modifier(str: String) defined in org.jetbrains.kotlin.j2k.ast.Modifier[ClassConstructorDescriptorImpl]

'' @ [27:13] ==> private constructor Modifier(str: String) defined in org.jetbrains.kotlin.j2k.ast.Modifier[ClassConstructorDescriptorImpl]

'' @ [28:9] ==> private constructor Modifier(str: String) defined in org.jetbrains.kotlin.j2k.ast.Modifier[ClassConstructorDescriptorImpl]

'' @ [29:13] ==> private constructor Modifier(str: String) defined in org.jetbrains.kotlin.j2k.ast.Modifier[ClassConstructorDescriptorImpl]

'' @ [30:13] ==> private constructor Modifier(str: String) defined in org.jetbrains.kotlin.j2k.ast.Modifier[ClassConstructorDescriptorImpl]

'' @ [31:10] ==> private constructor Modifier(str: String) defined in org.jetbrains.kotlin.j2k.ast.Modifier[ClassConstructorDescriptorImpl]

'' @ [32:10] ==> private constructor Modifier(str: String) defined in org.jetbrains.kotlin.j2k.ast.Modifier[ClassConstructorDescriptorImpl]

'str' @ [34:30] ==> private final val str: String defined in org.jetbrains.kotlin.j2k.ast.Modifier[PropertyDescriptorImpl]

'setOf' @ [37:24] ==> public fun <T> setOf(vararg elements: Modifier): Set<Modifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modifier

'PUBLIC' @ [37:39] ==> enum entry PUBLIC defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'PROTECTED' @ [37:56] ==> enum entry PROTECTED defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'PRIVATE' @ [37:76] ==> enum entry PRIVATE defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'INTERNAL' @ [37:94] ==> enum entry INTERNAL defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'Element' @ [39:52] ==> public constructor Element() defined in org.jetbrains.kotlin.j2k.ast.Element[ClassConstructorDescriptorImpl]

'modifiers' @ [40:21] ==> value-parameter modifiers: Collection<Modifier> defined in org.jetbrains.kotlin.j2k.ast.Modifiers.<init>[ValueParameterDescriptorImpl]

'toSet' @ [40:31] ==> public fun <T> Iterable<Modifier>.toSet(): Set<Modifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modifier

'if (modifiers.contains(Modifier.OVERRIDE))
            modifiers // for override members we remove redundant visibility modifiers in post-processing
        else
            modifiers.filter { it != Modifier.PUBLIC }' @ [43:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<Modifier>, elseBranch: Collection<Modifier>): Collection<Modifier>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<Modifier>

'modifiers' @ [43:38] ==> public final val modifiers: Set<Modifier> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[PropertyDescriptorImpl]

'contains' @ [43:48] ==> public abstract fun contains(element: Modifier): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'OVERRIDE' @ [43:66] ==> enum entry OVERRIDE defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'modifiers' @ [44:13] ==> public final val modifiers: Set<Modifier> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[PropertyDescriptorImpl]

'modifiers' @ [46:13] ==> public final val modifiers: Set<Modifier> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[PropertyDescriptorImpl]

'filter' @ [46:23] ==> public inline fun <T> Iterable<Modifier>.filter(predicate: (Modifier) -> Boolean): List<Modifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modifier

'it' @ [46:32] ==> value-parameter it: Modifier defined in org.jetbrains.kotlin.j2k.ast.Modifiers.generateCode.<anonymous>[ValueParameterDescriptorImpl]

'PUBLIC' @ [46:47] ==> enum entry PUBLIC defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'modifiersToInclude' @ [47:20] ==> val modifiersToInclude: Collection<Modifier> defined in org.jetbrains.kotlin.j2k.ast.Modifiers.generateCode[LocalVariableDescriptor]

'sortedBy' @ [48:18] ==> public inline fun <T, R : Comparable<Int>> Iterable<Modifier>.sortedBy(crossinline selector: (Modifier) -> Int?): List<Modifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modifier
    <R : Comparable<R>> -> Int

'it' @ [48:29] ==> value-parameter it: Modifier defined in org.jetbrains.kotlin.j2k.ast.Modifiers.generateCode.<anonymous>[ValueParameterDescriptorImpl]

'ordinal' @ [48:32] ==> public final val ordinal: Int defined in org.jetbrains.kotlin.j2k.ast.Modifier[DeserializedPropertyDescriptor]

'joinToString' @ [49:18] ==> public fun <T> Iterable<Modifier>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Modifier) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modifier

'it' @ [49:38] ==> value-parameter it: Modifier defined in org.jetbrains.kotlin.j2k.ast.Modifiers.generateCode.<anonymous>[ValueParameterDescriptorImpl]

'toKotlin' @ [49:41] ==> public final fun toKotlin(): String defined in org.jetbrains.kotlin.j2k.ast.Modifier[SimpleFunctionDescriptorImpl]

'builder' @ [50:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Modifiers.generateCode[ValueParameterDescriptorImpl]

'append' @ [50:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'text' @ [50:24] ==> val text: String defined in org.jetbrains.kotlin.j2k.ast.Modifiers.generateCode[LocalVariableDescriptor]

'modifiers' @ [54:17] ==> public final val modifiers: Set<Modifier> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[PropertyDescriptorImpl]

'isEmpty' @ [54:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'if (modifier != null) Modifiers(modifiers + listOf(modifier)).assignPrototypesFrom(this) else this' @ [56:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Modifiers, elseBranch: Modifiers): Modifiers[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Modifiers

'modifier' @ [56:52] ==> value-parameter modifier: Modifier? defined in org.jetbrains.kotlin.j2k.ast.Modifiers.with[ValueParameterDescriptorImpl]

'Modifiers' @ [56:70] ==> public constructor Modifiers(modifiers: Collection<Modifier>) defined in org.jetbrains.kotlin.j2k.ast.Modifiers[ClassConstructorDescriptorImpl]

'modifiers' @ [56:80] ==> public final val modifiers: Set<Modifier> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[PropertyDescriptorImpl]

'listOf' @ [56:92] ==> public fun <T> listOf(element: Modifier): List<Modifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modifier

'modifier' @ [56:99] ==> value-parameter modifier: Modifier? defined in org.jetbrains.kotlin.j2k.ast.Modifiers.with[ValueParameterDescriptorImpl]

'assignPrototypesFrom' @ [56:110] ==> public fun <TElement : Element> Modifiers.assignPrototypesFrom(element: Element, inheritance: CommentsAndSpacesInheritance? = ...): Modifiers defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Modifiers

'this' @ [56:131] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[LazyClassReceiverParameterDescriptor]

'this' @ [56:142] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[LazyClassReceiverParameterDescriptor]

'modifier' @ [59:13] ==> value-parameter modifier: Modifier? defined in org.jetbrains.kotlin.j2k.ast.Modifiers.without[ValueParameterDescriptorImpl]

'!' @ [59:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'modifiers' @ [59:34] ==> public final val modifiers: Set<Modifier> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[PropertyDescriptorImpl]

'contains' @ [59:44] ==> public abstract fun contains(element: Modifier): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'modifier' @ [59:53] ==> value-parameter modifier: Modifier? defined in org.jetbrains.kotlin.j2k.ast.Modifiers.without[ValueParameterDescriptorImpl]

'this' @ [59:71] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[LazyClassReceiverParameterDescriptor]

'Modifiers' @ [60:16] ==> public constructor Modifiers(modifiers: Collection<Modifier>) defined in org.jetbrains.kotlin.j2k.ast.Modifiers[ClassConstructorDescriptorImpl]

'modifiers' @ [60:26] ==> public final val modifiers: Set<Modifier> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[PropertyDescriptorImpl]

'filter' @ [60:36] ==> public inline fun <T> Iterable<Modifier>.filter(predicate: (Modifier) -> Boolean): List<Modifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modifier

'it' @ [60:45] ==> value-parameter it: Modifier defined in org.jetbrains.kotlin.j2k.ast.Modifiers.without.<anonymous>[ValueParameterDescriptorImpl]

'modifier' @ [60:51] ==> value-parameter modifier: Modifier? defined in org.jetbrains.kotlin.j2k.ast.Modifiers.without[ValueParameterDescriptorImpl]

'assignPrototypesFrom' @ [60:63] ==> public fun <TElement : Element> Modifiers.assignPrototypesFrom(element: Element, inheritance: CommentsAndSpacesInheritance? = ...): Modifiers defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Modifiers

'this' @ [60:84] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[LazyClassReceiverParameterDescriptor]

'modifiers' @ [63:49] ==> public final val modifiers: Set<Modifier> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[PropertyDescriptorImpl]

'contains' @ [63:59] ==> public abstract fun contains(element: Modifier): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'modifier' @ [63:68] ==> value-parameter modifier: Modifier defined in org.jetbrains.kotlin.j2k.ast.Modifiers.contains[ValueParameterDescriptorImpl]

'contains' @ [65:36] ==> public final fun contains(modifier: Modifier): Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'PRIVATE' @ [65:54] ==> enum entry PRIVATE defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'modifiers' @ [67:39] ==> public final val modifiers: Set<Modifier> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[PropertyDescriptorImpl]

'firstOrNull' @ [67:49] ==> public inline fun <T> Iterable<Modifier>.firstOrNull(predicate: (Modifier) -> Boolean): Modifier? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modifier

'it' @ [67:63] ==> value-parameter it: Modifier defined in org.jetbrains.kotlin.j2k.ast.Modifiers.accessModifier.<anonymous>[ValueParameterDescriptorImpl]

'ACCESS_MODIFIERS' @ [67:69] ==> public val ACCESS_MODIFIERS: Set<Modifier> defined in org.jetbrains.kotlin.j2k.ast in file Modifier.kt[PropertyDescriptorImpl]

'Modifiers' @ [70:16] ==> public constructor Modifiers(modifiers: Collection<Modifier>) defined in org.jetbrains.kotlin.j2k.ast.Modifiers[ClassConstructorDescriptorImpl]

'this' @ [70:26] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[LazyClassReceiverParameterDescriptor]

'modifiers' @ [70:31] ==> public final val modifiers: Set<Modifier> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[PropertyDescriptorImpl]

'other' @ [70:43] ==> value-parameter other: Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers.plus[ValueParameterDescriptorImpl]

'modifiers' @ [70:49] ==> public final val modifiers: Set<Modifier> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[PropertyDescriptorImpl]

'assignPrototypesFrom' @ [70:60] ==> public fun <TElement : Element> Modifiers.assignPrototypesFrom(element: Element, inheritance: CommentsAndSpacesInheritance? = ...): Modifiers defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Modifiers

'this' @ [70:81] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[LazyClassReceiverParameterDescriptor]

'Modifiers' @ [74:21] ==> public constructor Modifiers(modifiers: Collection<Modifier>) defined in org.jetbrains.kotlin.j2k.ast.Modifiers[ClassConstructorDescriptorImpl]

'listOf' @ [74:31] ==> @InlineOnly public inline fun <T> listOf(): List<Modifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modifier

'Modifiers' @ [79:11] ==> public constructor Modifiers(modifiers: Collection<Modifier>) defined in org.jetbrains.kotlin.j2k.ast.Modifiers[ClassConstructorDescriptorImpl]

'modifiers' @ [79:21] ==> public final val modifiers: Set<Modifier> defined in org.jetbrains.kotlin.j2k.ast.Modifiers[PropertyDescriptorImpl]

'filter' @ [79:31] ==> public inline fun <T> Iterable<Modifier>.filter(predicate: (Modifier) -> Boolean): List<Modifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modifier

'predicate' @ [79:38] ==> value-parameter predicate: (Modifier) -> Boolean defined in org.jetbrains.kotlin.j2k.ast.filter[ValueParameterDescriptorImpl]

'assignPrototypesFrom' @ [79:50] ==> public fun <TElement : Element> Modifiers.assignPrototypesFrom(element: Element, inheritance: CommentsAndSpacesInheritance? = ...): Modifiers defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Modifiers

'this' @ [79:71] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.filter[ReceiverParameterDescriptorImpl]

'!' @ [82:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'modifiers' @ [82:10] ==> value-parameter modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.ast.appendWithSpaceAfter[ValueParameterDescriptorImpl]

'isEmpty' @ [82:20] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[PropertyDescriptorImpl]

'this' @ [83:9] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.appendWithSpaceAfter[ReceiverParameterDescriptorImpl]

'modifiers' @ [83:21] ==> value-parameter modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.ast.appendWithSpaceAfter[ValueParameterDescriptorImpl]

'this' @ [85:12] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.appendWithSpaceAfter[ReceiverParameterDescriptorImpl]

