'Element' @ [23:81] ==> public constructor Element() defined in org.jetbrains.kotlin.j2k.ast.Element[ClassConstructorDescriptorImpl]

'members' @ [36:31] ==> public final val members: List<Member> defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'filter' @ [36:39] ==> public inline fun <T> Iterable<Member>.filter(predicate: (Member) -> Boolean): List<Member> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Member

'!' @ [36:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [36:49] ==> value-parameter it: Member defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo.<anonymous>[ValueParameterDescriptorImpl]

'isEmpty' @ [36:52] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Member[PropertyDescriptorImpl]

'classKind' @ [37:13] ==> public final val classKind: ClassKind defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'ANONYMOUS_OBJECT' @ [37:36] ==> enum entry ANONYMOUS_OBJECT defined in org.jetbrains.kotlin.j2k.ClassKind[FakeCallableDescriptorForObject]

'membersFiltered' @ [37:56] ==> val membersFiltered: List<Member> defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo[LocalVariableDescriptor]

'isEmpty' @ [37:72] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'companionObjectMembers' @ [37:85] ==> public final val companionObjectMembers: List<Member> defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'isEmpty' @ [37:108] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'builder' @ [39:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo[ValueParameterDescriptorImpl]

'lBrace' @ [39:35] ==> public final val lBrace: LBrace defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'if (!classKind.isEnum()) {
            builder.append(membersFiltered.sortedByDescending { it is Property }, "\n")
        }
        else {
            val (constants, otherMembers) = membersFiltered.partition { it is EnumConstant }

            builder.append(constants, ", ")

            if (otherMembers.isNotEmpty() || companionObjectMembers.isNotEmpty()) {
                builder.append(";\n")
            }

            builder.append(otherMembers.sortedByDescending { it is Property }, "\n")
        }' @ [41:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CodeBuilder, elseBranch: CodeBuilder): CodeBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CodeBuilder

'!' @ [41:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classKind' @ [41:14] ==> public final val classKind: ClassKind defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'isEnum' @ [41:24] ==> public final fun isEnum(): Boolean defined in org.jetbrains.kotlin.j2k.ClassKind[SimpleFunctionDescriptorImpl]

'builder' @ [42:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo[ValueParameterDescriptorImpl]

'append' @ [42:21] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]

'membersFiltered' @ [42:28] ==> val membersFiltered: List<Member> defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo[LocalVariableDescriptor]

'sortedByDescending' @ [42:44] ==> public inline fun <T, R : Comparable<Boolean>> Iterable<Member>.sortedByDescending(crossinline selector: (Member) -> Boolean?): List<Member> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Member
    <R : Comparable<R>> -> Boolean

'it' @ [42:65] ==> value-parameter it: Member defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [45:18] ==> public final operator fun component1(): List<Member> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [45:29] ==> public final operator fun component2(): List<Member> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'membersFiltered' @ [45:45] ==> val membersFiltered: List<Member> defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo[LocalVariableDescriptor]

'partition' @ [45:61] ==> public inline fun <T> Iterable<Member>.partition(predicate: (Member) -> Boolean): Pair<List<Member>, List<Member>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Member

'it' @ [45:73] ==> value-parameter it: Member defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo.<anonymous>[ValueParameterDescriptorImpl]

'builder' @ [47:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo[ValueParameterDescriptorImpl]

'append' @ [47:21] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]

'constants' @ [47:28] ==> val constants: List<Member> defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo[LocalVariableDescriptor]

'otherMembers' @ [49:17] ==> val otherMembers: List<Member> defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo[LocalVariableDescriptor]

'isNotEmpty' @ [49:30] ==> @InlineOnly public inline fun <T> Collection<Member>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Member

'companionObjectMembers' @ [49:46] ==> public final val companionObjectMembers: List<Member> defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'isNotEmpty' @ [49:69] ==> @InlineOnly public inline fun <T> Collection<Member>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Member

'builder' @ [50:17] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo[ValueParameterDescriptorImpl]

'append' @ [50:25] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'builder' @ [53:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo[ValueParameterDescriptorImpl]

'append' @ [53:21] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]

'otherMembers' @ [53:28] ==> val otherMembers: List<Member> defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo[LocalVariableDescriptor]

'sortedByDescending' @ [53:41] ==> public inline fun <T, R : Comparable<Boolean>> Iterable<Member>.sortedByDescending(crossinline selector: (Member) -> Boolean?): List<Member> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Member
    <R : Comparable<R>> -> Boolean

'it' @ [53:62] ==> value-parameter it: Member defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo.<anonymous>[ValueParameterDescriptorImpl]

'appendCompanionObject' @ [56:9] ==> private final fun appendCompanionObject(builder: CodeBuilder, blankLineBefore: Boolean): Unit defined in org.jetbrains.kotlin.j2k.ast.ClassBody[SimpleFunctionDescriptorImpl]

'builder' @ [56:31] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo[ValueParameterDescriptorImpl]

'membersFiltered' @ [56:40] ==> val membersFiltered: List<Member> defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo[LocalVariableDescriptor]

'isNotEmpty' @ [56:56] ==> @InlineOnly public inline fun <T> Collection<Member>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Member

'builder' @ [58:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendTo[ValueParameterDescriptorImpl]

'rBrace' @ [58:36] ==> public final val rBrace: RBrace defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'companionObjectMembers' @ [62:13] ==> public final val companionObjectMembers: List<Member> defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'isEmpty' @ [62:36] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'blankLineBefore' @ [63:13] ==> value-parameter blankLineBefore: Boolean defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendCompanionObject[ValueParameterDescriptorImpl]

'builder' @ [63:30] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendCompanionObject[ValueParameterDescriptorImpl]

'append' @ [63:38] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'builder' @ [64:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ClassBody.appendCompanionObject[ValueParameterDescriptorImpl]

'append' @ [64:17] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]

'companionObjectMembers' @ [64:24] ==> public final val companionObjectMembers: List<Member> defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

