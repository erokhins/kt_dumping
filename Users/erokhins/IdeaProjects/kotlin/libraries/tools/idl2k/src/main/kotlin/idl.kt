'WebIDLBaseVisitor<List<Attribute>>' @ [61:73] ==> public constructor WebIDLBaseVisitor<T : (Any..Any?)>() defined in org.antlr.webidl.WebIDLBaseVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<Attribute>

'ArrayList' @ [62:29] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Attribute

'arguments' @ [64:53] ==> private final val arguments: ArrayList<Attribute> defined in org.jetbrains.idl2k.ExtendedAttributeArgumentsParser[PropertyDescriptorImpl]

'AttributeVisitor' @ [67:32] ==> public constructor AttributeVisitor(readOnly: Boolean = ..., static: Boolean = ..., namespace: String) defined in org.jetbrains.idl2k.AttributeVisitor[ClassConstructorDescriptorImpl]

'namespace' @ [67:61] ==> private final val namespace: String defined in org.jetbrains.idl2k.ExtendedAttributeArgumentsParser[PropertyDescriptorImpl]

'attributeVisitor' @ [68:9] ==> val attributeVisitor: AttributeVisitor defined in org.jetbrains.idl2k.ExtendedAttributeArgumentsParser.visitOptionalOrRequiredArgument[LocalVariableDescriptor]

'visit' @ [68:26] ==> public open fun visit(p0: (ParseTree..ParseTree?)): (Attribute..Attribute?) defined in org.jetbrains.idl2k.AttributeVisitor[JavaMethodDescriptor]

'ctx' @ [68:32] ==> value-parameter ctx: WebIDLParser.OptionalOrRequiredArgumentContext defined in org.jetbrains.idl2k.ExtendedAttributeArgumentsParser.visitOptionalOrRequiredArgument[ValueParameterDescriptorImpl]

'attributeVisitor' @ [69:25] ==> val attributeVisitor: AttributeVisitor defined in org.jetbrains.idl2k.ExtendedAttributeArgumentsParser.visitOptionalOrRequiredArgument[LocalVariableDescriptor]

'visitChildren' @ [69:42] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Attribute..Attribute?) defined in org.jetbrains.idl2k.AttributeVisitor[JavaMethodDescriptor]

'ctx' @ [69:56] ==> value-parameter ctx: WebIDLParser.OptionalOrRequiredArgumentContext defined in org.jetbrains.idl2k.ExtendedAttributeArgumentsParser.visitOptionalOrRequiredArgument[ValueParameterDescriptorImpl]

'arguments' @ [71:9] ==> private final val arguments: ArrayList<Attribute> defined in org.jetbrains.idl2k.ExtendedAttributeArgumentsParser[PropertyDescriptorImpl]

'add' @ [71:19] ==> public open fun add(element: Attribute): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'parameter' @ [71:23] ==> val parameter: (Attribute..Attribute?) defined in org.jetbrains.idl2k.ExtendedAttributeArgumentsParser.visitOptionalOrRequiredArgument[LocalVariableDescriptor]

'visitChildren' @ [73:9] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (List<Attribute>..List<Attribute>?) defined in org.jetbrains.idl2k.ExtendedAttributeArgumentsParser[JavaMethodDescriptor]

'ctx' @ [73:23] ==> value-parameter ctx: WebIDLParser.OptionalOrRequiredArgumentContext defined in org.jetbrains.idl2k.ExtendedAttributeArgumentsParser.visitOptionalOrRequiredArgument[ValueParameterDescriptorImpl]

'defaultResult' @ [74:16] ==> protected open fun defaultResult(): List<Attribute> defined in org.jetbrains.idl2k.ExtendedAttributeArgumentsParser[SimpleFunctionDescriptorImpl]

'WebIDLBaseVisitor<ExtendedAttribute>' @ [82:64] ==> public constructor WebIDLBaseVisitor<T : (Any..Any?)>() defined in org.antlr.webidl.WebIDLBaseVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ExtendedAttribute

'ArrayList' @ [85:29] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Attribute

'ExtendedAttribute' @ [87:55] ==> public constructor ExtendedAttribute(name: String?, call: String, arguments: List<Attribute>) defined in org.jetbrains.idl2k.ExtendedAttribute[ClassConstructorDescriptorImpl]

'name' @ [87:73] ==> private final var name: String? defined in org.jetbrains.idl2k.ExtendedAttributeParser[PropertyDescriptorImpl]

'call' @ [87:79] ==> private final var call: String defined in org.jetbrains.idl2k.ExtendedAttributeParser[PropertyDescriptorImpl]

'arguments' @ [87:85] ==> private final val arguments: ArrayList<Attribute> defined in org.jetbrains.idl2k.ExtendedAttributeParser[PropertyDescriptorImpl]

'call' @ [90:9] ==> private final var call: String defined in org.jetbrains.idl2k.ExtendedAttributeParser[PropertyDescriptorImpl]

'ctx' @ [90:16] ==> value-parameter ctx: WebIDLParser.ExtendedAttributeContext defined in org.jetbrains.idl2k.ExtendedAttributeParser.visitExtendedAttribute[ValueParameterDescriptorImpl]

'children' @ [90:20] ==> public final var children: (MutableList<(ParseTree..ParseTree?)>..List<(ParseTree..ParseTree?)>?) defined in org.antlr.webidl.WebIDLParser.ExtendedAttributeContext[JavaPropertyDescriptor]

'filterIdentifiers' @ [90:29] ==> private fun List<ParseTree>?.filterIdentifiers(): List<ParseTree> defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [90:49] ==> public fun <T> List<ParseTree>.firstOrNull(): ParseTree? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParseTree

'text' @ [90:64] ==> public final val ParseTree.text: (String..String?)[MyPropertyDescriptor]

'visitChildren' @ [92:9] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (ExtendedAttribute..ExtendedAttribute?) defined in org.jetbrains.idl2k.ExtendedAttributeParser[JavaMethodDescriptor]

'ctx' @ [92:23] ==> value-parameter ctx: WebIDLParser.ExtendedAttributeContext defined in org.jetbrains.idl2k.ExtendedAttributeParser.visitExtendedAttribute[ValueParameterDescriptorImpl]

'defaultResult' @ [93:16] ==> protected open fun defaultResult(): ExtendedAttribute defined in org.jetbrains.idl2k.ExtendedAttributeParser[SimpleFunctionDescriptorImpl]

'arguments' @ [97:9] ==> private final val arguments: ArrayList<Attribute> defined in org.jetbrains.idl2k.ExtendedAttributeParser[PropertyDescriptorImpl]

'addAll' @ [97:19] ==> public open fun addAll(elements: Collection<Attribute>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ExtendedAttributeArgumentsParser' @ [97:26] ==> public constructor ExtendedAttributeArgumentsParser(namespace: String) defined in org.jetbrains.idl2k.ExtendedAttributeArgumentsParser[ClassConstructorDescriptorImpl]

'namespace' @ [97:59] ==> private final val namespace: String defined in org.jetbrains.idl2k.ExtendedAttributeParser[PropertyDescriptorImpl]

'visitChildren' @ [97:70] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (List<Attribute>..List<Attribute>?) defined in org.jetbrains.idl2k.ExtendedAttributeArgumentsParser[JavaMethodDescriptor]

'ctx' @ [97:84] ==> value-parameter ctx: WebIDLParser.ArgumentListContext defined in org.jetbrains.idl2k.ExtendedAttributeParser.visitArgumentList[ValueParameterDescriptorImpl]

'defaultResult' @ [98:16] ==> protected open fun defaultResult(): ExtendedAttribute defined in org.jetbrains.idl2k.ExtendedAttributeParser[SimpleFunctionDescriptorImpl]

'WebIDLBaseVisitor<Unit>' @ [102:18] ==> public constructor WebIDLBaseVisitor<T : (Any..Any?)>() defined in org.antlr.webidl.WebIDLBaseVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'node' @ [104:21] ==> value-parameter node: TerminalNode defined in org.jetbrains.idl2k.ExtendedAttributeParser.visitIdentifierList.<no name provided>.visitTerminal[ValueParameterDescriptorImpl]

'symbol' @ [104:26] ==> public final val TerminalNode.symbol: (Token..Token?)[MyPropertyDescriptor]

'type' @ [104:33] ==> public final val Token.type: Int[MyPropertyDescriptor]

'IDENTIFIER_WEBIDL' @ [104:53] ==> public const final val IDENTIFIER_WEBIDL: Int defined in org.antlr.webidl.WebIDLLexer[JavaPropertyDescriptor]

'arguments' @ [105:21] ==> private final val arguments: ArrayList<Attribute> defined in org.jetbrains.idl2k.ExtendedAttributeParser[PropertyDescriptorImpl]

'add' @ [105:31] ==> public open fun add(element: Attribute): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Attribute' @ [105:35] ==> public constructor Attribute(name: String, type: Type, readOnly: Boolean = ..., defaultValue: String? = ..., vararg: Boolean, static: Boolean, required: Boolean) defined in org.jetbrains.idl2k.Attribute[ClassConstructorDescriptorImpl]

'node' @ [105:45] ==> value-parameter node: TerminalNode defined in org.jetbrains.idl2k.ExtendedAttributeParser.visitIdentifierList.<no name provided>.visitTerminal[ValueParameterDescriptorImpl]

'text' @ [105:50] ==> public final val TerminalNode.text: (String..String?)[MyPropertyDescriptor]

'AnyType' @ [105:56] ==> public constructor AnyType(nullable: Boolean = ...) defined in org.jetbrains.idl2k.AnyType[ClassConstructorDescriptorImpl]

'visitChildren' @ [108:11] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Unit..Unit?) defined in org.jetbrains.idl2k.ExtendedAttributeParser.visitIdentifierList.<no name provided>[JavaMethodDescriptor]

'ctx' @ [108:25] ==> value-parameter ctx: WebIDLParser.IdentifierListContext defined in org.jetbrains.idl2k.ExtendedAttributeParser.visitIdentifierList[ValueParameterDescriptorImpl]

'defaultResult' @ [110:16] ==> protected open fun defaultResult(): ExtendedAttribute defined in org.jetbrains.idl2k.ExtendedAttributeParser[SimpleFunctionDescriptorImpl]

'name' @ [114:9] ==> private final var name: String? defined in org.jetbrains.idl2k.ExtendedAttributeParser[PropertyDescriptorImpl]

'getName' @ [114:16] ==> private fun getName(ctx: ParserRuleContext): (String..String?) defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'ctx' @ [114:24] ==> value-parameter ctx: WebIDLParser.ExtendedAttributeNamePartContext defined in org.jetbrains.idl2k.ExtendedAttributeParser.visitExtendedAttributeNamePart[ValueParameterDescriptorImpl]

'defaultResult' @ [115:16] ==> protected open fun defaultResult(): ExtendedAttribute defined in org.jetbrains.idl2k.ExtendedAttributeParser[SimpleFunctionDescriptorImpl]

'WebIDLBaseVisitor<List<Type>>' @ [119:49] ==> public constructor WebIDLBaseVisitor<T : (Any..Any?)>() defined in org.antlr.webidl.WebIDLBaseVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<Type>

'ArrayList' @ [120:16] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Type

'list' @ [122:36] ==> public final val list: ArrayList<Type> defined in org.jetbrains.idl2k.UnionTypeVisitor[PropertyDescriptorImpl]

'list' @ [125:9] ==> public final val list: ArrayList<Type> defined in org.jetbrains.idl2k.UnionTypeVisitor[PropertyDescriptorImpl]

'add' @ [125:14] ==> public open fun add(element: Type): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'TypeVisitor' @ [125:18] ==> public constructor TypeVisitor(namespace: String) defined in org.jetbrains.idl2k.TypeVisitor[ClassConstructorDescriptorImpl]

'namespace' @ [125:30] ==> public final val namespace: String defined in org.jetbrains.idl2k.UnionTypeVisitor[PropertyDescriptorImpl]

'visitChildren' @ [125:41] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Type..Type?) defined in org.jetbrains.idl2k.TypeVisitor[JavaMethodDescriptor]

'ctx' @ [125:55] ==> value-parameter ctx: WebIDLParser.UnionMemberTypeContext defined in org.jetbrains.idl2k.UnionTypeVisitor.visitUnionMemberType[ValueParameterDescriptorImpl]

'list' @ [127:16] ==> public final val list: ArrayList<Type> defined in org.jetbrains.idl2k.UnionTypeVisitor[PropertyDescriptorImpl]

'WebIDLBaseVisitor<Type>' @ [131:44] ==> public constructor WebIDLBaseVisitor<T : (Any..Any?)>() defined in org.antlr.webidl.WebIDLBaseVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Type

'AnyType' @ [132:30] ==> public constructor AnyType(nullable: Boolean = ...) defined in org.jetbrains.idl2k.AnyType[ClassConstructorDescriptorImpl]

'type' @ [135:36] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'type' @ [138:9] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'super' @ [138:16] ==> <this> defined in org.jetbrains.idl2k.TypeVisitor[LazyClassReceiverParameterDescriptor]

'visitType' @ [138:22] ==> @Override public open fun visitType(ctx: (WebIDLParser.TypeContext..WebIDLParser.TypeContext?)): (Type..Type?) defined in org.antlr.webidl.WebIDLBaseVisitor[JavaMethodDescriptor]

