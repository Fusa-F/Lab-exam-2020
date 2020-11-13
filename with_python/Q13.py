# coding: utf-8
import MeCab


def print_words_and_results(raw_text: str = 'すもももももももものうち'):
    meCab = MeCab.Tagger('-Ochasen')
    print(meCab.parse(raw_text))


def print_morpheme(raw_text: str = 'すもももももももものうち'):
    select_condition = ['名詞']
    meCab = MeCab.Tagger('-Ochasen')
    # ノードごとに分ける
    node = meCab.parseToNode(raw_text)
    terms = []
    while node:
        # 単語
        term = node.surface
        # 品詞
        pos = node.feature.split(',')[0]

        if pos in select_condition:
            terms.append(term)

        node = node.next

    print(' '.join(terms))


if __name__ == '__main__':
    print('- Q1.3.1')
    print_words_and_results()
    print('- Q1.3.2')
    print_morpheme()