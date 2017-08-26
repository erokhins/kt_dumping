'arrayListOf' @ [27:27] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<CommandHistory.Entry> /* = ArrayList<CommandHistory.Entry> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry

'arrayListOf' @ [31:21] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<HistoryUpdateListener> /* = ArrayList<HistoryUpdateListener> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HistoryUpdateListener

'entries' @ [33:32] ==> private final val entries: ArrayList<CommandHistory.Entry> /* = ArrayList<CommandHistory.Entry> */ defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'i' @ [33:40] ==> value-parameter i: Int defined in org.jetbrains.kotlin.console.CommandHistory.get[ValueParameterDescriptorImpl]

'entries' @ [36:9] ==> private final val entries: ArrayList<CommandHistory.Entry> /* = ArrayList<CommandHistory.Entry> */ defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'add' @ [36:17] ==> public open fun add(element: CommandHistory.Entry): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'entry' @ [36:21] ==> value-parameter entry: CommandHistory.Entry defined in org.jetbrains.kotlin.console.CommandHistory.addEntry[ValueParameterDescriptorImpl]

'listeners' @ [37:9] ==> public final val listeners: ArrayList<HistoryUpdateListener> /* = ArrayList<HistoryUpdateListener> */ defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'forEach' @ [37:19] ==> @HidesMembers public inline fun <T> Iterable<HistoryUpdateListener>.forEach(action: (HistoryUpdateListener) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HistoryUpdateListener

'it' @ [37:29] ==> value-parameter it: HistoryUpdateListener defined in org.jetbrains.kotlin.console.CommandHistory.addEntry.<anonymous>[ValueParameterDescriptorImpl]

'onNewEntry' @ [37:32] ==> public abstract fun onNewEntry(entry: CommandHistory.Entry): Unit defined in org.jetbrains.kotlin.console.HistoryUpdateListener[SimpleFunctionDescriptorImpl]

'entry' @ [37:43] ==> value-parameter entry: CommandHistory.Entry defined in org.jetbrains.kotlin.console.CommandHistory.addEntry[ValueParameterDescriptorImpl]

'if (processedEntriesCount < size) {
            get(processedEntriesCount)
        }
        else {
            null
        }' @ [41:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CommandHistory.Entry?, elseBranch: CommandHistory.Entry?): CommandHistory.Entry?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Entry?

'processedEntriesCount' @ [41:20] ==> public final var processedEntriesCount: Int defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'size' @ [41:44] ==> public final val size: Int defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'get' @ [42:13] ==> public final operator fun get(i: Int): CommandHistory.Entry defined in org.jetbrains.kotlin.console.CommandHistory[SimpleFunctionDescriptorImpl]

'processedEntriesCount' @ [42:17] ==> public final var processedEntriesCount: Int defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'processedEntriesCount' @ [50:9] ==> public final var processedEntriesCount: Int defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'entries' @ [54:17] ==> private final val entries: ArrayList<CommandHistory.Entry> /* = ArrayList<CommandHistory.Entry> */ defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'size' @ [54:25] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

