'StringConverter<T>' @ [26:30] ==> public constructor StringConverter<T : (Any..Any?)>() defined in javafx.util.StringConverter[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'fromStringFunction' @ [28:20] ==> value-parameter fromStringFunction: ((String?) -> T)? = ... defined in net.corda.explorer.views.stringConverter[ValueParameterDescriptorImpl]

'invoke' @ [28:40] ==> public abstract operator fun invoke(p1: String?): T defined in kotlin.Function1[FunctionInvokeDescriptor]

'string' @ [28:47] ==> value-parameter string: String? defined in net.corda.explorer.views.stringConverter.<no name provided>.fromString[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [28:64] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'invoke' @ [32:20] ==> public abstract operator fun invoke(p1: T): String defined in kotlin.Function1[FunctionInvokeDescriptor]

'o' @ [32:37] ==> value-parameter o: T defined in net.corda.explorer.views.stringConverter.<no name provided>.toString[ValueParameterDescriptorImpl]

'converter' @ [35:12] ==> val converter: <no name provided><T> defined in net.corda.explorer.views.stringConverter[LocalVariableDescriptor]

'this' @ [42:9] ==> <this> defined in net.corda.explorer.views.toStringWithSuffix[ReceiverParameterDescriptorImpl]

'toDouble' @ [42:14] ==> public abstract fun toDouble(): Double defined in kotlin.Number[DeserializedSimpleFunctionDescriptor]

'this' @ [42:42] ==> <this> defined in net.corda.explorer.views.toStringWithSuffix[ReceiverParameterDescriptorImpl]

'min' @ [44:20] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'scales' @ [44:24] ==> val scales: String defined in net.corda.explorer.views.toStringWithSuffix[LocalVariableDescriptor]

'length' @ [44:31] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'/' @ [44:40] ==> public final operator fun div(other: Double): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'log' @ [44:45] ==> public open fun log(p0: Double): Double defined in java.lang.Math[JavaMethodDescriptor]

'this' @ [44:49] ==> <this> defined in net.corda.explorer.views.toStringWithSuffix[ReceiverParameterDescriptorImpl]

'toDouble' @ [44:54] ==> public abstract fun toDouble(): Double defined in kotlin.Number[DeserializedSimpleFunctionDescriptor]

'log' @ [44:73] ==> public open fun log(p0: Double): Double defined in java.lang.Math[JavaMethodDescriptor]

'toInt' @ [44:86] ==> public open fun toInt(): Int defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'this' @ [45:16] ==> <this> defined in net.corda.explorer.views.toStringWithSuffix[ReceiverParameterDescriptorImpl]

'toDouble' @ [45:21] ==> public abstract fun toDouble(): Double defined in kotlin.Number[DeserializedSimpleFunctionDescriptor]

'pow' @ [45:39] ==> public open fun pow(p0: Double, p1: Double): Double defined in java.lang.Math[JavaMethodDescriptor]

'exp' @ [45:51] ==> val exp: Int defined in net.corda.explorer.views.toStringWithSuffix[LocalVariableDescriptor]

'toDouble' @ [45:55] ==> public open fun toDouble(): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'format' @ [45:68] ==> public fun Double.format(precision: Int): String defined in net.corda.explorer.views[SimpleFunctionDescriptorImpl]

'precision' @ [45:75] ==> value-parameter precision: Int = ... defined in net.corda.explorer.views.toStringWithSuffix[ValueParameterDescriptorImpl]

'scales' @ [45:88] ==> val scales: String defined in net.corda.explorer.views.toStringWithSuffix[LocalVariableDescriptor]

'exp' @ [45:95] ==> val exp: Int defined in net.corda.explorer.views.toStringWithSuffix[LocalVariableDescriptor]

'String' @ [48:37] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'format' @ [48:44] ==> @InlineOnly public inline fun String.Companion.format(format: String, vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'precision' @ [48:56] ==> value-parameter precision: Int defined in net.corda.explorer.views.format[ValueParameterDescriptorImpl]

'this' @ [48:70] ==> <this> defined in net.corda.explorer.views.format[ReceiverParameterDescriptorImpl]

'if (Platform.isFxApplicationThread()) {
        block()
    } else {
        Platform.runLater(block)
    }' @ [54:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isFxApplicationThread' @ [54:18] ==> public open fun isFxApplicationThread(): Boolean defined in javafx.application.Platform[JavaMethodDescriptor]

'invoke' @ [55:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'runLater' @ [57:18] ==> public final fun runLater(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javafx.application.Platform[SamAdapterFunctionDescriptor]

'block' @ [57:27] ==> value-parameter block: () -> Unit defined in net.corda.explorer.views.runInFxApplicationThread[ValueParameterDescriptorImpl]

'gridpane' @ [65:12] ==> public fun EventTarget.gridpane(op: (GridPane.() -> Unit)? = ...): GridPane defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'label' @ [66:9] ==> public fun EventTarget.label(text: String = ..., op: (Label.() -> Unit)? = ...): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'maxWidth' @ [67:13] ==> public final var Label.maxWidth: Double[MyPropertyDescriptor]

'Double' @ [67:24] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [67:31] ==> public final val MAX_VALUE: Double defined in kotlin.Double.Companion[DeserializedPropertyDescriptor]

'textAlignment' @ [68:13] ==> public final var Label.textAlignment: (TextAlignment..TextAlignment?)[MyPropertyDescriptor]

'CENTER' @ [68:43] ==> enum entry CENTER defined in javafx.scene.text.TextAlignment[FakeCallableDescriptorForObject]

'alignment' @ [69:13] ==> public final var Label.alignment: (Pos..Pos?)[MyPropertyDescriptor]

'CENTER' @ [69:29] ==> enum entry CENTER defined in javafx.geometry.Pos[FakeCallableDescriptorForObject]

'setVgrow' @ [70:22] ==> public open fun setVgrow(p0: (Node..Node?), p1: (Priority..Priority?)): Unit defined in javafx.scene.layout.GridPane[JavaMethodDescriptor]

'this' @ [70:31] ==> <this> defined in net.corda.explorer.views.underConstruction.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'ALWAYS' @ [70:46] ==> enum entry ALWAYS defined in javafx.scene.layout.Priority[FakeCallableDescriptorForObject]

'setHgrow' @ [71:22] ==> public open fun setHgrow(p0: (Node..Node?), p1: (Priority..Priority?)): Unit defined in javafx.scene.layout.GridPane[JavaMethodDescriptor]

'this' @ [71:31] ==> <this> defined in net.corda.explorer.views.underConstruction.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'ALWAYS' @ [71:46] ==> enum entry ALWAYS defined in javafx.scene.layout.Priority[FakeCallableDescriptorForObject]

'textfield' @ [79:109] ==> public fun EventTarget.textfield(value: String? = ..., op: (TextField.() -> Unit)? = ...): TextField defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'value' @ [80:5] ==> value-parameter value: ObservableValue<String>? = ... defined in net.corda.explorer.views.copyableLabel[ValueParameterDescriptorImpl]

'let' @ [80:12] ==> @InlineOnly public inline fun <T, R> ObservableValue<String>.let(block: (ObservableValue<String>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ObservableValue<String>
    <R> -> Unit

'textProperty' @ [80:18] ==> public final fun textProperty(): (StringProperty..StringProperty?) defined in javafx.scene.control.TextField[JavaMethodDescriptor]

'bind' @ [80:33] ==> public abstract fun bind(p0: (ObservableValue<out (String..String?)>..ObservableValue<out (String..String?)>?)): Unit defined in javafx.beans.property.StringProperty[JavaMethodDescriptor]

'it' @ [80:38] ==> value-parameter it: ObservableValue<String> defined in net.corda.explorer.views.copyableLabel.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'op' @ [81:5] ==> value-parameter op: (TextField.() -> Unit)? = ... defined in net.corda.explorer.views.copyableLabel[ValueParameterDescriptorImpl]

'invoke' @ [81:9] ==> public abstract operator fun invoke(p1: TextField): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [81:16] ==> <this> defined in net.corda.explorer.views.copyableLabel.<anonymous>[ReceiverParameterDescriptorImpl]

'isEditable' @ [82:5] ==> public final var TextField.isEditable: Boolean[MyPropertyDescriptor]

'styleClass' @ [83:5] ==> public final val TextField.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'add' @ [83:16] ==> public abstract fun add(element: (String..String?)): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'Models' @ [86:58] ==> public object Models defined in net.corda.client.jfx.model[FakeCallableDescriptorForObject]

'get' @ [86:65] ==> public final fun <M : Any> get(klass: KClass<M>, origin: KClass<*>): M defined in net.corda.client.jfx.model.Models[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <M : Any> -> M

'this' @ [86:79] ==> <this> defined in net.corda.explorer.views.getModel[ReceiverParameterDescriptorImpl]

'javaClass' @ [86:84] ==> public val <T : Any> UIComponent.javaClass: Class<UIComponent> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> UIComponent

'kotlin' @ [86:94] ==> public val <T : Any> Class<UIComponent>.kotlin: KClass<UIComponent> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> UIComponent

'this' @ [89:56] ==> <this> defined in net.corda.explorer.views.cross[ReceiverParameterDescriptorImpl]

'flatMap' @ [89:61] ==> public inline fun <T, R> Iterable<A>.flatMap(transform: (A) -> Iterable<Pair<A, B>>): List<Pair<A, B>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A
    <R> -> Pair<A, B>

'other' @ [89:76] ==> value-parameter other: Collection<B> defined in net.corda.explorer.views.cross[ValueParameterDescriptorImpl]

'map' @ [89:82] ==> public inline fun <T, R> Iterable<B>.map(transform: (B) -> Pair<A, B>): List<Pair<A, B>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> B
    <R> -> Pair<A, B>

'a' @ [89:93] ==> value-parameter a: A defined in net.corda.explorer.views.cross.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [89:98] ==> value-parameter b: B defined in net.corda.explorer.views.cross.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [92:72] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [92:78] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [92:83] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [92:90] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [92:96] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [92:103] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'resolveIssuer' @ [92:109] ==> public fun AbstractParty.resolveIssuer(): ObservableValue<Party?> defined in net.corda.explorer.views[SimpleFunctionDescriptorImpl]

'Models' @ [94:62] ==> public object Models defined in net.corda.client.jfx.model[FakeCallableDescriptorForObject]

'get' @ [94:69] ==> public final fun <M : Any> get(klass: KClass<NetworkIdentityModel>, origin: KClass<*>): NetworkIdentityModel defined in net.corda.client.jfx.model.Models[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <M : Any> -> NetworkIdentityModel

'NetworkIdentityModel' @ [94:73] ==> public constructor NetworkIdentityModel() defined in net.corda.client.jfx.model.NetworkIdentityModel[DeserializedClassConstructorDescriptor]

'javaClass' @ [94:102] ==> public val <T : Any> AbstractParty.javaClass: Class<AbstractParty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> AbstractParty

'kotlin' @ [94:112] ==> public val <T : Any> Class<AbstractParty>.kotlin: KClass<AbstractParty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> AbstractParty

'lookup' @ [94:120] ==> public final fun lookup(publicKey: PublicKey): ObservableValue<NodeInfo?> defined in net.corda.client.jfx.model.NetworkIdentityModel[DeserializedSimpleFunctionDescriptor]

'owningKey' @ [94:127] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'map' @ [94:138] ==> public fun <A, B> ObservableValue<out NodeInfo?>.map(function: (NodeInfo?) -> Party?): ObservableValue<Party?> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> NodeInfo?
    <B> -> Party?

'it' @ [94:144] ==> value-parameter it: NodeInfo? defined in net.corda.explorer.views.resolveIssuer.<anonymous>[ValueParameterDescriptorImpl]

'legalIdentity' @ [94:148] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

