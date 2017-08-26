'Subscriber<Any>' @ [21:78] ==> protected/*protected and package*/ constructor Subscriber<T : (Any..Any?)>() defined in rx.Subscriber[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'HashMap' @ [22:28] ==> public final fun <K, V> <init>(): HashMap<StateMachineRunId, Int> /* = HashMap<StateMachineRunId, Int> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> StateMachineRunId
    <V> -> Int

'createStateMachinesTable' @ [23:25] ==> private final fun createStateMachinesTable(): TableElement defined in net.corda.node.shell.FlowWatchPrintingSubscriber[SimpleFunctionDescriptorImpl]

'openFuture' @ [24:18] ==> public fun <V> openFuture(): OpenFuture<Unit> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'future' @ [29:9] ==> public final val future: OpenFuture<Unit> defined in net.corda.node.shell.FlowWatchPrintingSubscriber[PropertyDescriptorImpl]

'then' @ [29:16] ==> public abstract fun <W> then(callback: (CordaFuture<Unit>) -> Unit): Unit defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <W> -> Unit

'unsubscribe' @ [29:23] ==> public final fun unsubscribe(): Unit defined in net.corda.node.shell.FlowWatchPrintingSubscriber[JavaMethodDescriptor]

'Synchronized' @ [32:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'future' @ [35:9] ==> public final val future: OpenFuture<Unit> defined in net.corda.node.shell.FlowWatchPrintingSubscriber[PropertyDescriptorImpl]

'set' @ [35:16] ==> public abstract fun set(value: Unit): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'Unit' @ [35:20] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'Synchronized' @ [38:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

't' @ [40:13] ==> value-parameter t: Any? defined in net.corda.node.shell.FlowWatchPrintingSubscriber.onNext[ValueParameterDescriptorImpl]

'toStream' @ [41:13] ==> private final val toStream: RenderPrintWriter defined in net.corda.node.shell.FlowWatchPrintingSubscriber[PropertyDescriptorImpl]

'cls' @ [41:22] ==> public final fun cls(): (RenderPrintWriter..RenderPrintWriter?) defined in org.crsh.text.RenderPrintWriter[JavaMethodDescriptor]

'createStateMachinesRow' @ [42:13] ==> private final fun createStateMachinesRow(smmUpdate: StateMachineUpdate): Unit defined in net.corda.node.shell.FlowWatchPrintingSubscriber[SimpleFunctionDescriptorImpl]

't' @ [42:36] ==> value-parameter t: Any? defined in net.corda.node.shell.FlowWatchPrintingSubscriber.onNext[ValueParameterDescriptorImpl]

'toStream' @ [43:13] ==> private final val toStream: RenderPrintWriter defined in net.corda.node.shell.FlowWatchPrintingSubscriber[PropertyDescriptorImpl]

'print' @ [43:22] ==> public open fun print(p0: (Any..Any?)): Unit defined in org.crsh.text.RenderPrintWriter[JavaMethodDescriptor]

'table' @ [43:28] ==> private final val table: TableElement defined in net.corda.node.shell.FlowWatchPrintingSubscriber[PropertyDescriptorImpl]

'toStream' @ [44:13] ==> private final val toStream: RenderPrintWriter defined in net.corda.node.shell.FlowWatchPrintingSubscriber[PropertyDescriptorImpl]

'println' @ [44:22] ==> public open fun println(p0: (String..String?)): Unit defined in org.crsh.text.RenderPrintWriter[JavaMethodDescriptor]

'toStream' @ [45:13] ==> private final val toStream: RenderPrintWriter defined in net.corda.node.shell.FlowWatchPrintingSubscriber[PropertyDescriptorImpl]

'flush' @ [45:22] ==> public open fun flush(): Unit defined in org.crsh.text.RenderPrintWriter[JavaMethodDescriptor]

'Synchronized' @ [49:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'toStream' @ [51:9] ==> private final val toStream: RenderPrintWriter defined in net.corda.node.shell.FlowWatchPrintingSubscriber[PropertyDescriptorImpl]

'println' @ [51:18] ==> public open fun println(p0: (String..String?)): Unit defined in org.crsh.text.RenderPrintWriter[JavaMethodDescriptor]

'future' @ [52:9] ==> public final val future: OpenFuture<Unit> defined in net.corda.node.shell.FlowWatchPrintingSubscriber[PropertyDescriptorImpl]

'setException' @ [52:16] ==> public abstract fun setException(t: Throwable): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'e' @ [52:29] ==> value-parameter e: Throwable defined in net.corda.node.shell.FlowWatchPrintingSubscriber.onError[ValueParameterDescriptorImpl]

'when (update) {
            is Added -> Color.blue
            is Removed -> if (update.result.isSuccess) Color.green else Color.red
        }' @ [56:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Color, entry1: Color): Color[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Color

'update' @ [56:22] ==> value-parameter update: StateMachineUpdate defined in net.corda.node.shell.FlowWatchPrintingSubscriber.stateColor[ValueParameterDescriptorImpl]

'blue' @ [57:31] ==> enum entry blue defined in org.crsh.text.Color[FakeCallableDescriptorForObject]

'if (update.result.isSuccess) Color.green else Color.red' @ [58:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Color, elseBranch: Color): Color[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Color

'update' @ [58:31] ==> value-parameter update: StateMachineUpdate defined in net.corda.node.shell.FlowWatchPrintingSubscriber.stateColor[ValueParameterDescriptorImpl]

'result' @ [58:38] ==> public final val result: Try<*> defined in net.corda.core.messaging.StateMachineUpdate.Removed[DeserializedPropertyDescriptor]

'isSuccess' @ [58:45] ==> public abstract val isSuccess: Boolean defined in net.corda.core.utilities.Try[DeserializedPropertyDescriptor]

'green' @ [58:62] ==> enum entry green defined in org.crsh.text.Color[FakeCallableDescriptorForObject]

'red' @ [58:79] ==> enum entry red defined in org.crsh.text.Color[FakeCallableDescriptorForObject]

'TableElement' @ [63:21] ==> public constructor TableElement(vararg p0: Int) defined in org.crsh.text.ui.TableElement[JavaClassConstructorDescriptor]

'overflow' @ [63:43] ==> public open fun overflow(p0: (Overflow..Overflow?)): (TableElement..TableElement?) defined in org.crsh.text.ui.TableElement[JavaMethodDescriptor]

'HIDDEN' @ [63:61] ==> enum entry HIDDEN defined in org.crsh.text.ui.Overflow[FakeCallableDescriptorForObject]

'rightCellPadding' @ [63:69] ==> public open fun rightCellPadding(p0: Int): (TableElement..TableElement?) defined in org.crsh.text.ui.TableElement[JavaMethodDescriptor]

'RowElement' @ [64:22] ==> public constructor RowElement(p0: Boolean) defined in org.crsh.text.ui.RowElement[JavaClassConstructorDescriptor]

'add' @ [64:39] ==> public open fun add(vararg p0: (String..String?)): (RowElement..RowElement?) defined in org.crsh.text.ui.RowElement[JavaMethodDescriptor]

'style' @ [64:85] ==> public open fun style(p0: (Style.Composite..Style.Composite?)): (RowElement..RowElement?) defined in org.crsh.text.ui.RowElement[JavaMethodDescriptor]

'fg' @ [64:107] ==> public open fun fg(p0: (Color..Color?)): (Style.Composite..Style.Composite?) defined in org.crsh.text.Decoration[JavaMethodDescriptor]

'black' @ [64:116] ==> enum entry black defined in org.crsh.text.Color[FakeCallableDescriptorForObject]

'bg' @ [64:123] ==> public open fun bg(p0: (Color..Color?)): (Style.Composite..Style.Composite?) defined in org.crsh.text.Style.Composite[JavaMethodDescriptor]

'white' @ [64:132] ==> enum entry white defined in org.crsh.text.Color[FakeCallableDescriptorForObject]

'table' @ [65:9] ==> val table: (TableElement..TableElement?) defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesTable[LocalVariableDescriptor]

'add' @ [65:15] ==> public open fun add(p0: (RowElement..RowElement?)): (TableElement..TableElement?) defined in org.crsh.text.ui.TableElement[JavaMethodDescriptor]

'header' @ [65:19] ==> val header: (RowElement..RowElement?) defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesTable[LocalVariableDescriptor]

'table' @ [66:16] ==> val table: (TableElement..TableElement?) defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesTable[LocalVariableDescriptor]

'when (smmUpdate) {
            is Added -> {
                table.add(RowElement().add(
                        LabelElement(formatFlowId(smmUpdate.id)),
                        LabelElement(formatFlowName(smmUpdate.stateMachineInfo.flowLogicClassName)),
                        LabelElement(formatFlowInitiator(smmUpdate.stateMachineInfo.initiator)),
                        LabelElement("In progress")
                ).style(stateColor(smmUpdate).fg()))
                indexMap[smmUpdate.id] = table.rows.size - 1
            }
            is Removed -> {
                val idx = indexMap[smmUpdate.id]
                if (idx != null) {
                    val oldRow = table.rows[idx]
                    val flowNameLabel = oldRow.getCol(1) as LabelElement
                    val flowInitiatorLabel = oldRow.getCol(2) as LabelElement
                    table.rows[idx] = RowElement().add(
                            LabelElement(formatFlowId(smmUpdate.id)),
                            LabelElement(flowNameLabel.value),
                            LabelElement(flowInitiatorLabel.value),
                            LabelElement(formatFlowResult(smmUpdate.result))
                    ).style(stateColor(smmUpdate).fg())
                }
            }
        }' @ [71:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'smmUpdate' @ [71:15] ==> value-parameter smmUpdate: StateMachineUpdate defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[ValueParameterDescriptorImpl]

'table' @ [73:17] ==> private final val table: TableElement defined in net.corda.node.shell.FlowWatchPrintingSubscriber[PropertyDescriptorImpl]

'add' @ [73:23] ==> public open fun add(p0: (RowElement..RowElement?)): (TableElement..TableElement?) defined in org.crsh.text.ui.TableElement[JavaMethodDescriptor]

'RowElement' @ [73:27] ==> public constructor RowElement() defined in org.crsh.text.ui.RowElement[JavaClassConstructorDescriptor]

'add' @ [73:40] ==> public open fun add(vararg p0: (Element..Element?)): (RowElement..RowElement?) defined in org.crsh.text.ui.RowElement[JavaMethodDescriptor]

'LabelElement' @ [74:25] ==> public constructor LabelElement(p0: (String..String?)) defined in org.crsh.text.ui.LabelElement[JavaClassConstructorDescriptor]

'formatFlowId' @ [74:38] ==> private final fun formatFlowId(flowId: StateMachineRunId): String defined in net.corda.node.shell.FlowWatchPrintingSubscriber[SimpleFunctionDescriptorImpl]

'smmUpdate' @ [74:51] ==> value-parameter smmUpdate: StateMachineUpdate defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[ValueParameterDescriptorImpl]

'id' @ [74:61] ==> public abstract val id: StateMachineRunId defined in net.corda.core.messaging.StateMachineUpdate[DeserializedPropertyDescriptor]

'LabelElement' @ [75:25] ==> public constructor LabelElement(p0: (String..String?)) defined in org.crsh.text.ui.LabelElement[JavaClassConstructorDescriptor]

'formatFlowName' @ [75:38] ==> private final fun formatFlowName(flowName: String): String defined in net.corda.node.shell.FlowWatchPrintingSubscriber[SimpleFunctionDescriptorImpl]

'smmUpdate' @ [75:53] ==> value-parameter smmUpdate: StateMachineUpdate defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[ValueParameterDescriptorImpl]

'stateMachineInfo' @ [75:63] ==> public final val stateMachineInfo: StateMachineInfo defined in net.corda.core.messaging.StateMachineUpdate.Added[DeserializedPropertyDescriptor]

'flowLogicClassName' @ [75:80] ==> public final val flowLogicClassName: String defined in net.corda.core.messaging.StateMachineInfo[DeserializedPropertyDescriptor]

'LabelElement' @ [76:25] ==> public constructor LabelElement(p0: (String..String?)) defined in org.crsh.text.ui.LabelElement[JavaClassConstructorDescriptor]

'formatFlowInitiator' @ [76:38] ==> private final fun formatFlowInitiator(flowInitiator: FlowInitiator): String defined in net.corda.node.shell.FlowWatchPrintingSubscriber[SimpleFunctionDescriptorImpl]

'smmUpdate' @ [76:58] ==> value-parameter smmUpdate: StateMachineUpdate defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[ValueParameterDescriptorImpl]

'stateMachineInfo' @ [76:68] ==> public final val stateMachineInfo: StateMachineInfo defined in net.corda.core.messaging.StateMachineUpdate.Added[DeserializedPropertyDescriptor]

'initiator' @ [76:85] ==> public final val initiator: FlowInitiator defined in net.corda.core.messaging.StateMachineInfo[DeserializedPropertyDescriptor]

'LabelElement' @ [77:25] ==> public constructor LabelElement(p0: (String..String?)) defined in org.crsh.text.ui.LabelElement[JavaClassConstructorDescriptor]

'style' @ [78:19] ==> public open fun style(p0: (Style.Composite..Style.Composite?)): (RowElement..RowElement?) defined in org.crsh.text.ui.RowElement[JavaMethodDescriptor]

'stateColor' @ [78:25] ==> private final fun stateColor(update: StateMachineUpdate): Color defined in net.corda.node.shell.FlowWatchPrintingSubscriber[SimpleFunctionDescriptorImpl]

'smmUpdate' @ [78:36] ==> value-parameter smmUpdate: StateMachineUpdate defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[ValueParameterDescriptorImpl]

'fg' @ [78:47] ==> public open fun fg(): (Style.Composite..Style.Composite?) defined in org.crsh.text.Color[JavaMethodDescriptor]

'indexMap' @ [79:17] ==> private final val indexMap: HashMap<StateMachineRunId, Int> /* = HashMap<StateMachineRunId, Int> */ defined in net.corda.node.shell.FlowWatchPrintingSubscriber[PropertyDescriptorImpl]

'smmUpdate' @ [79:26] ==> value-parameter smmUpdate: StateMachineUpdate defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[ValueParameterDescriptorImpl]

'id' @ [79:36] ==> public abstract val id: StateMachineRunId defined in net.corda.core.messaging.StateMachineUpdate[DeserializedPropertyDescriptor]

'table' @ [79:42] ==> private final val table: TableElement defined in net.corda.node.shell.FlowWatchPrintingSubscriber[PropertyDescriptorImpl]

'rows' @ [79:48] ==> public final val TableElement.rows: (MutableList<(RowElement..RowElement?)>..List<(RowElement..RowElement?)>?)[MyPropertyDescriptor]

'size' @ [79:53] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'indexMap' @ [82:27] ==> private final val indexMap: HashMap<StateMachineRunId, Int> /* = HashMap<StateMachineRunId, Int> */ defined in net.corda.node.shell.FlowWatchPrintingSubscriber[PropertyDescriptorImpl]

'smmUpdate' @ [82:36] ==> value-parameter smmUpdate: StateMachineUpdate defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[ValueParameterDescriptorImpl]

'id' @ [82:46] ==> public abstract val id: StateMachineRunId defined in net.corda.core.messaging.StateMachineUpdate[DeserializedPropertyDescriptor]

'idx' @ [83:21] ==> val idx: Int? defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[LocalVariableDescriptor]

'table' @ [84:34] ==> private final val table: TableElement defined in net.corda.node.shell.FlowWatchPrintingSubscriber[PropertyDescriptorImpl]

'rows' @ [84:40] ==> public final val TableElement.rows: (MutableList<(RowElement..RowElement?)>..List<(RowElement..RowElement?)>?)[MyPropertyDescriptor]

'idx' @ [84:45] ==> val idx: Int? defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[LocalVariableDescriptor]

'oldRow' @ [85:41] ==> val oldRow: (RowElement..RowElement?) defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[LocalVariableDescriptor]

'getCol' @ [85:48] ==> public open fun getCol(p0: Int): (Element..Element?) defined in org.crsh.text.ui.RowElement[JavaMethodDescriptor]

'oldRow' @ [86:46] ==> val oldRow: (RowElement..RowElement?) defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[LocalVariableDescriptor]

'getCol' @ [86:53] ==> public open fun getCol(p0: Int): (Element..Element?) defined in org.crsh.text.ui.RowElement[JavaMethodDescriptor]

'table' @ [87:21] ==> private final val table: TableElement defined in net.corda.node.shell.FlowWatchPrintingSubscriber[PropertyDescriptorImpl]

'rows' @ [87:27] ==> public final val TableElement.rows: (MutableList<(RowElement..RowElement?)>..List<(RowElement..RowElement?)>?)[MyPropertyDescriptor]

'idx' @ [87:32] ==> val idx: Int? defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[LocalVariableDescriptor]

'RowElement' @ [87:39] ==> public constructor RowElement() defined in org.crsh.text.ui.RowElement[JavaClassConstructorDescriptor]

'add' @ [87:52] ==> public open fun add(vararg p0: (Element..Element?)): (RowElement..RowElement?) defined in org.crsh.text.ui.RowElement[JavaMethodDescriptor]

'LabelElement' @ [88:29] ==> public constructor LabelElement(p0: (String..String?)) defined in org.crsh.text.ui.LabelElement[JavaClassConstructorDescriptor]

'formatFlowId' @ [88:42] ==> private final fun formatFlowId(flowId: StateMachineRunId): String defined in net.corda.node.shell.FlowWatchPrintingSubscriber[SimpleFunctionDescriptorImpl]

'smmUpdate' @ [88:55] ==> value-parameter smmUpdate: StateMachineUpdate defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[ValueParameterDescriptorImpl]

'id' @ [88:65] ==> public abstract val id: StateMachineRunId defined in net.corda.core.messaging.StateMachineUpdate[DeserializedPropertyDescriptor]

'LabelElement' @ [89:29] ==> public constructor LabelElement(p0: (String..String?)) defined in org.crsh.text.ui.LabelElement[JavaClassConstructorDescriptor]

'flowNameLabel' @ [89:42] ==> val flowNameLabel: LabelElement defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[LocalVariableDescriptor]

'value' @ [89:56] ==> public final val LabelElement.value: (String..String?)[MyPropertyDescriptor]

'LabelElement' @ [90:29] ==> public constructor LabelElement(p0: (String..String?)) defined in org.crsh.text.ui.LabelElement[JavaClassConstructorDescriptor]

'flowInitiatorLabel' @ [90:42] ==> val flowInitiatorLabel: LabelElement defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[LocalVariableDescriptor]

'value' @ [90:61] ==> public final val LabelElement.value: (String..String?)[MyPropertyDescriptor]

'LabelElement' @ [91:29] ==> public constructor LabelElement(p0: (String..String?)) defined in org.crsh.text.ui.LabelElement[JavaClassConstructorDescriptor]

'formatFlowResult' @ [91:42] ==> private final fun formatFlowResult(flowResult: Try<*>): String defined in net.corda.node.shell.FlowWatchPrintingSubscriber[SimpleFunctionDescriptorImpl]

'smmUpdate' @ [91:59] ==> value-parameter smmUpdate: StateMachineUpdate defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[ValueParameterDescriptorImpl]

'result' @ [91:69] ==> public final val result: Try<*> defined in net.corda.core.messaging.StateMachineUpdate.Removed[DeserializedPropertyDescriptor]

'style' @ [92:23] ==> public open fun style(p0: (Style.Composite..Style.Composite?)): (RowElement..RowElement?) defined in org.crsh.text.ui.RowElement[JavaMethodDescriptor]

'stateColor' @ [92:29] ==> private final fun stateColor(update: StateMachineUpdate): Color defined in net.corda.node.shell.FlowWatchPrintingSubscriber[SimpleFunctionDescriptorImpl]

'smmUpdate' @ [92:40] ==> value-parameter smmUpdate: StateMachineUpdate defined in net.corda.node.shell.FlowWatchPrintingSubscriber.createStateMachinesRow[ValueParameterDescriptorImpl]

'fg' @ [92:51] ==> public open fun fg(): (Style.Composite..Style.Composite?) defined in org.crsh.text.Color[JavaMethodDescriptor]

'Regex' @ [99:30] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'flowName' @ [100:20] ==> value-parameter flowName: String defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowName[ValueParameterDescriptorImpl]

'split' @ [100:29] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'last' @ [100:45] ==> public fun <T> List<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'camelCaseRegex' @ [102:16] ==> val camelCaseRegex: Regex defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowName[LocalVariableDescriptor]

'split' @ [102:31] ==> public final fun split(input: CharSequence, limit: Int = ...): List<String> defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'name' @ [102:37] ==> val name: String defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowName[LocalVariableDescriptor]

'filter' @ [102:43] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [102:52] ==> value-parameter it: String defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowName.<anonymous>[ValueParameterDescriptorImpl]

'compareTo' @ [102:55] ==> public fun String.compareTo(other: String, ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'joinToString' @ [102:86] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'flowId' @ [106:16] ==> value-parameter flowId: StateMachineRunId defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowId[ValueParameterDescriptorImpl]

'toString' @ [106:23] ==> public open fun toString(): String defined in net.corda.core.flows.StateMachineRunId[DeserializedSimpleFunctionDescriptor]

'removeSurrounding' @ [106:34] ==> public fun String.removeSurrounding(prefix: CharSequence, suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (flowInitiator) {
            is FlowInitiator.Scheduled ->  flowInitiator.scheduledState.ref.toString()
            is FlowInitiator.Shell -> "Shell" // TODO Change when we will have more information on shell user.
            is FlowInitiator.Peer -> flowInitiator.party.name.commonName
            is FlowInitiator.RPC -> "RPC: " + flowInitiator.username
        }' @ [110:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'flowInitiator' @ [110:22] ==> value-parameter flowInitiator: FlowInitiator defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowInitiator[ValueParameterDescriptorImpl]

'flowInitiator' @ [111:44] ==> value-parameter flowInitiator: FlowInitiator defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowInitiator[ValueParameterDescriptorImpl]

'scheduledState' @ [111:58] ==> public final val scheduledState: ScheduledStateRef defined in net.corda.core.flows.FlowInitiator.Scheduled[DeserializedPropertyDescriptor]

'ref' @ [111:73] ==> public final val ref: StateRef defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'toString' @ [111:77] ==> public open fun toString(): String defined in net.corda.core.contracts.StateRef[DeserializedSimpleFunctionDescriptor]

'flowInitiator' @ [113:38] ==> value-parameter flowInitiator: FlowInitiator defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowInitiator[ValueParameterDescriptorImpl]

'party' @ [113:52] ==> public final val party: Party defined in net.corda.core.flows.FlowInitiator.Peer[DeserializedPropertyDescriptor]

'name' @ [113:58] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'commonName' @ [113:63] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'+' @ [114:37] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'flowInitiator' @ [114:47] ==> value-parameter flowInitiator: FlowInitiator defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowInitiator[ValueParameterDescriptorImpl]

'username' @ [114:61] ==> public final val username: String defined in net.corda.core.flows.FlowInitiator.RPC[DeserializedPropertyDescriptor]

'when(value) {
                is SignedTransaction -> "Tx ID: " + value.id.toString()
                is kotlin.Unit -> "No return value"
                null -> "No return value"
                else -> value.toString()
            }' @ [120:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'value' @ [120:25] ==> value-parameter value: Any? defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowResult.successFormat[ValueParameterDescriptorImpl]

'+' @ [121:41] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'value' @ [121:53] ==> value-parameter value: Any? defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowResult.successFormat[ValueParameterDescriptorImpl]

'id' @ [121:59] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'toString' @ [121:62] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'value' @ [124:25] ==> value-parameter value: Any? defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowResult.successFormat[ValueParameterDescriptorImpl]

'toString' @ [124:31] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'when (flowResult) {
            is Try.Success -> successFormat(flowResult.value)
            is Try.Failure -> flowResult.exception.message ?: flowResult.exception.toString()
        }' @ [127:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'flowResult' @ [127:22] ==> value-parameter flowResult: Try<*> defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowResult[ValueParameterDescriptorImpl]

'successFormat' @ [128:31] ==> local final fun successFormat(value: Any?): String defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowResult[SimpleFunctionDescriptorImpl]

'flowResult' @ [128:45] ==> value-parameter flowResult: Try<*> defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowResult[ValueParameterDescriptorImpl]

'value' @ [128:56] ==> public final val value: Any? defined in net.corda.core.utilities.Try.Success[DeserializedPropertyDescriptor]

'flowResult' @ [129:31] ==> value-parameter flowResult: Try<*> defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowResult[ValueParameterDescriptorImpl]

'exception' @ [129:42] ==> public final val exception: Throwable defined in net.corda.core.utilities.Try.Failure[DeserializedPropertyDescriptor]

'message' @ [129:52] ==> public open val message: String? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'flowResult' @ [129:63] ==> value-parameter flowResult: Try<*> defined in net.corda.node.shell.FlowWatchPrintingSubscriber.formatFlowResult[ValueParameterDescriptorImpl]

'exception' @ [129:74] ==> public final val exception: Throwable defined in net.corda.core.utilities.Try.Failure[DeserializedPropertyDescriptor]

'toString' @ [129:84] ==> public open fun toString(): String defined in kotlin.Throwable[DeserializedSimpleFunctionDescriptor]