'ctx' @ [138:32] ==> value-parameter ctx: WebIDLParser.TypeContext? defined in org.jetbrains.idl2k.TypeVisitor.visitType[ValueParameterDescriptorImpl]

'type' @ [139:16] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'awaitingSimpleType' @ [143:9] ==> private final var awaitingSimpleType: Boolean defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'type' @ [144:9] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'super' @ [144:16] ==> <this> defined in org.jetbrains.idl2k.TypeVisitor[LazyClassReceiverParameterDescriptor]

'visitReturnType' @ [144:22] ==> @Override public open fun visitReturnType(ctx: (WebIDLParser.ReturnTypeContext..WebIDLParser.ReturnTypeContext?)): (Type..Type?) defined in org.antlr.webidl.WebIDLBaseVisitor[JavaMethodDescriptor]

'ctx' @ [144:38] ==> value-parameter ctx: WebIDLParser.ReturnTypeContext? defined in org.jetbrains.idl2k.TypeVisitor.visitReturnType[ValueParameterDescriptorImpl]

'type' @ [145:16] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'awaitingSimpleType' @ [149:9] ==> private final var awaitingSimpleType: Boolean defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'type' @ [150:9] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'super' @ [150:16] ==> <this> defined in org.jetbrains.idl2k.TypeVisitor[LazyClassReceiverParameterDescriptor]

'visitNonAnyType' @ [150:22] ==> @Override public open fun visitNonAnyType(ctx: (WebIDLParser.NonAnyTypeContext..WebIDLParser.NonAnyTypeContext?)): (Type..Type?) defined in org.antlr.webidl.WebIDLBaseVisitor[JavaMethodDescriptor]

'ctx' @ [150:38] ==> value-parameter ctx: WebIDLParser.NonAnyTypeContext defined in org.jetbrains.idl2k.TypeVisitor.visitNonAnyType[ValueParameterDescriptorImpl]

'type' @ [151:16] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'type' @ [155:9] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'UnionType' @ [155:16] ==> public constructor UnionType(namespace: String, types: Collection<Type>, nullable: Boolean) defined in org.jetbrains.idl2k.UnionType[ClassConstructorDescriptorImpl]

'namespace' @ [155:26] ==> public final val namespace: String defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'UnionTypeVisitor' @ [155:37] ==> public constructor UnionTypeVisitor(namespace: String) defined in org.jetbrains.idl2k.UnionTypeVisitor[ClassConstructorDescriptorImpl]

'namespace' @ [155:54] ==> public final val namespace: String defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'visitChildren' @ [155:65] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (List<Type>..List<Type>?) defined in org.jetbrains.idl2k.UnionTypeVisitor[JavaMethodDescriptor]

'ctx' @ [155:79] ==> value-parameter ctx: WebIDLParser.UnionTypeContext defined in org.jetbrains.idl2k.TypeVisitor.visitUnionType[ValueParameterDescriptorImpl]

'type' @ [156:16] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'type' @ [160:9] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'PromiseType' @ [160:16] ==> public constructor PromiseType(valueType: Type, nullable: Boolean) defined in org.jetbrains.idl2k.PromiseType[ClassConstructorDescriptorImpl]

'TypeVisitor' @ [160:28] ==> public constructor TypeVisitor(namespace: String) defined in org.jetbrains.idl2k.TypeVisitor[ClassConstructorDescriptorImpl]

'namespace' @ [160:40] ==> public final val namespace: String defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'visitChildren' @ [160:51] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Type..Type?) defined in org.jetbrains.idl2k.TypeVisitor[JavaMethodDescriptor]

'ctx' @ [160:65] ==> value-parameter ctx: WebIDLParser.PromiseTypeContext defined in org.jetbrains.idl2k.TypeVisitor.visitPromiseType[ValueParameterDescriptorImpl]

'type' @ [161:16] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'ctx' @ [165:23] ==> value-parameter ctx: WebIDLParser.SequenceTypeContext defined in org.jetbrains.idl2k.TypeVisitor.visitSequenceType[ValueParameterDescriptorImpl]

'getChild' @ [165:27] ==> public open fun getChild(p0: Int): (ParseTree..ParseTree?) defined in org.antlr.webidl.WebIDLParser.SequenceTypeContext[JavaMethodDescriptor]

'text' @ [165:39] ==> public final val ParseTree.text: (String..String?)[MyPropertyDescriptor]

'type' @ [166:9] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'ArrayType' @ [166:16] ==> public constructor ArrayType(memberType: Type, mutable: Boolean, nullable: Boolean) defined in org.jetbrains.idl2k.ArrayType[ClassConstructorDescriptorImpl]

'TypeVisitor' @ [166:26] ==> public constructor TypeVisitor(namespace: String) defined in org.jetbrains.idl2k.TypeVisitor[ClassConstructorDescriptorImpl]

'namespace' @ [166:38] ==> public final val namespace: String defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'visitChildren' @ [166:49] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Type..Type?) defined in org.jetbrains.idl2k.TypeVisitor[JavaMethodDescriptor]

'ctx' @ [166:63] ==> value-parameter ctx: WebIDLParser.SequenceTypeContext defined in org.jetbrains.idl2k.TypeVisitor.visitSequenceType[ValueParameterDescriptorImpl]

'mutable' @ [166:79] ==> val mutable: Boolean defined in org.jetbrains.idl2k.TypeVisitor.visitSequenceType[LocalVariableDescriptor]

'type' @ [167:16] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'when (ctx.text?.trim()) {
            "?" -> type = type.toNullable()
            "[]" -> type = ArrayType(type, mutable = true, nullable = false)
            "[]?" -> type = ArrayType(type, mutable = true, nullable = false)
            "?[]" -> type = ArrayType(type.toNullable(), mutable = true, nullable = false)
        }' @ [171:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'ctx' @ [171:15] ==> value-parameter ctx: WebIDLParser.TypeSuffixContext defined in org.jetbrains.idl2k.TypeVisitor.visitTypeSuffix[ValueParameterDescriptorImpl]

'text' @ [171:19] ==> public final val WebIDLParser.TypeSuffixContext.text: (String..String?)[MyPropertyDescriptor]

'trim' @ [171:25] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'type' @ [172:20] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'type' @ [172:27] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'toNullable' @ [172:32] ==> public fun <T : Type> Type.toNullable(): Type defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Type> -> Type

'type' @ [173:21] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'ArrayType' @ [173:28] ==> public constructor ArrayType(memberType: Type, mutable: Boolean, nullable: Boolean) defined in org.jetbrains.idl2k.ArrayType[ClassConstructorDescriptorImpl]

'type' @ [173:38] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'type' @ [174:22] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'ArrayType' @ [174:29] ==> public constructor ArrayType(memberType: Type, mutable: Boolean, nullable: Boolean) defined in org.jetbrains.idl2k.ArrayType[ClassConstructorDescriptorImpl]

'type' @ [174:39] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'type' @ [175:22] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'ArrayType' @ [175:29] ==> public constructor ArrayType(memberType: Type, mutable: Boolean, nullable: Boolean) defined in org.jetbrains.idl2k.ArrayType[ClassConstructorDescriptorImpl]

'type' @ [175:39] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'toNullable' @ [175:44] ==> public fun <T : Type> Type.toNullable(): Type defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Type> -> Type

'type' @ [178:16] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'ctx' @ [182:13] ==> value-parameter ctx: WebIDLParser.Null_Context defined in org.jetbrains.idl2k.TypeVisitor.visitNull_[ValueParameterDescriptorImpl]

'text' @ [182:17] ==> public final val WebIDLParser.Null_Context.text: (String..String?)[MyPropertyDescriptor]

'trim' @ [182:23] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'type' @ [183:13] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'type' @ [183:20] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'toNullable' @ [183:25] ==> public fun <T : Type> Type.toNullable(): Type defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Type> -> Type

'type' @ [185:16] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'awaitingSimpleType' @ [189:13] ==> private final var awaitingSimpleType: Boolean defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'type' @ [190:13] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'SimpleType' @ [190:20] ==> public constructor SimpleType(type: String, nullable: Boolean) defined in org.jetbrains.idl2k.SimpleType[ClassConstructorDescriptorImpl]

'node' @ [190:31] ==> value-parameter node: TerminalNode defined in org.jetbrains.idl2k.TypeVisitor.visitTerminal[ValueParameterDescriptorImpl]

'text' @ [190:36] ==> public final val TerminalNode.text: (String..String?)[MyPropertyDescriptor]

'awaitingSimpleType' @ [191:13] ==> private final var awaitingSimpleType: Boolean defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'type' @ [193:16] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'awaitingSimpleType' @ [197:9] ==> private final var awaitingSimpleType: Boolean defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'type' @ [198:9] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'super' @ [198:16] ==> <this> defined in org.jetbrains.idl2k.TypeVisitor[LazyClassReceiverParameterDescriptor]

'visitUnsignedIntegerType' @ [198:22] ==> @Override public open fun visitUnsignedIntegerType(ctx: (WebIDLParser.UnsignedIntegerTypeContext..WebIDLParser.UnsignedIntegerTypeContext?)): (Type..Type?) defined in org.antlr.webidl.WebIDLBaseVisitor[JavaMethodDescriptor]

'ctx' @ [198:47] ==> value-parameter ctx: WebIDLParser.UnsignedIntegerTypeContext defined in org.jetbrains.idl2k.TypeVisitor.visitUnsignedIntegerType[ValueParameterDescriptorImpl]

'type' @ [199:16] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'awaitingSimpleType' @ [203:9] ==> private final var awaitingSimpleType: Boolean defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'type' @ [204:9] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'super' @ [204:16] ==> <this> defined in org.jetbrains.idl2k.TypeVisitor[LazyClassReceiverParameterDescriptor]

'visitUnrestrictedFloatType' @ [204:22] ==> @Override public open fun visitUnrestrictedFloatType(ctx: (WebIDLParser.UnrestrictedFloatTypeContext..WebIDLParser.UnrestrictedFloatTypeContext?)): (Type..Type?) defined in org.antlr.webidl.WebIDLBaseVisitor[JavaMethodDescriptor]

'ctx' @ [204:49] ==> value-parameter ctx: WebIDLParser.UnrestrictedFloatTypeContext defined in org.jetbrains.idl2k.TypeVisitor.visitUnrestrictedFloatType[ValueParameterDescriptorImpl]

'type' @ [205:16] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'type' @ [209:9] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'SimpleType' @ [209:16] ==> public constructor SimpleType(type: String, nullable: Boolean) defined in org.jetbrains.idl2k.SimpleType[ClassConstructorDescriptorImpl]

'ctx' @ [209:27] ==> value-parameter ctx: WebIDLParser.FloatTypeContext defined in org.jetbrains.idl2k.TypeVisitor.visitFloatType[ValueParameterDescriptorImpl]

'text' @ [209:31] ==> public final val WebIDLParser.FloatTypeContext.text: (String..String?)[MyPropertyDescriptor]

'type' @ [210:16] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'type' @ [214:9] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'SimpleType' @ [214:16] ==> public constructor SimpleType(type: String, nullable: Boolean) defined in org.jetbrains.idl2k.SimpleType[ClassConstructorDescriptorImpl]

'ctx' @ [214:27] ==> value-parameter ctx: WebIDLParser.IntegerTypeContext defined in org.jetbrains.idl2k.TypeVisitor.visitIntegerType[ValueParameterDescriptorImpl]

'text' @ [214:31] ==> public final val WebIDLParser.IntegerTypeContext.text: (String..String?)[MyPropertyDescriptor]

'type' @ [215:16] ==> private final var type: Type defined in org.jetbrains.idl2k.TypeVisitor[PropertyDescriptorImpl]

'WebIDLBaseVisitor<Operation>' @ [219:135] ==> public constructor WebIDLBaseVisitor<T : (Any..Any?)>() defined in org.antlr.webidl.WebIDLBaseVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Operation

'UnitType' @ [221:36] ==> public object UnitType : Type defined in org.jetbrains.idl2k in file types.kt[FakeCallableDescriptorForObject]

'ArrayList' @ [222:30] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Attribute

'ArrayList' @ [223:24] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ExtendedAttribute

'Operation' @ [225:36] ==> public constructor Operation(name: String, returnType: Type, parameters: List<Attribute>, attributes: List<ExtendedAttribute>, static: Boolean) defined in org.jetbrains.idl2k.Operation[ClassConstructorDescriptorImpl]

'name' @ [225:46] ==> private final var name: String defined in org.jetbrains.idl2k.OperationVisitor[PropertyDescriptorImpl]

'returnType' @ [225:52] ==> private final var returnType: Type defined in org.jetbrains.idl2k.OperationVisitor[PropertyDescriptorImpl]

'parameters' @ [225:64] ==> private final val parameters: ArrayList<Attribute> defined in org.jetbrains.idl2k.OperationVisitor[PropertyDescriptorImpl]

'attributes' @ [225:76] ==> private final val attributes: List<ExtendedAttribute> defined in org.jetbrains.idl2k.OperationVisitor[PropertyDescriptorImpl]

'exts' @ [225:89] ==> private final val exts: ArrayList<ExtendedAttribute> defined in org.jetbrains.idl2k.OperationVisitor[PropertyDescriptorImpl]

