'emptyList' @ [29:47] ==> public fun <T> emptyList(): List<Constraint> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint

'simplifiedConstraints' @ [32:13] ==> private final var simplifiedConstraints: List<Constraint>? defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[PropertyDescriptorImpl]

'simplifiedConstraints' @ [33:13] ==> private final var simplifiedConstraints: List<Constraint>? defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[PropertyDescriptorImpl]

'simplifyConstraints' @ [33:37] ==> private final fun simplifyConstraints(): List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[SimpleFunctionDescriptorImpl]

'simplifiedConstraints' @ [35:16] ==> private final var simplifiedConstraints: List<Constraint>? defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[PropertyDescriptorImpl]

'ArrayList' @ [37:38] ==> public final fun <E> <init>(p0: (MutableCollection<out (Constraint..Constraint?)>..Collection<(Constraint..Constraint?)>?)): ArrayList<(Constraint..Constraint?)> /* = ArrayList<(Constraint..Constraint?)> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> (org.jetbrains.kotlin.resolve.calls.inference.model.Constraint..org.jetbrains.kotlin.resolve.calls.inference.model.Constraint?)

'constraints' @ [37:48] ==> value-parameter constraints: Collection<Constraint> = ... defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.<init>[ValueParameterDescriptorImpl]

'constraints' @ [43:46] ==> public open val constraints: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[PropertyDescriptorImpl]

'filter' @ [43:58] ==> public inline fun <T> Iterable<Constraint>.filter(predicate: (Constraint) -> Boolean): List<Constraint> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint

'it' @ [43:67] ==> value-parameter it: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.addConstraint.<anonymous>[ValueParameterDescriptorImpl]

'typeHashCode' @ [43:70] ==> public final val typeHashCode: Int defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'constraint' @ [43:86] ==> value-parameter constraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.addConstraint[ValueParameterDescriptorImpl]

'typeHashCode' @ [43:97] ==> public final val typeHashCode: Int defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'it' @ [43:113] ==> value-parameter it: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.addConstraint.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [43:116] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'constraint' @ [43:124] ==> value-parameter constraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.addConstraint[ValueParameterDescriptorImpl]

'type' @ [43:135] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'previousConstraintWithSameType' @ [45:13] ==> val previousConstraintWithSameType: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.addConstraint[LocalVariableDescriptor]

'any' @ [45:44] ==> public inline fun <T> Iterable<Constraint>.any(predicate: (Constraint) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint

'newConstraintIsUseless' @ [45:50] ==> private final fun newConstraintIsUseless(oldKind: ConstraintKind, newKind: ConstraintKind): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[SimpleFunctionDescriptorImpl]

'it' @ [45:73] ==> value-parameter it: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.addConstraint.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [45:76] ==> public final val kind: ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'constraint' @ [45:82] ==> value-parameter constraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.addConstraint[ValueParameterDescriptorImpl]

'kind' @ [45:93] ==> public final val kind: ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'if (previousConstraintWithSameType.isNotEmpty()) {
            // i.e. previous is LOWER and new is UPPER or opposite situation
            Constraint(ConstraintKind.EQUALITY, constraint.type, constraint.position, constraint.typeHashCode)
        }
        else {
            constraint
        }' @ [49:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Constraint, elseBranch: Constraint): Constraint[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Constraint

'previousConstraintWithSameType' @ [49:36] ==> val previousConstraintWithSameType: List<Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.addConstraint[LocalVariableDescriptor]

'isNotEmpty' @ [49:67] ==> @InlineOnly public inline fun <T> Collection<Constraint>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint

'Constraint' @ [51:13] ==> public constructor Constraint(kind: ConstraintKind, type: UnwrappedType, position: IncorporationConstraintPosition, typeHashCode: Int = ...) defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[ClassConstructorDescriptorImpl]

'EQUALITY' @ [51:39] ==> enum entry EQUALITY defined in org.jetbrains.kotlin.resolve.calls.inference.model.ConstraintKind[FakeCallableDescriptorForObject]

'constraint' @ [51:49] ==> value-parameter constraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.addConstraint[ValueParameterDescriptorImpl]

'type' @ [51:60] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'constraint' @ [51:66] ==> value-parameter constraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.addConstraint[ValueParameterDescriptorImpl]

'position' @ [51:77] ==> public final val position: IncorporationConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'constraint' @ [51:87] ==> value-parameter constraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.addConstraint[ValueParameterDescriptorImpl]

'typeHashCode' @ [51:98] ==> public final val typeHashCode: Int defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'constraint' @ [54:13] ==> value-parameter constraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.addConstraint[ValueParameterDescriptorImpl]

'mutableConstraints' @ [56:9] ==> private final val mutableConstraints: ArrayList<(Constraint..Constraint?)> /* = ArrayList<(Constraint..Constraint?)> */ defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[PropertyDescriptorImpl]

