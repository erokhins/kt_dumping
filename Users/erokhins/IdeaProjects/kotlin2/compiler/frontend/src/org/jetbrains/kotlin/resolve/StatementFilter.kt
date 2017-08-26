'JvmField' @ [28:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'StatementFilter' @ [28:39] ==> public constructor StatementFilter() defined in org.jetbrains.kotlin.resolve.StatementFilter[ClassConstructorDescriptorImpl]

'filter' @ [35:9] ==> public open val filter: ((KtExpression) -> Boolean)? defined in org.jetbrains.kotlin.resolve.StatementFilter[PropertyDescriptorImpl]

'block' @ [35:27] ==> value-parameter block: KtBlockExpression defined in org.jetbrains.kotlin.resolve.filterStatements[ValueParameterDescriptorImpl]

'block' @ [35:74] ==> value-parameter block: KtBlockExpression defined in org.jetbrains.kotlin.resolve.filterStatements[ValueParameterDescriptorImpl]

'statements' @ [35:80] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'block' @ [36:12] ==> value-parameter block: KtBlockExpression defined in org.jetbrains.kotlin.resolve.filterStatements[ValueParameterDescriptorImpl]

'statements' @ [36:18] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'filter' @ [36:29] ==> public inline fun <T> Iterable<(KtExpression..KtExpression?)>.filter(predicate: ((KtExpression..KtExpression?)) -> Boolean): List<(KtExpression..KtExpression?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'filter' @ [36:38] ==> public open val filter: ((KtExpression) -> Boolean)? defined in org.jetbrains.kotlin.resolve.StatementFilter[PropertyDescriptorImpl]

'it' @ [36:47] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.resolve.filterStatements.<anonymous>[ValueParameterDescriptorImpl]

'filterStatements' @ [39:74] ==> public fun StatementFilter.filterStatements(block: KtBlockExpression): List<KtExpression> defined in org.jetbrains.kotlin.resolve in file StatementFilter.kt[SimpleFunctionDescriptorImpl]

'block' @ [39:91] ==> value-parameter block: KtBlockExpression defined in org.jetbrains.kotlin.resolve.getLastStatementInABlock[ValueParameterDescriptorImpl]

'lastOrNull' @ [39:98] ==> public fun <T> List<KtExpression>.lastOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