'static' @ [225:95] ==> private final val static: Boolean defined in org.jetbrains.idl2k.OperationVisitor[PropertyDescriptorImpl]

'name' @ [228:9] ==> private final var name: String defined in org.jetbrains.idl2k.OperationVisitor[PropertyDescriptorImpl]

'ctx' @ [228:16] ==> value-parameter ctx: WebIDLParser.OptionalIdentifierContext defined in org.jetbrains.idl2k.OperationVisitor.visitOptionalIdentifier[ValueParameterDescriptorImpl]

'text' @ [228:20] ==> public final val WebIDLParser.OptionalIdentifierContext.text: (String..String?)[MyPropertyDescriptor]

'defaultResult' @ [229:16] ==> protected open fun defaultResult(): Operation defined in org.jetbrains.idl2k.OperationVisitor[SimpleFunctionDescriptorImpl]

'ctx' @ [233:13] ==> value-parameter ctx: WebIDLParser.SpecialContext defined in org.jetbrains.idl2k.OperationVisitor.visitSpecial[ValueParameterDescriptorImpl]

'children' @ [233:17] ==> public final var children: (MutableList<(ParseTree..ParseTree?)>..List<(ParseTree..ParseTree?)>?) defined in org.antlr.webidl.WebIDLParser.SpecialContext[JavaPropertyDescriptor]

'exts' @ [234:13] ==> private final val exts: ArrayList<ExtendedAttribute> defined in org.jetbrains.idl2k.OperationVisitor[PropertyDescriptorImpl]

'add' @ [234:18] ==> public open fun add(element: ExtendedAttribute): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ExtendedAttribute' @ [234:22] ==> public constructor ExtendedAttribute(name: String?, call: String, arguments: List<Attribute>) defined in org.jetbrains.idl2k.ExtendedAttribute[ClassConstructorDescriptorImpl]

'ctx' @ [234:47] ==> value-parameter ctx: WebIDLParser.SpecialContext defined in org.jetbrains.idl2k.OperationVisitor.visitSpecial[ValueParameterDescriptorImpl]

'text' @ [234:51] ==> public final val WebIDLParser.SpecialContext.text: (String..String?)[MyPropertyDescriptor]

'emptyList' @ [234:82] ==> public fun <T> emptyList(): List<Attribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Attribute

'defaultResult' @ [237:16] ==> protected open fun defaultResult(): Operation defined in org.jetbrains.idl2k.OperationVisitor[SimpleFunctionDescriptorImpl]

'returnType' @ [241:9] ==> private final var returnType: Type defined in org.jetbrains.idl2k.OperationVisitor[PropertyDescriptorImpl]

'TypeVisitor' @ [241:22] ==> public constructor TypeVisitor(namespace: String) defined in org.jetbrains.idl2k.TypeVisitor[ClassConstructorDescriptorImpl]

'namespace' @ [241:34] ==> private final val namespace: String defined in org.jetbrains.idl2k.OperationVisitor[PropertyDescriptorImpl]

'visit' @ [241:45] ==> public open fun visit(p0: (ParseTree..ParseTree?)): (Type..Type?) defined in org.jetbrains.idl2k.TypeVisitor[JavaMethodDescriptor]

'ctx' @ [241:51] ==> value-parameter ctx: WebIDLParser.ReturnTypeContext defined in org.jetbrains.idl2k.OperationVisitor.visitReturnType[ValueParameterDescriptorImpl]

'defaultResult' @ [242:16] ==> protected open fun defaultResult(): Operation defined in org.jetbrains.idl2k.OperationVisitor[SimpleFunctionDescriptorImpl]

'AttributeVisitor' @ [246:32] ==> public constructor AttributeVisitor(readOnly: Boolean = ..., static: Boolean = ..., namespace: String) defined in org.jetbrains.idl2k.AttributeVisitor[ClassConstructorDescriptorImpl]

'namespace' @ [246:77] ==> private final val namespace: String defined in org.jetbrains.idl2k.OperationVisitor[PropertyDescriptorImpl]

'attributeVisitor' @ [247:9] ==> val attributeVisitor: AttributeVisitor defined in org.jetbrains.idl2k.OperationVisitor.visitOptionalOrRequiredArgument[LocalVariableDescriptor]

'visit' @ [247:26] ==> public open fun visit(p0: (ParseTree..ParseTree?)): (Attribute..Attribute?) defined in org.jetbrains.idl2k.AttributeVisitor[JavaMethodDescriptor]

'ctx' @ [247:32] ==> value-parameter ctx: WebIDLParser.OptionalOrRequiredArgumentContext defined in org.jetbrains.idl2k.OperationVisitor.visitOptionalOrRequiredArgument[ValueParameterDescriptorImpl]

'attributeVisitor' @ [248:25] ==> val attributeVisitor: AttributeVisitor defined in org.jetbrains.idl2k.OperationVisitor.visitOptionalOrRequiredArgument[LocalVariableDescriptor]

'visitChildren' @ [248:42] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Attribute..Attribute?) defined in org.jetbrains.idl2k.AttributeVisitor[JavaMethodDescriptor]

'ctx' @ [248:56] ==> value-parameter ctx: WebIDLParser.OptionalOrRequiredArgumentContext defined in org.jetbrains.idl2k.OperationVisitor.visitOptionalOrRequiredArgument[ValueParameterDescriptorImpl]

'parameters' @ [250:9] ==> private final val parameters: ArrayList<Attribute> defined in org.jetbrains.idl2k.OperationVisitor[PropertyDescriptorImpl]

'add' @ [250:20] ==> public open fun add(element: Attribute): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'parameter' @ [250:24] ==> val parameter: (Attribute..Attribute?) defined in org.jetbrains.idl2k.OperationVisitor.visitOptionalOrRequiredArgument[LocalVariableDescriptor]

'defaultResult' @ [252:16] ==> protected open fun defaultResult(): Operation defined in org.jetbrains.idl2k.OperationVisitor[SimpleFunctionDescriptorImpl]

'WebIDLBaseVisitor<Attribute>' @ [256:133] ==> public constructor WebIDLBaseVisitor<T : (Any..Any?)>() defined in org.antlr.webidl.WebIDLBaseVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Attribute

'AnyType' @ [257:30] ==> public constructor AnyType(nullable: Boolean = ...) defined in org.jetbrains.idl2k.AnyType[ClassConstructorDescriptorImpl]

'Attribute' @ [263:47] ==> public constructor Attribute(name: String, type: Type, readOnly: Boolean = ..., defaultValue: String? = ..., vararg: Boolean, static: Boolean, required: Boolean) defined in org.jetbrains.idl2k.Attribute[ClassConstructorDescriptorImpl]

'name' @ [263:57] ==> private final var name: String defined in org.jetbrains.idl2k.AttributeVisitor[PropertyDescriptorImpl]

'type' @ [263:63] ==> private final var type: Type defined in org.jetbrains.idl2k.AttributeVisitor[PropertyDescriptorImpl]

'readOnly' @ [263:69] ==> private final val readOnly: Boolean defined in org.jetbrains.idl2k.AttributeVisitor[PropertyDescriptorImpl]

'defaultValue' @ [263:79] ==> private final var defaultValue: String? defined in org.jetbrains.idl2k.AttributeVisitor[PropertyDescriptorImpl]

'vararg' @ [263:93] ==> private final var vararg: Boolean defined in org.jetbrains.idl2k.AttributeVisitor[PropertyDescriptorImpl]

'static' @ [263:101] ==> private final val static: Boolean defined in org.jetbrains.idl2k.AttributeVisitor[PropertyDescriptorImpl]

'required' @ [263:109] ==> private final var required: Boolean defined in org.jetbrains.idl2k.AttributeVisitor[PropertyDescriptorImpl]

'type' @ [266:9] ==> private final var type: Type defined in org.jetbrains.idl2k.AttributeVisitor[PropertyDescriptorImpl]

'TypeVisitor' @ [266:16] ==> public constructor TypeVisitor(namespace: String) defined in org.jetbrains.idl2k.TypeVisitor[ClassConstructorDescriptorImpl]

'namespace' @ [266:28] ==> private final val namespace: String defined in org.jetbrains.idl2k.AttributeVisitor[PropertyDescriptorImpl]

'visit' @ [266:39] ==> public open fun visit(p0: (ParseTree..ParseTree?)): (Type..Type?) defined in org.jetbrains.idl2k.TypeVisitor[JavaMethodDescriptor]

'ctx' @ [266:45] ==> value-parameter ctx: WebIDLParser.TypeContext defined in org.jetbrains.idl2k.AttributeVisitor.visitType[ValueParameterDescriptorImpl]

'defaultResult' @ [267:16] ==> protected open fun defaultResult(): Attribute defined in org.jetbrains.idl2k.AttributeVisitor[SimpleFunctionDescriptorImpl]

'ctx' @ [271:13] ==> value-parameter ctx: WebIDLParser.OptionalOrRequiredArgumentContext defined in org.jetbrains.idl2k.AttributeVisitor.visitOptionalOrRequiredArgument[ValueParameterDescriptorImpl]

'children' @ [271:17] ==> public final var children: (MutableList<(ParseTree..ParseTree?)>..List<(ParseTree..ParseTree?)>?) defined in org.antlr.webidl.WebIDLParser.OptionalOrRequiredArgumentContext[JavaPropertyDescriptor]

