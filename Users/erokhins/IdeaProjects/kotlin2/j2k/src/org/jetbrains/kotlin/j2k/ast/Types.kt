'this' @ [22:30] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.isUnit[ReceiverParameterDescriptorImpl]

'when(this) {
    Nullability.Nullable -> true
    Nullability.NotNull -> false
    Nullability.Default -> !settings.forceNotNullTypes
}' @ [30:59] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [30:64] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.isNullable[ReceiverParameterDescriptorImpl]

'Nullable' @ [31:17] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'NotNull' @ [32:17] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Default' @ [33:17] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'!' @ [33:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'settings' @ [33:29] ==> value-parameter settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.ast.isNullable[ValueParameterDescriptorImpl]

'forceNotNullTypes' @ [33:38] ==> public final var forceNotNullTypes: Boolean defined in org.jetbrains.kotlin.j2k.ConverterSettings[PropertyDescriptorImpl]

'when(this) {
    Mutability.Mutable -> true
    Mutability.NonMutable -> false
    Mutability.Default -> false //TODO: setting?
}' @ [42:57] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [42:62] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.isMutable[ReceiverParameterDescriptorImpl]

'Mutable' @ [43:16] ==> enum entry Mutable defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'NonMutable' @ [44:16] ==> enum entry NonMutable defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'Default' @ [45:16] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'Type' @ [48:95] ==> public constructor Type() defined in org.jetbrains.kotlin.j2k.ast.Type[ClassConstructorDescriptorImpl]

'nullability' @ [49:40] ==> value-parameter nullability: Nullability defined in org.jetbrains.kotlin.j2k.ast.MayBeNullableType.<init>[ValueParameterDescriptorImpl]

'isNullable' @ [49:52] ==> public fun Nullability.isNullable(settings: ConverterSettings): Boolean defined in org.jetbrains.kotlin.j2k.ast in file Types.kt[SimpleFunctionDescriptorImpl]

'settings' @ [49:63] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.ast.MayBeNullableType[PropertyDescriptorImpl]

