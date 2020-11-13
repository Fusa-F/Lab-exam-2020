from typing import List
import random

def generate_10_numbers_from_0_until_100() -> List[int]:
    return [random.randint(0, 100) for i in range(10)]


def print_list(numbers: List[int]):
    for item in numbers:
        print(item)


def sort_in_ascending_order(numbers: List[int]) -> List[int]:
    return sorted(numbers)


def remove_content_which_number_is_under_50(numbers: List[int]) -> List[int]:
    return [item for item in numbers if item > 50]


if __name__ == '__main__':
    print('- Q1.2.1')
    generate_10_numbers_from_0_until_100()
    list = generate_10_numbers_from_0_until_100()
    print_list(list)

    print('- Q1.2.2')
    l = sort_in_ascending_order(list)
    print(l)

    print('Q1.2.3')
    l2 = remove_content_which_number_is_under_50(l)
    print(l2)