'any' @ [271:27] ==> public inline fun <T> Iterable<(ParseTree..ParseTree?)>.any(predicate: ((ParseTree..ParseTree?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.antlr.v4.runtime.tree.ParseTree..org.antlr.v4.runtime.tree.ParseTree?)

'it' @ [271:33] ==> value-parameter it: (ParseTree..ParseTree?) defined in org.jetbrains.idl2k.AttributeVisitor.visitOptionalOrRequiredArgument.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [271:55] ==> value-parameter it: (ParseTree..ParseTree?) defined in org.jetbrains.idl2k.AttributeVisitor.visitOptionalOrRequiredArgument.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [271:58] ==> public final val TerminalNode.text: (String..String?)[MyPropertyDescriptor]

'defaultValue' @ [272:13] ==> private final var defaultValue: String? defined in org.jetbrains.idl2k.AttributeVisitor[PropertyDescriptorImpl]

'ctx' @ [274:13] ==> value-parameter ctx: WebIDLParser.OptionalOrRequiredArgumentContext defined in org.jetbrains.idl2k.AttributeVisitor.visitOptionalOrRequiredArgument[ValueParameterDescriptorImpl]

'children' @ [274:17] ==> public final var children: (MutableList<(ParseTree..ParseTree?)>..List<(ParseTree..ParseTree?)>?) defined in org.antlr.webidl.WebIDLParser.OptionalOrRequiredArgumentContext[JavaPropertyDescriptor]

'any' @ [274:27] ==> public inline fun <T> Iterable<(ParseTree..ParseTree?)>.any(predicate: ((ParseTree..ParseTree?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.antlr.v4.runtime.tree.ParseTree..org.antlr.v4.runtime.tree.ParseTree?)

'it' @ [274:33] ==> value-parameter it: (ParseTree..ParseTree?) defined in org.jetbrains.idl2k.AttributeVisitor.visitOptionalOrRequiredArgument.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [274:55] ==> value-parameter it: (ParseTree..ParseTree?) defined in org.jetbrains.idl2k.AttributeVisitor.visitOptionalOrRequiredArgument.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [274:58] ==> public final val TerminalNode.text: (String..String?)[MyPropertyDescriptor]

'required' @ [275:13] ==> private final var required: Boolean defined in org.jetbrains.idl2k.AttributeVisitor[PropertyDescriptorImpl]

'visitChildren' @ [277:16] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Attribute..Attribute?) defined in org.jetbrains.idl2k.AttributeVisitor[JavaMethodDescriptor]

'ctx' @ [277:30] ==> value-parameter ctx: WebIDLParser.OptionalOrRequiredArgumentContext defined in org.jetbrains.idl2k.AttributeVisitor.visitOptionalOrRequiredArgument[ValueParameterDescriptorImpl]

'name' @ [281:9] ==> private final var name: String defined in org.jetbrains.idl2k.AttributeVisitor[PropertyDescriptorImpl]

'getNameOrNull' @ [281:16] ==> private fun getNameOrNull(ctx: ParserRuleContext): String? defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'ctx' @ [281:30] ==> value-parameter ctx: WebIDLParser.AttributeRestContext defined in org.jetbrains.idl2k.AttributeVisitor.visitAttributeRest[ValueParameterDescriptorImpl]

'ctx' @ [281:38] ==> value-parameter ctx: WebIDLParser.AttributeRestContext defined in org.jetbrains.idl2k.AttributeVisitor.visitAttributeRest[ValueParameterDescriptorImpl]

'children' @ [281:42] ==> public final var children: (MutableList<(ParseTree..ParseTree?)>..List<(ParseTree..ParseTree?)>?) defined in org.antlr.webidl.WebIDLParser.AttributeRestContext[JavaPropertyDescriptor]

'filter' @ [281:51] ==> public inline fun <T> Iterable<(ParseTree..ParseTree?)>.filter(predicate: ((ParseTree..ParseTree?)) -> Boolean): List<(ParseTree..ParseTree?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.antlr.v4.runtime.tree.ParseTree..org.antlr.v4.runtime.tree.ParseTree?)

'it' @ [281:60] ==> value-parameter it: (ParseTree..ParseTree?) defined in org.jetbrains.idl2k.AttributeVisitor.visitAttributeRest.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [281:81] ==> public inline fun <T> Iterable<(ParseTree..ParseTree?)>.filter(predicate: ((ParseTree..ParseTree?)) -> Boolean): List<(ParseTree..ParseTree?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.antlr.v4.runtime.tree.ParseTree..org.antlr.v4.runtime.tree.ParseTree?)

'it' @ [281:90] ==> value-parameter it: (ParseTree..ParseTree?) defined in org.jetbrains.idl2k.AttributeVisitor.visitAttributeRest.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [281:93] ==> public final val ParseTree.text: (String..String?)[MyPropertyDescriptor]

'last' @ [281:107] ==> public fun <T> List<(ParseTree..ParseTree?)>.last(): (ParseTree..ParseTree?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.antlr.v4.runtime.tree.ParseTree..org.antlr.v4.runtime.tree.ParseTree?)

'text' @ [281:114] ==> public final val ParseTree.text: (String..String?)[MyPropertyDescriptor]

'defaultResult' @ [282:16] ==> protected open fun defaultResult(): Attribute defined in org.jetbrains.idl2k.AttributeVisitor[SimpleFunctionDescriptorImpl]

'name' @ [286:9] ==> private final var name: String defined in org.jetbrains.idl2k.AttributeVisitor[PropertyDescriptorImpl]

'getNameOrNull' @ [286:16] ==> private fun getNameOrNull(ctx: ParserRuleContext): String? defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'ctx' @ [286:30] ==> value-parameter ctx: WebIDLParser.ArgumentNameContext defined in org.jetbrains.idl2k.AttributeVisitor.visitArgumentName[ValueParameterDescriptorImpl]

'ctx' @ [286:38] ==> value-parameter ctx: WebIDLParser.ArgumentNameContext defined in org.jetbrains.idl2k.AttributeVisitor.visitArgumentName[ValueParameterDescriptorImpl]

'text' @ [286:42] ==> public final val WebIDLParser.ArgumentNameContext.text: (String..String?)[MyPropertyDescriptor]

'defaultResult' @ [287:16] ==> protected open fun defaultResult(): Attribute defined in org.jetbrains.idl2k.AttributeVisitor[SimpleFunctionDescriptorImpl]

'defaultValue' @ [291:9] ==> private final var defaultValue: String? defined in org.jetbrains.idl2k.AttributeVisitor[PropertyDescriptorImpl]

'ctx' @ [291:24] ==> value-parameter ctx: WebIDLParser.DefaultValueContext defined in org.jetbrains.idl2k.AttributeVisitor.visitDefaultValue[ValueParameterDescriptorImpl]

'text' @ [291:28] ==> public final val WebIDLParser.DefaultValueContext.text: (String..String?)[MyPropertyDescriptor]

'defaultResult' @ [292:16] ==> protected open fun defaultResult(): Attribute defined in org.jetbrains.idl2k.AttributeVisitor[SimpleFunctionDescriptorImpl]

'vararg' @ [296:9] ==> private final var vararg: Boolean defined in org.jetbrains.idl2k.AttributeVisitor[PropertyDescriptorImpl]

'vararg' @ [296:18] ==> private final var vararg: Boolean defined in org.jetbrains.idl2k.AttributeVisitor[PropertyDescriptorImpl]

'in' @ [296:28] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ctx' @ [296:37] ==> value-parameter ctx: WebIDLParser.EllipsisContext defined in org.jetbrains.idl2k.AttributeVisitor.visitEllipsis[ValueParameterDescriptorImpl]

'text' @ [296:41] ==> public final val WebIDLParser.EllipsisContext.text: (String..String?)[MyPropertyDescriptor]

'defaultResult' @ [297:16] ==> protected open fun defaultResult(): Attribute defined in org.jetbrains.idl2k.AttributeVisitor[SimpleFunctionDescriptorImpl]

'WebIDLBaseVisitor<Constant>' @ [301:25] ==> public constructor WebIDLBaseVisitor<T : (Any..Any?)>() defined in org.antlr.webidl.WebIDLBaseVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Constant

'AnyType' @ [302:30] ==> public constructor AnyType(nullable: Boolean = ...) defined in org.jetbrains.idl2k.AnyType[ClassConstructorDescriptorImpl]

'Constant' @ [306:46] ==> public constructor Constant(name: String, type: Type, value: String?) defined in org.jetbrains.idl2k.Constant[ClassConstructorDescriptorImpl]

'name' @ [306:55] ==> private final var name: String defined in org.jetbrains.idl2k.ConstantVisitor[PropertyDescriptorImpl]

'type' @ [306:61] ==> private final var type: Type defined in org.jetbrains.idl2k.ConstantVisitor[PropertyDescriptorImpl]

'value' @ [306:67] ==> private final var value: String? defined in org.jetbrains.idl2k.ConstantVisitor[PropertyDescriptorImpl]

'name' @ [309:9] ==> private final var name: String defined in org.jetbrains.idl2k.ConstantVisitor[PropertyDescriptorImpl]

'getName' @ [309:16] ==> private fun getName(ctx: ParserRuleContext): (String..String?) defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'ctx' @ [309:24] ==> value-parameter ctx: WebIDLParser.Const_Context defined in org.jetbrains.idl2k.ConstantVisitor.visitConst_[ValueParameterDescriptorImpl]

'visitChildren' @ [311:16] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Constant..Constant?) defined in org.jetbrains.idl2k.ConstantVisitor[JavaMethodDescriptor]

'ctx' @ [311:30] ==> value-parameter ctx: WebIDLParser.Const_Context defined in org.jetbrains.idl2k.ConstantVisitor.visitConst_[ValueParameterDescriptorImpl]

'type' @ [315:9] ==> private final var type: Type defined in org.jetbrains.idl2k.ConstantVisitor[PropertyDescriptorImpl]

'SimpleType' @ [315:16] ==> public constructor SimpleType(type: String, nullable: Boolean) defined in org.jetbrains.idl2k.SimpleType[ClassConstructorDescriptorImpl]

'ctx' @ [315:27] ==> value-parameter ctx: WebIDLParser.ConstTypeContext defined in org.jetbrains.idl2k.ConstantVisitor.visitConstType[ValueParameterDescriptorImpl]

'text' @ [315:31] ==> public final val WebIDLParser.ConstTypeContext.text: (String..String?)[MyPropertyDescriptor]

'defaultResult' @ [316:16] ==> protected open fun defaultResult(): Constant defined in org.jetbrains.idl2k.ConstantVisitor[SimpleFunctionDescriptorImpl]

'value' @ [320:9] ==> private final var value: String? defined in org.jetbrains.idl2k.ConstantVisitor[PropertyDescriptorImpl]

'ctx' @ [320:17] ==> value-parameter ctx: WebIDLParser.ConstValueContext defined in org.jetbrains.idl2k.ConstantVisitor.visitConstValue[ValueParameterDescriptorImpl]

'text' @ [320:21] ==> public final val WebIDLParser.ConstValueContext.text: (String..String?)[MyPropertyDescriptor]

'defaultResult' @ [321:16] ==> protected open fun defaultResult(): Constant defined in org.jetbrains.idl2k.ConstantVisitor[SimpleFunctionDescriptorImpl]

'WebIDLBaseVisitor<Definition>' @ [325:142] ==> public constructor WebIDLBaseVisitor<T : (Any..Any?)>() defined in org.antlr.webidl.WebIDLBaseVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Definition

'INTERFACE' @ [326:39] ==> enum entry INTERFACE defined in org.jetbrains.idl2k.DefinitionKind[FakeCallableDescriptorForObject]

'ArrayList' @ [328:36] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ExtendedAttribute

'ArrayList' @ [329:30] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Operation

'ArrayList' @ [330:30] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Attribute

'ArrayList' @ [333:29] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'ArrayList' @ [336:29] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Constant

'mutableListOf' @ [339:31] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'when (kind) {
        DefinitionKind.INTERFACE -> InterfaceDefinition(name, namespace, extendedAttributes, operations, attributes, inherited, constants, false, partial, callback)
        DefinitionKind.DICTIONARY -> InterfaceDefinition(name, namespace, extendedAttributes, operations, attributes, inherited, constants, /* dictionary = */ true, partial, callback)
        DefinitionKind.EXTENSION_INTERFACE -> ExtensionInterfaceDefinition(namespace, name, implements ?: "")
        DefinitionKind.TYPEDEF -> TypedefDefinition(typedefType ?: AnyType(true), namespace, name)
        DefinitionKind.ENUM -> EnumDefinition(namespace, name, enumEntries)
    }' @ [342:48] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Definition, entry1: Definition, entry2: Definition, entry3: Definition, entry4: Definition): Definition[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Definition

'kind' @ [342:54] ==> private final var kind: DefinitionKind defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'INTERFACE' @ [343:24] ==> enum entry INTERFACE defined in org.jetbrains.idl2k.DefinitionKind[FakeCallableDescriptorForObject]

'InterfaceDefinition' @ [343:37] ==> public constructor InterfaceDefinition(name: String, namespace: String, extendedAttributes: List<ExtendedAttribute>, operations: List<Operation>, attributes: List<Attribute>, superTypes: List<String>, constants: List<Constant>, dictionary: Boolean = ..., partial: Boolean, callback: Boolean) defined in org.jetbrains.idl2k.InterfaceDefinition[ClassConstructorDescriptorImpl]

'name' @ [343:57] ==> private final var name: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'namespace' @ [343:63] ==> public final val namespace: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'extendedAttributes' @ [343:74] ==> public final val extendedAttributes: List<ExtendedAttribute> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'operations' @ [343:94] ==> private final val operations: ArrayList<Operation> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'attributes' @ [343:106] ==> private final val attributes: ArrayList<Attribute> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'inherited' @ [343:118] ==> private final val inherited: ArrayList<String> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'constants' @ [343:129] ==> private final val constants: ArrayList<Constant> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'partial' @ [343:147] ==> private final var partial: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'callback' @ [343:156] ==> private final var callback: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'DICTIONARY' @ [344:24] ==> enum entry DICTIONARY defined in org.jetbrains.idl2k.DefinitionKind[FakeCallableDescriptorForObject]

'InterfaceDefinition' @ [344:38] ==> public constructor InterfaceDefinition(name: String, namespace: String, extendedAttributes: List<ExtendedAttribute>, operations: List<Operation>, attributes: List<Attribute>, superTypes: List<String>, constants: List<Constant>, dictionary: Boolean = ..., partial: Boolean, callback: Boolean) defined in org.jetbrains.idl2k.InterfaceDefinition[ClassConstructorDescriptorImpl]

'name' @ [344:58] ==> private final var name: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'namespace' @ [344:64] ==> public final val namespace: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'extendedAttributes' @ [344:75] ==> public final val extendedAttributes: List<ExtendedAttribute> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'operations' @ [344:95] ==> private final val operations: ArrayList<Operation> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'attributes' @ [344:107] ==> private final val attributes: ArrayList<Attribute> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'inherited' @ [344:119] ==> private final val inherited: ArrayList<String> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'constants' @ [344:130] ==> private final val constants: ArrayList<Constant> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'partial' @ [344:166] ==> private final var partial: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'callback' @ [344:175] ==> private final var callback: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'EXTENSION_INTERFACE' @ [345:24] ==> enum entry EXTENSION_INTERFACE defined in org.jetbrains.idl2k.DefinitionKind[FakeCallableDescriptorForObject]

'ExtensionInterfaceDefinition' @ [345:47] ==> public constructor ExtensionInterfaceDefinition(namespace: String, name: String, implements: String) defined in org.jetbrains.idl2k.ExtensionInterfaceDefinition[ClassConstructorDescriptorImpl]

'namespace' @ [345:76] ==> public final val namespace: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'name' @ [345:87] ==> private final var name: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'implements' @ [345:93] ==> private final var implements: String? defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'TYPEDEF' @ [346:24] ==> enum entry TYPEDEF defined in org.jetbrains.idl2k.DefinitionKind[FakeCallableDescriptorForObject]

'TypedefDefinition' @ [346:35] ==> public constructor TypedefDefinition(types: Type, namespace: String, name: String) defined in org.jetbrains.idl2k.TypedefDefinition[ClassConstructorDescriptorImpl]

'typedefType' @ [346:53] ==> private final var typedefType: Type? defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'AnyType' @ [346:68] ==> public constructor AnyType(nullable: Boolean = ...) defined in org.jetbrains.idl2k.AnyType[ClassConstructorDescriptorImpl]

'namespace' @ [346:83] ==> public final val namespace: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'name' @ [346:94] ==> private final var name: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'ENUM' @ [347:24] ==> enum entry ENUM defined in org.jetbrains.idl2k.DefinitionKind[FakeCallableDescriptorForObject]

'EnumDefinition' @ [347:32] ==> public constructor EnumDefinition(namespace: String, name: String, entries: List<String>) defined in org.jetbrains.idl2k.EnumDefinition[ClassConstructorDescriptorImpl]

'namespace' @ [347:47] ==> public final val namespace: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'name' @ [347:58] ==> private final var name: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'enumEntries' @ [347:64] ==> private final val enumEntries: MutableList<String> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'callback' @ [351:9] ==> private final var callback: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'visitChildren' @ [352:16] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Definition..Definition?) defined in org.jetbrains.idl2k.DefinitionVisitor[JavaMethodDescriptor]