'add' @ [56:28] ==> public open fun add(element: (Constraint..Constraint?)): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'actualConstraint' @ [56:32] ==> val actualConstraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.addConstraint[LocalVariableDescriptor]

'simplifiedConstraints' @ [57:9] ==> private final var simplifiedConstraints: List<Constraint>? defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[PropertyDescriptorImpl]

'actualConstraint' @ [58:16] ==> val actualConstraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.addConstraint[LocalVariableDescriptor]

'mutableConstraints' @ [64:9] ==> private final val mutableConstraints: ArrayList<(Constraint..Constraint?)> /* = ArrayList<(Constraint..Constraint?)> */ defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[PropertyDescriptorImpl]

'trimToSize' @ [64:28] ==> internal fun <E> MutableList<(Constraint..Constraint?)>.trimToSize(newSize: Int): Unit defined in org.jetbrains.kotlin.resolve.calls.inference[SimpleFunctionDescriptorImpl]
Inferred types:
    <E> -> (org.jetbrains.kotlin.resolve.calls.inference.model.Constraint..org.jetbrains.kotlin.resolve.calls.inference.model.Constraint?)

'mutableConstraints' @ [64:39] ==> private final val mutableConstraints: ArrayList<(Constraint..Constraint?)> /* = ArrayList<(Constraint..Constraint?)> */ defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[PropertyDescriptorImpl]

'indexOfLast' @ [64:58] ==> public inline fun <T> List<(Constraint..Constraint?)>.indexOfLast(predicate: ((Constraint..Constraint?)) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.inference.model.Constraint..org.jetbrains.kotlin.resolve.calls.inference.model.Constraint?)

'!' @ [64:72] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [64:73] ==> public abstract operator fun invoke(p1: Constraint): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [64:86] ==> value-parameter it: (Constraint..Constraint?) defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.removeLastConstraints.<anonymous>[ValueParameterDescriptorImpl]

'simplifiedConstraints' @ [65:9] ==> private final var simplifiedConstraints: List<Constraint>? defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[PropertyDescriptorImpl]

'mutableConstraints' @ [70:9] ==> private final val mutableConstraints: ArrayList<(Constraint..Constraint?)> /* = ArrayList<(Constraint..Constraint?)> */ defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[PropertyDescriptorImpl]

