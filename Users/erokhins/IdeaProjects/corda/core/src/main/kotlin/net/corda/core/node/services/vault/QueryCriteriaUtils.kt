'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'CordaSerializable' @ [11:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [46:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [55:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'CriteriaExpression<O, Boolean>' @ [57:157] ==> private constructor CriteriaExpression<O, out T>() defined in net.corda.core.node.services.vault.CriteriaExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> O
    <out T> -> Boolean

'CriteriaExpression<O, Boolean>' @ [58:73] ==> private constructor CriteriaExpression<O, out T>() defined in net.corda.core.node.services.vault.CriteriaExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> O
    <out T> -> Boolean

'CriteriaExpression<O, Boolean>' @ [59:111] ==> private constructor CriteriaExpression<O, out T>() defined in net.corda.core.node.services.vault.CriteriaExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> O
    <out T> -> Boolean

'CriteriaExpression<O, Boolean>' @ [62:82] ==> private constructor CriteriaExpression<O, out T>() defined in net.corda.core.node.services.vault.CriteriaExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> O
    <out T> -> Boolean

'CordaSerializable' @ [65:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'this' @ [67:33] ==> public constructor Column<O, out C>(name: String, declaringClass: Class<*>) defined in net.corda.core.node.services.vault.Column[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> O
    <out C> -> C

'field' @ [67:38] ==> value-parameter field: Field defined in net.corda.core.node.services.vault.Column.<init>[ValueParameterDescriptorImpl]

'name' @ [67:44] ==> public final val Field.name: (String..String?)[MyPropertyDescriptor]

'field' @ [67:50] ==> value-parameter field: Field defined in net.corda.core.node.services.vault.Column.<init>[ValueParameterDescriptorImpl]

'declaringClass' @ [67:56] ==> public final val Field.declaringClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'this' @ [68:48] ==> public constructor Column<O, out C>(name: String, declaringClass: Class<*>) defined in net.corda.core.node.services.vault.Column[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> O
    <out C> -> C

'property' @ [68:53] ==> value-parameter property: KProperty1<O, C?> defined in net.corda.core.node.services.vault.Column.<init>[ValueParameterDescriptorImpl]

'name' @ [68:62] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'property' @ [68:68] ==> value-parameter property: KProperty1<O, C?> defined in net.corda.core.node.services.vault.Column.<init>[ValueParameterDescriptorImpl]

'javaGetter' @ [68:77] ==> public val KProperty<*>.javaGetter: Method? defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'declaringClass' @ [68:90] ==> public final val Method.declaringClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'CordaSerializable' @ [71:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'ColumnPredicate<C>' @ [73:103] ==> private constructor ColumnPredicate<C>() defined in net.corda.core.node.services.vault.ColumnPredicate[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> C

'ColumnPredicate<C>' @ [74:115] ==> private constructor ColumnPredicate<C>() defined in net.corda.core.node.services.vault.ColumnPredicate[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> C

'ColumnPredicate<String>' @ [75:85] ==> private constructor ColumnPredicate<C>() defined in net.corda.core.node.services.vault.ColumnPredicate[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> String

'ColumnPredicate<C>' @ [76:109] ==> private constructor ColumnPredicate<C>() defined in net.corda.core.node.services.vault.ColumnPredicate[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> C

'ColumnPredicate<C>' @ [77:93] ==> private constructor ColumnPredicate<C>() defined in net.corda.core.node.services.vault.ColumnPredicate[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> C

'ColumnPredicate<C>' @ [78:64] ==> private constructor ColumnPredicate<C>() defined in net.corda.core.node.services.vault.ColumnPredicate[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> C

'ColumnPredicate<C>' @ [79:72] ==> private constructor ColumnPredicate<C>() defined in net.corda.core.node.services.vault.ColumnPredicate[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> C

'when (expression) {
        is CriteriaExpression.BinaryLogical -> resolveEnclosingObjectFromExpression(expression.left)
        is CriteriaExpression.Not -> resolveEnclosingObjectFromExpression(expression.expression)
        is CriteriaExpression.ColumnPredicateExpression<O, *> -> resolveEnclosingObjectFromColumn(expression.column)
        is CriteriaExpression.AggregateFunctionExpression<O, *> -> resolveEnclosingObjectFromColumn(expression.column)
    }' @ [83:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Class<O>, entry1: Class<O>, entry2: Class<O>, entry3: Class<O>): Class<O>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Class<O>

'expression' @ [83:18] ==> value-parameter expression: CriteriaExpression<O, R> defined in net.corda.core.node.services.vault.resolveEnclosingObjectFromExpression[ValueParameterDescriptorImpl]

'resolveEnclosingObjectFromExpression' @ [84:48] ==> public fun <O, R> resolveEnclosingObjectFromExpression(expression: CriteriaExpression<O, Boolean>): Class<O> defined in net.corda.core.node.services.vault[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> Boolean

'expression' @ [84:85] ==> value-parameter expression: CriteriaExpression<O, R> defined in net.corda.core.node.services.vault.resolveEnclosingObjectFromExpression[ValueParameterDescriptorImpl]

'left' @ [84:96] ==> public final val left: CriteriaExpression<O, Boolean> defined in net.corda.core.node.services.vault.CriteriaExpression.BinaryLogical[PropertyDescriptorImpl]

'resolveEnclosingObjectFromExpression' @ [85:38] ==> public fun <O, R> resolveEnclosingObjectFromExpression(expression: CriteriaExpression<O, Boolean>): Class<O> defined in net.corda.core.node.services.vault[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> Boolean

'expression' @ [85:75] ==> value-parameter expression: CriteriaExpression<O, R> defined in net.corda.core.node.services.vault.resolveEnclosingObjectFromExpression[ValueParameterDescriptorImpl]

'expression' @ [85:86] ==> public final val expression: CriteriaExpression<O, Boolean> defined in net.corda.core.node.services.vault.CriteriaExpression.Not[PropertyDescriptorImpl]

'resolveEnclosingObjectFromColumn' @ [86:66] ==> @Suppress public fun <O, C> resolveEnclosingObjectFromColumn(column: Column<O, Any?>): Class<O> defined in net.corda.core.node.services.vault[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <C> -> Any?

'expression' @ [86:99] ==> value-parameter expression: CriteriaExpression<O, R> defined in net.corda.core.node.services.vault.resolveEnclosingObjectFromExpression[ValueParameterDescriptorImpl]

'column' @ [86:110] ==> public final val column: Column<O, Any?> defined in net.corda.core.node.services.vault.CriteriaExpression.ColumnPredicateExpression[PropertyDescriptorImpl]

'resolveEnclosingObjectFromColumn' @ [87:68] ==> @Suppress public fun <O, C> resolveEnclosingObjectFromColumn(column: Column<O, Any?>): Class<O> defined in net.corda.core.node.services.vault[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <C> -> Any?

'expression' @ [87:101] ==> value-parameter expression: CriteriaExpression<O, R> defined in net.corda.core.node.services.vault.resolveEnclosingObjectFromExpression[ValueParameterDescriptorImpl]

'column' @ [87:112] ==> public final val column: Column<O, Any?> defined in net.corda.core.node.services.vault.CriteriaExpression.AggregateFunctionExpression[PropertyDescriptorImpl]

'Suppress' @ [91:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'column' @ [92:79] ==> value-parameter column: Column<O, C> defined in net.corda.core.node.services.vault.resolveEnclosingObjectFromColumn[ValueParameterDescriptorImpl]

'declaringClass' @ [92:86] ==> public final val declaringClass: Class<*> defined in net.corda.core.node.services.vault.Column[PropertyDescriptorImpl]

'column' @ [93:58] ==> value-parameter column: Column<O, C> defined in net.corda.core.node.services.vault.getColumnName[ValueParameterDescriptorImpl]

'name' @ [93:65] ==> public final val name: String defined in net.corda.core.node.services.vault.Column[PropertyDescriptorImpl]

'Int' @ [114:27] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [114:31] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'CordaSerializable' @ [123:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'-' @ [124:52] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'DEFAULT_PAGE_SIZE' @ [124:76] ==> public const val DEFAULT_PAGE_SIZE: Int defined in net.corda.core.node.services.vault in file QueryCriteriaUtils.kt[PropertyDescriptorImpl]

'pageSize' @ [125:22] ==> public final val pageSize: Int defined in net.corda.core.node.services.vault.PageSpecification[PropertyDescriptorImpl]

'DEFAULT_PAGE_SIZE' @ [125:34] ==> public const val DEFAULT_PAGE_SIZE: Int defined in net.corda.core.node.services.vault in file QueryCriteriaUtils.kt[PropertyDescriptorImpl]

'pageNumber' @ [125:55] ==> public final val pageNumber: Int defined in net.corda.core.node.services.vault.PageSpecification[PropertyDescriptorImpl]

'-' @ [125:69] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'CordaSerializable' @ [132:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [134:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [140:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'' @ [144:18] ==> private constructor CommonStateAttribute(attributeParent: String, attributeChild: String?) defined in net.corda.core.node.services.vault.Sort.CommonStateAttribute[ClassConstructorDescriptorImpl]

'' @ [145:25] ==> private constructor CommonStateAttribute(attributeParent: String, attributeChild: String?) defined in net.corda.core.node.services.vault.Sort.CommonStateAttribute[ClassConstructorDescriptorImpl]

'' @ [146:24] ==> private constructor CommonStateAttribute(attributeParent: String, attributeChild: String?) defined in net.corda.core.node.services.vault.Sort.CommonStateAttribute[ClassConstructorDescriptorImpl]

'' @ [151:20] ==> private constructor VaultStateAttribute(attributeName: String) defined in net.corda.core.node.services.vault.Sort.VaultStateAttribute[ClassConstructorDescriptorImpl]

'' @ [152:22] ==> private constructor VaultStateAttribute(attributeName: String) defined in net.corda.core.node.services.vault.Sort.VaultStateAttribute[ClassConstructorDescriptorImpl]

'' @ [153:21] ==> private constructor VaultStateAttribute(attributeName: String) defined in net.corda.core.node.services.vault.Sort.VaultStateAttribute[ClassConstructorDescriptorImpl]

'' @ [154:22] ==> private constructor VaultStateAttribute(attributeName: String) defined in net.corda.core.node.services.vault.Sort.VaultStateAttribute[ClassConstructorDescriptorImpl]

'' @ [155:22] ==> private constructor VaultStateAttribute(attributeName: String) defined in net.corda.core.node.services.vault.Sort.VaultStateAttribute[ClassConstructorDescriptorImpl]

'' @ [156:16] ==> private constructor VaultStateAttribute(attributeName: String) defined in net.corda.core.node.services.vault.Sort.VaultStateAttribute[ClassConstructorDescriptorImpl]

'' @ [161:13] ==> private constructor LinearStateAttribute(attributeName: String) defined in net.corda.core.node.services.vault.Sort.LinearStateAttribute[ClassConstructorDescriptorImpl]

'' @ [162:20] ==> private constructor LinearStateAttribute(attributeName: String) defined in net.corda.core.node.services.vault.Sort.LinearStateAttribute[ClassConstructorDescriptorImpl]

'' @ [167:17] ==> private constructor FungibleStateAttribute(attributeName: String) defined in net.corda.core.node.services.vault.Sort.FungibleStateAttribute[ClassConstructorDescriptorImpl]

'' @ [168:19] ==> private constructor FungibleStateAttribute(attributeName: String) defined in net.corda.core.node.services.vault.Sort.FungibleStateAttribute[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [171:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'ASC' @ [174:56] ==> enum entry ASC defined in net.corda.core.node.services.vault.Sort.Direction[FakeCallableDescriptorForObject]

'CordaSerializable' @ [177:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'SortAttribute' @ [183:58] ==> private constructor SortAttribute() defined in net.corda.core.node.services.vault.SortAttribute[ClassConstructorDescriptorImpl]

'SortAttribute' @ [191:60] ==> private constructor SortAttribute() defined in net.corda.core.node.services.vault.SortAttribute[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [194:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'BinaryComparison' @ [197:101] ==> public constructor BinaryComparison<C : Comparable<R>>(operator: BinaryComparisonOperator, rightLiteral: R) defined in net.corda.core.node.services.vault.ColumnPredicate.BinaryComparison[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Comparable<C>> -> R

'operator' @ [197:118] ==> value-parameter operator: BinaryComparisonOperator defined in net.corda.core.node.services.vault.Builder.compare[ValueParameterDescriptorImpl]

'value' @ [197:128] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.compare[ValueParameterDescriptorImpl]

'ColumnPredicateExpression' @ [198:96] ==> public constructor ColumnPredicateExpression<O, C>(column: Column<O, R>, predicate: ColumnPredicate<R>) defined in net.corda.core.node.services.vault.CriteriaExpression.ColumnPredicateExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> O
    <C> -> R

'Column' @ [198:122] ==> public constructor Column<O, out C>(property: KProperty1<O, R?>) defined in net.corda.core.node.services.vault.Column[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> O
    <out C> -> R

'this' @ [198:129] ==> <this> defined in net.corda.core.node.services.vault.Builder.predicate[ReceiverParameterDescriptorImpl]

'predicate' @ [198:136] ==> value-parameter predicate: ColumnPredicate<R> defined in net.corda.core.node.services.vault.Builder.predicate[ValueParameterDescriptorImpl]

'ColumnPredicateExpression' @ [200:81] ==> public constructor ColumnPredicateExpression<O, C>(column: Column<Any, R>, predicate: ColumnPredicate<R>) defined in net.corda.core.node.services.vault.CriteriaExpression.ColumnPredicateExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> Any
    <C> -> R

'Column' @ [200:107] ==> public constructor Column<O, out C>(field: Field) defined in net.corda.core.node.services.vault.Column[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> Any
    <out C> -> R

'this' @ [200:122] ==> <this> defined in net.corda.core.node.services.vault.Builder.predicate[ReceiverParameterDescriptorImpl]

'predicate' @ [200:129] ==> value-parameter predicate: ColumnPredicate<R> defined in net.corda.core.node.services.vault.Builder.predicate[ValueParameterDescriptorImpl]

'AggregateFunctionExpression' @ [203:34] ==> public constructor AggregateFunctionExpression<O, C>(column: Column<O, R>, predicate: ColumnPredicate<R>, groupByColumns: List<Column<O, R>>?, orderBy: Sort.Direction?) defined in net.corda.core.node.services.vault.CriteriaExpression.AggregateFunctionExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> O
    <C> -> R

'Column' @ [203:62] ==> public constructor Column<O, out C>(property: KProperty1<O, R?>) defined in net.corda.core.node.services.vault.Column[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> O
    <out C> -> R

'this' @ [203:69] ==> <this> defined in net.corda.core.node.services.vault.Builder.functionPredicate[ReceiverParameterDescriptorImpl]

'predicate' @ [203:76] ==> value-parameter predicate: ColumnPredicate<R> defined in net.corda.core.node.services.vault.Builder.functionPredicate[ValueParameterDescriptorImpl]

'groupByColumns' @ [203:87] ==> value-parameter groupByColumns: List<Column<O, R>>? = ... defined in net.corda.core.node.services.vault.Builder.functionPredicate[ValueParameterDescriptorImpl]

'orderBy' @ [203:103] ==> value-parameter orderBy: Sort.Direction? = ... defined in net.corda.core.node.services.vault.Builder.functionPredicate[ValueParameterDescriptorImpl]

'AggregateFunctionExpression' @ [205:34] ==> public constructor AggregateFunctionExpression<O, C>(column: Column<Any, R>, predicate: ColumnPredicate<R>, groupByColumns: List<Column<Any, R>>?, orderBy: Sort.Direction?) defined in net.corda.core.node.services.vault.CriteriaExpression.AggregateFunctionExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> Any
    <C> -> R

'Column' @ [205:62] ==> public constructor Column<O, out C>(field: Field) defined in net.corda.core.node.services.vault.Column[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> Any
    <out C> -> R

'this' @ [205:77] ==> <this> defined in net.corda.core.node.services.vault.Builder.functionPredicate[ReceiverParameterDescriptorImpl]

'predicate' @ [205:84] ==> value-parameter predicate: ColumnPredicate<R> defined in net.corda.core.node.services.vault.Builder.functionPredicate[ValueParameterDescriptorImpl]

'groupByColumns' @ [205:95] ==> value-parameter groupByColumns: List<Column<Any, R>>? = ... defined in net.corda.core.node.services.vault.Builder.functionPredicate[ValueParameterDescriptorImpl]

'orderBy' @ [205:111] ==> value-parameter orderBy: Sort.Direction? = ... defined in net.corda.core.node.services.vault.Builder.functionPredicate[ValueParameterDescriptorImpl]

'predicate' @ [207:115] ==> public final fun <O, R> KProperty1<O, R?>.predicate(predicate: ColumnPredicate<R>): CriteriaExpression.ColumnPredicateExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> R

'compare' @ [207:125] ==> public final fun <R : Comparable<R>> compare(operator: BinaryComparisonOperator, value: R): ColumnPredicate.BinaryComparison<R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R : Comparable<R>> -> R

'operator' @ [207:133] ==> value-parameter operator: BinaryComparisonOperator defined in net.corda.core.node.services.vault.Builder.comparePredicate[ValueParameterDescriptorImpl]

'value' @ [207:143] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.comparePredicate[ValueParameterDescriptorImpl]

'predicate' @ [208:100] ==> public final fun <R> Field.predicate(predicate: ColumnPredicate<R>): CriteriaExpression.ColumnPredicateExpression<Any, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R

'compare' @ [208:110] ==> public final fun <R : Comparable<R>> compare(operator: BinaryComparisonOperator, value: R): ColumnPredicate.BinaryComparison<R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R : Comparable<R>> -> R

'operator' @ [208:118] ==> value-parameter operator: BinaryComparisonOperator defined in net.corda.core.node.services.vault.Builder.comparePredicate[ValueParameterDescriptorImpl]

'value' @ [208:128] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.comparePredicate[ValueParameterDescriptorImpl]

'predicate' @ [210:52] ==> public final fun <O, R> KProperty1<O, R?>.predicate(predicate: ColumnPredicate<R>): CriteriaExpression.ColumnPredicateExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> R

'EqualityComparison' @ [210:78] ==> public constructor EqualityComparison<C>(operator: EqualityComparisonOperator, rightLiteral: R) defined in net.corda.core.node.services.vault.ColumnPredicate.EqualityComparison[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'EQUAL' @ [210:124] ==> enum entry EQUAL defined in net.corda.core.node.services.vault.EqualityComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [210:131] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.equal[ValueParameterDescriptorImpl]

'predicate' @ [211:55] ==> public final fun <O, R> KProperty1<O, R?>.predicate(predicate: ColumnPredicate<R>): CriteriaExpression.ColumnPredicateExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> R

'EqualityComparison' @ [211:81] ==> public constructor EqualityComparison<C>(operator: EqualityComparisonOperator, rightLiteral: R) defined in net.corda.core.node.services.vault.ColumnPredicate.EqualityComparison[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'NOT_EQUAL' @ [211:127] ==> enum entry NOT_EQUAL defined in net.corda.core.node.services.vault.EqualityComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [211:138] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.notEqual[ValueParameterDescriptorImpl]

'comparePredicate' @ [212:71] ==> public final fun <O, R : Comparable<R>> KProperty1<O, R?>.comparePredicate(operator: BinaryComparisonOperator, value: R): CriteriaExpression.ColumnPredicateExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R : Comparable<R>> -> R

'LESS_THAN' @ [212:113] ==> enum entry LESS_THAN defined in net.corda.core.node.services.vault.BinaryComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [212:124] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.lessThan[ValueParameterDescriptorImpl]

'comparePredicate' @ [213:78] ==> public final fun <O, R : Comparable<R>> KProperty1<O, R?>.comparePredicate(operator: BinaryComparisonOperator, value: R): CriteriaExpression.ColumnPredicateExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R : Comparable<R>> -> R

'LESS_THAN_OR_EQUAL' @ [213:120] ==> enum entry LESS_THAN_OR_EQUAL defined in net.corda.core.node.services.vault.BinaryComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [213:140] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.lessThanOrEqual[ValueParameterDescriptorImpl]

'comparePredicate' @ [214:74] ==> public final fun <O, R : Comparable<R>> KProperty1<O, R?>.comparePredicate(operator: BinaryComparisonOperator, value: R): CriteriaExpression.ColumnPredicateExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R : Comparable<R>> -> R

'GREATER_THAN' @ [214:116] ==> enum entry GREATER_THAN defined in net.corda.core.node.services.vault.BinaryComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [214:130] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.greaterThan[ValueParameterDescriptorImpl]

'comparePredicate' @ [215:81] ==> public final fun <O, R : Comparable<R>> KProperty1<O, R?>.comparePredicate(operator: BinaryComparisonOperator, value: R): CriteriaExpression.ColumnPredicateExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R : Comparable<R>> -> R

'GREATER_THAN_OR_EQUAL' @ [215:123] ==> enum entry GREATER_THAN_OR_EQUAL defined in net.corda.core.node.services.vault.BinaryComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [215:146] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.greaterThanOrEqual[ValueParameterDescriptorImpl]

'predicate' @ [216:76] ==> public final fun <O, R> KProperty1<O, R?>.predicate(predicate: ColumnPredicate<R>): CriteriaExpression.ColumnPredicateExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> R

'Between' @ [216:102] ==> public constructor Between<C : Comparable<R>>(rightFromLiteral: R, rightToLiteral: R) defined in net.corda.core.node.services.vault.ColumnPredicate.Between[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Comparable<C>> -> R

'from' @ [216:110] ==> value-parameter from: R defined in net.corda.core.node.services.vault.Builder.between[ValueParameterDescriptorImpl]

'to' @ [216:116] ==> value-parameter to: R defined in net.corda.core.node.services.vault.Builder.between[ValueParameterDescriptorImpl]

'predicate' @ [217:84] ==> public final fun <O, R> KProperty1<O, R?>.predicate(predicate: ColumnPredicate<R>): CriteriaExpression.ColumnPredicateExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> R

'CollectionExpression' @ [217:110] ==> public constructor CollectionExpression<C>(operator: CollectionOperator, rightLiteral: Collection<R>) defined in net.corda.core.node.services.vault.ColumnPredicate.CollectionExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'IN' @ [217:150] ==> enum entry IN defined in net.corda.core.node.services.vault.CollectionOperator[FakeCallableDescriptorForObject]

'collection' @ [217:154] ==> value-parameter collection: Collection<R> defined in net.corda.core.node.services.vault.Builder.`in`[ValueParameterDescriptorImpl]

'predicate' @ [218:85] ==> public final fun <O, R> KProperty1<O, R?>.predicate(predicate: ColumnPredicate<R>): CriteriaExpression.ColumnPredicateExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> R

'CollectionExpression' @ [218:111] ==> public constructor CollectionExpression<C>(operator: CollectionOperator, rightLiteral: Collection<R>) defined in net.corda.core.node.services.vault.ColumnPredicate.CollectionExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'NOT_IN' @ [218:151] ==> enum entry NOT_IN defined in net.corda.core.node.services.vault.CollectionOperator[FakeCallableDescriptorForObject]

'collection' @ [218:159] ==> value-parameter collection: Collection<R> defined in net.corda.core.node.services.vault.Builder.notIn[ValueParameterDescriptorImpl]

'JvmStatic' @ [220:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'predicate' @ [220:48] ==> public final fun <R> Field.predicate(predicate: ColumnPredicate<R>): CriteriaExpression.ColumnPredicateExpression<Any, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R

'EqualityComparison' @ [220:74] ==> public constructor EqualityComparison<C>(operator: EqualityComparisonOperator, rightLiteral: R) defined in net.corda.core.node.services.vault.ColumnPredicate.EqualityComparison[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'EQUAL' @ [220:120] ==> enum entry EQUAL defined in net.corda.core.node.services.vault.EqualityComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [220:127] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.equal[ValueParameterDescriptorImpl]

'JvmStatic' @ [221:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'predicate' @ [221:51] ==> public final fun <R> Field.predicate(predicate: ColumnPredicate<R>): CriteriaExpression.ColumnPredicateExpression<Any, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R

'EqualityComparison' @ [221:77] ==> public constructor EqualityComparison<C>(operator: EqualityComparisonOperator, rightLiteral: R) defined in net.corda.core.node.services.vault.ColumnPredicate.EqualityComparison[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'NOT_EQUAL' @ [221:123] ==> enum entry NOT_EQUAL defined in net.corda.core.node.services.vault.EqualityComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [221:134] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.notEqual[ValueParameterDescriptorImpl]

'JvmStatic' @ [222:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'comparePredicate' @ [222:67] ==> public final fun <R : Comparable<R>> Field.comparePredicate(operator: BinaryComparisonOperator, value: R): CriteriaExpression.ColumnPredicateExpression<Any, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R : Comparable<R>> -> R

'LESS_THAN' @ [222:109] ==> enum entry LESS_THAN defined in net.corda.core.node.services.vault.BinaryComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [222:120] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.lessThan[ValueParameterDescriptorImpl]

'JvmStatic' @ [223:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'comparePredicate' @ [223:74] ==> public final fun <R : Comparable<R>> Field.comparePredicate(operator: BinaryComparisonOperator, value: R): CriteriaExpression.ColumnPredicateExpression<Any, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R : Comparable<R>> -> R

'LESS_THAN_OR_EQUAL' @ [223:116] ==> enum entry LESS_THAN_OR_EQUAL defined in net.corda.core.node.services.vault.BinaryComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [223:136] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.lessThanOrEqual[ValueParameterDescriptorImpl]

'JvmStatic' @ [224:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'comparePredicate' @ [224:70] ==> public final fun <R : Comparable<R>> Field.comparePredicate(operator: BinaryComparisonOperator, value: R): CriteriaExpression.ColumnPredicateExpression<Any, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R : Comparable<R>> -> R

'GREATER_THAN' @ [224:112] ==> enum entry GREATER_THAN defined in net.corda.core.node.services.vault.BinaryComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [224:126] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.greaterThan[ValueParameterDescriptorImpl]

'JvmStatic' @ [225:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'comparePredicate' @ [225:77] ==> public final fun <R : Comparable<R>> Field.comparePredicate(operator: BinaryComparisonOperator, value: R): CriteriaExpression.ColumnPredicateExpression<Any, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R : Comparable<R>> -> R

'GREATER_THAN_OR_EQUAL' @ [225:119] ==> enum entry GREATER_THAN_OR_EQUAL defined in net.corda.core.node.services.vault.BinaryComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [225:142] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.greaterThanOrEqual[ValueParameterDescriptorImpl]

'JvmStatic' @ [226:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'predicate' @ [226:72] ==> public final fun <R> Field.predicate(predicate: ColumnPredicate<R>): CriteriaExpression.ColumnPredicateExpression<Any, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R

'Between' @ [226:98] ==> public constructor Between<C : Comparable<R>>(rightFromLiteral: R, rightToLiteral: R) defined in net.corda.core.node.services.vault.ColumnPredicate.Between[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Comparable<C>> -> R

'from' @ [226:106] ==> value-parameter from: R defined in net.corda.core.node.services.vault.Builder.between[ValueParameterDescriptorImpl]

'to' @ [226:112] ==> value-parameter to: R defined in net.corda.core.node.services.vault.Builder.between[ValueParameterDescriptorImpl]

'JvmStatic' @ [227:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'predicate' @ [227:80] ==> public final fun <R> Field.predicate(predicate: ColumnPredicate<R>): CriteriaExpression.ColumnPredicateExpression<Any, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R

'CollectionExpression' @ [227:106] ==> public constructor CollectionExpression<C>(operator: CollectionOperator, rightLiteral: Collection<R>) defined in net.corda.core.node.services.vault.ColumnPredicate.CollectionExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'IN' @ [227:146] ==> enum entry IN defined in net.corda.core.node.services.vault.CollectionOperator[FakeCallableDescriptorForObject]

'collection' @ [227:150] ==> value-parameter collection: Collection<R> defined in net.corda.core.node.services.vault.Builder.`in`[ValueParameterDescriptorImpl]

'JvmStatic' @ [228:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'predicate' @ [228:81] ==> public final fun <R> Field.predicate(predicate: ColumnPredicate<R>): CriteriaExpression.ColumnPredicateExpression<Any, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R

'CollectionExpression' @ [228:107] ==> public constructor CollectionExpression<C>(operator: CollectionOperator, rightLiteral: Collection<R>) defined in net.corda.core.node.services.vault.ColumnPredicate.CollectionExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'NOT_IN' @ [228:147] ==> enum entry NOT_IN defined in net.corda.core.node.services.vault.CollectionOperator[FakeCallableDescriptorForObject]

'collection' @ [228:155] ==> value-parameter collection: Collection<R> defined in net.corda.core.node.services.vault.Builder.notIn[ValueParameterDescriptorImpl]

'EqualityComparison' @ [230:47] ==> public constructor EqualityComparison<C>(operator: EqualityComparisonOperator, rightLiteral: R) defined in net.corda.core.node.services.vault.ColumnPredicate.EqualityComparison[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'EQUAL' @ [230:93] ==> enum entry EQUAL defined in net.corda.core.node.services.vault.EqualityComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [230:100] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.equal[ValueParameterDescriptorImpl]

'EqualityComparison' @ [231:50] ==> public constructor EqualityComparison<C>(operator: EqualityComparisonOperator, rightLiteral: R) defined in net.corda.core.node.services.vault.ColumnPredicate.EqualityComparison[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'NOT_EQUAL' @ [231:96] ==> enum entry NOT_EQUAL defined in net.corda.core.node.services.vault.EqualityComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [231:107] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.notEqual[ValueParameterDescriptorImpl]

'compare' @ [232:50] ==> public final fun <R : Comparable<R>> compare(operator: BinaryComparisonOperator, value: R): ColumnPredicate.BinaryComparison<R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R : Comparable<R>> -> R

'LESS_THAN' @ [232:83] ==> enum entry LESS_THAN defined in net.corda.core.node.services.vault.BinaryComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [232:94] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.lessThan[ValueParameterDescriptorImpl]

'compare' @ [233:57] ==> public final fun <R : Comparable<R>> compare(operator: BinaryComparisonOperator, value: R): ColumnPredicate.BinaryComparison<R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R : Comparable<R>> -> R

'LESS_THAN_OR_EQUAL' @ [233:90] ==> enum entry LESS_THAN_OR_EQUAL defined in net.corda.core.node.services.vault.BinaryComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [233:110] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.lessThanOrEqual[ValueParameterDescriptorImpl]

'compare' @ [234:53] ==> public final fun <R : Comparable<R>> compare(operator: BinaryComparisonOperator, value: R): ColumnPredicate.BinaryComparison<R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R : Comparable<R>> -> R

'GREATER_THAN' @ [234:86] ==> enum entry GREATER_THAN defined in net.corda.core.node.services.vault.BinaryComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [234:100] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.greaterThan[ValueParameterDescriptorImpl]

'compare' @ [235:60] ==> public final fun <R : Comparable<R>> compare(operator: BinaryComparisonOperator, value: R): ColumnPredicate.BinaryComparison<R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R : Comparable<R>> -> R

'GREATER_THAN_OR_EQUAL' @ [235:93] ==> enum entry GREATER_THAN_OR_EQUAL defined in net.corda.core.node.services.vault.BinaryComparisonOperator[FakeCallableDescriptorForObject]

'value' @ [235:116] ==> value-parameter value: R defined in net.corda.core.node.services.vault.Builder.greaterThanOrEqual[ValueParameterDescriptorImpl]

'Between' @ [236:71] ==> public constructor Between<C : Comparable<R>>(rightFromLiteral: R, rightToLiteral: R) defined in net.corda.core.node.services.vault.ColumnPredicate.Between[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Comparable<C>> -> R

'from' @ [236:79] ==> value-parameter from: R defined in net.corda.core.node.services.vault.Builder.between[ValueParameterDescriptorImpl]

'to' @ [236:85] ==> value-parameter to: R defined in net.corda.core.node.services.vault.Builder.between[ValueParameterDescriptorImpl]

'CollectionExpression' @ [237:79] ==> public constructor CollectionExpression<C>(operator: CollectionOperator, rightLiteral: Collection<R>) defined in net.corda.core.node.services.vault.ColumnPredicate.CollectionExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'IN' @ [237:119] ==> enum entry IN defined in net.corda.core.node.services.vault.CollectionOperator[FakeCallableDescriptorForObject]

'collection' @ [237:123] ==> value-parameter collection: Collection<R> defined in net.corda.core.node.services.vault.Builder.`in`[ValueParameterDescriptorImpl]

'CollectionExpression' @ [238:80] ==> public constructor CollectionExpression<C>(operator: CollectionOperator, rightLiteral: Collection<R>) defined in net.corda.core.node.services.vault.ColumnPredicate.CollectionExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'NOT_IN' @ [238:120] ==> enum entry NOT_IN defined in net.corda.core.node.services.vault.CollectionOperator[FakeCallableDescriptorForObject]

'collection' @ [238:128] ==> value-parameter collection: Collection<R> defined in net.corda.core.node.services.vault.Builder.notIn[ValueParameterDescriptorImpl]

'predicate' @ [240:59] ==> public final fun <O, R> KProperty1<O, String?>.predicate(predicate: ColumnPredicate<String>): CriteriaExpression.ColumnPredicateExpression<O, String> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> String

'Likeness' @ [240:85] ==> public constructor Likeness(operator: LikenessOperator, rightLiteral: String) defined in net.corda.core.node.services.vault.ColumnPredicate.Likeness[ClassConstructorDescriptorImpl]

'LIKE' @ [240:111] ==> enum entry LIKE defined in net.corda.core.node.services.vault.LikenessOperator[FakeCallableDescriptorForObject]

'string' @ [240:117] ==> value-parameter string: String defined in net.corda.core.node.services.vault.Builder.like[ValueParameterDescriptorImpl]

'JvmStatic' @ [241:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'predicate' @ [241:49] ==> public final fun <R> Field.predicate(predicate: ColumnPredicate<String>): CriteriaExpression.ColumnPredicateExpression<Any, String> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> String

'Likeness' @ [241:75] ==> public constructor Likeness(operator: LikenessOperator, rightLiteral: String) defined in net.corda.core.node.services.vault.ColumnPredicate.Likeness[ClassConstructorDescriptorImpl]

'LIKE' @ [241:101] ==> enum entry LIKE defined in net.corda.core.node.services.vault.LikenessOperator[FakeCallableDescriptorForObject]

'string' @ [241:107] ==> value-parameter string: String defined in net.corda.core.node.services.vault.Builder.like[ValueParameterDescriptorImpl]

'predicate' @ [242:62] ==> public final fun <O, R> KProperty1<O, String?>.predicate(predicate: ColumnPredicate<String>): CriteriaExpression.ColumnPredicateExpression<O, String> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> String

'Likeness' @ [242:88] ==> public constructor Likeness(operator: LikenessOperator, rightLiteral: String) defined in net.corda.core.node.services.vault.ColumnPredicate.Likeness[ClassConstructorDescriptorImpl]

'NOT_LIKE' @ [242:114] ==> enum entry NOT_LIKE defined in net.corda.core.node.services.vault.LikenessOperator[FakeCallableDescriptorForObject]

'string' @ [242:124] ==> value-parameter string: String defined in net.corda.core.node.services.vault.Builder.notLike[ValueParameterDescriptorImpl]

'JvmStatic' @ [243:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'predicate' @ [243:52] ==> public final fun <R> Field.predicate(predicate: ColumnPredicate<String>): CriteriaExpression.ColumnPredicateExpression<Any, String> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> String

'Likeness' @ [243:78] ==> public constructor Likeness(operator: LikenessOperator, rightLiteral: String) defined in net.corda.core.node.services.vault.ColumnPredicate.Likeness[ClassConstructorDescriptorImpl]

'NOT_LIKE' @ [243:104] ==> enum entry NOT_LIKE defined in net.corda.core.node.services.vault.LikenessOperator[FakeCallableDescriptorForObject]

'string' @ [243:114] ==> value-parameter string: String defined in net.corda.core.node.services.vault.Builder.notLike[ValueParameterDescriptorImpl]

'predicate' @ [245:45] ==> public final fun <O, R> KProperty1<O, R?>.predicate(predicate: ColumnPredicate<R>): CriteriaExpression.ColumnPredicateExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> R

'NullExpression' @ [245:71] ==> public constructor NullExpression<C>(operator: NullOperator) defined in net.corda.core.node.services.vault.ColumnPredicate.NullExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'IS_NULL' @ [245:99] ==> enum entry IS_NULL defined in net.corda.core.node.services.vault.NullOperator[FakeCallableDescriptorForObject]

'JvmStatic' @ [246:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'predicate' @ [246:37] ==> public final fun <R> Field.predicate(predicate: ColumnPredicate<Any>): CriteriaExpression.ColumnPredicateExpression<Any, Any> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Any

'NullExpression' @ [246:63] ==> public constructor NullExpression<C>(operator: NullOperator) defined in net.corda.core.node.services.vault.ColumnPredicate.NullExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> Any

'IS_NULL' @ [246:96] ==> enum entry IS_NULL defined in net.corda.core.node.services.vault.NullOperator[FakeCallableDescriptorForObject]

'predicate' @ [247:46] ==> public final fun <O, R> KProperty1<O, R?>.predicate(predicate: ColumnPredicate<R>): CriteriaExpression.ColumnPredicateExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> R

'NullExpression' @ [247:72] ==> public constructor NullExpression<C>(operator: NullOperator) defined in net.corda.core.node.services.vault.ColumnPredicate.NullExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'NOT_NULL' @ [247:100] ==> enum entry NOT_NULL defined in net.corda.core.node.services.vault.NullOperator[FakeCallableDescriptorForObject]

'JvmStatic' @ [248:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'predicate' @ [248:38] ==> public final fun <R> Field.predicate(predicate: ColumnPredicate<Any>): CriteriaExpression.ColumnPredicateExpression<Any, Any> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Any

'NullExpression' @ [248:64] ==> public constructor NullExpression<C>(operator: NullOperator) defined in net.corda.core.node.services.vault.ColumnPredicate.NullExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> Any

'NOT_NULL' @ [248:97] ==> enum entry NOT_NULL defined in net.corda.core.node.services.vault.NullOperator[FakeCallableDescriptorForObject]

'functionPredicate' @ [252:13] ==> public final fun <O, R> KProperty1<O, R?>.functionPredicate(predicate: ColumnPredicate<R>, groupByColumns: List<Column<O, R>>? = ..., orderBy: Sort.Direction? = ...): CriteriaExpression.AggregateFunctionExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> R

'AggregateFunction' @ [252:47] ==> public constructor AggregateFunction<C>(type: AggregateFunctionType) defined in net.corda.core.node.services.vault.ColumnPredicate.AggregateFunction[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'SUM' @ [252:87] ==> enum entry SUM defined in net.corda.core.node.services.vault.AggregateFunctionType[FakeCallableDescriptorForObject]

'groupByColumns' @ [252:93] ==> value-parameter groupByColumns: List<KProperty1<O, R>>? = ... defined in net.corda.core.node.services.vault.Builder.sum[ValueParameterDescriptorImpl]

'map' @ [252:109] ==> public inline fun <T, R> Iterable<KProperty1<O, R>>.map(transform: (KProperty1<O, R>) -> Column<O, R>): List<Column<O, R>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty1<O, R>
    <R> -> Column<O, R>

'Column' @ [252:115] ==> public constructor Column<O, out C>(property: KProperty1<O, R?>) defined in net.corda.core.node.services.vault.Column[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> O
    <out C> -> R

'it' @ [252:122] ==> value-parameter it: KProperty1<O, R> defined in net.corda.core.node.services.vault.Builder.sum.<anonymous>[ValueParameterDescriptorImpl]

'orderBy' @ [252:129] ==> value-parameter orderBy: Sort.Direction? = ... defined in net.corda.core.node.services.vault.Builder.sum[ValueParameterDescriptorImpl]

'JvmStatic' @ [253:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'JvmOverloads' @ [253:16] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'functionPredicate' @ [255:13] ==> public final fun <R> Field.functionPredicate(predicate: ColumnPredicate<R>, groupByColumns: List<Column<Any, R>>? = ..., orderBy: Sort.Direction? = ...): CriteriaExpression.AggregateFunctionExpression<Any, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R

'AggregateFunction' @ [255:47] ==> public constructor AggregateFunction<C>(type: AggregateFunctionType) defined in net.corda.core.node.services.vault.ColumnPredicate.AggregateFunction[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'SUM' @ [255:90] ==> enum entry SUM defined in net.corda.core.node.services.vault.AggregateFunctionType[FakeCallableDescriptorForObject]

'groupByColumns' @ [255:96] ==> value-parameter groupByColumns: List<Field>? = ... defined in net.corda.core.node.services.vault.Builder.sum[ValueParameterDescriptorImpl]

'map' @ [255:112] ==> public inline fun <T, R> Iterable<Field>.map(transform: (Field) -> Column<Any, R>): List<Column<Any, R>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field
    <R> -> Column<Any, R>

'Column' @ [255:118] ==> public constructor Column<O, out C>(field: Field) defined in net.corda.core.node.services.vault.Column[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> Any
    <out C> -> R

'it' @ [255:132] ==> value-parameter it: Field defined in net.corda.core.node.services.vault.Builder.sum.<anonymous>[ValueParameterDescriptorImpl]

'orderBy' @ [255:139] ==> value-parameter orderBy: Sort.Direction? = ... defined in net.corda.core.node.services.vault.Builder.sum[ValueParameterDescriptorImpl]

'functionPredicate' @ [257:44] ==> public final fun <O, R> KProperty1<O, R?>.functionPredicate(predicate: ColumnPredicate<R>, groupByColumns: List<Column<O, R>>? = ..., orderBy: Sort.Direction? = ...): CriteriaExpression.AggregateFunctionExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> R

'AggregateFunction' @ [257:78] ==> public constructor AggregateFunction<C>(type: AggregateFunctionType) defined in net.corda.core.node.services.vault.ColumnPredicate.AggregateFunction[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'COUNT' @ [257:118] ==> enum entry COUNT defined in net.corda.core.node.services.vault.AggregateFunctionType[FakeCallableDescriptorForObject]

'JvmStatic' @ [258:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'functionPredicate' @ [258:36] ==> public final fun <R> Field.functionPredicate(predicate: ColumnPredicate<Any>, groupByColumns: List<Column<Any, Any>>? = ..., orderBy: Sort.Direction? = ...): CriteriaExpression.AggregateFunctionExpression<Any, Any> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Any

'AggregateFunction' @ [258:70] ==> public constructor AggregateFunction<C>(type: AggregateFunctionType) defined in net.corda.core.node.services.vault.ColumnPredicate.AggregateFunction[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> Any

'COUNT' @ [258:115] ==> enum entry COUNT defined in net.corda.core.node.services.vault.AggregateFunctionType[FakeCallableDescriptorForObject]

'functionPredicate' @ [261:13] ==> public final fun <O, R> KProperty1<O, R?>.functionPredicate(predicate: ColumnPredicate<R>, groupByColumns: List<Column<O, R>>? = ..., orderBy: Sort.Direction? = ...): CriteriaExpression.AggregateFunctionExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> R

'AggregateFunction' @ [261:47] ==> public constructor AggregateFunction<C>(type: AggregateFunctionType) defined in net.corda.core.node.services.vault.ColumnPredicate.AggregateFunction[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'AVG' @ [261:87] ==> enum entry AVG defined in net.corda.core.node.services.vault.AggregateFunctionType[FakeCallableDescriptorForObject]

'groupByColumns' @ [261:93] ==> value-parameter groupByColumns: List<KProperty1<O, R>>? = ... defined in net.corda.core.node.services.vault.Builder.avg[ValueParameterDescriptorImpl]

'map' @ [261:109] ==> public inline fun <T, R> Iterable<KProperty1<O, R>>.map(transform: (KProperty1<O, R>) -> Column<O, R>): List<Column<O, R>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty1<O, R>
    <R> -> Column<O, R>

'Column' @ [261:115] ==> public constructor Column<O, out C>(property: KProperty1<O, R?>) defined in net.corda.core.node.services.vault.Column[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> O
    <out C> -> R

'it' @ [261:122] ==> value-parameter it: KProperty1<O, R> defined in net.corda.core.node.services.vault.Builder.avg.<anonymous>[ValueParameterDescriptorImpl]

'orderBy' @ [261:129] ==> value-parameter orderBy: Sort.Direction? = ... defined in net.corda.core.node.services.vault.Builder.avg[ValueParameterDescriptorImpl]

'JvmStatic' @ [262:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'JvmOverloads' @ [263:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'functionPredicate' @ [265:13] ==> public final fun <R> Field.functionPredicate(predicate: ColumnPredicate<R>, groupByColumns: List<Column<Any, R>>? = ..., orderBy: Sort.Direction? = ...): CriteriaExpression.AggregateFunctionExpression<Any, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R

'AggregateFunction' @ [265:47] ==> public constructor AggregateFunction<C>(type: AggregateFunctionType) defined in net.corda.core.node.services.vault.ColumnPredicate.AggregateFunction[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'AVG' @ [265:90] ==> enum entry AVG defined in net.corda.core.node.services.vault.AggregateFunctionType[FakeCallableDescriptorForObject]

'groupByColumns' @ [265:96] ==> value-parameter groupByColumns: List<Field>? = ... defined in net.corda.core.node.services.vault.Builder.avg[ValueParameterDescriptorImpl]

'map' @ [265:112] ==> public inline fun <T, R> Iterable<Field>.map(transform: (Field) -> Column<Any, R>): List<Column<Any, R>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field
    <R> -> Column<Any, R>

'Column' @ [265:118] ==> public constructor Column<O, out C>(field: Field) defined in net.corda.core.node.services.vault.Column[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> Any
    <out C> -> R

'it' @ [265:132] ==> value-parameter it: Field defined in net.corda.core.node.services.vault.Builder.avg.<anonymous>[ValueParameterDescriptorImpl]

'orderBy' @ [265:139] ==> value-parameter orderBy: Sort.Direction? = ... defined in net.corda.core.node.services.vault.Builder.avg[ValueParameterDescriptorImpl]

'functionPredicate' @ [268:13] ==> public final fun <O, R> KProperty1<O, R?>.functionPredicate(predicate: ColumnPredicate<R>, groupByColumns: List<Column<O, R>>? = ..., orderBy: Sort.Direction? = ...): CriteriaExpression.AggregateFunctionExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> R

'AggregateFunction' @ [268:47] ==> public constructor AggregateFunction<C>(type: AggregateFunctionType) defined in net.corda.core.node.services.vault.ColumnPredicate.AggregateFunction[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'MIN' @ [268:87] ==> enum entry MIN defined in net.corda.core.node.services.vault.AggregateFunctionType[FakeCallableDescriptorForObject]

'groupByColumns' @ [268:93] ==> value-parameter groupByColumns: List<KProperty1<O, R>>? = ... defined in net.corda.core.node.services.vault.Builder.min[ValueParameterDescriptorImpl]

'map' @ [268:109] ==> public inline fun <T, R> Iterable<KProperty1<O, R>>.map(transform: (KProperty1<O, R>) -> Column<O, R>): List<Column<O, R>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty1<O, R>
    <R> -> Column<O, R>

'Column' @ [268:115] ==> public constructor Column<O, out C>(property: KProperty1<O, R?>) defined in net.corda.core.node.services.vault.Column[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> O
    <out C> -> R

'it' @ [268:122] ==> value-parameter it: KProperty1<O, R> defined in net.corda.core.node.services.vault.Builder.min.<anonymous>[ValueParameterDescriptorImpl]

'orderBy' @ [268:129] ==> value-parameter orderBy: Sort.Direction? = ... defined in net.corda.core.node.services.vault.Builder.min[ValueParameterDescriptorImpl]

'JvmStatic' @ [269:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'JvmOverloads' @ [270:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'functionPredicate' @ [272:13] ==> public final fun <R> Field.functionPredicate(predicate: ColumnPredicate<R>, groupByColumns: List<Column<Any, R>>? = ..., orderBy: Sort.Direction? = ...): CriteriaExpression.AggregateFunctionExpression<Any, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R

'AggregateFunction' @ [272:47] ==> public constructor AggregateFunction<C>(type: AggregateFunctionType) defined in net.corda.core.node.services.vault.ColumnPredicate.AggregateFunction[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'MIN' @ [272:90] ==> enum entry MIN defined in net.corda.core.node.services.vault.AggregateFunctionType[FakeCallableDescriptorForObject]

'groupByColumns' @ [272:96] ==> value-parameter groupByColumns: List<Field>? = ... defined in net.corda.core.node.services.vault.Builder.min[ValueParameterDescriptorImpl]

'map' @ [272:112] ==> public inline fun <T, R> Iterable<Field>.map(transform: (Field) -> Column<Any, R>): List<Column<Any, R>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field
    <R> -> Column<Any, R>

'Column' @ [272:118] ==> public constructor Column<O, out C>(field: Field) defined in net.corda.core.node.services.vault.Column[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> Any
    <out C> -> R

'it' @ [272:132] ==> value-parameter it: Field defined in net.corda.core.node.services.vault.Builder.min.<anonymous>[ValueParameterDescriptorImpl]

'orderBy' @ [272:139] ==> value-parameter orderBy: Sort.Direction? = ... defined in net.corda.core.node.services.vault.Builder.min[ValueParameterDescriptorImpl]

'functionPredicate' @ [275:13] ==> public final fun <O, R> KProperty1<O, R?>.functionPredicate(predicate: ColumnPredicate<R>, groupByColumns: List<Column<O, R>>? = ..., orderBy: Sort.Direction? = ...): CriteriaExpression.AggregateFunctionExpression<O, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <O> -> O
    <R> -> R

'AggregateFunction' @ [275:47] ==> public constructor AggregateFunction<C>(type: AggregateFunctionType) defined in net.corda.core.node.services.vault.ColumnPredicate.AggregateFunction[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'MAX' @ [275:87] ==> enum entry MAX defined in net.corda.core.node.services.vault.AggregateFunctionType[FakeCallableDescriptorForObject]

'groupByColumns' @ [275:93] ==> value-parameter groupByColumns: List<KProperty1<O, R>>? = ... defined in net.corda.core.node.services.vault.Builder.max[ValueParameterDescriptorImpl]

'map' @ [275:109] ==> public inline fun <T, R> Iterable<KProperty1<O, R>>.map(transform: (KProperty1<O, R>) -> Column<O, R>): List<Column<O, R>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty1<O, R>
    <R> -> Column<O, R>

'Column' @ [275:115] ==> public constructor Column<O, out C>(property: KProperty1<O, R?>) defined in net.corda.core.node.services.vault.Column[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> O
    <out C> -> R

'it' @ [275:122] ==> value-parameter it: KProperty1<O, R> defined in net.corda.core.node.services.vault.Builder.max.<anonymous>[ValueParameterDescriptorImpl]

'orderBy' @ [275:129] ==> value-parameter orderBy: Sort.Direction? = ... defined in net.corda.core.node.services.vault.Builder.max[ValueParameterDescriptorImpl]

'JvmStatic' @ [276:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'JvmOverloads' @ [277:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'functionPredicate' @ [279:13] ==> public final fun <R> Field.functionPredicate(predicate: ColumnPredicate<R>, groupByColumns: List<Column<Any, R>>? = ..., orderBy: Sort.Direction? = ...): CriteriaExpression.AggregateFunctionExpression<Any, R> defined in net.corda.core.node.services.vault.Builder[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R

'AggregateFunction' @ [279:47] ==> public constructor AggregateFunction<C>(type: AggregateFunctionType) defined in net.corda.core.node.services.vault.ColumnPredicate.AggregateFunction[ClassConstructorDescriptorImpl]
Inferred types:
    <C> -> R

'MAX' @ [279:90] ==> enum entry MAX defined in net.corda.core.node.services.vault.AggregateFunctionType[FakeCallableDescriptorForObject]

'groupByColumns' @ [279:96] ==> value-parameter groupByColumns: List<Field>? = ... defined in net.corda.core.node.services.vault.Builder.max[ValueParameterDescriptorImpl]

'map' @ [279:112] ==> public inline fun <T, R> Iterable<Field>.map(transform: (Field) -> Column<Any, R>): List<Column<Any, R>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field
    <R> -> Column<Any, R>

'Column' @ [279:118] ==> public constructor Column<O, out C>(field: Field) defined in net.corda.core.node.services.vault.Column[ClassConstructorDescriptorImpl]
Inferred types:
    <O> -> Any
    <out C> -> R

'it' @ [279:132] ==> value-parameter it: Field defined in net.corda.core.node.services.vault.Builder.max.<anonymous>[ValueParameterDescriptorImpl]

'orderBy' @ [279:139] ==> value-parameter orderBy: Sort.Direction? = ... defined in net.corda.core.node.services.vault.Builder.max[ValueParameterDescriptorImpl]

'invoke' @ [282:50] ==> public abstract operator fun invoke(p1: Builder): A defined in kotlin.Function1[FunctionInvokeDescriptor]

'Builder' @ [282:56] ==> @CordaSerializable public object Builder defined in net.corda.core.node.services.vault in file QueryCriteriaUtils.kt[FakeCallableDescriptorForObject]