'ctx' @ [352:30] ==> value-parameter ctx: WebIDLParser.CallbackRestOrInterfaceContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitCallbackRestOrInterface[ValueParameterDescriptorImpl]

'kind' @ [356:9] ==> private final var kind: DefinitionKind defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'TYPEDEF' @ [356:31] ==> enum entry TYPEDEF defined in org.jetbrains.idl2k.DefinitionKind[FakeCallableDescriptorForObject]

'name' @ [357:9] ==> private final var name: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'getName' @ [357:16] ==> private fun getName(ctx: ParserRuleContext): (String..String?) defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'ctx' @ [357:24] ==> value-parameter ctx: WebIDLParser.CallbackRestContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitCallbackRest[ValueParameterDescriptorImpl]

'OperationVisitor' @ [359:24] ==> public constructor OperationVisitor(attributes: List<ExtendedAttribute>, static: Boolean, namespace: String) defined in org.jetbrains.idl2k.OperationVisitor[ClassConstructorDescriptorImpl]

'memberAttributes' @ [359:41] ==> private final val memberAttributes: ArrayList<ExtendedAttribute> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'toList' @ [359:58] ==> public fun <T> Iterable<ExtendedAttribute>.toList(): List<ExtendedAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtendedAttribute

'static' @ [359:68] ==> private final var static: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'namespace' @ [359:76] ==> public final val namespace: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'visit' @ [359:87] ==> public open fun visit(p0: (ParseTree..ParseTree?)): (Operation..Operation?) defined in org.jetbrains.idl2k.OperationVisitor[JavaMethodDescriptor]

'ctx' @ [359:93] ==> value-parameter ctx: WebIDLParser.CallbackRestContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitCallbackRest[ValueParameterDescriptorImpl]

'typedefType' @ [360:9] ==> private final var typedefType: Type? defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'FunctionType' @ [360:23] ==> public constructor FunctionType(parameterTypes: List<Attribute>, returnType: Type, nullable: Boolean) defined in org.jetbrains.idl2k.FunctionType[ClassConstructorDescriptorImpl]

'function' @ [360:36] ==> val function: (Operation..Operation?) defined in org.jetbrains.idl2k.DefinitionVisitor.visitCallbackRest[LocalVariableDescriptor]

'parameters' @ [360:45] ==> public final val parameters: List<Attribute> defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'function' @ [360:57] ==> val function: (Operation..Operation?) defined in org.jetbrains.idl2k.DefinitionVisitor.visitCallbackRest[LocalVariableDescriptor]

'returnType' @ [360:66] ==> public final val returnType: Type defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'memberAttributes' @ [362:9] ==> private final val memberAttributes: ArrayList<ExtendedAttribute> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'clear' @ [362:26] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'defaultResult' @ [363:16] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'getName' @ [367:26] ==> private fun getName(ctx: ParserRuleContext): (String..String?) defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'ctx' @ [367:34] ==> value-parameter ctx: WebIDLParser.ModuleContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitModule[ValueParameterDescriptorImpl]

'if (this.namespace.endsWith(moduleName)) this.namespace else this.namespace + "." + moduleName' @ [368:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'this' @ [368:29] ==> <this> defined in org.jetbrains.idl2k.DefinitionVisitor[LazyClassReceiverParameterDescriptor]

'namespace' @ [368:34] ==> public final val namespace: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'endsWith' @ [368:44] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'moduleName' @ [368:53] ==> val moduleName: (String..String?) defined in org.jetbrains.idl2k.DefinitionVisitor.visitModule[LocalVariableDescriptor]

'this' @ [368:66] ==> <this> defined in org.jetbrains.idl2k.DefinitionVisitor[LazyClassReceiverParameterDescriptor]

'namespace' @ [368:71] ==> public final val namespace: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'this' @ [368:86] ==> <this> defined in org.jetbrains.idl2k.DefinitionVisitor[LazyClassReceiverParameterDescriptor]

'namespace' @ [368:91] ==> public final val namespace: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'moduleName' @ [368:109] ==> val moduleName: (String..String?) defined in org.jetbrains.idl2k.DefinitionVisitor.visitModule[LocalVariableDescriptor]

'ModuleVisitor' @ [370:9] ==> public constructor ModuleVisitor(declarations: MutableList<Definition>, namespace: String = ...) defined in org.jetbrains.idl2k.ModuleVisitor[ClassConstructorDescriptorImpl]

'declarations' @ [370:23] ==> public final val declarations: MutableList<Definition> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'namespace' @ [370:37] ==> val namespace: String defined in org.jetbrains.idl2k.DefinitionVisitor.visitModule[LocalVariableDescriptor]

'visitChildren' @ [370:48] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Unit..Unit?) defined in org.jetbrains.idl2k.ModuleVisitor[JavaMethodDescriptor]

'ctx' @ [370:62] ==> value-parameter ctx: WebIDLParser.ModuleContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitModule[ValueParameterDescriptorImpl]

'defaultResult' @ [372:16] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'name' @ [376:9] ==> private final var name: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'getName' @ [376:16] ==> private fun getName(ctx: ParserRuleContext): (String..String?) defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'ctx' @ [376:24] ==> value-parameter ctx: WebIDLParser.Interface_Context defined in org.jetbrains.idl2k.DefinitionVisitor.visitInterface_[ValueParameterDescriptorImpl]

'visitChildren' @ [377:9] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Definition..Definition?) defined in org.jetbrains.idl2k.DefinitionVisitor[JavaMethodDescriptor]

'ctx' @ [377:23] ==> value-parameter ctx: WebIDLParser.Interface_Context defined in org.jetbrains.idl2k.DefinitionVisitor.visitInterface_[ValueParameterDescriptorImpl]

'defaultResult' @ [378:16] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'name' @ [382:9] ==> private final var name: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'getName' @ [382:16] ==> private fun getName(ctx: ParserRuleContext): (String..String?) defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'ctx' @ [382:24] ==> value-parameter ctx: WebIDLParser.PartialInterfaceContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitPartialInterface[ValueParameterDescriptorImpl]

'partial' @ [383:9] ==> private final var partial: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'visitChildren' @ [384:9] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Definition..Definition?) defined in org.jetbrains.idl2k.DefinitionVisitor[JavaMethodDescriptor]

'ctx' @ [384:23] ==> value-parameter ctx: WebIDLParser.PartialInterfaceContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitPartialInterface[ValueParameterDescriptorImpl]

'defaultResult' @ [385:16] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'name' @ [389:13] ==> private final var name: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'defaultResult' @ [391:20] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'kind' @ [394:9] ==> private final var kind: DefinitionKind defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'TYPEDEF' @ [394:31] ==> enum entry TYPEDEF defined in org.jetbrains.idl2k.DefinitionKind[FakeCallableDescriptorForObject]

'name' @ [395:9] ==> private final var name: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'getName' @ [395:16] ==> private fun getName(ctx: ParserRuleContext): (String..String?) defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'ctx' @ [395:24] ==> value-parameter ctx: WebIDLParser.TypedefContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitTypedef[ValueParameterDescriptorImpl]

'typedefType' @ [397:9] ==> private final var typedefType: Type? defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'ctx' @ [397:23] ==> value-parameter ctx: WebIDLParser.TypedefContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitTypedef[ValueParameterDescriptorImpl]

'accept' @ [397:27] ==> @Override public open fun <T : (Any..Any?)> accept(visitor: (ParseTreeVisitor<out (Type..Type?)>..ParseTreeVisitor<out (Type..Type?)>?)): (Type..Type?) defined in org.antlr.webidl.WebIDLParser.TypedefContext[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.idl2k.Type..org.jetbrains.idl2k.Type?)

'WebIDLBaseVisitor<Type>' @ [397:43] ==> public constructor WebIDLBaseVisitor<T : (Any..Any?)>() defined in org.antlr.webidl.WebIDLBaseVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Type

'AnyType' @ [398:43] ==> public constructor AnyType(nullable: Boolean = ...) defined in org.jetbrains.idl2k.AnyType[ClassConstructorDescriptorImpl]

'foundType' @ [400:50] ==> private final var foundType: Type defined in org.jetbrains.idl2k.DefinitionVisitor.visitTypedef.<no name provided>[PropertyDescriptorImpl]

'foundType' @ [403:17] ==> private final var foundType: Type defined in org.jetbrains.idl2k.DefinitionVisitor.visitTypedef.<no name provided>[PropertyDescriptorImpl]

'TypeVisitor' @ [403:29] ==> public constructor TypeVisitor(namespace: String) defined in org.jetbrains.idl2k.TypeVisitor[ClassConstructorDescriptorImpl]

'namespace' @ [403:41] ==> public final val namespace: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'visit' @ [403:52] ==> public open fun visit(p0: (ParseTree..ParseTree?)): (Type..Type?) defined in org.jetbrains.idl2k.TypeVisitor[JavaMethodDescriptor]

'ctx' @ [403:58] ==> value-parameter ctx: WebIDLParser.TypeContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitTypedef.<no name provided>.visitType[ValueParameterDescriptorImpl]

'defaultResult' @ [404:24] ==> protected open fun defaultResult(): Type defined in org.jetbrains.idl2k.DefinitionVisitor.visitTypedef.<no name provided>[SimpleFunctionDescriptorImpl]

'defaultResult' @ [408:16] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'enumEntryExpected' @ [412:9] ==> private final var enumEntryExpected: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'kind' @ [413:9] ==> private final var kind: DefinitionKind defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'ENUM' @ [413:31] ==> enum entry ENUM defined in org.jetbrains.idl2k.DefinitionKind[FakeCallableDescriptorForObject]

'name' @ [414:9] ==> private final var name: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'getName' @ [414:16] ==> private fun getName(ctx: ParserRuleContext): (String..String?) defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'ctx' @ [414:24] ==> value-parameter ctx: WebIDLParser.Enum_Context defined in org.jetbrains.idl2k.DefinitionVisitor.visitEnum_[ValueParameterDescriptorImpl]

'super' @ [416:9] ==> <this> defined in org.jetbrains.idl2k.DefinitionVisitor[LazyClassReceiverParameterDescriptor]

'visitEnum_' @ [416:15] ==> @Override public open fun visitEnum_(ctx: (WebIDLParser.Enum_Context..WebIDLParser.Enum_Context?)): (Definition..Definition?) defined in org.antlr.webidl.WebIDLBaseVisitor[JavaMethodDescriptor]

'ctx' @ [416:26] ==> value-parameter ctx: WebIDLParser.Enum_Context defined in org.jetbrains.idl2k.DefinitionVisitor.visitEnum_[ValueParameterDescriptorImpl]

'enumEntryExpected' @ [418:9] ==> private final var enumEntryExpected: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'defaultResult' @ [419:16] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'enumEntryExpected' @ [423:13] ==> private final var enumEntryExpected: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'node' @ [423:34] ==> value-parameter node: TerminalNode defined in org.jetbrains.idl2k.DefinitionVisitor.visitTerminal[ValueParameterDescriptorImpl]

'symbol' @ [423:39] ==> public final val TerminalNode.symbol: (Token..Token?)[MyPropertyDescriptor]

'type' @ [423:46] ==> public final val Token.type: Int[MyPropertyDescriptor]

'STRING_WEBIDL' @ [423:67] ==> public const final val STRING_WEBIDL: Int defined in org.antlr.webidl.WebIDLParser[JavaPropertyDescriptor]

'enumEntries' @ [424:13] ==> private final val enumEntries: MutableList<String> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'node' @ [424:28] ==> value-parameter node: TerminalNode defined in org.jetbrains.idl2k.DefinitionVisitor.visitTerminal[ValueParameterDescriptorImpl]

'symbol' @ [424:33] ==> public final val TerminalNode.symbol: (Token..Token?)[MyPropertyDescriptor]

'text' @ [424:40] ==> public final val Token.text: (String..String?)[MyPropertyDescriptor]

'removeSurrounding' @ [424:45] ==> public fun String.removeSurrounding(prefix: CharSequence, suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'super' @ [426:16] ==> <this> defined in org.jetbrains.idl2k.DefinitionVisitor[LazyClassReceiverParameterDescriptor]

'visitTerminal' @ [426:22] ==> public open fun visitTerminal(p0: (TerminalNode..TerminalNode?)): (Definition..Definition?) defined in org.antlr.webidl.WebIDLBaseVisitor[JavaMethodDescriptor]

'node' @ [426:36] ==> value-parameter node: TerminalNode defined in org.jetbrains.idl2k.DefinitionVisitor.visitTerminal[ValueParameterDescriptorImpl]

'kind' @ [430:9] ==> private final var kind: DefinitionKind defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'DICTIONARY' @ [430:31] ==> enum entry DICTIONARY defined in org.jetbrains.idl2k.DefinitionKind[FakeCallableDescriptorForObject]

'name' @ [431:9] ==> private final var name: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'getName' @ [431:16] ==> private fun getName(ctx: ParserRuleContext): (String..String?) defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'ctx' @ [431:24] ==> value-parameter ctx: WebIDLParser.DictionaryContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionary[ValueParameterDescriptorImpl]

'visitChildren' @ [433:16] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Definition..Definition?) defined in org.jetbrains.idl2k.DefinitionVisitor[JavaMethodDescriptor]