'if (isNullable) "?" else ""' @ [52:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isNullable' @ [52:21] ==> public open val isNullable: Boolean defined in org.jetbrains.kotlin.j2k.ast.MayBeNullableType[PropertyDescriptorImpl]

'Type' @ [55:30] ==> public constructor Type() defined in org.jetbrains.kotlin.j2k.ast.Type[ClassConstructorDescriptorImpl]

'Element' @ [60:23] ==> public constructor Element() defined in org.jetbrains.kotlin.j2k.ast.Element[ClassConstructorDescriptorImpl]

'this' @ [63:38] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.Type[LazyClassReceiverParameterDescriptor]

'this' @ [65:39] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.Type[LazyClassReceiverParameterDescriptor]

'other' @ [67:49] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.j2k.ast.Type.equals[ValueParameterDescriptorImpl]

'other' @ [67:66] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.j2k.ast.Type.equals[ValueParameterDescriptorImpl]

'canonicalCode' @ [67:72] ==> public fun Element.canonicalCode(): String defined in org.jetbrains.kotlin.j2k.ast in file Element.kt[SimpleFunctionDescriptorImpl]

'this' @ [67:91] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.Type[LazyClassReceiverParameterDescriptor]

'canonicalCode' @ [67:96] ==> public fun Element.canonicalCode(): String defined in org.jetbrains.kotlin.j2k.ast in file Element.kt[SimpleFunctionDescriptorImpl]

'canonicalCode' @ [69:36] ==> public fun Element.canonicalCode(): String defined in org.jetbrains.kotlin.j2k.ast in file Element.kt[SimpleFunctionDescriptorImpl]

'hashCode' @ [69:52] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'canonicalCode' @ [71:39] ==> public fun Element.canonicalCode(): String defined in org.jetbrains.kotlin.j2k.ast in file Element.kt[SimpleFunctionDescriptorImpl]

'NotNullType' @ [74:18] ==> public constructor NotNullType() defined in org.jetbrains.kotlin.j2k.ast.NotNullType[ClassConstructorDescriptorImpl]

'builder' @ [76:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.UnitType.generateCode[ValueParameterDescriptorImpl]

'append' @ [76:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'Type' @ [80:24] ==> public constructor Type() defined in org.jetbrains.kotlin.j2k.ast.Type[ClassConstructorDescriptorImpl]

'builder' @ [82:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ErrorType.generateCode[ValueParameterDescriptorImpl]

'append' @ [82:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'ErrorType' @ [89:18] ==> public constructor ErrorType() defined in org.jetbrains.kotlin.j2k.ast.ErrorType[ClassConstructorDescriptorImpl]

'MayBeNullableType' @ [95:5] ==> public constructor MayBeNullableType(nullability: Nullability, settings: ConverterSettings) defined in org.jetbrains.kotlin.j2k.ast.MayBeNullableType[ClassConstructorDescriptorImpl]

'nullability' @ [95:23] ==> value-parameter nullability: Nullability defined in org.jetbrains.kotlin.j2k.ast.ClassType.<init>[ValueParameterDescriptorImpl]

'settings' @ [95:36] ==> value-parameter settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.ast.ClassType.<init>[ValueParameterDescriptorImpl]

'builder' @ [98:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ClassType.generateCode[ValueParameterDescriptorImpl]

'referenceElement' @ [98:24] ==> public final val referenceElement: ReferenceElement defined in org.jetbrains.kotlin.j2k.ast.ClassType[PropertyDescriptorImpl]

'isNullableStr' @ [98:48] ==> protected final val isNullableStr: String defined in org.jetbrains.kotlin.j2k.ast.ClassType[PropertyDescriptorImpl]

'ClassType' @ [101:42] ==> public constructor ClassType(referenceElement: ReferenceElement, nullability: Nullability, settings: ConverterSettings) defined in org.jetbrains.kotlin.j2k.ast.ClassType[ClassConstructorDescriptorImpl]

'referenceElement' @ [101:52] ==> public final val referenceElement: ReferenceElement defined in org.jetbrains.kotlin.j2k.ast.ClassType[PropertyDescriptorImpl]

'NotNull' @ [101:82] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'settings' @ [101:91] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.ast.ClassType[PropertyDescriptorImpl]

'assignPrototypesFrom' @ [101:101] ==> public fun <TElement : Element> ClassType.assignPrototypesFrom(element: Element, inheritance: CommentsAndSpacesInheritance? = ...): ClassType defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ClassType

'this' @ [101:122] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.ClassType[LazyClassReceiverParameterDescriptor]

'ClassType' @ [102:43] ==> public constructor ClassType(referenceElement: ReferenceElement, nullability: Nullability, settings: ConverterSettings) defined in org.jetbrains.kotlin.j2k.ast.ClassType[ClassConstructorDescriptorImpl]

'referenceElement' @ [102:53] ==> public final val referenceElement: ReferenceElement defined in org.jetbrains.kotlin.j2k.ast.ClassType[PropertyDescriptorImpl]

'Nullable' @ [102:83] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'settings' @ [102:93] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.ast.ClassType[PropertyDescriptorImpl]

'assignPrototypesFrom' @ [102:103] ==> public fun <TElement : Element> ClassType.assignPrototypesFrom(element: Element, inheritance: CommentsAndSpacesInheritance? = ...): ClassType defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ClassType

'this' @ [102:124] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.ClassType[LazyClassReceiverParameterDescriptor]

'referenceElement' @ [104:25] ==> public final val referenceElement: ReferenceElement defined in org.jetbrains.kotlin.j2k.ast.ClassType[PropertyDescriptorImpl]

'name' @ [104:42] ==> public final val name: Identifier defined in org.jetbrains.kotlin.j2k.ast.ReferenceElement[PropertyDescriptorImpl]

'isEmpty' @ [104:47] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Identifier[PropertyDescriptorImpl]

'MayBeNullableType' @ [108:5] ==> public constructor MayBeNullableType(nullability: Nullability, settings: ConverterSettings) defined in org.jetbrains.kotlin.j2k.ast.MayBeNullableType[ClassConstructorDescriptorImpl]

'nullability' @ [108:23] ==> value-parameter nullability: Nullability defined in org.jetbrains.kotlin.j2k.ast.ArrayType.<init>[ValueParameterDescriptorImpl]

'settings' @ [108:36] ==> value-parameter settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.ast.ArrayType.<init>[ValueParameterDescriptorImpl]

'if (elementType is PrimitiveType) {
            builder append elementType append "Array" append isNullableStr
        }
        else {
            builder append "Array<" append elementType append ">" append isNullableStr
        }' @ [111:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CodeBuilder, elseBranch: CodeBuilder): CodeBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CodeBuilder

'elementType' @ [111:13] ==> public final val elementType: Type defined in org.jetbrains.kotlin.j2k.ast.ArrayType[PropertyDescriptorImpl]

'builder' @ [112:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayType.generateCode[ValueParameterDescriptorImpl]

'elementType' @ [112:28] ==> public final val elementType: Type defined in org.jetbrains.kotlin.j2k.ast.ArrayType[PropertyDescriptorImpl]

'isNullableStr' @ [112:62] ==> protected final val isNullableStr: String defined in org.jetbrains.kotlin.j2k.ast.ArrayType[PropertyDescriptorImpl]

'builder' @ [115:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayType.generateCode[ValueParameterDescriptorImpl]

'elementType' @ [115:44] ==> public final val elementType: Type defined in org.jetbrains.kotlin.j2k.ast.ArrayType[PropertyDescriptorImpl]

'isNullableStr' @ [115:74] ==> protected final val isNullableStr: String defined in org.jetbrains.kotlin.j2k.ast.ArrayType[PropertyDescriptorImpl]

'ArrayType' @ [119:42] ==> public constructor ArrayType(elementType: Type, nullability: Nullability, settings: ConverterSettings) defined in org.jetbrains.kotlin.j2k.ast.ArrayType[ClassConstructorDescriptorImpl]

'elementType' @ [119:52] ==> public final val elementType: Type defined in org.jetbrains.kotlin.j2k.ast.ArrayType[PropertyDescriptorImpl]

'NotNull' @ [119:77] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'settings' @ [119:86] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.ast.ArrayType[PropertyDescriptorImpl]

'assignPrototypesFrom' @ [119:96] ==> public fun <TElement : Element> ArrayType.assignPrototypesFrom(element: Element, inheritance: CommentsAndSpacesInheritance? = ...): ArrayType defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ArrayType

'this' @ [119:117] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.ArrayType[LazyClassReceiverParameterDescriptor]

'ArrayType' @ [120:43] ==> public constructor ArrayType(elementType: Type, nullability: Nullability, settings: ConverterSettings) defined in org.jetbrains.kotlin.j2k.ast.ArrayType[ClassConstructorDescriptorImpl]

'elementType' @ [120:53] ==> public final val elementType: Type defined in org.jetbrains.kotlin.j2k.ast.ArrayType[PropertyDescriptorImpl]

'Nullable' @ [120:78] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'settings' @ [120:88] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.ast.ArrayType[PropertyDescriptorImpl]

'assignPrototypesFrom' @ [120:98] ==> public fun <TElement : Element> ArrayType.assignPrototypesFrom(element: Element, inheritance: CommentsAndSpacesInheritance? = ...): ArrayType defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ArrayType

'this' @ [120:119] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.ArrayType[LazyClassReceiverParameterDescriptor]

'NotNullType' @ [123:43] ==> public constructor NotNullType() defined in org.jetbrains.kotlin.j2k.ast.NotNullType[ClassConstructorDescriptorImpl]

'builder' @ [125:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.InProjectionType.generateCode[ValueParameterDescriptorImpl]

'bound' @ [125:37] ==> public final val bound: Type defined in org.jetbrains.kotlin.j2k.ast.InProjectionType[PropertyDescriptorImpl]

'NotNullType' @ [129:44] ==> public constructor NotNullType() defined in org.jetbrains.kotlin.j2k.ast.NotNullType[ClassConstructorDescriptorImpl]

'builder' @ [131:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.OutProjectionType.generateCode[ValueParameterDescriptorImpl]

'bound' @ [131:38] ==> public final val bound: Type defined in org.jetbrains.kotlin.j2k.ast.OutProjectionType[PropertyDescriptorImpl]

'NotNullType' @ [135:28] ==> public constructor NotNullType() defined in org.jetbrains.kotlin.j2k.ast.NotNullType[ClassConstructorDescriptorImpl]

'builder' @ [137:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.StarProjectionType.generateCode[ValueParameterDescriptorImpl]

'append' @ [137:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'NotNullType' @ [141:45] ==> public constructor NotNullType() defined in org.jetbrains.kotlin.j2k.ast.NotNullType[ClassConstructorDescriptorImpl]

'builder' @ [143:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.PrimitiveType.generateCode[ValueParameterDescriptorImpl]

'append' @ [143:17] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'name' @ [143:24] ==> public final val name: Identifier defined in org.jetbrains.kotlin.j2k.ast.PrimitiveType[PropertyDescriptorImpl]

'NotNullType' @ [147:36] ==> public constructor NotNullType() defined in org.jetbrains.kotlin.j2k.ast.NotNullType[ClassConstructorDescriptorImpl]

'builder' @ [149:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.VarArgType.generateCode[ValueParameterDescriptorImpl]

'append' @ [149:17] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'type' @ [149:24] ==> public final val type: Type defined in org.jetbrains.kotlin.j2k.ast.VarArgType[PropertyDescriptorImpl]