'removeAll' @ [70:28] ==> public fun <T> MutableList<(Constraint..Constraint?)>.removeAll(predicate: ((Constraint..Constraint?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.inference.model.Constraint..org.jetbrains.kotlin.resolve.calls.inference.model.Constraint?)

'shouldRemove' @ [70:38] ==> value-parameter shouldRemove: (Constraint) -> Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.removeConstrains[ValueParameterDescriptorImpl]

'simplifiedConstraints' @ [71:9] ==> private final var simplifiedConstraints: List<Constraint>? defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[PropertyDescriptorImpl]

'when (oldKind) {
                ConstraintKind.EQUALITY -> true
                ConstraintKind.LOWER -> newKind == ConstraintKind.LOWER
                ConstraintKind.UPPER -> newKind == ConstraintKind.UPPER
            }' @ [75:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'oldKind' @ [75:19] ==> value-parameter oldKind: ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.newConstraintIsUseless[ValueParameterDescriptorImpl]

'EQUALITY' @ [76:32] ==> enum entry EQUALITY defined in org.jetbrains.kotlin.resolve.calls.inference.model.ConstraintKind[FakeCallableDescriptorForObject]

'LOWER' @ [77:32] ==> enum entry LOWER defined in org.jetbrains.kotlin.resolve.calls.inference.model.ConstraintKind[FakeCallableDescriptorForObject]

'newKind' @ [77:41] ==> value-parameter newKind: ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.newConstraintIsUseless[ValueParameterDescriptorImpl]

'LOWER' @ [77:67] ==> enum entry LOWER defined in org.jetbrains.kotlin.resolve.calls.inference.model.ConstraintKind[FakeCallableDescriptorForObject]

'UPPER' @ [78:32] ==> enum entry UPPER defined in org.jetbrains.kotlin.resolve.calls.inference.model.ConstraintKind[FakeCallableDescriptorForObject]

'newKind' @ [78:41] ==> value-parameter newKind: ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.newConstraintIsUseless[ValueParameterDescriptorImpl]

'UPPER' @ [78:67] ==> enum entry UPPER defined in org.jetbrains.kotlin.resolve.calls.inference.model.ConstraintKind[FakeCallableDescriptorForObject]

'mutableConstraints' @ [82:35] ==> private final val mutableConstraints: ArrayList<(Constraint..Constraint?)> /* = ArrayList<(Constraint..Constraint?)> */ defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[PropertyDescriptorImpl]

'filter' @ [83:18] ==> public inline fun <T> Iterable<(Constraint..Constraint?)>.filter(predicate: ((Constraint..Constraint?)) -> Boolean): List<(Constraint..Constraint?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.inference.model.Constraint..org.jetbrains.kotlin.resolve.calls.inference.model.Constraint?)

'it' @ [83:27] ==> value-parameter it: (Constraint..Constraint?) defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.simplifyConstraints.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [83:30] ==> public final val kind: ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'EQUALITY' @ [83:53] ==> enum entry EQUALITY defined in org.jetbrains.kotlin.resolve.calls.inference.model.ConstraintKind[FakeCallableDescriptorForObject]

'groupBy' @ [84:18] ==> public inline fun <T, K> Iterable<(Constraint..Constraint?)>.groupBy(keySelector: ((Constraint..Constraint?)) -> Int): Map<Int, List<(Constraint..Constraint?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.inference.model.Constraint..org.jetbrains.kotlin.resolve.calls.inference.model.Constraint?)
    <K> -> Int

'it' @ [84:28] ==> value-parameter it: (Constraint..Constraint?) defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.simplifyConstraints.<anonymous>[ValueParameterDescriptorImpl]

'typeHashCode' @ [84:31] ==> public final val typeHashCode: Int defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'mutableConstraints' @ [85:16] ==> private final val mutableConstraints: ArrayList<(Constraint..Constraint?)> /* = ArrayList<(Constraint..Constraint?)> */ defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[PropertyDescriptorImpl]

'filter' @ [85:35] ==> public inline fun <T> Iterable<(Constraint..Constraint?)>.filter(predicate: ((Constraint..Constraint?)) -> Boolean): List<(Constraint..Constraint?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.inference.model.Constraint..org.jetbrains.kotlin.resolve.calls.inference.model.Constraint?)

'isUsefulConstraint' @ [85:44] ==> private final fun isUsefulConstraint(constraint: Constraint, equalityConstraints: Map<Int, List<Constraint>>): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[SimpleFunctionDescriptorImpl]

'it' @ [85:63] ==> value-parameter it: (Constraint..Constraint?) defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.simplifyConstraints.<anonymous>[ValueParameterDescriptorImpl]

'equalityConstraints' @ [85:67] ==> val equalityConstraints: Map<Int, List<(Constraint..Constraint?)>> defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.simplifyConstraints[LocalVariableDescriptor]

'constraint' @ [89:13] ==> value-parameter constraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.isUsefulConstraint[ValueParameterDescriptorImpl]

'kind' @ [89:24] ==> public final val kind: ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'EQUALITY' @ [89:47] ==> enum entry EQUALITY defined in org.jetbrains.kotlin.resolve.calls.inference.model.ConstraintKind[FakeCallableDescriptorForObject]

'equalityConstraints' @ [90:16] ==> value-parameter equalityConstraints: Map<Int, List<Constraint>> defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.isUsefulConstraint[ValueParameterDescriptorImpl]

'constraint' @ [90:36] ==> value-parameter constraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.isUsefulConstraint[ValueParameterDescriptorImpl]

'typeHashCode' @ [90:47] ==> public final val typeHashCode: Int defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'none' @ [90:62] ==> public inline fun <T> Iterable<Constraint>.none(predicate: (Constraint) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constraint

'it' @ [90:69] ==> value-parameter it: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.isUsefulConstraint.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [90:72] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'constraint' @ [90:80] ==> value-parameter constraint: Constraint defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints.isUsefulConstraint[ValueParameterDescriptorImpl]

'type' @ [90:91] ==> public final val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.Constraint[PropertyDescriptorImpl]

'typeVariable' @ [94:34] ==> public open val typeVariable: NewTypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.model.MutableVariableWithConstraints[PropertyDescriptorImpl]

'LinkedHashMap' @ [100:83] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> TypeConstructor
    <V : (Any..Any?)> -> NewTypeVariable

'LinkedHashMap' @ [101:103] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> TypeConstructor
    <V : (Any..Any?)> -> MutableVariableWithConstraints

'ArrayList' @ [102:71] ==> public final fun <E> <init>(): ArrayList<InitialConstraint> /* = ArrayList<InitialConstraint> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> InitialConstraint

'ArrayList' @ [104:62] ==> public final fun <E> <init>(): ArrayList<KotlinCallDiagnostic> /* = ArrayList<KotlinCallDiagnostic> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> KotlinCallDiagnostic

'LinkedHashMap' @ [105:83] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> TypeConstructor
    <V : (Any..Any?)> -> UnwrappedType