'ctx' @ [433:30] ==> value-parameter ctx: WebIDLParser.DictionaryContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionary[ValueParameterDescriptorImpl]

'ctx' @ [437:20] ==> value-parameter ctx: WebIDLParser.DictionaryMemberContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember[ValueParameterDescriptorImpl]

'children' @ [437:24] ==> public final var children: (MutableList<(ParseTree..ParseTree?)>..List<(ParseTree..ParseTree?)>?) defined in org.antlr.webidl.WebIDLParser.DictionaryMemberContext[JavaPropertyDescriptor]

'filterIdentifiers' @ [438:18] ==> private fun List<ParseTree>?.filterIdentifiers(): List<ParseTree> defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [439:18] ==> public inline fun <T> Iterable<ParseTree>.firstOrNull(predicate: (ParseTree) -> Boolean): ParseTree? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParseTree

'it' @ [439:32] ==> value-parameter it: ParseTree defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [439:35] ==> public final val ParseTree.text: (String..String?)[MyPropertyDescriptor]

'text' @ [440:19] ==> public final val ParseTree.text: (String..String?)[MyPropertyDescriptor]

'TypeVisitor' @ [442:20] ==> public constructor TypeVisitor(namespace: String) defined in org.jetbrains.idl2k.TypeVisitor[ClassConstructorDescriptorImpl]

'namespace' @ [442:32] ==> public final val namespace: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'visit' @ [442:43] ==> public open fun visit(p0: (ParseTree..ParseTree?)): (Type..Type?) defined in org.jetbrains.idl2k.TypeVisitor[JavaMethodDescriptor]

'ctx' @ [442:49] ==> value-parameter ctx: WebIDLParser.DictionaryMemberContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember[ValueParameterDescriptorImpl]

'children' @ [442:53] ==> public final var children: (MutableList<(ParseTree..ParseTree?)>..List<(ParseTree..ParseTree?)>?) defined in org.antlr.webidl.WebIDLParser.DictionaryMemberContext[JavaPropertyDescriptor]

'first' @ [442:62] ==> public inline fun <T> Iterable<(ParseTree..ParseTree?)>.first(predicate: ((ParseTree..ParseTree?)) -> Boolean): (ParseTree..ParseTree?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.antlr.v4.runtime.tree.ParseTree..org.antlr.v4.runtime.tree.ParseTree?)

'it' @ [442:70] ==> value-parameter it: (ParseTree..ParseTree?) defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember.<anonymous>[ValueParameterDescriptorImpl]

'WebIDLBaseVisitor<String?>' @ [444:37] ==> public constructor WebIDLBaseVisitor<T : (Any..Any?)>() defined in org.antlr.webidl.WebIDLBaseVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String?

'value' @ [447:44] ==> private final var value: String? defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember.<no name provided>[PropertyDescriptorImpl]

'value' @ [450:17] ==> private final var value: String? defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember.<no name provided>[PropertyDescriptorImpl]

'ctx2' @ [450:25] ==> value-parameter ctx2: WebIDLParser.DefaultValueContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember.<no name provided>.visitDefaultValue[ValueParameterDescriptorImpl]

'text' @ [450:30] ==> public final val WebIDLParser.DefaultValueContext.text: (String..String?)[MyPropertyDescriptor]

'value' @ [451:24] ==> private final var value: String? defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember.<no name provided>[PropertyDescriptorImpl]

'ctx' @ [455:21] ==> value-parameter ctx: WebIDLParser.RequiredContext? defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember.<no name provided>.visitRequired[ValueParameterDescriptorImpl]

'children' @ [455:26] ==> public final var children: (MutableList<(ParseTree..ParseTree?)>..List<(ParseTree..ParseTree?)>?) defined in org.antlr.webidl.WebIDLParser.RequiredContext[JavaPropertyDescriptor]

'any' @ [455:36] ==> public inline fun <T> Iterable<(ParseTree..ParseTree?)>.any(predicate: ((ParseTree..ParseTree?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.antlr.v4.runtime.tree.ParseTree..org.antlr.v4.runtime.tree.ParseTree?)

'it' @ [455:42] ==> value-parameter it: (ParseTree..ParseTree?) defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember.<no name provided>.visitRequired.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [455:64] ==> value-parameter it: (ParseTree..ParseTree?) defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember.<no name provided>.visitRequired.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [455:67] ==> public final val TerminalNode.text: (String..String?)[MyPropertyDescriptor]

'required' @ [456:21] ==> var required: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember[LocalVariableDescriptor]

'super' @ [458:24] ==> <this> defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitRequired' @ [458:30] ==> @Override public open fun visitRequired(ctx: (WebIDLParser.RequiredContext..WebIDLParser.RequiredContext?)): String? defined in org.antlr.webidl.WebIDLBaseVisitor[JavaMethodDescriptor]

'ctx' @ [458:44] ==> value-parameter ctx: WebIDLParser.RequiredContext? defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember.<no name provided>.visitRequired[ValueParameterDescriptorImpl]

'visit' @ [460:11] ==> public open fun visit(p0: (ParseTree..ParseTree?)): String? defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember.<no name provided>[JavaMethodDescriptor]

'ctx' @ [460:17] ==> value-parameter ctx: WebIDLParser.DictionaryMemberContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember[ValueParameterDescriptorImpl]

'attributes' @ [462:9] ==> private final val attributes: ArrayList<Attribute> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'add' @ [462:20] ==> public open fun add(element: Attribute): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Attribute' @ [462:24] ==> public constructor Attribute(name: String, type: Type, readOnly: Boolean = ..., defaultValue: String? = ..., vararg: Boolean, static: Boolean, required: Boolean) defined in org.jetbrains.idl2k.Attribute[ClassConstructorDescriptorImpl]

'name' @ [462:34] ==> val name: String? defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember[LocalVariableDescriptor]

'type' @ [462:46] ==> val type: (Type..Type?) defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember[LocalVariableDescriptor]

'defaultValue' @ [462:59] ==> val defaultValue: String? defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember[LocalVariableDescriptor]

'static' @ [462:80] ==> private final var static: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'required' @ [462:88] ==> var required: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor.visitDictionaryMember[LocalVariableDescriptor]

'defaultResult' @ [464:16] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'ctx' @ [468:27] ==> value-parameter ctx: WebIDLParser.ImplementsStatementContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitImplementsStatement[ValueParameterDescriptorImpl]

'children' @ [468:31] ==> public final var children: (MutableList<(ParseTree..ParseTree?)>..List<(ParseTree..ParseTree?)>?) defined in org.antlr.webidl.WebIDLParser.ImplementsStatementContext[JavaPropertyDescriptor]

'filterIdentifiers' @ [468:40] ==> private fun List<ParseTree>?.filterIdentifiers(): List<ParseTree> defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'map' @ [468:60] ==> public inline fun <T, R> Iterable<ParseTree>.map(transform: (ParseTree) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParseTree
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [468:66] ==> value-parameter it: ParseTree defined in org.jetbrains.idl2k.DefinitionVisitor.visitImplementsStatement.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [468:69] ==> public final val ParseTree.text: (String..String?)[MyPropertyDescriptor]

'identifiers' @ [470:13] ==> val identifiers: List<(String..String?)> defined in org.jetbrains.idl2k.DefinitionVisitor.visitImplementsStatement[LocalVariableDescriptor]

'size' @ [470:25] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'kind' @ [471:13] ==> private final var kind: DefinitionKind defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'EXTENSION_INTERFACE' @ [471:35] ==> enum entry EXTENSION_INTERFACE defined in org.jetbrains.idl2k.DefinitionKind[FakeCallableDescriptorForObject]

'name' @ [472:13] ==> private final var name: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'identifiers' @ [472:20] ==> val identifiers: List<(String..String?)> defined in org.jetbrains.idl2k.DefinitionVisitor.visitImplementsStatement[LocalVariableDescriptor]

'implements' @ [473:13] ==> private final var implements: String? defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'identifiers' @ [473:26] ==> val identifiers: List<(String..String?)> defined in org.jetbrains.idl2k.DefinitionVisitor.visitImplementsStatement[LocalVariableDescriptor]

'visitChildren' @ [474:13] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Definition..Definition?) defined in org.jetbrains.idl2k.DefinitionVisitor[JavaMethodDescriptor]

'ctx' @ [474:27] ==> value-parameter ctx: WebIDLParser.ImplementsStatementContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitImplementsStatement[ValueParameterDescriptorImpl]

'defaultResult' @ [477:16] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'visitOperationImpl' @ [481:9] ==> private final fun visitOperationImpl(ctx: ParserRuleContext): Unit defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'ctx' @ [481:28] ==> value-parameter ctx: WebIDLParser.OperationContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitOperation[ValueParameterDescriptorImpl]

'defaultResult' @ [482:16] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'operations' @ [486:9] ==> private final val operations: ArrayList<Operation> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'add' @ [486:20] ==> public open fun add(element: Operation): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'OperationVisitor' @ [486:24] ==> public constructor OperationVisitor(attributes: List<ExtendedAttribute>, static: Boolean, namespace: String) defined in org.jetbrains.idl2k.OperationVisitor[ClassConstructorDescriptorImpl]

'memberAttributes' @ [486:41] ==> private final val memberAttributes: ArrayList<ExtendedAttribute> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'toList' @ [486:58] ==> public fun <T> Iterable<ExtendedAttribute>.toList(): List<ExtendedAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtendedAttribute

'static' @ [486:68] ==> private final var static: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'namespace' @ [486:76] ==> public final val namespace: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'visit' @ [486:87] ==> public open fun visit(p0: (ParseTree..ParseTree?)): (Operation..Operation?) defined in org.jetbrains.idl2k.OperationVisitor[JavaMethodDescriptor]

'ctx' @ [486:93] ==> value-parameter ctx: ParserRuleContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitOperationImpl[ValueParameterDescriptorImpl]

'memberAttributes' @ [487:9] ==> private final val memberAttributes: ArrayList<ExtendedAttribute> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'clear' @ [487:26] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'ctx' @ [491:13] ==> value-parameter ctx: WebIDLParser.InheritanceContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitInheritance[ValueParameterDescriptorImpl]

'children' @ [491:17] ==> public final var children: (MutableList<(ParseTree..ParseTree?)>..List<(ParseTree..ParseTree?)>?) defined in org.antlr.webidl.WebIDLParser.InheritanceContext[JavaPropertyDescriptor]

'inherited' @ [492:13] ==> private final val inherited: ArrayList<String> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'addAll' @ [492:23] ==> public open fun addAll(elements: Collection<String>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ctx' @ [492:30] ==> value-parameter ctx: WebIDLParser.InheritanceContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitInheritance[ValueParameterDescriptorImpl]

'children' @ [492:34] ==> public final var children: (MutableList<(ParseTree..ParseTree?)>..List<(ParseTree..ParseTree?)>?) defined in org.antlr.webidl.WebIDLParser.InheritanceContext[JavaPropertyDescriptor]

'filterIdentifiers' @ [492:43] ==> private fun List<ParseTree>?.filterIdentifiers(): List<ParseTree> defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'map' @ [492:63] ==> public inline fun <T, R> Iterable<ParseTree>.map(transform: (ParseTree) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParseTree
    <R> -> String

'it' @ [492:69] ==> value-parameter it: ParseTree defined in org.jetbrains.idl2k.DefinitionVisitor.visitInheritance.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [492:72] ==> public final val ParseTree.text: (String..String?)[MyPropertyDescriptor]

'trim' @ [492:77] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'filter' @ [492:86] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [492:95] ==> value-parameter it: String defined in org.jetbrains.idl2k.DefinitionVisitor.visitInheritance.<anonymous>[ValueParameterDescriptorImpl]

'defaultResult' @ [494:16] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'visitReadOnlyImpl' @ [498:16] ==> private final fun visitReadOnlyImpl(ctx: ParserRuleContext): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'ctx' @ [498:34] ==> value-parameter ctx: WebIDLParser.ReadOnlyContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitReadOnly[ValueParameterDescriptorImpl]

'visitReadOnlyImpl' @ [502:16] ==> private final fun visitReadOnlyImpl(ctx: ParserRuleContext): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'ctx' @ [502:34] ==> value-parameter ctx: WebIDLParser.ReadonlyMemberRestContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitReadonlyMemberRest[ValueParameterDescriptorImpl]

'readOnly' @ [506:9] ==> private final var readOnly: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'visitChildren' @ [507:9] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Definition..Definition?) defined in org.jetbrains.idl2k.DefinitionVisitor[JavaMethodDescriptor]

'ctx' @ [507:23] ==> value-parameter ctx: ParserRuleContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitReadOnlyImpl[ValueParameterDescriptorImpl]

'readOnly' @ [508:9] ==> private final var readOnly: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'defaultResult' @ [510:16] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'static' @ [514:9] ==> private final var static: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'visitChildren' @ [515:9] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Definition..Definition?) defined in org.jetbrains.idl2k.DefinitionVisitor[JavaMethodDescriptor]

'ctx' @ [515:23] ==> value-parameter ctx: WebIDLParser.StaticMemberContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitStaticMember[ValueParameterDescriptorImpl]

'static' @ [516:9] ==> private final var static: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'defaultResult' @ [518:16] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'if (ctx.children?.any { it is OperationRestContext } ?: false) {
            visitOperationImpl(ctx)
        } else {
            visitChildren(ctx)
        }' @ [522:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'ctx' @ [522:13] ==> value-parameter ctx: WebIDLParser.StaticMemberRestContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitStaticMemberRest[ValueParameterDescriptorImpl]

'children' @ [522:17] ==> public final var children: (MutableList<(ParseTree..ParseTree?)>..List<(ParseTree..ParseTree?)>?) defined in org.antlr.webidl.WebIDLParser.StaticMemberRestContext[JavaPropertyDescriptor]

'any' @ [522:27] ==> public inline fun <T> Iterable<(ParseTree..ParseTree?)>.any(predicate: ((ParseTree..ParseTree?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.antlr.v4.runtime.tree.ParseTree..org.antlr.v4.runtime.tree.ParseTree?)

'it' @ [522:33] ==> value-parameter it: (ParseTree..ParseTree?) defined in org.jetbrains.idl2k.DefinitionVisitor.visitStaticMemberRest.<anonymous>[ValueParameterDescriptorImpl]

'visitOperationImpl' @ [523:13] ==> private final fun visitOperationImpl(ctx: ParserRuleContext): Unit defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'ctx' @ [523:32] ==> value-parameter ctx: WebIDLParser.StaticMemberRestContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitStaticMemberRest[ValueParameterDescriptorImpl]

'visitChildren' @ [525:13] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Definition..Definition?) defined in org.jetbrains.idl2k.DefinitionVisitor[JavaMethodDescriptor]

'ctx' @ [525:27] ==> value-parameter ctx: WebIDLParser.StaticMemberRestContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitStaticMemberRest[ValueParameterDescriptorImpl]

'defaultResult' @ [528:16] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'with' @ [532:9] ==> @InlineOnly public inline fun <T, R> with(receiver: AttributeVisitor, block: AttributeVisitor.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AttributeVisitor
    <R> -> Boolean

'AttributeVisitor' @ [532:14] ==> public constructor AttributeVisitor(readOnly: Boolean = ..., static: Boolean = ..., namespace: String) defined in org.jetbrains.idl2k.AttributeVisitor[ClassConstructorDescriptorImpl]

'readOnly' @ [532:31] ==> private final var readOnly: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'static' @ [532:41] ==> private final var static: Boolean defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'namespace' @ [532:49] ==> public final val namespace: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'visit' @ [533:13] ==> public open fun visit(p0: (ParseTree..ParseTree?)): (Attribute..Attribute?) defined in org.jetbrains.idl2k.AttributeVisitor[JavaMethodDescriptor]

'ctx' @ [533:19] ==> value-parameter ctx: WebIDLParser.AttributeRestContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitAttributeRest[ValueParameterDescriptorImpl]

'this@DefinitionVisitor' @ [534:13] ==> <this> defined in org.jetbrains.idl2k.DefinitionVisitor[LazyClassReceiverParameterDescriptor]

'attributes' @ [534:36] ==> private final val attributes: ArrayList<Attribute> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'add' @ [534:47] ==> public open fun add(element: Attribute): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'visitChildren' @ [534:51] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Attribute..Attribute?) defined in org.jetbrains.idl2k.AttributeVisitor[JavaMethodDescriptor]

'ctx' @ [534:65] ==> value-parameter ctx: WebIDLParser.AttributeRestContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitAttributeRest[ValueParameterDescriptorImpl]

'defaultResult' @ [537:16] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'constants' @ [541:9] ==> private final val constants: ArrayList<Constant> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'add' @ [541:19] ==> public open fun add(element: Constant): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ConstantVisitor' @ [541:23] ==> public constructor ConstantVisitor() defined in org.jetbrains.idl2k.ConstantVisitor[ClassConstructorDescriptorImpl]

'visit' @ [541:41] ==> public open fun visit(p0: (ParseTree..ParseTree?)): (Constant..Constant?) defined in org.jetbrains.idl2k.ConstantVisitor[JavaMethodDescriptor]

'ctx' @ [541:47] ==> value-parameter ctx: WebIDLParser.Const_Context defined in org.jetbrains.idl2k.DefinitionVisitor.visitConst_[ValueParameterDescriptorImpl]

'memberAttributes' @ [542:9] ==> private final val memberAttributes: ArrayList<ExtendedAttribute> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'clear' @ [542:26] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'defaultResult' @ [544:16] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'memberAttributes' @ [548:9] ==> private final val memberAttributes: ArrayList<ExtendedAttribute> defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'add' @ [548:26] ==> public open fun add(element: ExtendedAttribute): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ExtendedAttributeParser' @ [548:30] ==> public constructor ExtendedAttributeParser(namespace: String) defined in org.jetbrains.idl2k.ExtendedAttributeParser[ClassConstructorDescriptorImpl]

'namespace' @ [548:54] ==> public final val namespace: String defined in org.jetbrains.idl2k.DefinitionVisitor[PropertyDescriptorImpl]

'visit' @ [548:65] ==> public open fun visit(p0: (ParseTree..ParseTree?)): (ExtendedAttribute..ExtendedAttribute?) defined in org.jetbrains.idl2k.ExtendedAttributeParser[JavaMethodDescriptor]

'ctx' @ [548:71] ==> value-parameter ctx: WebIDLParser.ExtendedAttributeContext defined in org.jetbrains.idl2k.DefinitionVisitor.visitExtendedAttribute[ValueParameterDescriptorImpl]

'defaultResult' @ [549:16] ==> protected open fun defaultResult(): Definition defined in org.jetbrains.idl2k.DefinitionVisitor[SimpleFunctionDescriptorImpl]

'WebIDLBaseVisitor<Unit>' @ [554:94] ==> public constructor WebIDLBaseVisitor<T : (Any..Any?)>() defined in org.antlr.webidl.WebIDLBaseVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'ArrayList' @ [555:30] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ExtendedAttribute

'DefinitionVisitor' @ [558:27] ==> public constructor DefinitionVisitor(extendedAttributes: List<ExtendedAttribute>, namespace: String, declarations: MutableList<Definition>) defined in org.jetbrains.idl2k.DefinitionVisitor[ClassConstructorDescriptorImpl]

'extendedAttributes' @ [558:45] ==> public final val extendedAttributes: ArrayList<ExtendedAttribute> defined in org.jetbrains.idl2k.ModuleVisitor[PropertyDescriptorImpl]

'toList' @ [558:64] ==> public fun <T> Iterable<ExtendedAttribute>.toList(): List<ExtendedAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtendedAttribute

'namespace' @ [558:74] ==> public final var namespace: String defined in org.jetbrains.idl2k.ModuleVisitor[PropertyDescriptorImpl]

'declarations' @ [558:85] ==> public final val declarations: MutableList<Definition> defined in org.jetbrains.idl2k.ModuleVisitor[PropertyDescriptorImpl]

'visitChildren' @ [558:99] ==> public open fun visitChildren(p0: (RuleNode..RuleNode?)): (Definition..Definition?) defined in org.jetbrains.idl2k.DefinitionVisitor[JavaMethodDescriptor]

'ctx' @ [558:113] ==> value-parameter ctx: WebIDLParser.DefinitionContext defined in org.jetbrains.idl2k.ModuleVisitor.visitDefinition[ValueParameterDescriptorImpl]

'extendedAttributes' @ [559:9] ==> public final val extendedAttributes: ArrayList<ExtendedAttribute> defined in org.jetbrains.idl2k.ModuleVisitor[PropertyDescriptorImpl]

'clear' @ [559:28] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'declarations' @ [560:9] ==> public final val declarations: MutableList<Definition> defined in org.jetbrains.idl2k.ModuleVisitor[PropertyDescriptorImpl]

'add' @ [560:22] ==> public abstract fun add(element: Definition): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'declaration' @ [560:26] ==> val declaration: (Definition..Definition?) defined in org.jetbrains.idl2k.ModuleVisitor.visitDefinition[LocalVariableDescriptor]

'with' @ [564:19] ==> @InlineOnly public inline fun <T, R> with(receiver: ExtendedAttributeParser, block: ExtendedAttributeParser.() -> (ExtendedAttribute..ExtendedAttribute?)): (ExtendedAttribute..ExtendedAttribute?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtendedAttributeParser
    <R> -> (org.jetbrains.idl2k.ExtendedAttribute..org.jetbrains.idl2k.ExtendedAttribute?)

'ExtendedAttributeParser' @ [564:24] ==> public constructor ExtendedAttributeParser(namespace: String) defined in org.jetbrains.idl2k.ExtendedAttributeParser[ClassConstructorDescriptorImpl]

'namespace' @ [564:48] ==> public final var namespace: String defined in org.jetbrains.idl2k.ModuleVisitor[PropertyDescriptorImpl]

'visit' @ [565:13] ==> public open fun visit(p0: (ParseTree..ParseTree?)): (ExtendedAttribute..ExtendedAttribute?) defined in org.jetbrains.idl2k.ExtendedAttributeParser[JavaMethodDescriptor]

'ctx' @ [565:19] ==> value-parameter ctx: WebIDLParser.ExtendedAttributeContext? defined in org.jetbrains.idl2k.ModuleVisitor.visitExtendedAttribute[ValueParameterDescriptorImpl]

'extendedAttributes' @ [568:9] ==> public final val extendedAttributes: ArrayList<ExtendedAttribute> defined in org.jetbrains.idl2k.ModuleVisitor[PropertyDescriptorImpl]

'add' @ [568:28] ==> public open fun add(element: ExtendedAttribute): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'att' @ [568:32] ==> val att: (ExtendedAttribute..ExtendedAttribute?) defined in org.jetbrains.idl2k.ModuleVisitor.visitExtendedAttribute[LocalVariableDescriptor]

'this' @ [572:9] ==> <this> defined in org.jetbrains.idl2k.ModuleVisitor[LazyClassReceiverParameterDescriptor]

'namespace' @ [572:14] ==> public final var namespace: String defined in org.jetbrains.idl2k.ModuleVisitor[PropertyDescriptorImpl]

'ctx' @ [572:26] ==> value-parameter ctx: WebIDLParser.NamespaceRestContext defined in org.jetbrains.idl2k.ModuleVisitor.visitNamespaceRest[ValueParameterDescriptorImpl]

'text' @ [572:30] ==> public final val WebIDLParser.NamespaceRestContext.text: (String..String?)[MyPropertyDescriptor]

'this' @ [576:69] ==> <this> defined in org.jetbrains.idl2k.filterIdentifiers[ReceiverParameterDescriptorImpl]

'filter' @ [576:75] ==> public inline fun <T> Iterable<ParseTree>.filter(predicate: (ParseTree) -> Boolean): List<ParseTree> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParseTree

'it' @ [576:84] ==> value-parameter it: ParseTree defined in org.jetbrains.idl2k.filterIdentifiers.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [576:106] ==> value-parameter it: ParseTree defined in org.jetbrains.idl2k.filterIdentifiers.<anonymous>[ValueParameterDescriptorImpl]

'symbol' @ [576:109] ==> public final val TerminalNode.symbol: (Token..Token?)[MyPropertyDescriptor]

'type' @ [576:116] ==> public final val Token.type: Int[MyPropertyDescriptor]

'IDENTIFIER_WEBIDL' @ [576:136] ==> public const final val IDENTIFIER_WEBIDL: Int defined in org.antlr.webidl.WebIDLLexer[JavaPropertyDescriptor]

'emptyList' @ [576:159] ==> public fun <T> emptyList(): List<ParseTree> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParseTree

'ctx' @ [577:47] ==> value-parameter ctx: ParserRuleContext defined in org.jetbrains.idl2k.getName[ValueParameterDescriptorImpl]

'children' @ [577:51] ==> public final var children: (MutableList<(ParseTree..ParseTree?)>..List<(ParseTree..ParseTree?)>?) defined in org.antlr.v4.runtime.ParserRuleContext[JavaPropertyDescriptor]

'filterIdentifiers' @ [577:60] ==> private fun List<ParseTree>?.filterIdentifiers(): List<ParseTree> defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'first' @ [577:80] ==> public fun <T> List<ParseTree>.first(): ParseTree defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParseTree

'text' @ [577:88] ==> public final val ParseTree.text: (String..String?)[MyPropertyDescriptor]

'ctx' @ [578:53] ==> value-parameter ctx: ParserRuleContext defined in org.jetbrains.idl2k.getNameOrNull[ValueParameterDescriptorImpl]

'children' @ [578:57] ==> public final var children: (MutableList<(ParseTree..ParseTree?)>..List<(ParseTree..ParseTree?)>?) defined in org.antlr.v4.runtime.ParserRuleContext[JavaPropertyDescriptor]

'filterIdentifiers' @ [578:66] ==> private fun List<ParseTree>?.filterIdentifiers(): List<ParseTree> defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [578:86] ==> public fun <T> List<ParseTree>.firstOrNull(): ParseTree? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParseTree

'text' @ [578:101] ==> public final val ParseTree.text: (String..String?)[MyPropertyDescriptor]

'WebIDLLexer' @ [581:14] ==> public constructor WebIDLLexer(input: (CharStream..CharStream?)) defined in org.antlr.webidl.WebIDLLexer[JavaClassConstructorDescriptor]

'reader' @ [581:26] ==> value-parameter reader: CharStream defined in org.jetbrains.idl2k.parseIDL[ValueParameterDescriptorImpl]

'WebIDLParser' @ [582:14] ==> public constructor WebIDLParser(input: (TokenStream..TokenStream?)) defined in org.antlr.webidl.WebIDLParser[JavaClassConstructorDescriptor]

'CommonTokenStream' @ [582:27] ==> public constructor CommonTokenStream(p0: (TokenSource..TokenSource?)) defined in org.antlr.v4.runtime.CommonTokenStream[JavaClassConstructorDescriptor]

'll' @ [582:45] ==> val ll: WebIDLLexer defined in org.jetbrains.idl2k.parseIDL[LocalVariableDescriptor]

'pp' @ [584:15] ==> val pp: WebIDLParser defined in org.jetbrains.idl2k.parseIDL[LocalVariableDescriptor]

'webIDL' @ [584:18] ==> public final fun webIDL(): (WebIDLParser.WebIDLContext..WebIDLParser.WebIDLContext?) defined in org.antlr.webidl.WebIDLParser[JavaMethodDescriptor]

'ArrayList' @ [585:24] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Definition

'ModuleVisitor' @ [586:5] ==> public constructor ModuleVisitor(declarations: MutableList<Definition>, namespace: String = ...) defined in org.jetbrains.idl2k.ModuleVisitor[ClassConstructorDescriptorImpl]

'declarations' @ [586:19] ==> val declarations: ArrayList<Definition> defined in org.jetbrains.idl2k.parseIDL[LocalVariableDescriptor]

'visit' @ [586:33] ==> public open fun visit(p0: (ParseTree..ParseTree?)): (Unit..Unit?) defined in org.jetbrains.idl2k.ModuleVisitor[JavaMethodDescriptor]

'idl' @ [586:39] ==> val idl: (WebIDLParser.WebIDLContext..WebIDLParser.WebIDLContext?) defined in org.jetbrains.idl2k.parseIDL[LocalVariableDescriptor]

'Repository' @ [588:12] ==> public constructor Repository(interfaces: Map<String, InterfaceDefinition>, typeDefs: Map<String, TypedefDefinition>, externals: Map<String, List<String>>, enums: Map<String, EnumDefinition>) defined in org.jetbrains.idl2k.Repository[ClassConstructorDescriptorImpl]

'declarations' @ [589:13] ==> val declarations: ArrayList<Definition> defined in org.jetbrains.idl2k.parseIDL[LocalVariableDescriptor]

'filterIsInstance' @ [589:26] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<InterfaceDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> InterfaceDefinition

'filter' @ [589:66] ==> public inline fun <T> Iterable<InterfaceDefinition>.filter(predicate: (InterfaceDefinition) -> Boolean): List<InterfaceDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InterfaceDefinition

'it' @ [589:75] ==> value-parameter it: InterfaceDefinition defined in org.jetbrains.idl2k.parseIDL.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [589:78] ==> public final val name: String defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'isEmpty' @ [589:83] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'not' @ [589:93] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'groupBy' @ [589:101] ==> public inline fun <T, K> Iterable<InterfaceDefinition>.groupBy(keySelector: (InterfaceDefinition) -> String): Map<String, List<InterfaceDefinition>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InterfaceDefinition
    <K> -> String

'it' @ [589:111] ==> value-parameter it: InterfaceDefinition defined in org.jetbrains.idl2k.parseIDL.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [589:114] ==> public final val name: String defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'mapValues' @ [589:121] ==> public inline fun <K, V, R> Map<out String, List<InterfaceDefinition>>.mapValues(transform: (Map.Entry<String, List<InterfaceDefinition>>) -> InterfaceDefinition): Map<String, InterfaceDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<InterfaceDefinition>
    <R> -> InterfaceDefinition

'it' @ [589:133] ==> value-parameter it: Map.Entry<String, List<InterfaceDefinition>> defined in org.jetbrains.idl2k.parseIDL.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [589:136] ==> public abstract val value: List<InterfaceDefinition> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'reduce' @ [589:142] ==> public inline fun <S, T : InterfaceDefinition> Iterable<InterfaceDefinition>.reduce(operation: (acc: InterfaceDefinition, InterfaceDefinition) -> InterfaceDefinition): InterfaceDefinition defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> InterfaceDefinition
    <T : S> -> InterfaceDefinition

'merge' @ [589:151] ==> public fun merge(i1: InterfaceDefinition, i2: InterfaceDefinition): InterfaceDefinition defined in org.jetbrains.idl2k in file idl.kt[SimpleFunctionDescriptorImpl]

'declarations' @ [590:13] ==> val declarations: ArrayList<Definition> defined in org.jetbrains.idl2k.parseIDL[LocalVariableDescriptor]

'filterIsInstance' @ [590:26] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<TypedefDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> TypedefDefinition

'groupBy' @ [590:64] ==> public inline fun <T, K> Iterable<TypedefDefinition>.groupBy(keySelector: (TypedefDefinition) -> String): Map<String, List<TypedefDefinition>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypedefDefinition
    <K> -> String

'it' @ [590:74] ==> value-parameter it: TypedefDefinition defined in org.jetbrains.idl2k.parseIDL.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [590:77] ==> public final val name: String defined in org.jetbrains.idl2k.TypedefDefinition[PropertyDescriptorImpl]

'mapValues' @ [590:84] ==> public inline fun <K, V, R> Map<out String, List<TypedefDefinition>>.mapValues(transform: (Map.Entry<String, List<TypedefDefinition>>) -> TypedefDefinition): Map<String, TypedefDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<TypedefDefinition>
    <R> -> TypedefDefinition

'it' @ [590:96] ==> value-parameter it: Map.Entry<String, List<TypedefDefinition>> defined in org.jetbrains.idl2k.parseIDL.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [590:99] ==> public abstract val value: List<TypedefDefinition> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'first' @ [590:105] ==> public fun <T> List<TypedefDefinition>.first(): TypedefDefinition defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypedefDefinition

'declarations' @ [591:13] ==> val declarations: ArrayList<Definition> defined in org.jetbrains.idl2k.parseIDL[LocalVariableDescriptor]

'filterIsInstance' @ [591:26] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ExtensionInterfaceDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ExtensionInterfaceDefinition

'groupBy' @ [591:75] ==> public inline fun <T, K> Iterable<ExtensionInterfaceDefinition>.groupBy(keySelector: (ExtensionInterfaceDefinition) -> String): Map<String, List<ExtensionInterfaceDefinition>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtensionInterfaceDefinition
    <K> -> String

'it' @ [591:85] ==> value-parameter it: ExtensionInterfaceDefinition defined in org.jetbrains.idl2k.parseIDL.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [591:88] ==> public final val name: String defined in org.jetbrains.idl2k.ExtensionInterfaceDefinition[PropertyDescriptorImpl]

'mapValues' @ [591:95] ==> public inline fun <K, V, R> Map<out String, List<ExtensionInterfaceDefinition>>.mapValues(transform: (Map.Entry<String, List<ExtensionInterfaceDefinition>>) -> List<String>): Map<String, List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<ExtensionInterfaceDefinition>
    <R> -> List<String>

'it' @ [591:107] ==> value-parameter it: Map.Entry<String, List<ExtensionInterfaceDefinition>> defined in org.jetbrains.idl2k.parseIDL.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [591:110] ==> public abstract val value: List<ExtensionInterfaceDefinition> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'map' @ [591:116] ==> public inline fun <T, R> Iterable<ExtensionInterfaceDefinition>.map(transform: (ExtensionInterfaceDefinition) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtensionInterfaceDefinition
    <R> -> String

'it' @ [591:122] ==> value-parameter it: ExtensionInterfaceDefinition defined in org.jetbrains.idl2k.parseIDL.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'implements' @ [591:125] ==> public final val implements: String defined in org.jetbrains.idl2k.ExtensionInterfaceDefinition[PropertyDescriptorImpl]

'declarations' @ [592:13] ==> val declarations: ArrayList<Definition> defined in org.jetbrains.idl2k.parseIDL[LocalVariableDescriptor]

'filterIsInstance' @ [592:26] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<EnumDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> EnumDefinition

'groupBy' @ [592:61] ==> public inline fun <T, K> Iterable<EnumDefinition>.groupBy(keySelector: (EnumDefinition) -> String): Map<String, List<EnumDefinition>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EnumDefinition
    <K> -> String

'it' @ [592:71] ==> value-parameter it: EnumDefinition defined in org.jetbrains.idl2k.parseIDL.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [592:74] ==> public final val name: String defined in org.jetbrains.idl2k.EnumDefinition[PropertyDescriptorImpl]

'mapValues' @ [592:81] ==> public inline fun <K, V, R> Map<out String, List<EnumDefinition>>.mapValues(transform: (Map.Entry<String, List<EnumDefinition>>) -> EnumDefinition): Map<String, EnumDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<EnumDefinition>
    <R> -> EnumDefinition

'it' @ [592:93] ==> value-parameter it: Map.Entry<String, List<EnumDefinition>> defined in org.jetbrains.idl2k.parseIDL.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [592:96] ==> public abstract val value: List<EnumDefinition> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'reduce' @ [592:102] ==> public inline fun <S, T : EnumDefinition> Iterable<EnumDefinition>.reduce(operation: (acc: EnumDefinition, EnumDefinition) -> EnumDefinition): EnumDefinition defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> EnumDefinition
    <T : S> -> EnumDefinition

'a' @ [592:119] ==> value-parameter a: EnumDefinition defined in org.jetbrains.idl2k.parseIDL.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'require' @ [597:5] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'i1' @ [597:13] ==> value-parameter i1: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'name' @ [597:16] ==> public final val name: String defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i2' @ [597:24] ==> value-parameter i2: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'name' @ [597:27] ==> public final val name: String defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'InterfaceDefinition' @ [599:12] ==> public constructor InterfaceDefinition(name: String, namespace: String, extendedAttributes: List<ExtendedAttribute>, operations: List<Operation>, attributes: List<Attribute>, superTypes: List<String>, constants: List<Constant>, dictionary: Boolean = ..., partial: Boolean, callback: Boolean) defined in org.jetbrains.idl2k.InterfaceDefinition[ClassConstructorDescriptorImpl]

'i1' @ [599:32] ==> value-parameter i1: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'name' @ [599:35] ==> public final val name: String defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'if (i1.partial) i2.namespace else i1.namespace' @ [600:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'i1' @ [600:29] ==> value-parameter i1: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'partial' @ [600:32] ==> public final val partial: Boolean defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i2' @ [600:41] ==> value-parameter i2: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'namespace' @ [600:44] ==> public final val namespace: String defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i1' @ [600:59] ==> value-parameter i1: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'namespace' @ [600:62] ==> public final val namespace: String defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i1' @ [601:34] ==> value-parameter i1: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'extendedAttributes' @ [601:37] ==> public final val extendedAttributes: List<ExtendedAttribute> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i2' @ [601:62] ==> value-parameter i2: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'extendedAttributes' @ [601:65] ==> public final val extendedAttributes: List<ExtendedAttribute> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i1' @ [602:26] ==> value-parameter i1: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'operations' @ [602:29] ==> public final val operations: List<Operation> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i2' @ [602:46] ==> value-parameter i2: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'operations' @ [602:49] ==> public final val operations: List<Operation> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i1' @ [603:26] ==> value-parameter i1: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'attributes' @ [603:29] ==> public final val attributes: List<Attribute> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i2' @ [603:46] ==> value-parameter i2: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'attributes' @ [603:49] ==> public final val attributes: List<Attribute> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i1' @ [604:26] ==> value-parameter i1: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'superTypes' @ [604:29] ==> public final val superTypes: List<String> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i2' @ [604:46] ==> value-parameter i2: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'superTypes' @ [604:49] ==> public final val superTypes: List<String> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i1' @ [605:25] ==> value-parameter i1: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'constants' @ [605:28] ==> public final val constants: List<Constant> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i2' @ [605:44] ==> value-parameter i2: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'constants' @ [605:47] ==> public final val constants: List<Constant> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i1' @ [606:26] ==> value-parameter i1: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'dictionary' @ [606:29] ==> public final val dictionary: Boolean defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i2' @ [606:43] ==> value-parameter i2: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'dictionary' @ [606:46] ==> public final val dictionary: Boolean defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i1' @ [607:23] ==> value-parameter i1: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'partial' @ [607:26] ==> public final val partial: Boolean defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i2' @ [607:37] ==> value-parameter i2: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'partial' @ [607:40] ==> public final val partial: Boolean defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i1' @ [608:24] ==> value-parameter i1: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'callback' @ [608:27] ==> public final val callback: Boolean defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'i2' @ [608:39] ==> value-parameter i2: InterfaceDefinition defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'callback' @ [608:42] ==> public final val callback: Boolean defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'this' @ [612:48] ==> <this> defined in org.jetbrains.idl2k.merge[ReceiverParameterDescriptorImpl]

'other' @ [612:55] ==> value-parameter other: List<T> defined in org.jetbrains.idl2k.merge[ValueParameterDescriptorImpl]

'distinct' @ [612:62] ==> public fun <T> Iterable<T>.distinct(): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

